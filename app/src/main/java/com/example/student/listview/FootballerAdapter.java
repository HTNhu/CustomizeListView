package com.example.student.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FootballerAdapter extends BaseAdapter{
    Context ctx;
    int layout;
    ArrayList<Footballer> arrfbl;

    public FootballerAdapter(Context ctx, int layout, ArrayList<Footballer> arrfbl) {
        this.ctx = ctx;
        this.layout = layout;
        this.arrfbl = arrfbl;
    }

    @Override
    public int getCount() {
        return arrfbl.size();
    }

    @Override
    public Object getItem(int i) {
        return arrfbl.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        LayoutInflater inflater = LayoutInflater.from(ctx);
         v = inflater.inflate(R.layout.footballer, null);

        TextView tvName = (TextView)v.findViewById(R.id.tvName);
        TextView tvBirthday = (TextView)v.findViewById(R.id.tvBirthDay);
        ImageView ivProfile = (ImageView) v.findViewById(R.id.ivProfile);

        tvName.setText(arrfbl.get(i).getName());
        tvBirthday.setText(arrfbl.get(i).getBirthday());
        ivProfile.setImageResource(arrfbl.get(i).getProfile());
        return v;
    }
}
