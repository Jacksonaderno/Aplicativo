package com.example.aluno.aplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Informcao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informcao);
        Button BtnEnviar = (Button) findViewById(R.id.BtnEnviar);
        BtnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Informcao.this, RecebeInformacao.class);
            EditText mensagem = (EditText) findViewById(R.id.Mensagem);
                Bundle bundle = new Bundle();
                bundle.putString("agendaA",mensagem.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
