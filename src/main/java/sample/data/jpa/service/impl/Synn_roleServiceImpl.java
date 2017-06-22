package sample.data.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.data.jpa.dao.SynnapplyDao;
import sample.data.jpa.domain.Synn_role;
import sample.data.jpa.service.Synn_roleReposity;
import sample.data.jpa.service.Synn_roleService;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class Synn_roleServiceImpl implements Synn_roleService {
    @Autowired
    private SynnapplyDao synnapplyDao;


    @Override
    public List<Synn_role> findAll() {
        return null;
    }
}
