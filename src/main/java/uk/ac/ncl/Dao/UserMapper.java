package uk.ac.ncl.Dao;

import uk.ac.ncl.Model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by tommy on 2016/5/7.
 */
public interface UserMapper {
    public int add(User user);

    public int update(User user);

    public List<User> getUserList(Map<String,Object> filters);

    public User getUser(Long id);
}
