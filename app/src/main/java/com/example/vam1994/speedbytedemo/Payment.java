package com.example.vam1994.speedbytedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Payment extends AppCompatActivity {

    static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        button = (Button)findViewById(R.id.payButton);
        clickButton();

    }

    public void clickButton(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Payment Confirmed!!!", Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(Payment.this, RatingPage.class);
                startActivity(intent);
            }
        });
    }

}
