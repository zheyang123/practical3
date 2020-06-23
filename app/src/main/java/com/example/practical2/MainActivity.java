package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int mcount = 0;
private TextView mshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshow = (TextView) findViewById(R.id.show_count);
    }
    public void showToast(View view)
    {
Toast toast = Toast.makeText(this,R.string.text_massenges,Toast.LENGTH_SHORT);
     toast.show();
    }
    public void countup(View view)
    {
        mcount++;
        mshow.setText(Integer.toString(mcount));
    }
}