package sample.data.jpa.service;

import sample.data.jpa.domain.Synn_users;

/**
 * Created by windsorl on 2017/6/20.
 */
public interface LoginService {

    Synn_users  findByname(String name,String password);
    Synn_users  save(Synn_users synn_users);
}
