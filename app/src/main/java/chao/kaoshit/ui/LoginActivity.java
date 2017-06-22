package chao.kaoshit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import chao.kaoshit.R;

/**
 * Created by Chao on 2017/6/15.
 */


/**
 * 导航页三页跳转
 *
 */
public class LoginActivity extends Activity {
    private List<View> list = new ArrayList<>();
    private ViewPager vp;
    private int array[] = {
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher
    };
    Vpdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initList();
        initView();
    }

    //初始化数据源
    private void initList() {
        for (int i = 0; i < array.length; i++) {
            ImageView img = new ImageView(this);
            View v = View.inflate(this, R.layout.item, null);
            img = (ImageView) v.findViewById(R.id.img);
            img.setImageResource(array[i]);
            list.add(v);
        }
    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        adapter = new Vpdapter(list);
        vp.setAdapter(adapter);
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 2:
                        startActivity(new Intent(LoginActivity.this, ReplaseActivity.class));
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

}
