package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity2 extends AppCompatActivity {
    EditText editText;
    TextView text;
    Button button1;
    String str;
    String gsturl = "https://appyflow.in/verify-gst/#getAPI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findView();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = editText.getText().toString();

                if(isValidGSTNo(str) == true){
                    text.setText(str + " is a correct gst number");
                }
                else{
                    text.setText("Please enter a valid gst nyumber");
                }
            }
        });
    }
    public static boolean isValidGSTNo(String str)
    {
        // Regex to check valid
        // GST (Goods and Services Tax) number
        String regex = "^[0-9]{2}[A-Z]{5}[0-9]{4}"
                + "[A-Z]{1}[1-9A-Z]{1}"
                + "Z[0-9A-Z]{1}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null)
        {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }
    public void findView(){
        editText = findViewById(R.id.editText);
        text = findViewById(R.id.text);
        button1 = findViewById(R.id.button1);
    }
   /* public class getGSTDetails extends AsyncTask<String, String, String> {


        @Override
        protected String doInBackground(String... strings) {
            return null;
        }
    }*/
}
