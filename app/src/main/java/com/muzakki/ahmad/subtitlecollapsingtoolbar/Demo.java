package com.muzakki.ahmad.subtitlecollapsingtoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.muzakki.ahmad.widget.CollapsingToolbarLayout;


public class Demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsing = (CollapsingToolbarLayout) findViewById(R.id.collapsing);
        //collapsing.setCollapsedTitleTextColor(getResources().getColor(android.R.color.white));
//        collapsing.setExpandedTitleColor(getResources().getColor(android.R.color.white));
    }
}
