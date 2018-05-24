package com.example.android.java;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FrameLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainer = (FrameLayout) findViewById(R.id.frameLayout);
    }

    public void onRunBtnClick(View v) {
        //displayMessage("Running code!");
        View circle = new CircleView(this, Color.RED); //color of the circle
        mContainer.addView(circle);
    }

    public void displayMessage(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    class CircleView extends View {

        private int color;
        public CircleView(Context context, int color) {
            super(context);
            this.color = color;
        }

        //When the onDraw method is called it passes in a reference to a Canvas object
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas); //in canvas you can draw whatever you want

            int x = getWidth();
            int y = getHeight();

            int radius = 300;

            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.BLACK); //background color
            canvas.drawPaint(paint);

            paint.setColor(color);
            canvas.drawCircle(x / 2, y / 2, radius, paint);
            }
        }
    }

