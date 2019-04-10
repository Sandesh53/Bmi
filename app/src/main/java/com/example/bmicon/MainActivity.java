package com.example.bmicon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText Height,Weight;
    TextView result;
    Button btn1;
    bmi bmicon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Height = findViewById(R.id.Height);
        Weight = findViewById(R.id.Weight);
        result = findViewById(R.id.result);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        bmicon = new bmi();
    }

    @Override
    public void onClick(View v) {
        Toast toast;
        switch (v.getId()){
            case R.id.btn1:
                float value;
                bmicon.setHeight(Float.parseFloat(Height.getText().toString()));
                bmicon.setWeight(Float.parseFloat(Weight.getText().toString()));
                value=bmicon.Cal();
                result.setText(Float.toString(value));
                if (value < 18.5){
                    toast = Toast.makeText(this, "Under weight", Toast.LENGTH_SHORT);
                    toast.show();
                }else if (value > 18.5 && value < 24.9){
                    toast= Toast.makeText(

                            this, "Normal weight", Toast.LENGTH_SHORT);
                    toast.show();
                }else if(value > 25 && value < 29.9){
                    toast = Toast.makeText(this, "Overweight", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    toast = Toast.makeText(this, "Obesity", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            default:
                break;
        }
    }

}