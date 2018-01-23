package com.assignment;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ListDataFragment extends ListFragment {
    private final String TAG = ListDataFragment.class.toString();
    public ListDataFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_data, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: ");
        // create data source
        Data dataObj[] = new Data[]{
                new Data("Google", "Search Engine", R.drawable.google),
                new Data("Yahoo", "Search Engine", R.drawable.yahoo),
                new Data("Twitter", "Social Media", R.drawable.twitter),
                new Data("Facebook", "Social Media", R.drawable.facebook),
        };
        // init CustomAdapter
        CustomAdapter adapter = new CustomAdapter(getActivity(), R.layout.row, dataObj);
        setListAdapter(adapter); // set adapter
    }
}
