package com.example.kyle.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Spinner spinner1;
    private EditText e;
    private ImageButton ib;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.editText);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());

        iv = (ImageView) findViewById(R.id.imageView);

        ib = (ImageButton) findViewById(R.id.imageButton);
        ib.setOnClickListener(new Button_Clicker());
    }

    public void changeImage(View v){
        boolean checked= ((ToggleButton)v).isChecked();

        if(checked){
            iv.setImageResource(R.drawable.fail);
        }
        else {
            iv.setImageResource(0);
        }
    }
    class Button_Clicker implements Button.OnClickListener

    {

        @Override

        public void onClick(View v) {


            if (v == ib) {
                iv.setImageResource(R.drawable.download);

            }
        }
    }

    class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            if (pos > 0) {
                String a = String.valueOf(spinner1.getSelectedItem());
                Toast.makeText(parent.getContext(), "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();


                if (a.equals("COMP3606")) {
                    e.setText("45");
                }

                if (a.equals("COMP3607")) {

                    e.setText("10");
                }
                if (a.equals("COMP1600")) {

                    e.setText("30");
                }
                if (a.equals("COMP3613")) {

                    e.setText("47");
                }
                if (a.equals("COMP3588")) {

                    e.setText("30");
                }
            }
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub
        }

    }



}

