package com.example.zfah.keepdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText editincome;
    Button btnsubmit;
    TextView tvsum;
    Button btnnext;
    EditText editfixcost;
    Intent link1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editincome = (EditText) findViewById(R.id.editincome);
        editfixcost = (EditText) findViewById(R.id.editfixcost);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);
        tvsum = (TextView) findViewById(R.id.tvsum);
        btnnext = (Button) findViewById(R.id.btnnext);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=0;
                int num2=0;
                float result = 0;
                try{
                    num1 = Integer.parseInt(editincome.getText().toString());
                }
                catch (NumberFormatException e){}
                try{
                    num2 = Integer.parseInt(editfixcost.getText().toString());
                }
                catch (NumberFormatException e){}
                result = (num1 - num2) / 30;
                tvsum.setText(result+" ฿");


            }
        });

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                float total = 0;
                Intent link1 = new Intent(getApplicationContext(),Main2Activity.class);
                link1.putExtra("sum",total);
                startActivity(link1);


            }
        });


    }
}