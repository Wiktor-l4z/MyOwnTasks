package com.example.l4z.fragmentselector;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements OverviewFragment.OverviewFragmentActivityListener{


    private boolean isLand = false;
    private final FragmentManager fm = getFragmentManager();
    private Fragment currentFragment = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // pobieramy informację o pozycji urządzenia
        this.isLand = getResources().getBoolean(R.bool.isLand);

        // w trybie portrait dodajemy do kontenera OverviewFragment
        if (!this.isLand) {
            setOverviewFragment();
        }
    }


    @Override
    public void onItemSelected(String msg) {
        DetailFragment fragment = (DetailFragment) getFragmentManager()
                .findFragmentById(R.id.detailFragment);

        // tryb landscape
        if (fragment != null && fragment.isInLayout()) {
            fragment.setText(msg);
        } else {

            setDetailsFragment();
            this.fm.executePendingTransactions();

            // ustawiamy tekst fragmentu
            ((DetailFragment) this.currentFragment).setText(msg);
        }
    }

    private void setOverviewFragment() {
        FragmentTransaction ft = this.fm.beginTransaction();
        this.currentFragment = new OverviewFragment();
        ft.replace(R.id.fragment_container, this.currentFragment);
        ft.commit();
    }

    private void setDetailsFragment() {
        FragmentTransaction ft = this.fm.beginTransaction();
        this.currentFragment = new DetailFragment();
        ft.replace(R.id.fragment_container, this.currentFragment);

        // dodajemy transakcję na stos
        // dzięki temu możemy wrócić przyciskiem BACK
        ft.addToBackStack(null);

        // zatwierdzamy transakcję
        ft.commit();
    }

}
