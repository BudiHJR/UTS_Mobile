package com.example.hikineet.uts_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailActivity4 extends AppCompatActivity {

    EditText masukkan1,masukkan2;
    Button luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        masukkan1 = (EditText) findViewById(R.id.editText1);
        masukkan2 = (EditText) findViewById(R.id.editText2);
        luas = (Button)findViewById(R.id.luas);
        keliling = (Button)findViewById(R.id.keliling);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int nilai1 = Integer.parseInt(masukkan1.getText().toString());
                    int nilai2 = Integer.parseInt(masukkan2.getText().toString());
                    Intent intent = new Intent(DetailActivity4.this,HasilActivity.class);
                    startActivity(intent);

                }catch (Exception d){

                }
            }
        });
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int nilai1 = Integer.parseInt(masukkan1.getText().toString());
                    int nilai2 = Integer.parseInt(masukkan2.getText().toString());
                    Intent intent = new Intent(DetailActivity4.this,HasilActivity.class);
                    startActivity(intent);

                }catch (Exception d){

                }
            }
        });
    }
}
