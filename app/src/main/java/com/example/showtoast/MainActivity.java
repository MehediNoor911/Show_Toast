package com.example.showtoast;

import static com.example.showtoast.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView changetetxt=findViewById(R.id.textView2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button massage=findViewById(R.id.button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button count=findViewById(R.id.button2);


        counter=0;

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                changetetxt.setText(""+counter);
            }

        });


        massage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_SHORT).show();
                counter = 0;
                changetetxt.setText(String.valueOf(counter));
            }
        });



    }
}