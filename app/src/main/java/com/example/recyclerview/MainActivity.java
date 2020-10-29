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

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Alavés", "Pablo Machín", "Estadio de Mendizorroza"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Athletic", "Gaizka Garitano", "San Mamés"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Atlético", "Diego Simeone", "Wanda Metropolitano"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Barcelona", "Ronald Koeman", "Camp Nou"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Granada", "Diego Martínez", "Estadio Nuevo Los Cármenes"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"Real Madrid", "Zinedine Zidane", "Estadio Santiago Bernabéu"));

        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}