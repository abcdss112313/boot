package sample.data.jpa.service;

import org.springframework.stereotype.Service;
import sample.data.jpa.domain.Synn_users;
import sample.data.jpa.repository.Synn_userReposiy;

import javax.transaction.Transactional;

/**
 * Created by windsorl on 2017/6/20.
 */
@Transactional
@Service
public class LoginServiceImpl implements LoginService {
    private final Synn_userReposiy synn_userReposiy;

    public LoginServiceImpl(Synn_userReposiy synn_userReposiy) {
        this.synn_userReposiy = synn_userReposiy;
    }


    @Override
    public Synn_users findByname(String name, String password) {
        return synn_userReposiy.findByAccountAndPasswd(name,password);
    }
}
