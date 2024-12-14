package com.example.projectmobile.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MaisonDAO {
    @Query("SELECT * FROM Maison_d_hôte")
    List<Maison_d_hôte> getAll();
    @Insert
    void insert(Maison_d_hôte Maison_d_hôte);
    @Delete
    void delete(Maison_d_hôte Maison_d_hôte);
    @Update
    void update(Maison_d_hôte Maison_d_hôte);
}
