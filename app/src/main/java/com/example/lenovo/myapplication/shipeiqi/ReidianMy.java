package com.example.lenovo.myapplication.shipeiqi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lenovo.myapplication.Bean.Bean;
import com.example.lenovo.myapplication.R;

import java.util.ArrayList;

public class ReidianMy extends RecyclerView.Adapter<ReidianMy.ViewHolder> {

    Context context;
    ArrayList<Bean.DataBean> list;

    public ReidianMy(Context context, ArrayList<Bean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    public void setList(ArrayList<Bean.DataBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ReidianMy.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_item, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReidianMy.ViewHolder viewHolder, int i) {
        Bean.DataBean bean = list.get(i);
        Glide.with(context).load(bean.getThumbnail()).into(viewHolder.img);
        viewHolder.tv.setText(bean.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private final ImageView img;
        private final TextView tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
