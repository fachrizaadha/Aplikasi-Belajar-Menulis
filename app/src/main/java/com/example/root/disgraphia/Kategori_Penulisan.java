package com.example.root.disgraphia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Kategori_Penulisan extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori__penulisan);

        final ImageView Huruf = (ImageView) findViewById(R.id.Huruf);
        Huruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Kategori_Penulisan.this, Pemilihan.class);
                startActivity(pindah);
            }
        });
        ImageView Angka= (ImageView) findViewById(R.id.Angka);
        Angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Kategori_Penulisan.this, Angka.class);
                startActivity(pindah);
            }
        });
        ImageView Buah= (ImageView) findViewById(R.id.Buah);
        Buah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Kategori_Penulisan.this,Buah.class);
                startActivity(pindah);
            }
        });
        ImageView Hewan = (ImageView) findViewById(R.id.Hewan);
        Hewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  pindah = new Intent(Kategori_Penulisan.this,Binatang.class);
                startActivity(pindah);
            }
        });

    }
}
