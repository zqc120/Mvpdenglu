package chao.kaoshit.iml;

import chao.kaoshit.Bean.UserBean;

/**
 * Created by Chao on 2017/6/15.
 */

public interface LoginView {
    String getName();
    String getPass();
    void getSuccess(UserBean bean);
    void getFailed();
}
