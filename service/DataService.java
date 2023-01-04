package service;

import data.User;

public interface DataService {
    void create(User user);
    User read(User user);

}
