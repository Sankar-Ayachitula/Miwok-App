package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.List;

public class WordArrayAdapter extends ArrayAdapter<Word>{

    public int backgroundColor;
    public WordArrayAdapter(Context context, List<Word> objects,int color) {
        super(context,0,objects);

        this.backgroundColor=color;



    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Gets the AndroidFlavor object from the ArrayAdapter at the appropriate position


        Word word=getItem(position);

        // Adapters recycle views to AdapterViews.
        // If this is a new View object we're getting, then inflate the layout.
        // If not, this view already has the layout inflated from a previous call to getView,
        // and we modify the View widgets as usual.

        View list_view =convertView;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        ImageView imageView = (ImageView) convertView.findViewById(R.id.pic_view);
        if(word.getResource_id()!=0) {

            imageView.setImageResource(word.getResource_id());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }






        TextView miwoktrans = (TextView) convertView.findViewById(R.id.miwok_text_view);
        miwoktrans.setText(word.get_miwokTranslation());

        TextView defaulttrans = (TextView) convertView.findViewById(R.id.default_text_view);
        defaulttrans.setText(word.get_defaultTranslation());

        LinearLayout linearLayout=(LinearLayout) convertView.findViewById(R.id.background_for_textview);
        int color= ContextCompat.getColor(getContext(),backgroundColor);
        linearLayout.setBackgroundColor(color);




        return convertView;
    }
}
