package com.example.projectmobile;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectmobile.model.Maison_d_hôte;
import com.example.projectmobile.model.MaisonsAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {
      private RecyclerView recyclerView;
      private RecyclerView.Adapter Myadapter;
     List<Maison_d_hôte> maisonDHôteList;
     private Button buttonAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView=findViewById(R.id.RV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Myadapter =new MaisonsAdapter(this,maisonDHôteList);
        recyclerView.setAdapter(Myadapter);
        buttonAdd = findViewById(R.id.addbutton);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });

    }



    }

