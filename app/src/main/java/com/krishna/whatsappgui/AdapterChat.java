package com.krishna.whatsappgui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class AdapterChat extends BaseAdapter {

    Context mContext;
    String[] mName;
    int[] mImgs;
    String[] mMsg;
    String[] mTime;
    int[] mTiks;

    public AdapterChat(Context mContext, String[] mName, int[] mImgs, String[] mMsg, String[] mTime, int[] mTiks)
    {
        this.mContext = mContext;
        this.mImgs = mImgs;
        this.mName = mName;
        this.mMsg = mMsg;
        this.mTime = mTime;
        this.mTiks = mTiks;
    }

    @Override
    public int getCount() {
        return mName.length;
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

        View view;
        if (convertView==null)
        {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.listview,null);
        }
        else {
            view = convertView;
        }
        ImageView mydp = view.findViewById(R.id.dp);
        ImageView mytick = view.findViewById(R.id.arrow);
        TextView myname = view.findViewById(R.id.name);
        TextView mymsg = view.findViewById(R.id.msg);
        TextView mytime = view.findViewById(R.id.time);

        mydp.setImageResource(mImgs[position]);
        mytick.setImageResource(mTiks[position]);
        myname.setText(mName[position]);
        mymsg.setText(mMsg[position]);
        mytime.setText(mTime[position]);

        return view;
    }
}
