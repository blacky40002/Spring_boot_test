package boot.prova.services;
import boot.prova.entity.GasEntity;
import java.util.List;


public interface GasServiceI {
    GasEntity saveGas(GasEntity gasEntity);

    GasEntity updateGas(GasEntity gasEntity);

    void deleteGas(Long id);

    GasEntity getGasById(Long id);

    List<GasEntity> getAllGases();

}
