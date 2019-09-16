package com.example.student.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFootballer;
    ArrayList<Footballer> arrfbl;
    FootballerAdapter fadt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFootballer = (ListView)findViewById(R.id.lvFootballer);
        arrfbl = new ArrayList<>();

        arrfbl.add(new Footballer("Beckham","1975", R.drawable.beckham));
        arrfbl.add(new Footballer("Messi","1987", R.drawable.messi));
        fadt = new FootballerAdapter(MainActivity.this, R.layout.footballer, arrfbl);
        lvFootballer.setAdapter(fadt);
    }
}
