package com.assignment;

import android.app.ListActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {
    private final String TAG = MainActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // init layout file
        setContentView(R.layout.activity_main);
        // init Fragment and replace with parent layout
        getFragmentManager().beginTransaction().replace(R.id.content_layout, new ListDataFragment()).commit();
    }
}
