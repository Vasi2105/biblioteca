package model;
import java.util.Date;

public class Imprumut {
    private int id;
    private Carti carti;
    private Clienti clienti;
    private Date dataImprumut;
    private Date dataRetur;

    public Imprumut() {
    }

    public Imprumut(int id, Carti carti, Clienti clienti, Date dataImprumut, Date dataRetur) {
        this.id = id;
        this.carti = carti;
        this.clienti = clienti;
        this.dataImprumut = dataImprumut;
        this.dataRetur = dataRetur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carti getCarti() {
        return carti;
    }

    public void setCarti(Carti carti) {
        this.carti = carti;
    }

    public Clienti getClienti() {
        return clienti;
    }

    public void setClienti(Clienti clienti) {
        this.clienti = clienti;
    }

    public Date getDataImprumut() {
        return dataImprumut;
    }

    public void setDataImprumut(Date dataImprumut) {
        this.dataImprumut = dataImprumut;
    }

    public Date getDataRetur() {
        return dataRetur;
    }

    public void setDataRetur(Date dataRetur) {
        this.dataRetur = dataRetur;
    }

    @Override
    public String toString() {
        return "Imprumut{" +
                "id=" + id +
                ", carti=" + carti +
                ", clienti=" + clienti +
                ", dataImprumut=" + dataImprumut +
                ", dataRetur=" + dataRetur +
                '}';
    }
}
