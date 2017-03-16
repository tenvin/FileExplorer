package com.twg.fileexplorer.app.base;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by twg on 2017/3/16.
 */
public abstract class BaseActivity extends FragmentActivity {
    /**
     * 屏幕的宽度、高度、密度
     */
    protected int mScreenWidth;
    protected int mScreenHeight;
    protected float mDensity;
    protected Context mContext;
    protected String LogName; // 打印的名称
    protected ImageView titleBack;
    protected TextView titleName;
    protected TextView titleRightText;

    private static String mDialogTag = "basedialog";


}
