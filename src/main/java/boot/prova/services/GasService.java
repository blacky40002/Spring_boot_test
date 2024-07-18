// path: boot/prova/service/GasServiceImpl.java

package boot.prova.services;

import boot.prova.entity.GasEntity;
import boot.prova.repository.GasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GasService implements GasServiceI{

    @Autowired
    private GasRepository gasRepository;

    @Override
    public GasEntity saveGas(GasEntity gasEntity) {
        return gasRepository.save(gasEntity);
    }

    @Override
    public GasEntity updateGas(GasEntity gasEntity) {
        return gasRepository.save(gasEntity);
    }

    @Override
    public void deleteGas(Long id) {
        gasRepository.deleteById(id);
    }

    @Override
    public GasEntity getGasById(Long id) {
        Optional<GasEntity> gas = gasRepository.findById(id);
        return gas.orElse(null);
    }

    @Override
    public List<GasEntity> getAllGases() {
        return gasRepository.findAll();
    }
}
