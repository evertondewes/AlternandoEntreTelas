package com.example.alternandoentretelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    public int contadorRecebido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent intent = getIntent() ;
        TextView tvSaida = findViewById(R.id.tvSaida);

        int contador = intent.getIntExtra("contador", -1);

        this.contadorRecebido = contador;
        if(contador > 0) {
            String s = String.valueOf(contador);

            tvSaida.setText(s);
        } else {
            tvSaida.setText("Erro na leitura do contador.");
        }
    }

    public void botaoRetornar(View v){
        Intent intentRetorno = new Intent();

        this.contadorRecebido = this.contadorRecebido + 1;

        intentRetorno.putExtra("contador", this.contadorRecebido);
        setResult( RESULT_OK, intentRetorno);
        finish();
    }

}
