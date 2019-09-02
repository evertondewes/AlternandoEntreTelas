package com.example.alternandoentretelas;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static public int CODIGO_TELA_2 = 2;

    public int contador = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trocarDeTela(View botao){
        Intent i = new Intent(this, Tela2.class);
        i.putExtra("contador", this.contador);
        this.startActivityForResult(i, MainActivity.CODIGO_TELA_2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView t = findViewById(R.id.resultadoTela2);

        int retorno = data.getIntExtra("contador", -1);

        this.contador = retorno;

        if(retorno > 0) {
            String s = String.valueOf(retorno);
            t.setText(s);
        } else {
            t.setText("Deu erro");
        }



    }
}
