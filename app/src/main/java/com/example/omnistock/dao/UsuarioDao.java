package com.example.omnistock.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.omnistock.data.entities.Usuario;
@Dao
public interface UsuarioDao {
    @Query("SELECT * FROM Usuario WHERE nombre = :nombre AND pass = :pass LIMIT 1")
    Usuario login(String nombre, String pass);

    @Insert
    void insert(Usuario usuario);
}

