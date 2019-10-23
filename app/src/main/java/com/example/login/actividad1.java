package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class actividad1 extends AppCompatActivity {

    private TextView usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        usuario = (TextView)findViewById(R.id.usuario);

        Bundle bundle = getIntent().getExtras();
        usuario.setText(bundle.getString("nombre"));
    }

    public void cerrrarActivity(View view){
        finish();
    }
}
