package swing;

import java.io.Serializable;
//implements serializable 을 안해주면 직렬화 되지않음
public class UserInfo implements Serializable {
    String name, password;
    int age;

    public UserInfo() {
        this("unknown", "1111", 0);

    }

    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "(" + name + "," +password+ "," + age + ")";
    }
}
