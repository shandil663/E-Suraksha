package com.example.e_suraksha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Dataafterprocessing extends AppCompatActivity {
RecyclerView rec;
List<Modal> data=new ArrayList<Modal>();
    AutoCompleteTextView txt1,txt2, txt3;
    String[] auto1={"9:30","10:00","10:15","10:20"};
    String[] auto2={"06/06/2022","07/06/2022","10/10/2023","24/11/2023"};

    String [] auto3={"Chandigarh","Mohali","Kharar","Ludhiana"};

    ArrayAdapter<String> adapterItems;
Button btn;
MyAdapter adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataafterprocessing);
        rec=findViewById(R.id.recview);
        btn=findViewById(R.id.button2);
        txt1=findViewById(R.id.auto1);
        txt2=findViewById(R.id.auto2);
        txt3=findViewById(R.id.auto3);
        data.add(new Modal("98675342423","Haryana"));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.getText().toString().equals("9:30")&&txt2.getText().toString().equals("06/06/2022")&&txt3.getText().toString().equals("Chandigarh")){
                    data.clear();
                    data.add(new Modal("6230097483","Chandigarh"));
                    data.add(new Modal("9142273099","Chandigarh"));
                    data.add(new Modal("6299849722","Chandigarh"));
                    data.add(new Modal("8541794431","Chandigarh"));
                    data.add(new Modal("8102951157","Chandigarh"));
                    rec.setLayoutManager(new LinearLayoutManager(Dataafterprocessing.this));
                    adp=new MyAdapter(data,Dataafterprocessing.this);
                    rec.setAdapter(adp);
                }

               else if(txt1.getText().toString().equals("10:00")&&txt2.getText().toString().equals("07/06/2022")&&txt3.getText().toString().equals("Mohali")){
                    data.clear();
                    data.add(new Modal("9831097483","Mohali"));
                    data.add(new Modal("6242473099","Mohali"));
                    data.add(new Modal("6299649722","Mohali"));
                    data.add(new Modal("9541794431","Mohali"));
                    data.add(new Modal("8106751157","Mohali"));
                    rec.setLayoutManager(new LinearLayoutManager(Dataafterprocessing.this));
                    adp=new MyAdapter(data,Dataafterprocessing.this);
                    rec.setAdapter(adp);
                }
                else if(txt1.getText().toString().equals("10:15")&&txt2.getText().toString().equals("10/10/2023")&&txt3.getText().toString().equals("Kharar")){
                    data.clear();
                    data.add(new Modal("9831097483","Kharar"));
                    data.add(new Modal("6242473099","Kharar"));
                    data.add(new Modal("6299649722","Kharar"));
                    data.add(new Modal("9541794431","Kharar"));
                    data.add(new Modal("8106751157","Kharar"));
                    rec.setLayoutManager(new LinearLayoutManager(Dataafterprocessing.this));
                    adp=new MyAdapter(data,Dataafterprocessing.this);
                    rec.setAdapter(adp);
                }

                else if(txt1.getText().toString().equals("10:20")&&txt2.getText().toString().equals("24/11/2023")&&txt3.getText().toString().equals("Ludhiana")){
                    data.clear();
                    data.add(new Modal("8231097483","Ludhiana"));
                    data.add(new Modal("9842473099","Ludhiana"));
                    data.add(new Modal("7899649722","Ludhiana"));
                    data.add(new Modal("6341794431","Ludhiana"));
                    data.add(new Modal("8706751157","Ludhiana"));
                    rec.setLayoutManager(new LinearLayoutManager(Dataafterprocessing.this));
                    adp=new MyAdapter(data,Dataafterprocessing.this);
                    rec.setAdapter(adp);
                }

            }
        });


        rec.setLayoutManager(new LinearLayoutManager(Dataafterprocessing.this));
        adp=new MyAdapter(data,Dataafterprocessing.this);
        rec.setAdapter(adp);
        adapterItems=new ArrayAdapter<String>(this,R.layout.list_item,auto1);
        txt1.setAdapter(adapterItems);
        txt1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item =adapterView.getItemAtPosition(i).toString();
            }
        });

        adapterItems=new ArrayAdapter<String>(this,R.layout.list_item,auto2);
        txt2.setAdapter(adapterItems);
        txt2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item =adapterView.getItemAtPosition(i).toString();
            }
        });

        adapterItems=new ArrayAdapter<String>(this,R.layout.list_item,auto3);
        txt3.setAdapter(adapterItems);
        txt3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item =adapterView.getItemAtPosition(i).toString();
            }
        });

    }
}