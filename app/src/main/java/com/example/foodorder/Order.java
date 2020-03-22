package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Order extends AppCompatActivity {

    static final String EXTRA_NUM =  "com.example.foodorder.example.EXTRA_NUM";

    public int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }
    public void openActivity3(){
        Intent intent = new Intent(this, Activity3.class);
        intent.putExtra(EXTRA_NUM, a);
        startActivity(intent);
    }

    public void selectItem(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.chicken :
                if(checked){
                    a= a + 150;
                }
                else {
                    a = a-150;
                }
                break;
            case R.id.beef :
                if(checked){
                    a= a + 100;
                }
                else {
                    a = a-100;
                }
                break;
            case R.id.inchpizza :
                if(checked){
                    a= a + 350;
                }
                else {
                    a = a-350;
                }
                break;
            case R.id.pizza :
                if(checked){
                    a= a + 600;
                }
                else {
                    a = a-600;
                }
                break;
            case R.id.sandwich :
                if(checked){
                    a= a + 200;
                }
                else {
                    a = a-200;
                }
                break;
            case R.id.vegetable :
                if(checked){
                    a= a + 70;
                }
                else {
                    a = a-70;
                }
                break;
            case R.id.coffee :
                if(checked){
                    a= a + 50;
                }
                else {
                    a = a-50;
                }
                break;
            case R.id.tea :
                if(checked){
                    a= a + 20;
                }
                else {
                    a = a-20;
                }
                break;
        }
    }
}

