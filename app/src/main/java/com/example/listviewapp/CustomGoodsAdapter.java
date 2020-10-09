package com.example.listviewapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        Goods goods = (Goods) getItem(i);

            view = LayoutInflater.from(ctx).
                    inflate(layoutItem,viewGroup,false);
            //

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvShopName = view.findViewById(R.id.tvShopName);
        ImageView imgGoods = view.findViewById(R.id.imgGoods);


        //
        tvName.setText(arrayList.get(i).getName());
        tvShopName.setText(arrayList.get(i).getShopName());
        imgGoods.setImageResource(arrayList.get(i).getImageGoods());

        return view;
    }



}
