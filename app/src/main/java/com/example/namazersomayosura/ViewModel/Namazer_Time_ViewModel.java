package com.example.namazersomayosura.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.namazersomayosura.PojoClass.Prayer_Time_Daiy;
import com.example.namazersomayosura.Repository.Namazer_daily_time_Repository;

public class Namazer_Time_ViewModel extends AndroidViewModel {

    Namazer_daily_time_Repository namazer_daily_time_repository;

    public Namazer_Time_ViewModel(@NonNull Application application, String date, String lat, String lon) {
        super(application);

        namazer_daily_time_repository = new Namazer_daily_time_Repository(application, date, lat, lon);
    }

    public LiveData<Prayer_Time_Daiy> getAllUser_LiveData() {
        return namazer_daily_time_repository.get_prayer_Time();
    }
}
