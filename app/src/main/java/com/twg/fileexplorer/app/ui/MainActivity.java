package com.twg.fileexplorer.app.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.twg.fileexplorer.app.R;
import com.twg.fileexplorer.app.base.BaseActivity;

/**
 * Created by twg on 2017/3/16.
 */
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

}
