package com.applicationmobile.projectuas;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {

    private static final String TAG = "GridAdapter";

    private Context mContext;

    public GridAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public Integer[] thumbnail = {
            R.drawable.porto1,
            R.drawable.porto2,
            R.drawable.porto3,
            R.drawable.porto4,
            R.drawable.porto5,
            R.drawable.porto6,
    };

    @Override
    public int getCount() {
        return thumbnail.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(200,200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbnail[position]);
        return imageView;
    }
}
