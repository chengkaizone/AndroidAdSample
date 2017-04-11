package com.tony.sample.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tony.sample.R;
import com.tony.sample.adapter.AdAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private AdAdapter adAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);

        List<String> data = new ArrayList<>();
        data.add("插屏广告");
        data.add("横幅广告");
        adAdapter = new AdAdapter(this, data);
        listView.setAdapter(adAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0:

                startActivity(new Intent(this, InterstitialAdActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, BannerAdActivity.class));
                break;
        }
    }
}
