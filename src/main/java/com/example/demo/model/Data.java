package com.example.demo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Data {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("supertype")
    @Expose
    private String supertype;
    @SerializedName("subtypes")
    @Expose
    private List<Object> subtypes = null;
    @SerializedName("hp")
    @Expose
    private int hp;
    @SerializedName("types")
    @Expose
    private List<Object> types = null;
    @SerializedName("evolvesFrom")
    @Expose
    private String evolvesFrom;
    @SerializedName("attacks")
    @Expose
    private List<Attack> attacks = null;
    @SerializedName("weaknesses")
    @Expose
    private List<Object> weaknesses = null;
    @SerializedName("resistances")
    @Expose
    private List<Object> resistances = null;
    @SerializedName("retreatCost")
    @Expose
    private List<Object> retreatCost = null;
    @SerializedName("convertedRetreatCost")
    @Expose
    private Integer convertedRetreatCost;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("rarity")
    @Expose
    private String rarity;
    @SerializedName("flavorText")
    @Expose
    private String flavorText;
    @SerializedName("nationalPokedexNumbers")
    @Expose
    private List<Object> nationalPokedexNumbers = null;


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

    public String getSupertype() {
        return supertype;
    }

    public void setSupertype(String supertype) {
        this.supertype = supertype;
    }

    public List<Object> getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(List<Object> subtypes) {
        this.subtypes = subtypes;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public List<Object> getTypes() {
        return types;
    }

    public void setTypes(List<Object> types) {
        this.types = types;
    }

    public String getEvolvesFrom() {
        return evolvesFrom;
    }

    public void setEvolvesFrom(String evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }

    @SerializedName("images")
    @Expose
    private PokemonImg images;

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public List<Object> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<Object> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public List<Object> getResistances() {
        return resistances;
    }

    public void setResistances(List<Object> resistances) {
        this.resistances = resistances;
    }

    public List<Object> getRetreatCost() {
        return retreatCost;
    }

    public void setRetreatCost(List<Object> retreatCost) {
        this.retreatCost = retreatCost;
    }

    public Integer getConvertedRetreatCost() {
        return convertedRetreatCost;
    }

    public void setConvertedRetreatCost(Integer convertedRetreatCost) {
        this.convertedRetreatCost = convertedRetreatCost;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public List<Object> getNationalPokedexNumbers() {
        return nationalPokedexNumbers;
    }

    public void setNationalPokedexNumbers(List<Object> nationalPokedexNumbers) {
        this.nationalPokedexNumbers = nationalPokedexNumbers;
    }

    public PokemonImg getImages() {
        return images;
    }

    public void setImages(PokemonImg images) {
        this.images = images;
    }


}