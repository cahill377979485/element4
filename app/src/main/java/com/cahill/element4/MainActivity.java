package com.cahill.element4;

import android.os.Bundle;

import com.cahill.element4.base.BaseActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.nav_view)
    BottomNavigationView bnv;

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
        AppBarConfiguration config = new AppBarConfiguration.Builder(R.id.navigation_predict, R.id.navigation_setting, R.id.navigation_others).build();
        NavController controller = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, controller, config);
        NavigationUI.setupWithNavController(bnv, controller);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

}
