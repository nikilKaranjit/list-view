package com.example.nikil.lisstapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Nikil on 8/9/2016.
 */
public class Employee_Adapter extends BaseAdapter {
    private Context context;
    private List<Employee> employeelist;

    public Employee_Adapter(Context context, List<Employee> employeelist) {
        this.context = context;
        this.employeelist = employeelist;
    }

    @Override
    public int getCount() {
        return employeelist.size();
    }

    @Override
    public Object getItem(int position) {
        return employeelist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= View.inflate(context,R.layout.item_employee,null);
        TextView tv_Name= (TextView)v.findViewById(R.id.tv_Name);
        TextView tv_position= (TextView)v.findViewById(R.id.tv_Position);
        TextView tv_address= (TextView)v.findViewById(R.id.tv_Address);
        TextView tv_email= (TextView)v.findViewById(R.id.tv_Email);

        tv_Name.setText(employeelist.get(position).getName());
        tv_position.setText(employeelist.get(position).getPosition());
        tv_address.setText(employeelist.get(position).getAddress());
        tv_email.setText(employeelist.get(position).getEmail());
        return v;
    }
}
