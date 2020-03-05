package com.example.enoticeboard;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText notice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notice=(EditText) findViewById(R.id.Notice);
        Button clickbutton=findViewById(R.id.clickbutton);
        Spinner department = findViewById(R.id.departmentspinner);
        ArrayAdapter <CharSequence> dadpater = ArrayAdapter.createFromResource(this, R.array.department, android.R.layout.simple_spinner_item);
        dadpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         department.setAdapter(dadpater);
         department.setOnItemSelectedListener(this);
    }

    public void addNotice(View view){
        String text= notice.getText().toString();
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(),text ,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
