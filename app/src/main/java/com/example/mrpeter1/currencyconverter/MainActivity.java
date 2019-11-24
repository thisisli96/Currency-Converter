package com.example.mrpeter1.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button buttonconverter;
EditText astaga;
Integer tukarnilai ;
Integer hasilnilai;
String coba= "";
Integer nilaitukar = 14500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonconverter = findViewById(R.id.buttonconverter);
        astaga = findViewById(R.id.astaga);


//        tukarnilai = Integer.parseInt(editTextuang.getText().toString());
        buttonconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coba = astaga.getText().toString();
                tukarnilai = Integer.parseInt(astaga.getText().toString());

                Log.i("username", astaga.getText().toString() );
               // Log.i("password", textpassword.getText().toString() );
                hasilnilai = tukarnilai * nilaitukar;
                Toast.makeText(getApplicationContext(),"hi there "+ hasilnilai, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
