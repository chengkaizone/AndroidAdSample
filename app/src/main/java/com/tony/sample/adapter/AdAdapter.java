package com.tony.sample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tony.sample.R;

import java.util.List;

/**
 * Created by tony on 2017/4/11.
 */
public class AdAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<String> data;

    public AdAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    public AdAdapter(Context context, List<String> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    public void setData(List<String> data) {
        this.data = data;
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {

        if(data == null) {
            return 0;
        }
        return data.size();
    }

    @Override
    public String getItem(int position) {

        if(data == null) {
            return null;
        }
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = null;
        if (convertView == null) {
            holder = new Holder();
            convertView = inflater.inflate(R.layout.adapter_ad_item, null);
            holder.tv_title = (TextView) convertView
                    .findViewById(R.id.tv_title);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        String str = data.get(position);
        holder.tv_title.setText(str);

        return convertView;
    }

    private class Holder {

        TextView tv_title;
    }


}
