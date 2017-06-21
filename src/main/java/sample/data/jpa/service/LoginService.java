package sample.data.jpa.service;

import sample.data.jpa.domain.Synn_users;

/**
 * Created by windsorl on 2017/6/20.
 */
public interface LoginService {
    public Synn_users findByname(String name,String password);
}
