package com.example.felipe.signozodiacales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

TextView usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton=(Button)findViewById(R.id.ingresar);
        usuario = (TextView)findViewById(R.id.usuario);

        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){





                String usuario = ((EditText)findViewById(R.id.usuario)).getText().toString();
                String password = ((EditText)findViewById(R.id.password)).getText().toString();


               if (usuario.equals("Felipe")&& password.equals("123456")){
                   Intent entrar = new Intent(MainActivity.this,Main2Activity.class);
                   entrar.putExtra("",usuario.toString());
                   startActivity(entrar);
               }
                if (usuario.equals("FelipeT")&& password.equals("198395021")){
                    Intent entrar = new Intent(MainActivity.this,Main2Activity.class);
                    entrar.putExtra("",usuario.toString());
                    startActivity(entrar);
                }
                if (usuario.equals("miguel")&& password.equals("87654321")){
                    Intent entrar = new Intent(MainActivity.this,Main2Activity.class);
                    entrar.putExtra("",usuario.toString());
                    startActivity(entrar);
                }
                if (usuario.equals("inacap")&& password.equals("inacap")){
                    Intent entrar = new Intent(MainActivity.this,Main2Activity.class);
                    entrar.putExtra("",usuario.toString());
                    startActivity(entrar);
                }
                if (usuario.equals("gabriel")&& password.equals("12345678")){
                    Intent entrar = new Intent(MainActivity.this,Main2Activity.class);
                    entrar.putExtra("",usuario.toString());
                    startActivity(entrar);
                }
                else {

                }






        }
        }
        );
    }

}









