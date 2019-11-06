package br.com.fiap.placarapp;

import android.os.PersistableBundle;
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

    private Integer placarCasa;

    private Integer placarVisitante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvTimeCasa = (TextView) findViewById(R.id.tvTimeCasa);
        tvTimeVisitante = (TextView) findViewById(R.id.tvTimeVisitante);

        tvTimeCasaPlacar = (TextView) findViewById(R.id.tvTimeCasaPlacar);
        tvTimeVisitantePlacar = (TextView) findViewById(R.id.tvTimeVisitantePlacar);


        if (getIntent() != null) {
            timeCasa = getIntent().getStringExtra("TIMECASA");
            timeVisitante = getIntent().getStringExtra("TIMEVISITANTE");

            tvTimeCasa.setText(timeCasa);
            tvTimeVisitante.setText(timeVisitante);
        }

        if (savedInstanceState != null) {
            placarCasa = savedInstanceState.getInt("GOLCASA");
            placarVisitante = savedInstanceState.getInt("GOLVISITANTE");

            tvTimeCasaPlacar.setText(String.valueOf(placarCasa));
            tvTimeVisitantePlacar.setText(String.valueOf(placarVisitante));
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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("GOLCASA", placarCasa);
        outState.putInt("GOLVISITANTE", placarVisitante);
    }
}