package sample.data.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.data.jpa.domain.Synn_users;
import sample.data.jpa.dao.Synn_userDao;
import sample.data.jpa.service.LoginService;

import javax.transaction.Transactional;

/**
 * Created by windsorl on 2017/6/20.
 */
@Transactional
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private Synn_userDao synn_userDao;


    @Override
    public Synn_users findByname(String name, String password) {
        Synn_users synn_users =  synn_userDao.findByAccountAndPasswd(name,password);
        return synn_users;
    }

    @Override
    public Synn_users save(Synn_users synn_users) {
        return synn_userDao.save(synn_users);
    }

}
