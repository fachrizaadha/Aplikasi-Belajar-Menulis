package com.example.root.disgraphia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.radefffactory.paint.CanvasView;

public class Cat extends AppCompatActivity {
    private CanvasView canvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        canvasView = findViewById(R.id.canvas);
    }
    public void clearCanvas(View V){
        canvasView.clearCanvas();
    }
}