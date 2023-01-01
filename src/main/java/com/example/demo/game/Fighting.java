package com.example.demo.game;

import com.example.demo.model.PokemonObject;

import java.util.Random;

public class Fighting {

    private PokemonObject pokemonObject;
    private PokemonObject pokemonComputerObject;

    private int playerPoint;
    private int computerPoint;

    Random rand;

    public Fighting(PokemonObject pokemonObject, PokemonObject pokemonComputerObject) {
        this.pokemonObject = pokemonObject;
        this.pokemonComputerObject = pokemonComputerObject;
        rand = new Random();
    }

    public PokemonObject fightPlayerPokemon() {
        int dmgHp = pokemonObject.getHp() - rand.nextInt(1, pokemonComputerObject.getIngDmg());
        if(dmgHp < 0){
            pokemonObject.setHp(0);
        } else {
            pokemonObject.setHp(dmgHp);
        }

        setPlayerPoint(getPlayerPoint() + dmgHp);

        return pokemonObject;
    }

    public PokemonObject fightComputerPokemon() {
        int dmgHp = pokemonComputerObject.getHp() - rand.nextInt(1, pokemonObject.getIngDmg());
        if(dmgHp < 0 ){
            pokemonComputerObject.setHp(0);
        } else {
            pokemonComputerObject.setHp(dmgHp);
        }

        setComputerPoint(getComputerPoint() + dmgHp);

        return pokemonComputerObject;
    }

    public int getPlayerPoint() {
        return playerPoint;
    }

    public void setPlayerPoint(int playerPoint) {
        this.playerPoint = playerPoint;
    }

    public int getComputerPoint() {
        return computerPoint;
    }

    public void setComputerPoint(int computerPoint) {
        this.computerPoint = computerPoint;
    }

    public PokemonObject getPokemonObject() {
        return pokemonObject;
    }

    public void setPokemonObject(PokemonObject pokemonObject) {
        this.pokemonObject = pokemonObject;
    }

    public PokemonObject getPokemonComputerObject() {
        return pokemonComputerObject;
    }

    public void setPokemonComputerObject(PokemonObject pokemonComputerObject) {
        this.pokemonComputerObject = pokemonComputerObject;
    }


}
