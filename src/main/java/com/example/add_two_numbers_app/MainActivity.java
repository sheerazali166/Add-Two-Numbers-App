package com.example.add_two_numbers_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextKinzaNumber1, editTextRabiaNumber2;

    Button buttonKinzaSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        kinzaAddNumbers_2();



    }

    private void kinzaAddNumbers_2() {

        editTextKinzaNumber1 = findViewById(R.id.kinza);

        editTextRabiaNumber2 = findViewById(R.id.rabia);

        buttonKinzaSum = findViewById(R.id.kinza_amjad_button);


        buttonKinzaSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String kinza = editTextKinzaNumber1.getText().toString();

                String rabia = editTextRabiaNumber2.getText().toString();

                int k = Integer.parseInt(kinza);

                int r = Integer.parseInt(rabia);

                int kinzaSum = k + r;

                Toast.makeText(getApplicationContext(), String.valueOf(kinzaSum), Toast.LENGTH_SHORT).show();
            }
        });
    }
}