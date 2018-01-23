package com.assignment;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by prabhu on 23/1/18.
 */

public class CustomAdapter extends ArrayAdapter <Data> {
    private final String TAG = CustomAdapter.class.toString();
    TextView nameTxtView, desTxtView;
    ImageView iconImgView;

    @NonNull
    Context context;
    int resource;
    @NonNull
    Data[] objects = null;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull Data[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;
//        Getting LayoutInflater class and Inflating Layout
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        row = inflater.inflate(resource, parent, false);
        nameTxtView = (TextView) row.findViewById(R.id.nameTxtView);
        desTxtView = (TextView) row.findViewById(R.id.descriptionTxtView);
        iconImgView = (ImageView) row.findViewById(R.id.imageImgView);
//      Get each row data and flash on screen
        Data data = objects[position];
        nameTxtView.setText(data.getName());
        desTxtView.setText(data.getDesc());
        iconImgView.setImageResource(data.getImg());
        return row;
    }

}
