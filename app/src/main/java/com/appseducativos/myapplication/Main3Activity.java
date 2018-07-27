package com.appseducativos.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class Main3Activity extends AppCompatActivity {
ImageView imagen;
RadioGroup opciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imagen=findViewById(R.id.imageView2);
        opciones=findViewById(R.id.radioGroup);
        opciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //instrucciones  cuando cambiemos de opcion
                switch (i){
                    case R.id.radioButton:
                        imagen.setImageResource(R.drawable.lol);
                        ;break;
                    case R.id.radioButton2:
                        imagen.setImageResource(R.drawable.fortnite);
                        ;break;
                    case R.id.radioButton3:
                        imagen.setImageResource(R.drawable.halo);
                        ;break;
                    case R.id.radioButton4:
                        imagen.setImageResource(R.drawable.gta_v);
                        ;break;
                    case R.id.radioButton5:
                        imagen.setImageResource(R.drawable.uncharted);
                        ;break;

                }


            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.item1:
                startActivity(new Intent(this,MainActivity.class));
                return true;
            case R.id.item2:
                startActivity(new Intent(this,Main2Activity.class));
                ;return true;
            case R.id.item3:
                startActivity(new Intent(this,Main3Activity.class));
                return true;
            case R.id.item4:
                finish();
                return true;

            default: return onOptionsItemSelected(item);
        }



    }

}
