package com.example.sppinerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     Spinner spinner;
     AutoCompleteTextView actextView;
    ArrayList<String> arrIds  = new ArrayList<>();
    ArrayList<String>  arrLanguages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        actextView = findViewById(R.id.actextView);

        arrIds.add("Aadhar Card");
        arrIds.add("Pan Card");
        arrIds.add("Voter Id Card");
        arrIds.add("Driving Licence");
        arrIds.add("Ration Card");
        arrIds.add("Xth Score Card");
        arrIds.add("XII Score Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);


        // autocompleteTextView
       arrLanguages.add("C");
       arrLanguages.add("C++");
        arrLanguages.add("PHP");
        arrLanguages.add("JAVA");
        arrLanguages.add("KOTLIN");
        arrLanguages.add("JS");
        arrLanguages.add("C#");

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguages);
        actextView.setAdapter(actvAdapter);
        actextView.setThreshold(1);


    }
}
