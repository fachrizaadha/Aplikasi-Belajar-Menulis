package com.example.root.disgraphia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.radefffactory.paint.CanvasView;

public class nomor_9 extends AppCompatActivity {

    private CanvasView canvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomor_9);

        canvasView = (CanvasView) findViewById(R.id.canvas);
    }
    public void clearCanvas(View V){
        canvasView.clearCanvas();
    }
}
