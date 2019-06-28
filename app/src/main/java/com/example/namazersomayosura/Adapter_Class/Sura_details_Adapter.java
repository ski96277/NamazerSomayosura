package com.example.namazersomayosura.Adapter_Class;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.namazersomayosura.R;
import com.example.namazersomayosura.databinding.SuraDetailsFBinding;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Sura_details_Adapter extends RecyclerView.Adapter<Sura_details_Adapter.ViewClass> {
    //for onClick from java class (Second ....)
    private static ClickListener clickListener;

    Context context;

    String[] sura_aiyat;
    String[] sura_english_ortho;
    String[] sura_bangla_ortho;

    public Sura_details_Adapter(Context context, String[] sura_aiyat, String[] sura_english_ortho, String[] sura_bangla_ortho) {
        this.context = context;
        this.sura_aiyat = sura_aiyat;
        this.sura_english_ortho = sura_english_ortho;
        this.sura_bangla_ortho = sura_bangla_ortho;
    }

    @NonNull
    @Override
    public ViewClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_view_sura_details, viewGroup, false);
        return new ViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewClass viewClass, int i) {

        viewClass.aiyat_show.setText(sura_aiyat[i]);
        viewClass.english_ortho.setText(sura_english_ortho[i]);
        viewClass.bangla_Ortho.setText(sura_bangla_ortho[i]);

    }

    @Override
    public int getItemCount() {
        return sura_aiyat.length;
    }

    //implement interface for onClick from java class (third ....)
    public class ViewClass extends RecyclerView.ViewHolder implements View.OnLongClickListener, View.OnClickListener {

        TextView aiyat_show;
        TextView english_ortho;
        TextView bangla_Ortho;

        public ViewClass(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

            aiyat_show = itemView.findViewById(R.id.aiyat_show_TV);
            english_ortho = itemView.findViewById(R.id.english_ortho_TV);
            bangla_Ortho = itemView.findViewById(R.id.bangla_Ortho_TV);

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
        Sura_details_Adapter.clickListener = clickListener;
    }

    //for onClick from java class (First ....)
    public interface ClickListener {
        void onItemClick(int position, View v);

        void onItemLongClick(int position, View v);
    }
}