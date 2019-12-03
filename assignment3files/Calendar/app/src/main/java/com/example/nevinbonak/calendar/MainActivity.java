package com.example.nevinbonak.calendar;

import android.app.Activity;
import android.app.LauncherActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

import static java.util.Calendar.DATE;

//each day in the calendar will be a list_item.xml/ListItem.java
//each assignment in the day will be a assignment.xml

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ... the usual

        // Attach the listener to the AdapterView onCreate
        List<ListItem> list = new ArrayList<ListItem>();

        Calendar current = Calendar.getInstance();

        //for (int i = 0; i < 30; i++) {
        ListItem item = new ListItem();
        item.date = current.get(DATE);
        //Assignment assignment1 = new Assignment();
        //assignment1.refdate = current.get(DATE);
        //assignment1.title = "David";
        //assignment1.description = "Boston is not snowing now";
        //item.assignmentList.add(assignment1);
        list.add(item);
        //}









        //Create ListItemAdapter
        ListItemAdapter adapter;
        adapter = new ListItemAdapter(this, 0, list);

        //assign ListItemAdapter to ListView
        ListView calendarListView = (ListView)findViewById(R.id.CalendarListView);
        calendarListView.setAdapter(adapter);

/*
        calendarListView.setOnScrollListener(new EndlessScrollListener() {
            @Override
            public boolean onLoadMore(int page, int totalItemsCount) {
                // Triggered only when new data needs to be appended to the list
                // Add whatever code is needed to append new items to your AdapterView
                loadNextDataFromApi(page);
                // or loadNextDataFromApi(totalItemsCount);
                return true; // ONLY if more data is actually being loaded; false otherwise.
            }
        });
    }

    private void loadNextDataFromApi(int offset) {
*/
    }

}
