package com.chishenme.jjiang.chishenme.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.chishenme.jjiang.chishenme.R;

public class PoolActivity extends AppCompatActivity {


    private RecyclerView restaurant_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pool);
        restaurant_list = (RecyclerView) findViewById(R.id.rv_restaurant_list);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_add_restaurant);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
