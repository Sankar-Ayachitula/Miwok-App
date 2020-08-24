package com.example.android.miwok;

public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private int resource_id;

    public Word(String d, String m){
        defaultTranslation=d;
        miwokTranslation=m;
    }

    public Word(String d, String m, int resource_id){
        defaultTranslation=d;
        miwokTranslation=m;
        this.resource_id=resource_id;
    }



    public String get_defaultTranslation(){
        return defaultTranslation;
    }


    public String get_miwokTranslation(){
        return miwokTranslation;
    }

    public int getResource_id(){return resource_id;}




}
