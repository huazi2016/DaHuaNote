package com.example.skycn.dahuanote.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.skycn.dahuanote.R;

/**
 * @创建者 huazi
 * @创建时间 2018/11/4 下午6:15
 * @描述 主页
 * @公司 云集
 */
public class DhActivityMain extends AppCompatActivity {

    private static final String TAG = "DhActivityMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "这是第一行代码");
    }
}
