package com.applicationmobile.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    public static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        GridAdapter imageAdapter = new GridAdapter(this);
        ImageView imageView = findViewById(R.id.content_view);
        imageView.setImageResource(imageAdapter.thumbnail[position]);
    }
}