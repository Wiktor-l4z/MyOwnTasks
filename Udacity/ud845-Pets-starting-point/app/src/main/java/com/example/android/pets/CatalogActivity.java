/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.pets;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import data.PetContract;

import static data.PetContract.TABLE_NAME;

/**
 * Displays list of pets that were entered and stored in the app.
 */
public class CatalogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        // Setup FAB to open EditorActivity
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CatalogActivity.this, EditorActivity.class);
                startActivity(intent);
            }
        });
        displayDatabaseInfo();
    }

    private void displayDatabaseInfo() {


        // To access our database, we instantiate our subclass of SQLiteOpenHelper
        // and pass the context, which is the current activity.
        PetDbHelper mDbHelper = new PetDbHelper(this);

        // Create and/or open a database to read from it
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] projection = {
                PetContract._ID,
                PetContract.COLUMN_PET_NAME,
                PetContract.COLUMN_PET_BREED,
                PetContract.COLUMN_PET_GENDER,
                PetContract.COLUMN_PET_WEIGHT};

        Cursor cursor = db.query(TABLE_NAME, projection, null, null, null, null, null);

        // Perform this raw SQL query "SELECT * FROM pets"
        // to get a Cursor that contains all rows from the pets table.
        // Cursor cursor = db.rawQuery("SELECT * FROM " + PetContract.TABLE_NAME, null);

        TextView displayView = (TextView) findViewById(R.id.text_view_pet);
        try {
            // Display the number of rows in the Cursor (which reflects the number of rows in the
            // pets table in the database).

            displayView.setText("Number of rows in pets database table: " + cursor.getCount() + "\n\n");
            displayView.append(PetContract._ID + " - "
                    + PetContract.COLUMN_PET_NAME + " - "
                    + PetContract.COLUMN_PET_GENDER + " - "
                    + PetContract.COLUMN_PET_WEIGHT + " - "
                    + PetContract.COLUMN_PET_BREED + " - " + "\n");

            int idColumnInedex = cursor.getColumnIndex(PetContract._ID);
            int nameColumnIndex = cursor.getColumnIndex(PetContract.COLUMN_PET_NAME);
            int weightColumnIndex = cursor.getColumnIndex(PetContract.COLUMN_PET_WEIGHT);
            int breedColumnIndex = cursor.getColumnIndex(PetContract.COLUMN_PET_BREED);
            int genderColumnIndex = cursor.getColumnIndex(PetContract.COLUMN_PET_GENDER);

            while (cursor.moveToNext()) {
                int currentID = cursor.getInt(idColumnInedex);
                String currentName = cursor.getString(nameColumnIndex);
                String currentBreed = cursor.getString(breedColumnIndex);
                int currentGender = cursor.getInt(genderColumnIndex);
                int currentWeight = cursor.getInt(weightColumnIndex);

                displayView.append(("\n" + currentID + " - " + currentName + " - " + currentBreed + " - " + currentGender + " - " + currentWeight));

            }
        } finally {
            // Always close the cursor when you're done reading from it. This releases all its
            // resources and makes it invalid.
            cursor.close();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        displayDatabaseInfo();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Insert dummy data" menu option
            case R.id.action_insert_dummy_data:

                insertPet();
                onStart();
                return true;
            // Respond to a click on the "Delete all entries" menu option
            case R.id.action_delete_all_entries:
               clearDatabase();
                onStart();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void clearDatabase() {
        PetDbHelper mDbHelper = new PetDbHelper(this);
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        String clearDBQuery = "DELETE FROM " + TABLE_NAME;
        db.execSQL(clearDBQuery);
    }

    private void insertPet() {
        PetDbHelper mDbHelper = new PetDbHelper(this);
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(PetContract.COLUMN_PET_NAME, "Toto");
        values.put(PetContract.COLUMN_PET_BREED, "Terrier");
        values.put(PetContract.COLUMN_PET_GENDER, "Male");
        values.put(PetContract.COLUMN_PET_WEIGHT, 7);

        long newRowId = db.insert(
                TABLE_NAME,
                null,
                values);
    }
}
