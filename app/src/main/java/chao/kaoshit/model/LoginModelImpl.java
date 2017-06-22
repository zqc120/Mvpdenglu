package chao.kaoshit.model;

import chao.kaoshit.Bean.UserBean;
import chao.kaoshit.iml.LoginModel;

/**
 * Created by Chao on 2017/6/15.
 */

/**
 * 实现类
 */
public class LoginModelImpl implements LoginModel {

    @Override
    public void Login(final String name, final String pass, final OnLoginListener listener) {
        if (name.equals("") || pass.equals("")) {
            listener.failed();
        } else {
            listener.success(new UserBean(name, pass));
        }
    }
}
