package model;

public class Genuri {

    private int id;
    private String gen;

    public Genuri() {
    }


    public Genuri(int id, String gen) {
        this.id = id;
        this.gen = gen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Genuri{" +
                "id=" + id +
                ", gen='" + gen + '\'' +
                '}';
    }
}

