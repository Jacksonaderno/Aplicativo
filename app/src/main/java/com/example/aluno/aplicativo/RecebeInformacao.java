package com.example.aluno.aplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class RecebeInformacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_informacao);
        EditText editText = (EditText) findViewById(R.id.informacao);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String mensagem = bundle.getString("agendaA");
        editText.setText(mensagem);
    }
}
