package br.com.fiap.placarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class GameActivity extends AppCompatActivity {

    private String timeCasa;
    private String timeVisitante;

    private TextView tvTimeCasa;
    private TextView tvTimeVisitante;

    private TextView tvTimeVisitantePlacar;

    private TextView tvTimeCasaPlacar;


    private Button btnGolVisitante;

    private Button btnGolCasa;

    private Integer placarCasa;

    private Integer placarVisitante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvTimeCasa = (TextView) findViewById(R.id.tvTimeCasa);
        tvTimeVisitante = (TextView) findViewById(R.id.tvTimeVisitante);

        if (getIntent() != null) {

            timeCasa = getIntent().getStringExtra("TIMECASA");
            timeVisitante = getIntent().getStringExtra("TIMEVISITANTE");

            tvTimeCasa.setText(timeCasa);
            tvTimeVisitante.setText(timeVisitante);

        }
    }

    public void golCasa(View v) {

        this.tvTimeCasaPlacar = (TextView) findViewById(R.id.tvTimeCasaPlacar);
        this.placarCasa = Integer.parseInt(tvTimeCasaPlacar.getText().toString()) + 1;
        this.tvTimeCasaPlacar.setText(this.placarCasa.toString());


    }

    public void golVisitante(View v) {

        this.tvTimeVisitantePlacar = (TextView) findViewById(R.id.tvTimeVisitantePlacar);
        this.placarVisitante = Integer.parseInt(tvTimeVisitantePlacar.getText().toString()) + 1;
        this.tvTimeVisitantePlacar.setText(this.placarVisitante.toString());

    }
}