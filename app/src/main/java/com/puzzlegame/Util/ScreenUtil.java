package com.puzzlegame.Util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by zonelue003 on 2017/8/24.
 */

public class ScreenUtil {
    /**
     * 获取屏幕相关参数
     *
     * @return  DisplayMetrics 屏幕宽高
     */
    public static DisplayMetrics getScreenSize(Context context){
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager wm= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        display.getMetrics(metrics);
        return metrics;
    }

    /**
     * 获取屏幕密度
     *
     * @param context
     * @return density 屏幕密度
     */
    public static float getDeviceDensity(Context context){
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager wm= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(metrics);

        return metrics.density;
    }
}
