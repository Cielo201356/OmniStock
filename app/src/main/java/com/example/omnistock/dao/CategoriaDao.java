package com.example.omnistock.dao;
import com.example.omnistock.data.entities.Categoria;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CategoriaDao {
    @Query("SELECT * FROM Categoria")
    List<Categoria> getAll();

    @Insert
    void insert(Categoria categoria);
}
