package me.leifgao.springDemo.p493;

/**
 * Created by leif on 2017/12/26
 */
public class UserService {

    private CacheManager<User> cacheManager;

    public UserService() {
        cacheManager = new CacheManager<User>();
    }

    public User getUserById(String userId) {
        User result = cacheManager.getValue(userId);
        if (result != null) {
            System.out.println("get from cache ..." + userId);
            return result;
        }

        result = getFromDB(userId);
        if (result != null) {
            cacheManager.addOrUpdateCache(userId, result);
        }
        return result;
    }

    private User getFromDB(String userId) {
        System.out.println("query from DB...");
        return new User(userId);
    }

}
