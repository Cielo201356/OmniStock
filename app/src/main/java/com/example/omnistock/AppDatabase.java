package com.example.omnistock;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.omnistock.data.entities.Usuario;
import com.example.omnistock.data.entities.Categoria;
import com.example.omnistock.data.entities.Producto;
import com.example.omnistock.dao.ProductoDao;
import com.example.omnistock.dao.UsuarioDao;
import com.example.omnistock.dao.CategoriaDao;

@Database(entities = {Usuario.class, Categoria.class, Producto.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UsuarioDao usuarioDao();
    public abstract CategoriaDao categoriaDao();
    public abstract ProductoDao productoDao();
}
