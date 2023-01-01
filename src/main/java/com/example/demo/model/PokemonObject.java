package com.example.demo.model;

public class PokemonObject {

    private String id;
    private String name;
    private int hp;
    private String largeImg;
    private String dmg;
    private int ingDmg;


    public PokemonObject(String id, String name, int hp, String largeImg, String dmg) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.largeImg = largeImg;
        this.dmg = dmg;
        createDmg(dmg);
    }

    public void createDmg (String a) {
        if (a.contains("+") || a == "" || a.contains("×") || a.contains("-")){
            setIngDmg(getHp()/2);
        } else {
            setIngDmg(Integer.parseInt(a));
        }
    }

    public int getIngDmg() {
        return ingDmg;
    }

    public void setIngDmg(int ingDmg) {
        this.ingDmg = ingDmg;
    }

    public String getDmg() {
        return dmg;
    }

    public void setDmg(String dmg) {
        this.dmg = dmg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getLargeImg() {
        return largeImg;
    }

    public void setLargeImg(String largeImg) {
        this.largeImg = largeImg;
    }
}
