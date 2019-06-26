package com.dexcoder.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * Created by liyd on 16/6/20.
 */
@Repository
public class UserDaoImpl implements UserDao {

    private static final Map<String, User> userMap = new HashMap<String, User>();

    static {

        User user = new User();
        user.setUsername("liyd");
        user.setPassword("123456");
        user.setRole("user");
        userMap.put(user.getUsername(), user);

        user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        user.setRole("admin");
        userMap.put(user.getUsername(), user);
    }

    @Override
    public User getUser(String username) {
        return userMap.get(username);
    }
}
