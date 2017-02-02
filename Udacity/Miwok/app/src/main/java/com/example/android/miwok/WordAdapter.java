package com.example.android.miwok;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {




    public WordAdapter(Activity context, ArrayList<Word> androidFlavors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentAndroidFlavor = getItem(position);

        TextView randomTextView = (TextView)listItemView.findViewById(R.id.random_text_view);
        randomTextView.setText(currentAndroidFlavor.getmDeafaultTranstaltion());

        TextView miwakoTextView1 = (TextView)listItemView.findViewById(R.id.miwoako_text_view);
        miwakoTextView1.setText(currentAndroidFlavor.getmMiwokTranslation());

        return listItemView;
    }
}
