package com.example.projectmobile.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Maison_d_hôte implements Serializable {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "nom")
    private String nom;
    @ColumnInfo(name = "Ville")
    private String Ville;
    @ColumnInfo(name = "Region")
    private String Region;
    @ColumnInfo(name = "prix")
    private Double prix;
    private int image;
    private String Adress;
    private  int Phone;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return Ville;
    }

    public String getRegion() {
        return Region;
    }

    public Double getPrix() {
        return prix;
    }

    public int getImage() {
        return image;
    }

    public String getAdress() {
        return Adress;
    }

    public int getPhone() {
        return Phone;
    }
}
