package com.puzzlegame.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.puzzlegame.R;
import com.puzzlegame.Util.ScreenUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zonelue003 on 2017/8/25.
 */

public class PictureAdapter extends BaseAdapter {

    private List<Bitmap> list = new ArrayList<>();
    Context context;

    public PictureAdapter(List<Bitmap> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView iv_pic_item = null;
        int density = (int) ScreenUtil.getDeviceDensity(context);
        if (view == null) {
            iv_pic_item = new ImageView(context);
            //设置布局图片
            iv_pic_item.setLayoutParams(new GridView.LayoutParams(80 * density, 100 * density));
            //设置显示比例类型
            iv_pic_item.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            iv_pic_item = (ImageView) view;
        }
        iv_pic_item.setBackgroundColor(R.color.black);
        iv_pic_item.setImageBitmap(list.get(i));
        return iv_pic_item;
    }
}
