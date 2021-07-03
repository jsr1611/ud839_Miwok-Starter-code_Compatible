package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;


public class WordAdapter extends ArrayAdapter<Word> {

    private Button playBtn;
    private MediaPlayer mediaPlayer;

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;


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

        playBtn = listItemView.findViewById(R.id.playBtn);
        mediaPlayer = MediaPlayer.create(getContext(), words.getmPronunciationFileId());

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });


        ImageView mImageIcon = (ImageView) listItemView.findViewById(R.id.list_image);
        if (words.hasImage()) {
            mImageIcon.setImageResource(words.getmImageResourceId());
            mImageIcon.setVisibility(View.VISIBLE);
        } else {
            mImageIcon.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        playBtn.setBackgroundColor(color);


        return listItemView;
    }

}
