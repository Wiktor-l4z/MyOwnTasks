package com.example.android.miwok;


import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {
    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceID;


    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words   is the list of {@link Word}s to be displayed.
     *                +     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceID) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceID = colorResourceID;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Word currentAndroidFlavor = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView mDeafaultTextView = (TextView) listItemView.findViewById(R.id.random_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        mDeafaultTextView.setText(currentAndroidFlavor.getmDefaultTranslation());
        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView mMiwokTextView = (TextView) listItemView.findViewById(R.id.miwoako_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        mMiwokTextView.setText(currentAndroidFlavor.getmMiwokTranslation());
        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        // Check if an image is provided for this word or not
        if (currentAndroidFlavor.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAndroidFlavor.getImageResourceID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that te resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
