package sample.data.jpa.service;

import org.springframework.stereotype.Service;
import sample.data.jpa.domain.Synn_role;

import javax.transaction.Transactional;
import java.util.List;


@Service("Synn_roleService")
@Transactional
public class Synn_roleServiceImpl implements Synn_roleService {
    private final Synn_roleReposity synn_roleReposity;

    public Synn_roleServiceImpl(Synn_roleReposity synn_roleReposity) {
        this.synn_roleReposity = synn_roleReposity;
    }

    @Override
    public List<Synn_role> findAll() {
        return synn_roleReposity.findAll();
    }

}
