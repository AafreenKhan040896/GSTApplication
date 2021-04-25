package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    Button gst_details_by_gstnumber;
    Button gst_details_by_pan;
    Button connect_professional;
    FloatingActionButton floatingActionButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        gst_details_by_gstnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gstbygstintent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(gstbygstintent);
            }
        });

        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MediaStore.ACTION_IMAGE_CAPTURE));
            }
        });
        
    }

    public void findViews(){
        gst_details_by_gstnumber = findViewById(R.id.gst_by_gstnumber);
        gst_details_by_pan = findViewById(R.id.gst_by_pan);
        connect_professional = findViewById(R.id.connect_professional);
        floatingActionButton2 = findViewById(R.id.floatingActionButton2);
    }
}