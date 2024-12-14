package com.example.projectmobile.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Maison_d_hôte.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MaisonDAO maisonDAO();
}