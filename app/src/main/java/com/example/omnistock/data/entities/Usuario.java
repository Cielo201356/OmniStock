package com.example.omnistock.data.entities;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Usuario {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nombre;
    public String pass;
    public String rol; // ADMIN o VENDEDOR
}
