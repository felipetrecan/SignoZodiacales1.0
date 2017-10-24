package com.example.felipe.signozodiacales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


 ListView ListaSignos;
    TextView bienvenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


            bienvenido=(TextView) findViewById(R.id.bienvenido);
            Bundle bundle=getIntent().getExtras();
            bienvenido.setText(bundle.getString(""));



       ListaSignos = (ListView) findViewById(R.id.signos);

        final String[] values = new String[]{"Acuario","Piscis","Aries","Tauro","Geminis","Cancer","Leo","Virgo","Libra","Escorpion","Sagitario","Capricornio"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1,values );
        ListaSignos.setAdapter(adapter);
        ListaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0){
                    Intent intent1= new Intent(view.getContext(),Main3Activity.class);
                    startActivityForResult(intent1,0);

                }
                if (position == 1) {
                    Intent intent1 = new Intent(view.getContext(), Main4Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 2) {
                    Intent intent1 = new Intent(view.getContext(), Main5Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 3) {
                    Intent intent1 = new Intent(view.getContext(), Main6Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 4) {
                    Intent intent1 = new Intent(view.getContext(), Main7Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 5) {
                    Intent intent1 = new Intent(view.getContext(), Main8Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 6) {
                    Intent intent1 = new Intent(view.getContext(), Main9Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 7) {
                    Intent intent1 = new Intent(view.getContext(), Main10Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 8) {
                    Intent intent1 = new Intent(view.getContext(), Main11Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 9) {
                    Intent intent1 = new Intent(view.getContext(), Main12Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 10) {
                    Intent intent1 = new Intent(view.getContext(), Main13Activity.class);
                    startActivityForResult(intent1, 0);
                }
                if (position == 11) {
                    Intent intent1 = new Intent(view.getContext(), Main14Activity.class);
                    startActivityForResult(intent1, 0);
                }



            }
        });
    }
}
