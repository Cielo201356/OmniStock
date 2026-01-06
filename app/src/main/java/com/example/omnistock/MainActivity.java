package com.example.omnistock;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

import com.example.omnistock.data.AppDatabase;
import com.example.omnistock.data.entities.Usuario;

public class MainActivity extends AppCompatActivity {

    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Inicializar la BD dentro de onCreate
        db = Room.databaseBuilder(getApplicationContext(),
                        AppDatabase.class, "omnistock-db")
                .allowMainThreadQueries() // solo para pruebas
                .build();

        // Insertar usuario de prueba
        Usuario admin = new Usuario();
        admin.nombre = "ADMIN";
        admin.pass = "123";
        admin.rol = "ADMIN";
        db.usuarioDao().insert(admin); // CORREGIDO

        // Confirmar con un Toast
        Toast.makeText(this, "Usuario ADMIN creado", Toast.LENGTH_SHORT).show();

        // Ajuste de insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

