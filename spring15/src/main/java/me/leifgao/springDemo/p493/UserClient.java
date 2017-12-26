package me.leifgao.springDemo.p493;

/**
 * Created by leif on 2017/12/26
 */
public class UserClient {

    public static void main(String[] args) {
        UserService userService = new UserService();

        userService.getUserById("111");
        userService.getUserById("111");
    }

}
