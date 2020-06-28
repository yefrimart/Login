package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText TXT_USUARIO, TXT_CONTRA;
    Button btn, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TXT_USUARIO = (EditText)findViewById(R.id.editTextTextPersonName);
        TXT_CONTRA = (EditText)findViewById(R.id.editTextTextPassword);


        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String A_USER = TXT_USUARIO.getText().toString();
                String A_PASS = TXT_CONTRA.getText().toString();
                if (A_USER.equals("Wilis") && A_PASS.equals("12345678")){

                    Intent intent=new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña Invalidos", Toast.LENGTH_SHORT).show();
                }



            }
        });

        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TXT_USUARIO.getText().clear();
               TXT_CONTRA.getText().clear();

            }
        });
    }
}