package com.example.root.disgraphia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;


public class Main extends AppCompatActivity {

    MediaPlayer audio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        audio = MediaPlayer.create(this, R.raw.backsound);
        audio.setLooping(true);
        audio.setVolume(1,1);
        audio.start();

        Button b_keluar = (Button) findViewById(R.id.b_keluar);
        b_keluar.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });



        Button b_mengetik = (Button)findViewById(R.id.b_mengetik);
        b_mengetik.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Main.this, Ketik.class);
                startActivity(tay);
            }
        });


        Button b_pemilihan = (Button)findViewById(R.id.b_pemilihan);
        b_pemilihan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Main.this, Pemilihan.class);
                startActivity(tay);
            }
        });



        Button b_credit = (Button)findViewById(R.id.b_credit);
        b_credit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Main.this, Credit.class);
                startActivity(tay);
            }
        });
    }

    public void onToggleClicked (View view){
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            audio.setVolume(0, 0);
        }
        else {
            audio.setVolume(1, 1);
        }
    }

    public void onBackPressed(){
        audio.stop();
        Main.this.finish();
    }

}