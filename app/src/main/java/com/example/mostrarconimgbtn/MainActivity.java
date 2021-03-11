package com.example.mostrarconimgbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView muchotexto;
    ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtn= findViewById(R.id.imgbtn);
    }
    public void suanfonson(View view){
        String t= "Hola muy buenas yo soy el desarrolador de esta aplicación en android studio ";
        Toast.makeText(this,t,Toast.LENGTH_LONG).show();
    }

}