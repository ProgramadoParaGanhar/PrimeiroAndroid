package sp.senai.br.datanascimento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText etAnoNasc;
    TextView tvIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvIdade = findViewById(R.id.etNumeroNasc);
        tvIdade = findViewById(R.id.tvIdade);

    }

    public void CalcularIdade(View Calc){

        Calendar data = Calendar.getInstance();
        int iAnoAtual = data.get(Calendar.YEAR);
        int iAnoNasc = Integer.parseInt(etAnoNasc.getText().toString());
        int iDade = iAnoAtual - iAnoNasc;
        tvIdade.setText("Voce tem" + iDade + "anos");

        etAnoNasc.setText(null);
        etAnoNasc.requestFocus();
    }



}