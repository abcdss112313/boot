package sample.data.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.data.jpa.domain.Synnapply;

import java.util.List;


/**
 * Created by windsorl on 2017/6/22.
 */
public interface SynnapplyDao extends JpaRepository<Synnapply, Integer> {
    List<Synnapply> findByUserid(int id);

    Synnapply save(Synnapply synnapply);

    int deleteByApplyid(Integer integer);

    Synnapply  saveAndFlush(Synnapply synnapply);

}
