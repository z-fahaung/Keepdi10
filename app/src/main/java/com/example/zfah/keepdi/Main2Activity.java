package com.example.zfah.keepdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvtotal;
    Button btnadd;
    TextView tvsum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvsum2 = (TextView) findViewById(R.id.tvsum2);
        tvtotal = (TextView) findViewById(R.id.tvtotal);
        btnadd = (Button) findViewById(R.id.btnadd);
        Bundle bundle = getIntent().getExtras();
        Float result = bundle.getFloat("sum");
        tvsum2.setText(result+" ");

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link2 = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(link2);

            }
        });



    }
}

