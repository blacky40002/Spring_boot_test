
package boot.prova.controller;

import boot.prova.entity.GasEntity;
import boot.prova.services.GasServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gases")
public class GasController {

    @Autowired
    private GasServiceI gasService;

    @PostMapping
    public ResponseEntity<GasEntity> createGas(@RequestBody GasEntity gasEntity) {
        GasEntity savedGasEntity = gasService.saveGas(gasEntity);
        return ResponseEntity.ok(savedGasEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GasEntity> updateGas(@PathVariable Long id, @RequestBody GasEntity gasEntity) {
        gasEntity.setGasId(id);
        GasEntity updatedGasEntity = gasService.updateGas(gasEntity);
        return ResponseEntity.ok(updatedGasEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGas(@PathVariable Long id) {
        gasService.deleteGas(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GasEntity> getGasById(@PathVariable Long id) {
        GasEntity gasEntity = gasService.getGasById(id);
        return ResponseEntity.ok(gasEntity);
    }

    @GetMapping
    public ResponseEntity<List<GasEntity>> getAllGases() {
        List<GasEntity> gasEntities = gasService.getAllGases();
        return ResponseEntity.ok(gasEntities);
    }
}
