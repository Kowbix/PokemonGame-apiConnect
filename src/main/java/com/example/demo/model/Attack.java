package com.example.demo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Attack {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("convertedEnergyCost")
    @Expose
    private Integer convertedEnergyCost;
    @SerializedName("damage")
    @Expose
    private String damage;
    @SerializedName("text")
    @Expose
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getConvertedEnergyCost() {
        return convertedEnergyCost;
    }

    public void setConvertedEnergyCost(Integer convertedEnergyCost) {
        this.convertedEnergyCost = convertedEnergyCost;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}

