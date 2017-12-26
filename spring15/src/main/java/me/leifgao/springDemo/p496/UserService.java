package me.leifgao.springDemo.p496;

import me.leifgao.springDemo.p493.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by leif on 2017/12/26
 */
@Service
public class UserService {

    @Cacheable(cacheNames = "users")
    public User getUserById(String userId) {
        System.out.println("query db..." + userId);
        return getFromDB(userId);
    }

    private User getFromDB(String userId) {
        System.out.println("quering db..." + userId);
        return new User(userId);
    }

}
