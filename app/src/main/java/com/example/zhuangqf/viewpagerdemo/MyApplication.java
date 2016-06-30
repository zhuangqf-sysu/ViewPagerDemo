package com.example.zhuangqf.viewpagerdemo;

import android.app.Application;

/**
 * Created by zhuangqf on 6/30/16.
 */
public class MyApplication extends Application {

    public final static int mCount = 10;

    public final static String[] rank = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
    public static String[] country = new String[] { "China", "India", "United States",
            "Indonesia", "Brazil", "Pakistan", "Nigeria", "Bangladesh",
            "Russia", "Japan" };
    public static String[] population = new String[] { "1,354,040,000", "1,210,193,422",
            "315,761,000", "237,641,326", "193,946,886", "182,912,000",
            "170,901,000", "152,518,015", "143,369,806", "127,360,000" };
    public static int[] flag = new int[] { R.mipmap.china, R.mipmap.india,
            R.mipmap.unitedstates, R.mipmap.indonesia,
            R.mipmap.brazil, R.mipmap.pakistan, R.mipmap.nigeria,
            R.mipmap.bangladesh, R.mipmap.russia, R.mipmap.japan };

}
