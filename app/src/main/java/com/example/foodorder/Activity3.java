package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    public int number;
    public TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent intent = getIntent();
        number = intent.getIntExtra(Order.EXTRA_NUM, 0);

        textView1 = (TextView) findViewById(R.id.text1);
        textView1.setText("You have to pay "+number+ " TAKA to order the foods");

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

    }
    public  void openActivity4(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
