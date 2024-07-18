package boot.prova.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class GasEntity {
    private String tipoGas;
    private double quantita;
    private String fonte;
    private String destinazioni;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long gasId;

    public String getDestinazioni() {
        return destinazioni;
    }

    public void setDestinazioni(String destinazioni) {
        this.destinazioni = destinazioni;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public double getQuantita() {
        return quantita;
    }

    public void setQuantita(double quantita) {
        this.quantita = quantita;
    }

    public String getTipoGas() {
        return tipoGas;
    }

    public void setTipoGas(String tipoGas) {
        this.tipoGas = tipoGas;
    }

    public Long getGasId() {
        return gasId;
    }

    public void setGasId(Long gasId) {
        this.gasId = gasId;
    }




}
