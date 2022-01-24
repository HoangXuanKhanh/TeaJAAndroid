package com.example.teaja.HistoryDetail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.teaja.R;

public class DetaileTraCuu extends AppCompatActivity {
    private Toolbar tlHis10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaile_tra_cuu);
        tlHis10 = findViewById(R.id.Tool_his10);

        setSupportActionBar(tlHis10);
        if (getSupportActionBar() != null) {
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