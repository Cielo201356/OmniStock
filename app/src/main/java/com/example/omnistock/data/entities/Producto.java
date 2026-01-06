package com.example.omnistock.data.entities;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(
        entity = Categoria.class,
        parentColumns = "id",
        childColumns = "categoria_id",
        onDelete = ForeignKey.CASCADE))
public class Producto {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nombre;
    public double precio_base;
    public int stock;
    public String tipo; // ELECTRONICO, ROPA, ALIMENTO
    public int categoria_id;
}


