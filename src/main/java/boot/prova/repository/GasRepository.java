package boot.prova.repository;

import boot.prova.entity.GasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GasRepository extends JpaRepository<GasEntity, Long>
{
}
