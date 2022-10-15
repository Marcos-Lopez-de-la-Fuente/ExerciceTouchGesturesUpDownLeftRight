package com.example.detectordedirecciones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private GestureDetectorCompat mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDetector = new GestureDetectorCompat(this,this);
        mDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (this.mDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        if (distanceY > 200) {
            Toast.makeText(this, "Up", Toast.LENGTH_LONG).show();
        } else if (distanceY < -200) {
            Toast.makeText(this, "Down", Toast.LENGTH_LONG).show();
        } else if (distanceX > 100) {
            Toast.makeText(this, "Left", Toast.LENGTH_LONG).show();
        } else if (distanceX < -100) {
            Toast.makeText(this, "Right", Toast.LENGTH_LONG).show();
        }
        // Prueba
        // You can change the priority if you want to prioritize vertical or horizontal scrolling
        /*
        if (distanceX > 50) {
            Toast.makeText(this, "Izquierda", Toast.LENGTH_LONG).show();
        } else if (distanceX < -50) {
            Toast.makeText(this, "Derecha", Toast.LENGTH_LONG).show();
        } else if (distanceY > 100) {
            Toast.makeText(this, "Arriba", Toast.LENGTH_LONG).show();
        } else if (distanceY < -100) {
            Toast.makeText(this, "Abajo", Toast.LENGTH_LONG).show();
        }*/


        return true;
    }




    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }
}