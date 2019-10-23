package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.password);
    }


    public void validar(View view){
        try{

            String usu = usuario.getText().toString();
            String pass= password.getText().toString();

            if(usu.equals("andresgeo96@hotmail.com") && pass.equals("pass1234")){
                Intent i = new Intent(this,actividad1.class);
                i.putExtra("nombre",usuario.getText().toString());
                startActivity(i);
            }else{
                Intent i = new Intent(this,actividad2.class);
            }
        }catch (Exception e){

        }

    }


}
