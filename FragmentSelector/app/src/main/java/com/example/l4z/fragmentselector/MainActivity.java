package com.example.l4z.fragmentselector;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements OverviewFragment.OverviewFragmentActivityListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemSelected(String msg) {
        DetailFragment fragment = (DetailFragment) getFragmentManager()
                .findFragmentById(R.id.detailFragment);
        // jeżeli fragment istnieje w tej aktywności,
        // znaczy, że jesteśmy w trybie landscape
        if (fragment != null && fragment.isInLayout()) {
            fragment.setText(msg);
        } else {
            // w trybie portrait wywołujemy drugą aktywność
            Intent intent = new Intent(getApplicationContext(),
                    DetailActivity.class);
            intent.putExtra("msg", msg);
            startActivity(intent);
        }
    }
}
