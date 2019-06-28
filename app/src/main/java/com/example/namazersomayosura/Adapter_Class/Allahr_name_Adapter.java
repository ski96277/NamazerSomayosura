package com.example.namazersomayosura.Adapter_Class;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.ItemViewAllahrNameBinding;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;


public class Allahr_name_Adapter extends BaseAdapter {
    Context context;
    String[] allah_r_name;
    String[] allah_r_name_ortho;

    LayoutInflater inflter;

    public Allahr_name_Adapter(Context context, String[] allah_r_name, String[] allah_r_name_ortho) {
        this.context = context;
        this.allah_r_name = allah_r_name;
        this.allah_r_name_ortho = allah_r_name_ortho;

        inflter=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return allah_r_name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = inflter.inflate(R.layout.item_view_allahr_name, null);

        TextView nameTV=view.findViewById(R.id.name_TV_ID);
        TextView name_ortho_TV=view.findViewById(R.id.name_ortho_TV_ID);
        nameTV.setText(allah_r_name[position]);
        name_ortho_TV.setText(allah_r_name_ortho[position]);
        return view;
    }
}

/*
public class Allahr_name_Adapter extends RecyclerView.Adapter<Allahr_name_Adapter.ViewClass> {
    Context context;
    String[] allah_r_name;
    String[] allah_r_name_ortho;
    ItemViewAllahrNameBinding itemViewAllahrNameBinding;
    //for onClick from java class (Second ....)
    private static ClickListener clickListener;

    public Allahr_name_Adapter(Context context, String[] allah_r_name, String[] allah_r_name_ortho) {
        this.context = context;
        this.allah_r_name = allah_r_name;
        this.allah_r_name_ortho = allah_r_name_ortho;
    }

    @NonNull
    @Override
    public ViewClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        itemViewAllahrNameBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_view_allahr_name, viewGroup, false);
        View view = itemViewAllahrNameBinding.getRoot();
        return new ViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewClass viewClass, int i) {

        itemViewAllahrNameBinding.nameTVID.setText(allah_r_name[i].trim());
        itemViewAllahrNameBinding.nameOrthoTVID.setText(allah_r_name_ortho[i].trim());

    }

    @Override
    public int getItemCount() {
        return allah_r_name_ortho.length;
    }

    //implement interface for onClick from java class (third ....)
    public class ViewClass extends RecyclerView.ViewHolder implements View.OnLongClickListener, View.OnClickListener {


        public ViewClass(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

//            nameTV = itemView.findViewById(R.id.name_TV);
        }

        //Override this method for onClick from java class (fourth ....)
        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(), v);
        }

        @Override
        public boolean onLongClick(View v) {
            clickListener.onItemLongClick(getAdapterPosition(), v);
            return false;
        }

    }

    //for onClick from java class
    public void setOnItemClickListener(ClickListener clickListener) {
        Allahr_name_Adapter.clickListener = clickListener;
    }

    //for onClick from java class (First ....)
    public interface ClickListener {
        void onItemClick(int position, View v);

        void onItemLongClick(int position, View v);
    }
}*/
