package com.example.root.disgraphia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.radefffactory.paint.CanvasView;

public class Mangga extends AppCompatActivity {


    private CanvasView canvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangga);
        canvasView = findViewById(R.id.canvas);
    }
    public void clearCanvas(View V){
        canvasView.clearCanvas();
    }
}