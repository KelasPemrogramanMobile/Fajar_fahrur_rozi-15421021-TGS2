package com.el_fachru.proyek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText masukNama, masukNpm, masukTtl, masukAgama, masukFakultas, masukProdi;
    private Button btnambildata, btnexit;
    String nama, npm, ttl, agama, fakultas, prodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masukNama = (EditText) findViewById(R.id.masukinNama);
        masukNpm = (EditText) findViewById(R.id.masukinNpm);
        masukTtl = (EditText) findViewById(R.id.masukinTtl);
        masukAgama= (EditText) findViewById(R.id.masukinAgama);
        masukFakultas = (EditText) findViewById(R.id.masukinFakultas);
        masukProdi = (EditText) findViewById(R.id.masukinProdi);
        btnambildata = (Button) findViewById(R.id.btinputdata);
        btnexit = (Button) findViewById(R.id.btkeluar);

        btnambildata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = masukNama.getText().toString();
                npm = masukNpm.getText().toString();
                ttl = masukTtl.getText().toString();
                agama = masukAgama.getText().toString();
                fakultas = masukFakultas.getText().toString();
                prodi = masukProdi.getText().toString();

                Intent go = new Intent(MainActivity.this, tampilan.class);
                go.putExtra("Nama", nama);
                go.putExtra("Npm", npm);
                go.putExtra("Ttl", ttl);
                go.putExtra("Agama", agama);
                go.putExtra("Fakultas", fakultas);
                go.putExtra("Prodi", prodi);
                startActivity(go);

                finish();
            }
        });

        btnexit = (Button) findViewById(R.id.btkeluar);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
            }
        });
    }
}
