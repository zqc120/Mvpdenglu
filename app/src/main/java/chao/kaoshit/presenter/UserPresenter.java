package chao.kaoshit.presenter;

/**
 * Created by Chao on 2017/6/15.
 */

import android.app.Activity;
import android.content.Intent;

import chao.kaoshit.Bean.UserBean;
import chao.kaoshit.iml.LoginModel;
import chao.kaoshit.iml.LoginView;
import chao.kaoshit.model.LoginModelImpl;
import chao.kaoshit.ui.MainActivity;

/**
 * 实现类
 */
public class UserPresenter {
    private LoginView loginView;
    private LoginModel loginModel;
    private Activity a;


    public UserPresenter(LoginView loginView,Activity a) {
        this.loginView = loginView;
        loginModel = new LoginModelImpl();
        this.a=a;
    }

    public void login() {
        loginModel.Login(loginView.getName(), loginView.getPass(), new LoginModel.OnLoginListener() {
            @Override
            public void success(UserBean bean) {
                loginView.getSuccess(bean);
                a.startActivity(new Intent(a.getApplication(), MainActivity.class));
            }

            @Override
            public void failed() {
                loginView.getFailed();
            }
        });
    }

}
