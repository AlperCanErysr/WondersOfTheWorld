package com.can_erysr.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;
import java.util.Locale;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.can_erysr.wondersoftheworld.databinding.ActivityDetailsBinding;
import com.can_erysr.wondersoftheworld.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Wonders> wondersArrayList;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        wondersArrayList = new ArrayList<>();

        Wonders artemis = new Wonders("Temple of Artemis","Turkey",
                " The Temple of Artemis is also known as the Temple of Diana. The temple dedicated to the Goddess Artemis was completed in Ephesus around 550 BC. The temple was built entirely of marble. Today, only a few pieces of marble remain from the temple, which is considered one of the seven wonders of the world.",
                R.drawable.artemis);
        Wonders babil = new Wonders("Hanging Gardens of Babylon","Iraq",
                "The Hanging Gardens of Babylon was one of the Seven Wonders of the Ancient World listed by the Hellenic culture. They have been described as a remarkable feat of engineering, with a growing series of gardens containing a wide variety of trees, shrubs and vines, resembling a large green mountain built from mud bricks.",
                R.drawable.babil);
        Wonders giza = new Wonders("Great Pyramid of Giza","Egypt",
                "The Pyramid of Cheops, the Pyramid of Khufu or the Great Pyramid; It is the oldest and largest of the three monumental pyramids found in the ancient \"tomb city of Giza\" surrounding Giza, which is now part of Egypt's capital, Cairo.",
                R.drawable.giza);
        Wonders halikarnas = new Wonders("Mausoleum at Halicarnassus","Turkey",
                "The Mausoleum of Halicarnassus, built by his wife and sister Artemisia on behalf of King Mausolos, in Halicarnassus, one of the Seven Wonders of the World, is a very large tomb that resembles Greek architecture with its columns and Egyptian architecture with its pyramid-shaped roof.",
                R.drawable.halikarnas);
        Wonders iskenderiye = new Wonders("Lighthouse of Alexandria","Egypt",
                "Alexandria Lighthouse was built in Alexandria, Egypt; it is one of the Seven Wonders of the World and the tallest of the lighthouses ever built.",
                R.drawable.iskenderiye);
        Wonders rodos = new Wonders("Colossus of Rhodes","Greece",
                "The Statue of Rhodes is one of the seven wonders of the Ancient World. It is the statue of the Greek Sun God Helios, located at the entrance of the harbor of the city of Rhodes on the island of Rhodes in ancient times.",
                R.drawable.rodos);
        Wonders zeus = new Wonders("Statue of Zeus at Olympia","Turkey",
                "Zeus statue, BC It was a gigantic statue depicting the god Zeus seated, made by Fidias for the Temple of Zeus, built on Mount Olympus in 456. Fidias BC. His magnificent 13-meter-high work, which is estimated to have been made between 438 and 430, is among the Seven Wonders of the World.",
                R.drawable.zeus);

        wondersArrayList.add(artemis);
        wondersArrayList.add(babil);
        wondersArrayList.add(giza);
        wondersArrayList.add(halikarnas);
        wondersArrayList.add(iskenderiye);
        wondersArrayList.add(rodos);
        wondersArrayList.add(zeus);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(wondersArrayList);
        binding.recyclerView.setAdapter(recyclerAdapter);

        /*
        //Adapter
        //Listview

        //mapping

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                wondersArrayList.stream().map(wonders -> wonders.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("wondersoftheworld",wondersArrayList.get(position));
                startActivity(intent);
            }
        });
         */

    }
}