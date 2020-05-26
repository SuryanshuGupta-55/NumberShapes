package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Calculate(View view){
        Number num=new Number();
        EditText enterNumber=findViewById(R.id.editText);
        Log.i("enterNumber",enterNumber.getText().toString());
        num.number=Integer.parseInt(enterNumber.getText().toString());
        String message="";
        if(num.isSquare() && num.isTraingle())
            message="The number is both.";
        else if(num.isTraingle())
            message="The number is a Triangle number.";
        else if(num.isSquare())
            message="The number is a Square number.";
        else
            message="The number is neither.";
        Toast.makeText(MainActivity.this, ""+message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
