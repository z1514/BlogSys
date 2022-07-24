package com.example.MyBlog.repository;

import com.example.MyBlog.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private static AtomicLong counter = new AtomicLong();
    private final ConcurrentHashMap<Long,User> userMap = new ConcurrentHashMap<Long,User>();

    public UserRepositoryImpl(){
        User user = new User();
        user.setAge(22);
        user.setName("zjx");
        this.saveOrUpateUser(user);
    }

    @Override
    public User saveOrUpateUser(User user) {
        Long id = user.getId();
        if (id <= 0) {
            id = counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> listUser() {
        return new ArrayList<User>(this.userMap.values());
    }
}
