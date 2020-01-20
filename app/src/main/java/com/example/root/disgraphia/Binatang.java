package com.example.root.disgraphia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Binatang extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binatang);

        ImageView cat = findViewById(R.id.cat);
        cat.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            Intent pindah = new Intent(Binatang.this,Cat.class);
            startActivity(pindah);
          }
      });
        ImageView duck = findViewById(R.id.duck);
        duck.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent pindah = new Intent (Binatang.this,Duck.class);
              startActivity(pindah);
          }
      });
        ImageView cow = findViewById(R.id.cow);
        cow.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent pindah = new Intent(Binatang.this,Cow.class);
              startActivity(pindah);
          }
      });
        ImageView fish = findViewById(R.id.fish);
        fish.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent pindah = new Intent(Binatang.this,Fish.class);
              startActivity(pindah);
          }
      });
        ImageView bear = findViewById(R.id.bear);
        bear.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent pindah = new Intent (Binatang.this,Bear.class);
              startActivity(pindah);
          }
      });



    }
}
