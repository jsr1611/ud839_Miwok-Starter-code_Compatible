package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;


public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word words = getItem(position);
        TextView mDefaultTranslation = (TextView) listItemView.findViewById(R.id.list_item_1);

        mDefaultTranslation.setText(words.getmDefaultTranslation());

        TextView mMiwokTranslation = (TextView) listItemView.findViewById(R.id.list_item_2);

        mMiwokTranslation.setText(words.getmMiworkTranslation());

        return listItemView;
    }
}
