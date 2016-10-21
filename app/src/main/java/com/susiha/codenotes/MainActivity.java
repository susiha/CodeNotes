package com.susiha.codenotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.RecycledViewPool pools;
    private RecyclerView.Recycler recycle;
    private RecyclerView.RecyclerListener recyclerListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
    }
}
