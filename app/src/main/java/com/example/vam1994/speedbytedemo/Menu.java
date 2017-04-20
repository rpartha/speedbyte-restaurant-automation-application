package com.example.vam1994.speedbytedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Menu extends AppCompatActivity {

    static Button placeOrder;
    static ListView listViewMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listViewMenu = (ListView)findViewById(R.id.listViewMenu);
        placeOrder = (Button)findViewById(R.id.placeOrderButton);

        String[] menuItems = {"Cheese Burger-10 min", "Meatballs-12 min", "Pasta-10 min", "French fries-5 min", "Pasta-15 min", "Buffalo Chicken Wings-12 min", "Ice Cream-3 min"};

        ListAdapter listAdapter = new MenuAdapter(this, menuItems);

        listViewMenu.setAdapter(listAdapter);

        clickPlaceOrder();

    }


    public void clickPlaceOrder(){
        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, RatingPage.class);
                startActivity(intent);
            }
        });
    }
}
