package com.rosa.appreciclajee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ContenedorAmarillo extends AppCompatActivity {
    MediaPlayer sonido2;
    FloatingActionButton btnsonido2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_amarillo);

        referenciar();
        sonido2= MediaPlayer.create(this,R.raw.plastico);
        }

        private void referenciar() {
        btnsonido2 = findViewById(R.id.btnsonido2);
            btnsonido2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sonido2.start();

                }
            });
            Button boton6 = (Button) findViewById(R.id.bnt_atras);
            boton6.setOnClickListener( (v)->{
                Toast notificacion6= Toast.makeText(ContenedorAmarillo.this, "",Toast.LENGTH_SHORT);
                notificacion6.show();
                Intent intencion9 = new Intent(getApplicationContext(),MenuReciclaje.class);
                startActivity(intencion9);
            });
        }
    }
