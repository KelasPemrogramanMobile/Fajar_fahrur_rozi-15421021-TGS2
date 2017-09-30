package com.el_fachru.proyek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tampilan extends AppCompatActivity {

    TextView textNama, textNpm, textTtl, textAgama, textFakultas, textProdi;
    Intent nama, npm, ttl, agama, fakultas, prodi;
    String strNama, strNpm, strTtl, strAgama, strFakultas, strProdi;
    Button btnback, btnexit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        textNama = (TextView) findViewById(R.id.textNama);
        textNpm = (TextView) findViewById(R.id.textNpm);
        textTtl = (TextView) findViewById(R.id.textTtl);
        textAgama = (TextView) findViewById(R.id.textAgama);
        textFakultas = (TextView) findViewById(R.id.textFakultas);
        textProdi = (TextView) findViewById(R.id.textProdi);
        btnback = (Button) findViewById(R.id.kembali);

        nama = getIntent();
        strNama = nama.getStringExtra("Nama");
        textNama.setText(strNama);

        npm = getIntent();
        strNpm = npm.getStringExtra("Npm");
        textNpm.setText(strNpm);

        ttl = getIntent();
        strTtl = ttl.getStringExtra("Ttl");
        textTtl.setText(strTtl);

        agama = getIntent();
        strAgama = agama.getStringExtra("Agama");
        textAgama.setText(strAgama);

        fakultas = getIntent();
        strFakultas = fakultas.getStringExtra("Fakultas");
        textFakultas.setText(strFakultas);

        prodi = getIntent();
        strProdi = prodi.getStringExtra("Prodi");
        textProdi.setText(strProdi);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(tampilan.this, MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });

        btnexit = (Button) findViewById(R.id.keluar);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilan.this.finish();
            }
        });
    }
}