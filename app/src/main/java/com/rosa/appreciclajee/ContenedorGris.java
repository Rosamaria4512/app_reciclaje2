package com.rosa.appreciclajee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ContenedorGris extends AppCompatActivity {
    MediaPlayer sonido3;
    FloatingActionButton btnsonido3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_gris);
        referenciar();
        sonido3= MediaPlayer.create(this,R.raw.gris);
    }
    private void referenciar() {
        btnsonido3=findViewById(R.id.btnsonido3);
        btnsonido3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido3.start();



            }
        });
        Button boton7 = (Button) findViewById(R.id.bnt_atras);
        boton7.setOnClickListener( (v)->{
            Toast notificacion7= Toast.makeText(ContenedorGris.this, "",Toast.LENGTH_SHORT);
            notificacion7.show();
            Intent intencion10 = new Intent(getApplicationContext(),MenuReciclaje.class);
            startActivity(intencion10);
        });
    }
}