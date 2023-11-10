package raul.serrano.ejercicio01_introduccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtContador;
    private Button btnPulsa;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        inicializaVista();

        btnPulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                txtContador.setText(contador+" veces.");
            }
        });
    }

    private void inicializaVista() {
        txtContador = findViewById(R.id.txtContadorMain);
        btnPulsa = findViewById(R.id.btnPulsaMain);
    }
}