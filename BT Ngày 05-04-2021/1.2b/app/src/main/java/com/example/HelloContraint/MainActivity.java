package com.example.HelloContraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button btnZero, btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnCount = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if(mCount % 2==0){
            btnCount.setBackgroundColor(Color.GREEN);
        } else {
            btnCount.setBackgroundColor(Color.BLUE);
        }
        btnZero.setBackgroundColor(Color.MAGENTA);
    }

    public void setZero(View view) {
        mCount=0;
        mShowCount.setText("0");
        btnZero.setBackgroundColor(Color.parseColor("grey"));
    }
}