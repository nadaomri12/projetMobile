package com.example.projectmobile.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectmobile.R;

import java.util.List;

public class MaisonsAdapter extends RecyclerView.Adapter< MaisonsAdapter.MaisonsViewHolder> {
    private Context mCtx;
    private List<Maison_d_hôte> maisonDHôtesList;
    @NonNull
    @Override
    public MaisonsAdapter.MaisonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.item, parent, false);
        return new MaisonsViewHolder(view);
    }

    public MaisonsAdapter(Context mCtx, List<Maison_d_hôte> maisonDHôtesList) {
        this.mCtx = mCtx;
        this.maisonDHôtesList = maisonDHôtesList;
    }

    @Override
    public void onBindViewHolder(@NonNull MaisonsAdapter.MaisonsViewHolder holder, int position) {
        Maison_d_hôte t = maisonDHôtesList.get(position);
        holder.nom.setText(t.getNom());
        holder.ville.setText(t.getVille());

    }
 public static class MaisonsViewHolder extends RecyclerView.ViewHolder {
     TextView nom ,ville ;
     public MaisonsViewHolder(@NonNull View itemView) {
         super(itemView);
         itemView.findViewById(R.id.nom);
         itemView.findViewById(R.id.ville);

     }
    }
    @Override
    public int getItemCount() {
        return maisonDHôtesList.size();
    }
}
