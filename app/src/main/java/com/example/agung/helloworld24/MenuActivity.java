package com.example.agung.helloworld24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button calculateNilai = (Button) findViewById(R.id.calculate_nilai_button);
        calculateNilai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getBaseContext(),CalculateNilaiActivity.class);
                startActivity(i);
            }
        });
        Button aboutUs = (Button) findViewById(R.id.about_us_button);
        aboutUs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getBaseContext(),AboutUsActivity.class);
                startActivity(i);
            }
        });
    }

}
