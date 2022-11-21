package model;

public class ModelPreEvolucao1 {

    private int id;
    private String atk, def, sta;

    public ModelPreEvolucao1() {
    }

    public ModelPreEvolucao1(int id, String atk, String def, String sta) {
        this.id = id;
        this.atk = atk;
        this.def = def;
        this.sta = sta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }
}
