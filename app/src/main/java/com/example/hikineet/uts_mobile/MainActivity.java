package com.example.hikineet.uts_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    Intent intent;
    ListView list;
    String[] itemname = {
            "Persegi",
            "Lingkaran",
            "Segitiga",
            "Persegi Panjang",
            "Trapesium"
    };

    Integer[] imgid = {
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
        intent = new Intent(MainActivity.this , DetailActivity.class);
        list.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        switch(position){
            case 0 :
                intent.putExtra("judul","apalah");
                intent.putExtra("text","ajsdg");
                intent.putExtra("gambar","asdadf");
                startActivity(intent);
                break;
            default: break;
        }
    }
}
