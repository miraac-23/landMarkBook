package com.basarsoft.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.AdapterView;
import android.widget.ListView;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.basarsoft.landmarkbookjava.databinding.ActivityDetailsBinding;
import com.basarsoft.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        //DATA
        landmarkArrayList = new ArrayList<>();

        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eifel = new Landmark("Eiffel","France",R.drawable.eifel);
        Landmark coloseum = new Landmark("Coloseum","Italy",R.drawable.coloseum);
        Landmark londonBridge = new Landmark("LondonBridge","England",R.drawable.london);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eifel);
        landmarkArrayList.add(coloseum);
        landmarkArrayList.add(londonBridge);


        //recyclerView

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);



        //ADAPTER

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,landmarkArrayList);








        //Listview

        

    }
}