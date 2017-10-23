package com.example.jose.id_23;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
   // public TextView Foto;
    public GridLayout gridLayout;
    public TextView album1, album2, album3, album4;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = (GridLayout) findViewById(R.id.info);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        album1 = (TextView) findViewById(R.id.textView);
        album2 = (TextView) findViewById(R.id.textView2);
        album3 = (TextView) findViewById(R.id.textView3);
        album4 = (TextView) findViewById(R.id.textView4);


        album1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setList(32);
            }
        });

        album2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setList(10);
            }
        });

        album3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setList(1);
            }
        });

        album4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setList(24);
            }
        });
    }

    private void setList(int items) {
        PhotosAdapter adapter = new PhotosAdapter(items, this);

        recyclerView.setBackgroundColor(Color.RED);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }

}
