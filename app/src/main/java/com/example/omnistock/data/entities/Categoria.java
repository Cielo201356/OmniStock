package com.example.omnistock.data.entities;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Categoria {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nombre_categoria;
    public String descripcion;
}
