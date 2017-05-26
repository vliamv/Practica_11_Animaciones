package edu.cecyt9.ipn.practica11_animaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class NuevasAnimaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevas_animaciones);
    }
    //animaciones agregadas
    public void negacion(View o){
        TextView texto = (TextView)findViewById(R.id.texto);
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.negacion);
        texto.startAnimation(animacion);
    }
    public void enfasis(View o){
        TextView texto = (TextView)findViewById(R.id.texto);
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.enfasis);
        texto.startAnimation(animacion);
    }
    public void sacudida(View o){
        TextView texto = (TextView)findViewById(R.id.texto);
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.sacudida);
        texto.startAnimation(animacion);
    }
}
