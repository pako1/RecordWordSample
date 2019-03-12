package com.example.recordwordsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

    @NonNull
    @ColumnInfo(name = "word")
    @PrimaryKey(autoGenerate = true)
    private String mWord;


    public Word(String mWord) {
        this.mWord = mWord;
    }

    public String getmWord() {
        return mWord;
    }

}
