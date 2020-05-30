package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> wordList) {
        super(context, 0, wordList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        Word currentWord = getItem(position);

        TextView miwokView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        assert currentWord != null;
        miwokView.setText(currentWord.getMiwokTranslation());

        TextView defaultView = (TextView) listItemView.findViewById(R.id.defautl_text_view);
        defaultView.setText(currentWord.getDefaultTranslation());

        return listItemView;


    }
}
