package chao.kaoshit.ui;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import chao.kaoshit.R;
import chao.kaoshit.ui.fragment.Fragment1;
import chao.kaoshit.ui.fragment.Fragment2;
import chao.kaoshit.ui.fragment.Fragment3;

public class MainActivity extends FragmentActivity {
    private FrameLayout fragment;
    private RadioGroup group;
    private RadioButton bt1;
    private RadioButton bt2;
    private RadioButton bt3;
    FragmentManager fm;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragment1 = new Fragment1();
        fragmentTransaction.replace(R.id.fragment,fragment1);
        fragmentTransaction.commit();
        initView();
    }

    private void initView() {
        fragment = (FrameLayout) findViewById(R.id.fragment);
        group = (RadioGroup) findViewById(R.id.group);
        bt1 = (RadioButton) findViewById(R.id.bt1);
        bt2 = (RadioButton) findViewById(R.id.bt2);
        bt3 = (RadioButton) findViewById(R.id.bt3);


        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                FragmentTransaction ft = fm.beginTransaction();
                switch (checkedId) {
                    case R.id.bt1:
                        fragment1 = new Fragment1();
                        ft.replace(R.id.fragment,fragment1);
                        break;
                    case R.id.bt2:
                        fragment2 = new Fragment2();
                        ft.replace(R.id.fragment,fragment2);
                        break;
                    case R.id.bt3:
                        fragment3 = new Fragment3();
                        ft.replace(R.id.fragment,fragment3);
                        break;
                }
                ft.commit();
            }
        });
    }
}
