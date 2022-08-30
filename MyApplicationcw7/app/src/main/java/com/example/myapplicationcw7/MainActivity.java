package com.example.myapplicationcw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Food> foods = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView foodName = findViewById(R.id.foodName);
        TextView foodPrice = findViewById(R.id.priceNumber);
        ImageView foodImage = findViewById(R.id.imageView);
        TextView pricetext = findViewById(R.id.foodPriceTxt);


        Food food1 = new Food("ButterChicken", 5 , R.drawable.btrchicken);
        Food food2 = new Food("سمبوسه", 3 , R.drawable.sambosa);
        Food food3 = new Food("مجبوس", 7 , R.drawable.machboos);
        Food food4 = new Food("كباب", 6 , R.drawable.kabab);
        Food food5 = new Food("لبن فريييش", 1 , R.drawable.laben);
        Food food6 = new Food("لقيمات ", 4 , R.drawable.loqaemat);

        foods.add(food1); //0
        foods.add(food2);//1
        foods.add(food3); //2
        foods.add(food4);// 3
        foods.add(food5);//4
        foods.add(food6);//5

        foodAdapter foodAdapter = new foodAdapter(this,0 , foods);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(foodAdapter);
    }
}