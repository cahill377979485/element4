package com.cahill.element4.base;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cahill.element4.R;
import com.cahill.element4.util.UIHelper;

/**
 * @author: 文琳
 * @time: 2020/5/2 23:29
 * @desc:
 */
public abstract class BaseSwipeActivity extends BaseActivity {

    public void setTitle(int strId) {
        String str = MyApplication.context.getResources().getString(strId);
        setTitle(str);
    }

    public void setTitle(String str) {
        TextView tvTitle = findViewById(R.id.tv_title);
        UIHelper.setText(tvTitle, str);
        ImageView ivBack = findViewById(R.id.iv_back);
        ivBack.setOnClickListener(v -> finish());
    }
}
