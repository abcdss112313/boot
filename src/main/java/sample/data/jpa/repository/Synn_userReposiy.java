package sample.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.data.jpa.domain.Synn_users;

/**
 * Created by windsorl on 2017/6/20.
 */
public interface Synn_userReposiy extends JpaRepository<Synn_users, Long> {

    public Synn_users findByAccountAndPasswd(String account, String passwd);
}
