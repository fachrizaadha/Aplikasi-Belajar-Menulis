package com.example.root.disgraphia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.radefffactory.paint.CanvasView;

public class GambarQ extends AppCompatActivity {

    private CanvasView canvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar_q);

        canvasView = (CanvasView) findViewById(R.id.canvas);

        Button b_next = (Button)findViewById(R.id.b_next);
        b_next.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent tay=new Intent(GambarQ.this, GambarR.class);
                startActivity(tay);
            }
        });
    }
    public void clearCanvas(View V){
        canvasView.clearCanvas();
    }
}
