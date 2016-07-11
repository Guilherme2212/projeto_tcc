package com.example.android.imagebutton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.imagebutton.adapters.ManutencoesListAdapter;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by U6031409 on 24/06/2016.
 */
public class ManutencoesList extends AppCompatActivity {

    private Date data;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.realizar_manutencoes_list_view);


        List<Manutencoes> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.id_lv_manutencoes);
        listView.setAdapter(new ManutencoesListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Manutencoes manutencoes = (Manutencoes) o;
                Toast.makeText(ManutencoesList.this, "Selected :" + " " + manutencoes, Toast.LENGTH_LONG).show();
                switch (position){
                    case 0 :
                        Intent newActivity = new Intent(ManutencoesList.this,Freios.class);
                        startActivity(newActivity);
                        break;
                }
            }
        });

    }

    private List<Manutencoes> getListData() {
        List<Manutencoes> list = new ArrayList<Manutencoes>();
        Manutencoes oleo = new Manutencoes("Óleo", "oil24", "22/12/1992");
        Manutencoes pneus = new Manutencoes("Pneus", "tire24", "22/12/1992");
        Manutencoes freio = new Manutencoes("Freios", "disco_freio24", "22/12/1992");


        list.add(oleo);
        list.add(pneus);
        list.add(freio);

        return list;
    }
}
