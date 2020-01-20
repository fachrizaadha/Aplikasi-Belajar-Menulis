package com.example.root.disgraphia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.radefffactory.paint.CanvasView;

public class GambarZ extends AppCompatActivity {

    private CanvasView canvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar_z);

        canvasView = (CanvasView) findViewById(R.id.canvas);
    }
    public void clearCanvas(View V){
        canvasView.clearCanvas();
    }
}
