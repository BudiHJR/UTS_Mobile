package com.example.hikineet.uts_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView tampil;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        tampil = (TextView) findViewById(R.id.hasil);
        Intent intent = getIntent();
        data = intent.getStringExtra("hasil");
        tampil.setText(data);
        //ayas Zakaria
    }
}
