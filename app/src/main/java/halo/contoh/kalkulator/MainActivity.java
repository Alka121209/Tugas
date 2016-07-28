package halo.contoh.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eda;
    EditText edb;
    EditText edhasil;
    Button btntambah;
    Button btnkali;
    Button btnbagi;
    Button btnclear;
    Button btnexit;
    Button btnkurang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eda=(EditText)findViewById(R.id.eda);
        edb=(EditText)findViewById(R.id.edb);
        edhasil=(EditText)findViewById(R.id.edhasil);
        btntambah=(Button)findViewById(R.id.btntambah);
        btnkali=(Button)findViewById(R.id.btnkali);
        btnclear=(Button)findViewById(R.id.btnclear);
        btnexit=(Button)findViewById(R.id.btnexit);
        btnbagi=(Button)findViewById(R.id.btnbagi);
        btnkurang=(Button)findViewById(R.id.btnkurang);


        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a=Double.parseDouble(eda.getText().toString());
                b=Double.parseDouble(edb.getText().toString());
                c=a+b;
                edhasil.setText(String.valueOf(c));
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a=Double.parseDouble(eda.getText().toString());
                b=Double.parseDouble(edb.getText().toString());
                c=a*b;
                edhasil.setText(String.valueOf(c));
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a=Double.parseDouble(eda.getText().toString());
                b=Double.parseDouble(edb.getText().toString());
                c=a/b;
                edhasil.setText(String.valueOf(c));
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a=Double.parseDouble(eda.getText().toString());
                b=Double.parseDouble(edb.getText().toString());
                c=a-b;
                edhasil.setText(String.valueOf(c));
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eda.setText("");
                edb.setText("");
                edhasil.setText("");
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
