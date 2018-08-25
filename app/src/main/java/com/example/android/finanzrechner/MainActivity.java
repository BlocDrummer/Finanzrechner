package com.example.android.finanzrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private EditText etAktuellerKontostand;
    private TextView tvAlleFixkosten;
    private TextView tvWahrerKontostand;
    private EditText etFixkostenName;
    private EditText etFixkosten;
    private Button btnFixkostenHinzufuegen;
    private Map<String, Double> fixkostenMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAktuellerKontostand = (EditText) findViewById(R.id.etAktuellerKontostand);
        tvAlleFixkosten = (TextView) findViewById(R.id.tvAlleFixkosten);
        tvWahrerKontostand = (TextView) findViewById(R.id.tvWahrerKontostand);
        etFixkostenName = (EditText) findViewById(R.id.etFixkostenname);
        etFixkosten = (EditText) findViewById(R.id.etFixkosten);
        btnFixkostenHinzufuegen = (Button) findViewById(R.id.btnFixkostenHinzufuegen);

        fixkostenMap = new HashMap<>();

        btnFixkostenHinzufuegen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fixkostenName = etFixkostenName.getText().toString();
                double fixkosten = Double.parseDouble(etFixkosten.getText().toString());
                fixkostenMap.put(fixkostenName, fixkosten);
                tvAlleFixkosten.append(fixkostenName + ": " + fixkosten + "\n");
            }
        });
    }
}
