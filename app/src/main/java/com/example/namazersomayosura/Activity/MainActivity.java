package com.example.namazersomayosura.Activity;

import android.Manifest;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;

import com.example.namazersomayosura.PojoClass.Prayer_Time_Daiy;
import com.example.namazersomayosura.R;
import com.example.namazersomayosura.ViewModel.Namazer_Time_ViewModel;
import com.example.namazersomayosura.databinding.ContentMainBinding;
import com.example.namazersomayosura.fragment_class.About_Us_F;
import com.example.namazersomayosura.fragment_class.HomeFragment;
import com.example.namazersomayosura.fragment_class.Tasbih_F;
import com.example.namazersomayosura.javaClass.CheckNetwork;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.util.Log;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.kinda.alert.KAlertDialog;

import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;

import android.view.Menu;
import android.view.MenuItem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import es.dmoral.toasty.Toasty;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ContentMainBinding mainBinding;
    Fragment fragment = null;
    public static FloatingActionButton fab;
    public static Application application;

    private FusedLocationProviderClient fusedLocationProviderClient;
    private LocationRequest locationRequest;
    private LocationCallback locationCallback;


    Namazer_Time_ViewModel namazer_time_viewModel;

    KAlertDialog kAlertDialog;

    String achor_12_time = "";
    String magrib_12_time = "";
    String isha_12_time = "";
    String lat = "";
    String lon = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Hide Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fab.hide();
                fragment = new Tasbih_F();
                replaceFragment(fragment);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


//call the lat lon Start
        if (CheckNetwork.isInternetAvailable(this)){

            call_lat_lon();
        }else {
            Toasty.error(this,"Check Internet Connection").show();
        }
//call the lat lon END



//default Fragment
        Fragment fragment = new HomeFragment();
        if (fragment != null) {

            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.screen_Area_main, fragment);
            fragmentTransaction.commit();
        }
//default Fragment END

    }

    //call the latitude and longitude
    private void call_lat_lon() {
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        locationRequest = new LocationRequest()
                .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
//                .setFastestInterval(500); //processing time

        locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                super.onLocationResult(locationResult);

                for (Location location : locationResult.getLocations()) {

                    lat = String.valueOf(location.getLatitude());
                    lon = String.valueOf(location.getLongitude());
                    Log.e("TAG", "onCreate: "+lat );
                    Log.e("TAG", "onCreate: "+lon );
                    loadJson(lat,lon);
                }
            }
        };
        //alow permission after marshmallow
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION
                    , Manifest.permission.ACCESS_COARSE_LOCATION}, 0);
            return;
        }
        fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, null);

    }


    //load json
    private void loadJson(String lat, String lon) {

        Calendar calendar = Calendar.getInstance();
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        String month = String.valueOf(calendar.get(Calendar.MONTH) + 1);
        String day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        String date = day + "-" + month + "-" + year;

        if (CheckNetwork.isInternetAvailable(this)) {

            kAlertDialog = new KAlertDialog(this, KAlertDialog.PROGRESS_TYPE);
            kAlertDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
            kAlertDialog.setTitleText("Loading...");
            kAlertDialog.setCancelable(false);
            kAlertDialog.show();


            namazer_time_viewModel = new Namazer_Time_ViewModel(this.getApplication(), date, this.lat, this.lon);
            namazer_time_viewModel.getAllUser_LiveData().observe(this, new Observer<Prayer_Time_Daiy>() {
                @Override
                public void onChanged(Prayer_Time_Daiy prayer_time_daiys) {

                    if (prayer_time_daiys.getStatus().equals("OK")) {

                        String fajr_24_Time = prayer_time_daiys.getData().getTimings().getFajr();
                        String sunrise_24_Time = prayer_time_daiys.getData().getTimings().getSunrise();
                        String dhuhr_24_Time = prayer_time_daiys.getData().getTimings().getDhuhr();
                        String achor_24_Time = prayer_time_daiys.getData().getTimings().getAsr();
                        String magrib_24_Time = prayer_time_daiys.getData().getTimings().getMaghrib();
                        String isha_24_Time = prayer_time_daiys.getData().getTimings().getIsha();

                        //convert 24 hours to 12 hours -------- start
                        SimpleDateFormat _24HourSDF = new SimpleDateFormat("HH:mm");
                        SimpleDateFormat _12HourSDF = new SimpleDateFormat("hh:mm a");


                        try {

                            Date _24HourDt_achor = _24HourSDF.parse(achor_24_Time);
                            achor_12_time = _12HourSDF.format(_24HourDt_achor);

                            Date _24HourDt_magrib = _24HourSDF.parse(magrib_24_Time);
                            magrib_12_time = _12HourSDF.format(_24HourDt_magrib);

                            Date _24HourDt_isha = _24HourSDF.parse(isha_24_Time);
                            isha_12_time = _12HourSDF.format(_24HourDt_isha);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
//convert 24 hours to 12 hours -------- END

                        //shared preference save data
                        SharedPreferences.Editor editor = getSharedPreferences("jsonSave", 0).edit();
                        editor.putString("fajr", fajr_24_Time + " AM");
                        editor.putString("sunrise", sunrise_24_Time + " AM");
                        editor.putString("dhur", dhuhr_24_Time + " AM");
                        editor.putString("achor", achor_12_time);
                        editor.putString("magrib", magrib_12_time);
                        editor.putString("isha", isha_12_time);
                        editor.apply();
 //dismiss the loading bar
                        kAlertDialog.dismiss();
                    }

                }
            });
        } else {
            kAlertDialog = new KAlertDialog(this, KAlertDialog.ERROR_TYPE);
            kAlertDialog.setTitleText("Internet Problem");
            kAlertDialog.setContentText("Check Your Internet Connection");
            kAlertDialog.setCancelable(false);
            kAlertDialog.setConfirmClickListener(new KAlertDialog.OnSweetClickListener() {
                @Override
                public void onClick(KAlertDialog kAlertDialog) {
                    startActivity(new Intent(MainActivity.this,MainActivity.class));
                    finish();
                }
            });
            kAlertDialog.show();
        }
    }


    @Override
    public void onBackPressed() {

        fab.show();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_developer_profile) {
            // Handle the camera action
            fragment = new About_Us_F();
            fab.show();
            replaceFragment(fragment);

        }  else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //replace the Fragment
    private void replaceFragment(Fragment fragment) {

        if (fragment != null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            fragmentTransaction.replace(R.id.screen_Area_main, fragment);
            fragmentTransaction.addToBackStack("");
            fragmentTransaction.commit();

        }

    }
//replace the Fragment END

}
