package com.example.root.disgraphia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Angka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        Button button_0 = (Button)findViewById(R.id.button_0);
        button_0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_0.class);
                startActivity(tay);
            }
        });

        Button button_1 = (Button)findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_1.class);
                startActivity(tay);
            }
        });

        Button button_2 = (Button)findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_2.class);
                startActivity(tay);
            }
        });

        Button button_3 = (Button)findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_3.class);
                startActivity(tay);
            }
        });

        Button button_4 = (Button)findViewById(R.id.button_4);
        button_4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_4.class);
                startActivity(tay);
            }
        });

        Button button_5 = (Button)findViewById(R.id.button_5);
        button_5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_5.class);
                startActivity(tay);
            }
        });

        Button button_6 = (Button)findViewById(R.id.button_6);
        button_6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_6.class);
                startActivity(tay);
            }
        });

        Button button_7 = (Button)findViewById(R.id.button_7);
        button_7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_7.class);
                startActivity(tay);
            }
        });

        Button button_8 = (Button)findViewById(R.id.button_8);
        button_8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_8.class);
                startActivity(tay);
            }
        });

        Button button_9 = (Button)findViewById(R.id.button_9);
        button_9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(Angka.this, nomor_9.class);
                startActivity(tay);
            }
        });

    }
}
