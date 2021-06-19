package model;

import java.util.Date;

public class Carti {

    private int id;
    private String denumire;
    private Autor autor;
    private String editura;
    private Date anAparitie;
    private Genuri genuri;

    public Carti() {
    }

    public Carti(int id, String denumire, Autor autor, String editura, Date anAparitie, Genuri genuri) {
        this.id = id;
        this.denumire = denumire;
        this.autor = autor;
        this.editura = editura;
        this.anAparitie = anAparitie;
        this.genuri = genuri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = (Autor) autor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public java.sql.Date getAnAparitie() {
        return (java.sql.Date) anAparitie;
    }

    public void setAnAparitie(Date anAparitie) {
        this.anAparitie = anAparitie;
    }

    public Genuri getGenuri() {
        return genuri;
    }

    public void setGenuri(Genuri genuri) {
        this.genuri = (Genuri) genuri;
    }

    @Override
    public String toString() {
        return "Carti{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", autor=" + autor +
                ", editura='" + editura + '\'' +
                ", anAparitie=" + anAparitie +
                ", genuri=" + genuri +
                '}';
    }



}
