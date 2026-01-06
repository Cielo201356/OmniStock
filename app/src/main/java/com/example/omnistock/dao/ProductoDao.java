package com.example.omnistock.dao;
import com.example.omnistock.data.entities.Producto;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ProductoDao {
    @Query("SELECT * FROM Producto")
    List<Producto> getAll();

    @Query("SELECT * FROM Producto WHERE categoria_id = :categoriaId")
    List<Producto> getByCategoria(int categoriaId);

    @Insert
    void insert(Producto producto);

    @Update
    void update(Producto producto);
}
