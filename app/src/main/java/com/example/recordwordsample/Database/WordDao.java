package com.example.recordwordsample.Database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.recordwordsample.Word;

import java.util.List;

@Dao()
public interface WordDao {

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();

    @Insert
    Word insertWord(Word word);

    @Query("DELETE FROM word_table")
    void deleteAllWords();

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateWord(Word word);
}
