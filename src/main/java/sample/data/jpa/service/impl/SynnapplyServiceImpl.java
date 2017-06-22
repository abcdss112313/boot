package sample.data.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sample.data.jpa.dao.SynnapplyDao;
import sample.data.jpa.domain.Synnapply;
import sample.data.jpa.service.SynnapplyService;
import java.util.List;

@Service
@Transactional
public class SynnapplyServiceImpl implements SynnapplyService {

    @Autowired
    private SynnapplyDao synnapplyDao;

    @Override
    public List<Synnapply> findByUserid(int id) {
        return synnapplyDao.findByUserid(id);
    }

    @Override
    public Synnapply save(Synnapply synnapply) {
        return synnapplyDao.save(synnapply);
    }

    @Override
    public int deleteByApplyid(Integer integer) {
        return synnapplyDao.deleteByApplyid(integer);
    }

    @Override
    public Page<Synnapply> findBookCriteria(Integer page, Integer size, Synnapply synnapply) {
      return null;
    }
}
