package com.example.l4z.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.imagegallery);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(lm);

       /* RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 1);
        recyclerView.setLayoutManager(layoutManager);*/
        ArrayList<ImageCell> imageCells = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), imageCells);
        recyclerView.setAdapter(adapter);
    }

    private final String image_titles[] = {
            "Img1",
            "Img2",
            "Img3",
            "Img4",
            "Img5",
            "Img6",
            "Img7",
            "Img8",
            "Img9",
    };

    private final Integer image_ids[] = {
            R.drawable.fixxxx,
            R.drawable.helping_fixx,
            R.drawable.keep_fixed,
            R.drawable.fixxxx,
            R.drawable.helping_fixx,
            R.drawable.keep_fixed,
            R.drawable.fixxxx,
            R.drawable.helping_fixx,
            R.drawable.keep_fixed,
    };

    private ArrayList<ImageCell> prepareData() {

        ArrayList<ImageCell> theimage = new ArrayList<>();
        for (int i = 0; i < image_titles.length; i++) {
            ImageCell imageCell = new ImageCell();
            imageCell.setImage_title(image_titles[i]);
            imageCell.setImage_ID(image_ids[i]);
            theimage.add(imageCell);
        }
        return theimage;
    }


}

