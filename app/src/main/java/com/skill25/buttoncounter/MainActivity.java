package com.skill25.buttoncounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText userinput;
    private TextView textView;
    private Button button ;
    private Button button3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userinput = findViewById(R.id.editTextTextPersonName);
        textView = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        button3 = findViewById(R.id.button3);
        textView.setText("");

        View.OnClickListener butonView = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append(userinput.getText() + "\n");
            }
        };

        View.OnClickListener reset = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        };

        button.setOnClickListener(butonView);
        button3.setOnClickListener(reset);

    }



    }

