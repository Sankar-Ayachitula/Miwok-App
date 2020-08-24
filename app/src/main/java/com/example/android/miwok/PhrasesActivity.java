package com.example.android.miwok;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class PhrasesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words= new ArrayList <Word>();


        words.add(new Word("Where are you going?","minto wuksus"));
        words.add(new Word("What is your name?","tinnә oyaase'nә"));
        words.add(new Word("My name is... ","oyaaset..."));
        words.add(new Word("How are you feeling?","michәksәs?"));
        words.add(new Word("I’m feeling good","kuchi achit"));
        words.add(new Word("Are you coming?","әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new Word("I’m coming. ","әәnәm"));
        words.add(new Word("Let’s go. ","yoowutis"));
        words.add(new Word("Come here","әnni'nem"));






      /*  LinearLayout numbers_layout=  (LinearLayout) findViewById(R.id.numbers_layout);

        int i=0;
        for (i=0;i<10;i++){
            TextView wordview = new TextView(this);
            wordview.setText(numbers.get(i));
            numbers_layout.addView(wordview);
        } */

        WordArrayAdapter wordarrayAdapter=new WordArrayAdapter(this,words,R.color.category_phrases);

        ListView listView= (ListView) findViewById(R.id.listview);

        listView.setAdapter(wordarrayAdapter);

        // Set the content of the activity to use the activity_main.xml layout file

    }
}