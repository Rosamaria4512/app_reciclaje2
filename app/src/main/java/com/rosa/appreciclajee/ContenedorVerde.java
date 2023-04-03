package com.rosa.appreciclajee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ContenedorVerde extends AppCompatActivity {
    MediaPlayer sonido1;
    FloatingActionButton btnsonido1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_verde);
        referenciar();
        sonido1= MediaPlayer.create(this,R.raw.vidrio);
    }

    private void referenciar() {
        btnsonido1=findViewById(R.id.btnsonido1);
        btnsonido1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido1.start();

            }
        });
        Button boton5 = (Button) findViewById(R.id.bnt_atras);
        boton5.setOnClickListener( (v)->{
            Toast notificacion5= Toast.makeText(ContenedorVerde.this, "",Toast.LENGTH_SHORT);
            notificacion5.show();
            Intent intencion8 = new Intent(getApplicationContext(),MenuReciclaje.class);
            startActivity(intencion8);
        });

    }


}