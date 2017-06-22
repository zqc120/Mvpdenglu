package chao.kaoshit.iml;

/**
 * Created by Chao on 2017/6/15.
 */

import chao.kaoshit.Bean.UserBean;

/**
 * 接口类
 */
public interface LoginModel {
    void Login(String name, String pass, OnLoginListener listener);

    interface OnLoginListener {
        void success(UserBean bean);

        void failed();
    }

}
