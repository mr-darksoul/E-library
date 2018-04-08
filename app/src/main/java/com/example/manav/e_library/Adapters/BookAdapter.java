package com.example.manav.e_library.Adapters;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.manav.e_library.R;
import com.example.manav.e_library.Utility.Book;

/**
 * Created by manav on 4/1/18.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, int resource, ArrayList<Book> objects) {
        super(context,resource,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.list_item,parent,false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.nameTextView);
        Book book = getItem(position);
        name.setText(""+book.getName());
        return convertView;
    }
}

