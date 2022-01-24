package layoufavorite.CataloryOne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.teaja.R;

public class DetaileCata2 extends AppCompatActivity {
    private Toolbar tlCaCa2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaile_cata2);
        tlCaCa2 = findViewById(R.id.Tool_ComeBackTC2);

        setSupportActionBar(tlCaCa2);
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