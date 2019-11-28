package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView);

        List <Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Dayahang Rai","9842145632",R.drawable.daya));
        contactsList.add(new Contacts("Rajesh Hamal","9856145839",R.drawable.rajesh));
        contactsList.add(new Contacts("Biwash Khatiwada","96569855888",R.drawable.biwash));
        contactsList.add(new Contacts("Saugat Malla","025985666",R.drawable.saugat));
        contactsList.add(new Contacts("Saugat Malla","025985666",R.drawable.saugat));
        contactsList.add(new Contacts("Saugat Malla","025985666",R.drawable.saugat));
        contactsList.add(new Contacts("Saugat Malla","025985666",R.drawable.saugat));
        contactsList.add(new Contacts("Saugat Malla","025985666",R.drawable.saugat));


        ContactAdapter contactAdapter=new ContactAdapter(this,contactsList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
