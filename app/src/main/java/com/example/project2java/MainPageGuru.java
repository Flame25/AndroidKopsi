package com.example.project2java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainPageGuru extends AppCompatActivity {

    TextView titlepage, subtitlepage, endpage;
    DatabaseReference reference;
    RecyclerView ourdoes;
    ArrayList<MyDoes> list;
    DoesAdapter doesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_guru);

        titlepage = findViewById(R.id.titlepage);
        subtitlepage = findViewById(R.id.subtitlepage);
        endpage = findViewById(R.id.endingpage);

        // import font
        Typeface MLight = ResourcesCompat.getFont(this, R.font.ml);
        Typeface MMedium = ResourcesCompat.getFont(this, R.font.mm);

        // customize font
        titlepage.setTypeface(MMedium);
        subtitlepage.setTypeface(MLight);
        endpage.setTypeface(MLight);

        //Working With Data
        ourdoes = findViewById(R.id.ourdoes);
        ourdoes.setHasFixedSize(true);
        ourdoes.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<MyDoes>();

        doesAdapter = new DoesAdapter(this,list);
        ourdoes.setAdapter(doesAdapter);

        //Get Data From DataBase
        reference = FirebaseDatabase.getInstance("https://project-androidapps-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference();
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot snapshot1: snapshot.getChildren()) {
                    MyDoes p = snapshot1.getValue(MyDoes.class);
                    list.add(p);

                }
                doesAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "No Data", Toast.LENGTH_SHORT).show();
            }
        });


    }

}