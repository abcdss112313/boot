package sample.data.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.data.jpa.domain.Synn_users;


public interface Synn_userDao extends JpaRepository<Synn_users, Long> {

    public Synn_users findByAccountAndPasswd(String account, String passwd);

    Synn_users save(Synn_users synn_users);
}
