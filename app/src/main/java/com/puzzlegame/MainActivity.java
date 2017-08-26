package com.puzzlegame;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.puzzlegame.Util.ScreenUtil;
import com.puzzlegame.adapter.PictureAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    PopupWindow mPopupWindow;
    List<Bitmap> list = new ArrayList<>();
    int[] mResPicId = new int[]{
            R.drawable.test,  R.drawable.test3, R.drawable.test5, R.drawable.test6,
            R.drawable.test7, R.drawable.test8, R.drawable.test9,  R.drawable.test11
    };
    @InjectView(R.id.ll_puzzle_main_spiner)
    LinearLayout llPuzzleMainSpiner;
    @InjectView(R.id.gv_xpizzle_main_pic_list)
    GridView mGvPicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        Bitmap[] bitmaps = new Bitmap[mResPicId.length];
        for (int i = 0; i < bitmaps.length; i++) {
            bitmaps[i] = BitmapFactory.decodeResource(getResources(),mResPicId[i]);
            list.add(bitmaps[i]);
        }
        mGvPicList.setAdapter(new PictureAdapter(list,MainActivity.this));
    }

    /**
     * 显示popupWindow
     *
     * @param view popupWindow
     */
    private void poupShow(View view) {
        int density = (int) ScreenUtil.getDeviceDensity(this);
        //显示popupWindow
        mPopupWindow = new PopupWindow(view, 200 * density, 50 * density);
        mPopupWindow.setFocusable(true);
        mPopupWindow.setOutsideTouchable(true);
        //透明背景
        Drawable transpent = new ColorDrawable(Color.TRANSPARENT);
        mPopupWindow.setBackgroundDrawable(transpent);
        //获取位置
        int[] location = new int[2];
        view.getLocationOnScreen(location);
        mPopupWindow.showAtLocation(view, Gravity.NO_GRAVITY, location[0] - 40 * density, location[1] + 30 * density);
    }
}
