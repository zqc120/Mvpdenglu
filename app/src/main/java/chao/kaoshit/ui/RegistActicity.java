package chao.kaoshit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import chao.kaoshit.Bean.UserBean;
import chao.kaoshit.R;
import chao.kaoshit.iml.LoginView;
import chao.kaoshit.presenter.UserPresenter;

/**
 * Created by Chao on 2017/6/15.
 */

/**
 * 账号密码页面
 */

public class RegistActicity extends Activity implements LoginView {

    private EditText edit1;
    private EditText edit2;
    UserPresenter presenter;
    Button bt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        initView();
        presenter = new UserPresenter(this,this);
    }

    private void initView() {
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login();
            }
        });
    }

    @Override
    public String getName() {
        return edit1.getText().toString();
    }

    @Override
    public String getPass() {
        return edit2.getText().toString();
    }

    @Override
    public void getSuccess(UserBean bean) {
        startActivity(new Intent(RegistActicity.this,MainActivity.class));
    }

    @Override
    public void getFailed() {

    }
}
