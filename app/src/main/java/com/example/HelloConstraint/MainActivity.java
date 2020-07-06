package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int mcount = 0;
private TextView mshow;
private Button zero;
private Button count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshow = (TextView) findViewById(R.id.show_count);
        zero = (Button) findViewById(R.id.ZERO);
        count = (Button) findViewById(R.id.button_count);
    }
    public void showToast(View view)
    {
Toast toast = Toast.makeText(this,R.string.text_massenges,Toast.LENGTH_SHORT);
     toast.show();
    }
    public void countup(View view)
    {
        mcount++;
        zero.setBackgroundColor(getResources().getColor(R.color.red));
        mshow.setText(Integer.toString(mcount));
        if(mcount%2==0)
        {
            count.setBackgroundColor(getResources().getColor(R.color.green));
        }
        else
            count.setBackgroundColor(getResources().getColor(R.color.blue));
    }
    public void zerofunctons(View view)
    {
        mcount=0;
        zero.setBackgroundColor(getResources().getColor(R.color.gray));
        count.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        mshow.setText(Integer.toString(mcount));
    }
}