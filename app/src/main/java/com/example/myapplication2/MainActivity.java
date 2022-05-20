package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edit_pochta,edit_parol;
    private Button btn_voity,btn_password_zaby1;
    private TextView Dobro,register,vhod;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_pochta = (EditText) findViewById(R.id.pochta);
        edit_parol = (EditText) findViewById(R.id.editparol);
        btn_voity = (Button) findViewById(R.id.voiti);
        btn_password_zaby1 = (Button) findViewById(R.id.password_zaby1);
        Dobro = (TextView) findViewById(R.id.Dobro);
        register = (TextView) findViewById(R.id.register);
        vhod = (TextView) findViewById(R.id.vhod);
        onclicklistener();
        edit_pochta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edit_pochta.getText().toString().isEmpty()) {
                    btn_voity.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.seryi));
                } else {
                    btn_voity.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
            }
            }
        });edit_parol.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edit_parol.getText().toString().isEmpty()) {
                    btn_voity.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.seryi));
                } else {
                    btn_voity.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
            }

            }
        });
    }
    private void onclicklistener() {
        btn_voity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_pochta.getText().toString().equals("admin@gmail.com") && edit_parol.getText().toString().equals("admin")){
                    btn_voity.setVisibility(View.GONE);
                    btn_password_zaby1.setVisibility(View.GONE);
                    edit_pochta.setVisibility(View.GONE);
                    edit_parol.setVisibility(View.GONE);
                    register.setVisibility(View.GONE);
                    vhod.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this,"Вы успешно зарегестрировались",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Неправильный логин и пароль",Toast.LENGTH_SHORT ).show();
                }
            }
        });
    }
}