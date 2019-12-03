package com.example.nevinbonak.calendar;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListItemAdapter extends ArrayAdapter<ListItem> {

    private LayoutInflater mInflater;

    public ListItemAdapter (Context context, int rid, List<ListItem> list) {

        super(context, rid, list);
        mInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        //retrieve data
        ListItem item = (ListItem)getItem(position);

        //use layout file to generate view
        View view = mInflater.inflate(R.layout.list_item, null);

        Log.e("ListItemAdapter","getView");

        TextView date;
        date = view.findViewById(R.id.date);
        date.setText(item.date);

        //TextView title;
        //title = (TextView) view.findViewById(R.id.title);
        //title.setText(item.assignmentList.get(0).title);


        return view;



    }

}
