package com.example.root.disgraphia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Buah extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        ImageView Pir = findViewById(R.id.pir);
        Pir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Buah.this,Pir.class);
                startActivity(pindah);
            }
        });
        ImageView Melon = findViewById(R.id.melon);
        Melon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Buah.this,Melon.class);
                startActivity(pindah);
            }
        });
        ImageView Mangga = findViewById(R.id.mangga);
        Mangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Buah.this,Mangga.class);
                startActivity(pindah);
            }
        });
        ImageView Anggur = findViewById(R.id.anggur);
        Anggur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Buah.this,Anggur.class);
                startActivity(pindah);
            }
        });
        ImageView Ceri = findViewById(R.id.ceri);
        Ceri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent (Buah.this,Ceri.class);
                startActivity(pindah);
            }
        });
    }
}
