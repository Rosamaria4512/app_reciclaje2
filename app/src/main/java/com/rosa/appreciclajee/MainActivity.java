package com.rosa.appreciclajee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ImageView boton1 = (ImageView) findViewById(R.id.img_recicla);
       boton1.setOnClickListener( (v)->{
           Toast notificacion = Toast.makeText(MainActivity.this, "recicla",Toast.LENGTH_SHORT);
           notificacion.show();
          Intent intencion = new Intent(getApplicationContext(),MenuReciclaje.class);
           startActivity(intencion);
       });

       Button boton2 = (Button) findViewById(R.id.btn_verde);
        boton2.setOnClickListener( (v)->{
            Toast notificacion4 = Toast.makeText(MainActivity.this, "recicla",Toast.LENGTH_SHORT);
            notificacion4.show();
            Intent intencion4 = new Intent(getApplicationContext(),MenuReciclaje.class);
            startActivity(intencion4);
        });



}

    @Override
    public void onClick(View view) {

    }
}