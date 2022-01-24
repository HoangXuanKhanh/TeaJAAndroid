package com.example.teaja.Learning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.teaja.R;

public class MainActivityKanji extends AppCompatActivity {

    private Toolbar tlKanji;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kanji);
        tlKanji = findViewById(R.id.Tool_ComeBackKanji);

        setSupportActionBar(tlKanji);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_set, menu);
        return super.onCreateOptionsMenu(menu);
    }
}