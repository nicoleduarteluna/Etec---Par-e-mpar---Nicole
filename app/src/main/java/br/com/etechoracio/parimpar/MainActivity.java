package br.com.etechoracio.parimpar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    EditText txtnumero;
    TextView lblResultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnumero = findViewById(R.id.txtNumero);
        lblResultado2 = findViewById(R.id.lblResultado2);
    }

    public void onProcessar(View v) {

        if (txtnumero.getText().toString().isEmpty()) {
            Toast.makeText(this, "Digite o valor", Toast.LENGTH_LONG).show();
        } else {
            int numero = Integer.parseInt(txtnumero.getText().toString());

            if (numero % 2 == 0) {
                lblResultado2.setText("PAR");
            } else {
                lblResultado2.setText("ÍMPAR");
            }

        }
    }
}


