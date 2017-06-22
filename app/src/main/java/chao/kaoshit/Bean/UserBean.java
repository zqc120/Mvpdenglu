package chao.kaoshit.Bean;

/**
 * Created by Chao on 2017/6/15.
 */

public class UserBean {
    String name;
    String pass;

    public UserBean(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
