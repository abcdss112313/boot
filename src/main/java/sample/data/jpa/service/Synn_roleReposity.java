package sample.data.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.data.jpa.domain.City;
import sample.data.jpa.domain.Synn_role;

import java.util.List;

/**
 * Created by windsorl on 2017/6/20.
 */
public interface Synn_roleReposity extends JpaRepository<Synn_role,Long> {
    @Override
    List<Synn_role> findAll();
}
