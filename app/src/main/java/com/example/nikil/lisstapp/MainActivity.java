package com.example.nikil.lisstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 private ListView lv;
    private Employee_Adapter adapter;
    private List<Employee>employeeList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listview_Employee);
        employeeList=new ArrayList<>();
        employeeList.add(new Employee("Name:ram","Position:HR","Address:thimi","Email:RamHR@hotmail.com"));
        employeeList.add(new Employee("Name:Sam","Position:Manager","Address:ktm","Email:sam@hotmail.com"));
        employeeList.add(new Employee("Name:Bam","Position:peon","Address:BKT","Email:bam@hotmail.com"));
        employeeList.add(new Employee("Name:Raul","Position:waterman","Address:PTN","Email:raul@hotmail.com"));

        adapter=new Employee_Adapter(getApplicationContext(),employeeList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),"Name of Employee",Toast.LENGTH_SHORT).show();
            }
        });



        }

    }

