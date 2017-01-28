package com.example.l4z.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    int quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
      CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whippedCreamCheckBox);
       boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        int price = calculatePrice();
        String priceMessage = createOrderSummary(price, hasWhippedCream);
        orderText(priceMessage);
    }

    public void increment(View view) {
        quantity++;
        displayQuantity(quantity);
    }

    public String createOrderSummary(int price, boolean addWhippedCream) {

        String priceMessage = "Name: Lyla the Labyrinth";
        priceMessage += "Add whipped cream?" + addWhippedCream;
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\nThank you!";
        return priceMessage;

    }

    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }

    public void decrement(View view) {
        quantity--;
        displayQuantity(quantity);
    }


    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void orderText(String priceMessage) {
        TextView quantityTextView = (TextView) findViewById(R.id.orderText);
        quantityTextView.setText(priceMessage);
    }
}