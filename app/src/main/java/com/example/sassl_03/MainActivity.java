package com.example.sassl_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.tvHasil);
        final EditText et1 = findViewById(R.id.editText);
        final EditText et2 = findViewById(R.id.editText2);
        final Button bt1 = findViewById(R.id.btjumlah);
        final Button bt2 = findViewById(R.id.btjumlah2);
        final Button bt3 = findViewById(R.id.btjumlah3);
        final Button bt4 = findViewById(R.id.btjumlah4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah="";
                if (v.getId()==bt1.getId()){
                    int x1=Integer.parseInt(et1.getText().toString());
                    int x2=Integer.parseInt(et2.getText().toString());
                    int hasil = x1+x2;
                    jumlah = String.valueOf(hasil);
                    tv.setText(jumlah);
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah="";
                if (v.getId()==bt2.getId()){
                    int x1=Integer.parseInt(et1.getText().toString());
                    int x2=Integer.parseInt(et2.getText().toString());
                    int hasil = x1-x2;
                    jumlah = String.valueOf(hasil);
                    tv.setText(jumlah);
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah="";
                if (v.getId()==bt3.getId()){
                    int x1=Integer.parseInt(et1.getText().toString());
                    int x2=Integer.parseInt(et2.getText().toString());
                    int hasil = x1*x2;
                    jumlah = String.valueOf(hasil);
                    tv.setText(jumlah);
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah="";
                if (v.getId()==bt4.getId()){
                    int x1=Integer.parseInt(et1.getText().toString());
                    int x2=Integer.parseInt(et2.getText().toString());
                    int hasil = x1/x2;
                    jumlah = String.valueOf(hasil);
                    tv.setText(jumlah);
                }
            }
        });


    }
};