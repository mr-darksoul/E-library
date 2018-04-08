package com.example.manav.e_library;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.manav.e_library.Adapters.BookAdapter;
import com.example.manav.e_library.Utility.Book;

import java.util.ArrayList;

public class MainActivity extends Activity
{
    private ArrayList<Book> myBookList = new ArrayList<>();
    private BookAdapter mBookAdapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.bookListView);
        mBookAdapter = new BookAdapter(this,R.layout.list_item,myBookList);
        myBookList.add(new Book("DAA","Cormen","CS","CS",800.0));
        myBookList.add(new Book("DAA","Cormen","CS","CS",800.0));
        myBookList.add(new Book("DAA","Cormen","CS","CS",800.0));
        myBookList.add(new Book("DAA","Cormen","CS","CS",800.0));
        mListView.setAdapter(mBookAdapter);
        mBookAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBookAdapter.clear();
    }
}
