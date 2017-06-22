package sample.data.jpa.service;

import org.springframework.data.domain.Page;
import sample.data.jpa.domain.Synnapply;
import java.util.List;


/**
 * Created by windsorl on 2017/6/22.
 */
public interface SynnapplyService {

    List<Synnapply> findByUserid(int id);

    Synnapply save(Synnapply synnapply);

    int deleteByApplyid(Integer integer);

    Page<Synnapply> findBookCriteria(Integer page, Integer size, Synnapply synnapply);
}
