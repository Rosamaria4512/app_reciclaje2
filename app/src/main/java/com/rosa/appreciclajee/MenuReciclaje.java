package com.rosa.appreciclajee;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MenuReciclaje extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_reciclaje);


        ImageView boton_vidrio = (ImageView) findViewById(R.id.img_vidrio);
        boton_vidrio.setOnClickListener((v) -> {
            Toast notificacion2 = Toast.makeText(MenuReciclaje.this, "Vidrio", Toast.LENGTH_SHORT);
            notificacion2.show();
            Intent intencion2 = new Intent(getApplicationContext(), ContenedorVerde.class);
            startActivity(intencion2);

        });

        ImageView boton_plastico = (ImageView) findViewById(R.id.img_plastico);
        boton_plastico.setOnClickListener((v) -> {
            Toast notificacion1 = Toast.makeText(MenuReciclaje.this, "Plastico", Toast.LENGTH_SHORT);
            notificacion1.show();
            Intent intencion1 = new Intent(getApplicationContext(), ContenedorAmarillo.class);
            startActivity(intencion1);

        });

        ImageView boton_bolsa = (ImageView) findViewById(R.id.img_bolsa);
        boton_bolsa.setOnClickListener((v) -> {
            Toast notificacion2 = Toast.makeText(MenuReciclaje.this, "Restos", Toast.LENGTH_SHORT);
            notificacion2.show();
            Intent intencion2 = new Intent(getApplicationContext(), ContenedorGris.class);
            startActivity(intencion2);

        });

    }

    @Override
    public void onClick(View view) {

    }
}