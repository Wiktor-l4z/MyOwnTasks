package com.example.l4z.justjava;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whippedCreamCheckBox);
        boolean addWhippedCream = whippedCreamCheckBox.isChecked();

        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
        boolean addChocolate = chocolate.isChecked();

        int price = calculatePrice(addWhippedCream, addChocolate);
        String priceMessage = createOrderSummary(name, price, addWhippedCream, addChocolate);
        orderText(priceMessage);


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Just Java order for" + name);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    public String createOrderSummary(String name, int price, boolean addWhippedCream, boolean hasChocolate) {

        String priceMessage = getString(R.string.name, name);
        priceMessage += getString(R.string.add_whipped_cream) + addWhippedCream + "+1$";
        priceMessage += getString(R.string.add_chocolate) + hasChocolate + "+2$";
        priceMessage += getString(R.string.quantity) + quantity;
        priceMessage += getString(R.string.total) + price;
        priceMessage += getString(R.string.thank_you);
        return priceMessage;

    }

    private int calculatePrice(boolean addWhippedCream, boolean addChocolate) {
        int basePrice = 5;

        if (addChocolate) {
            basePrice += 2;
        }
        if (addWhippedCream) {
            basePrice += 1;
        }
        return quantity * basePrice;
    }

    public void increment(View view) {
        if (quantity == 100) {
            Toast.makeText(this, "You cannot have more than 100 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity++;
        displayQuantity(quantity);
    }

    public void decrement(View view) {


        if (quantity == 1) {
            Toast.makeText(this, "You cannot have less than 1 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
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