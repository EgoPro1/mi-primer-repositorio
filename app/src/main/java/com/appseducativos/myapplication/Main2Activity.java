package com.appseducativos.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    MediaPlayer musica;
    boolean sw;

Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sw=true;
        musica = MediaPlayer.create(getApplicationContext(),R.raw.musica);

        boton=findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //Intent Ventana3=new Intent(Main2Activity.this,Main3Activity.class);
                //startActivity(Ventana3);
                   // Intent sistema=new Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE);
                        //    startActivityForResult(sistema,100);
                if(sw==true)
                {
                    musica.start();
                    sw=false;
                }
                else
                {
                    musica.pause();
                    sw=true;
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
