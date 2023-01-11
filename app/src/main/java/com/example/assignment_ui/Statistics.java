package com.example.assignment_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import org.eazegraph.lib.charts.ValueLineChart;
import org.eazegraph.lib.models.ValueLinePoint;
import org.eazegraph.lib.models.ValueLineSeries;

import java.util.ArrayList;
import java.util.List;

public class Statistics extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ValueLineChart valueLineChart;
    String[] feature={"Expences","Balance"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        Spinner spinner=findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Statistics.this, android.R.layout.simple_spinner_item,feature);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        valueLineChart=findViewById(R.id.valuelinechart);
        ValueLineSeries series=new ValueLineSeries();
        series.setColor(0xFF56B7F1);

        series.addPoint(new ValueLinePoint("Jan", 123));
        series.addPoint(new ValueLinePoint("Feb", 876));
        series.addPoint(new ValueLinePoint("Mar", 1230));
        series.addPoint(new ValueLinePoint("Apr", 588));
        series.addPoint(new ValueLinePoint("May", 987));
        series.addPoint(new ValueLinePoint("Jun", 345));
        series.addPoint(new ValueLinePoint("Jul", 897));
        series.addPoint(new ValueLinePoint("Aug", 678));
        series.addPoint(new ValueLinePoint("Sep", 998));
        series.addPoint(new ValueLinePoint("Oct", 345));
        series.addPoint(new ValueLinePoint("Nov", 400));
        series.addPoint(new ValueLinePoint("Dec", 786));

        valueLineChart.addSeries(series);
        valueLineChart.startAnimation();

        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        List<Item> items=new ArrayList<Item>();
        items.add(new Item("Starbucks","Jan 12,2022","-$ 150.00",R.drawable.img_1));
        items.add(new Item("Transfer","Yesterday","-$ 110.00",R.drawable.img_2));
        items.add(new Item("Youtube","Jan 16,2022","-$ 11.99",R.drawable.img));
        items.add(new Item("Person","Jan 11,2022","-$ 50.00",R.drawable.img_3));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text=adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}