package com.example.agung.helloworld24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculateNilaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_nilai);
        final EditText UTSTeori = (EditText) findViewById(R.id.nilai_uts_teori_text);
        final EditText UTSPraktek = (EditText) findViewById(R.id.nilai_uts_praktek_text);
        final EditText UASTeori = (EditText) findViewById(R.id.nilai_uas_teori_text);
        final EditText UASPraktek = (EditText) findViewById(R.id.nilai_uas_praktek_text);
        final EditText TugasPraktek = (EditText) findViewById(R.id.nilai_tugas_praktek_text);
        final EditText TugasTeori = (EditText) findViewById(R.id.nilai_tugas_teori_text);
        final TextView nilai = (TextView) findViewById(R.id.nilai_akhir_text);
        DecimalFormat tes = new DecimalFormat("#.##");

        Button Hitungbutton = (Button) findViewById(R.id.hitung_button);
        Hitungbutton.setOnClickListener({
        public void Onclick()
        if (UTSPraktek && UASPraktek && TugasPraktek == "NULL") {
            float nilaiakhir = (UASTeori * 0.4 + UTSTeori * 0.3 + TugasTeori * 0.3);
            nilai.setText(String.valueOf(nilaiakhir));
        } else {
            float nilai = (((UASTeori * 0.4 + UTSTeori * 0.3 + TugasTeori * 0.3) * 0.6 + (UASPraktek * 0.4 + UTSPraktek * 0.3 + TugasPraktek * 0.3)));
            nilai.setText(String.valueOf(nilaiakhir));
        }

        Hitungbutton.setText(tes);

        });
    }
}
