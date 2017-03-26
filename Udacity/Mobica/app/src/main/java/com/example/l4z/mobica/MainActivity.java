package com.example.l4z.mobica;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import static com.example.l4z.mobica.R.drawable.mobica_fix;

public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.image_helping, R.drawable.image_keep, R.drawable.image_rd};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);




    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
        carouselView.setImageListener(imageListener);



        Toolbar toolbar = (Toolbar) findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setBackgroundDrawable(backwardCompatibleDrawable(mobica_fix));
        getSupportActionBar().setDisplayShowHomeEnabled(false);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "RegencieLight.ttf");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTypeface(myTypeFace);

        ImageView uxImageView = (ImageView) findViewById(R.id.ux_ui);
        uxImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.mobica.com/services-technologies/user-experience-user-interface-uxui"));
                startActivity(intent);
            }
        });

        ImageView qualityImageView = (ImageView) findViewById(R.id.quality_assurance);
        qualityImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.mobica.com/services-technologies/quality-assurance"));
                startActivity(intent);
            }
        });

        ImageView techImageView = (ImageView) findViewById(R.id.technology_colsulting);
        techImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.mobica.com/services-technologies/technology-consulting"));
                startActivity(intent);
            }
        });

        ImageView softImageView = (ImageView) findViewById(R.id.software_engineering);
        softImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.mobica.com/services-technologies/software-engineering"));
                startActivity(intent);
            }
        });

        ImageView linkedInImageView = (ImageView) findViewById(R.id.linkedIn);
        linkedInImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/company/mobica"));
                startActivity(intent);
            }
        });

        ImageView facebookImageView = (ImageView) findViewById(R.id.facebook);
        facebookImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/MobicaLimited"));
                startActivity(intent);
            }
        });
        ImageView ytImageView = (ImageView) findViewById(R.id.youtube);
        ytImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UC3c5EpJZ2pqI2GPapiRt8uA"));
                startActivity(intent);
            }
        });

        ImageView twitterImageView = (ImageView) findViewById(R.id.twitter);
        twitterImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/_Mobica"));
                startActivity(intent);
            }
        });
    }

    private Drawable backwardCompatibleDrawable(int res) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return getDrawable(res);
        }
        return getResources().getDrawable(res);
    }
}
