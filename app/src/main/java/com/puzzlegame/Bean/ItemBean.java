package com.puzzlegame.Bean;

import android.graphics.Bitmap;

/**
 * 拼图Item逻辑实体类：封装逻辑相关属性
 * <p>
 * Created by zonelue003 on 2017/8/26.
 */

public class ItemBean {
    //Item的Id
    private int mItemId;
    //Bitmap的ID
    private int mBitmapId;
    //mBitmap
    private Bitmap mBitmap;

    public int getmItemId() {
        return mItemId;
    }

    public void setmItemId(int mItemId) {
        this.mItemId = mItemId;
    }

    public int getmBitmapId() {
        return mBitmapId;
    }

    public void setmBitmapId(int mBitmapId) {
        this.mBitmapId = mBitmapId;
    }

    public Bitmap getmBitmap() {
        return mBitmap;
    }

    public void setmBitmap(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
    }

    public ItemBean(int mItemId, int mBitmapId, Bitmap mBitmap) {
        this.mItemId = mItemId;
        this.mBitmapId = mBitmapId;
        this.mBitmap = mBitmap;
    }
}
