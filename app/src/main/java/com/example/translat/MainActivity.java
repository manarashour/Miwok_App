package com.example.translat;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent n = new Intent(MainActivity.this, NumberActivity.class);
                        startActivity(n);
                    }
                });
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent c = new Intent(MainActivity.this, ColorsActivity.class);
                        startActivity(c);
                    }
                });
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent f = new Intent(MainActivity.this, FamilyActivity.class);
                        startActivity(f);
                    }
                });
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent p = new Intent(MainActivity.this, PhrasesActivity.class);
                        startActivity(p);
                    }
                });
    }

}
