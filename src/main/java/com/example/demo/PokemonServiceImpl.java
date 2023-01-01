package com.example.demo;

import com.example.demo.model.PokemonObject;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokemonServiceImpl {

    private List<PokemonObject> pokemonObjectList;
    private List<PokemonObject> pokemonObjectComputerList;


    public PokemonServiceImpl() {
        pokemonObjectList = new ArrayList<>();
        pokemonObjectComputerList = new ArrayList<>();
    }

    public void clearLists() {
        if(!pokemonObjectList.isEmpty()) {
            pokemonObjectList.clear();
            pokemonObjectComputerList.clear();
        }
    }

    public void setPokemon(String id){
        PokemonObject pokemon = pokemonObjectList.stream().filter(el -> el.getId().equals(id)).findFirst().get();

        Collections.swap(pokemonObjectList, 0, pokemonObjectList.indexOf(pokemon));

    }

    public void updatePlayerPokemon(int id, PokemonObject pokemonObject){
        pokemonObjectList.set(id, pokemonObject);
    }

    public void changePlayerPokemon(String id, PokemonObject newPokemon) {
        PokemonObject pokemon = pokemonObjectList.stream().filter(el -> el.getId().equals(id)).findFirst().get();
        int index = pokemonObjectList.indexOf(pokemon);
        pokemonObjectList.set(index, newPokemon);
    }

    public void updateComputerPokemon(int id, PokemonObject pokemonObject){
        pokemonObjectComputerList.set(id, pokemonObject);
    }

    public void addPokemon(PokemonObject pokemon) {
        pokemonObjectList.add(pokemon);
    }

    public void addComputerPokemon(PokemonObject pokemon) {
        pokemonObjectComputerList.add(pokemon);
    }

    public List<PokemonObject> getPokemonObjectList() {
        return pokemonObjectList;
    }

    public void setPokemonObjectList(List<PokemonObject> pokemonObjectList) {
        this.pokemonObjectList = pokemonObjectList;
    }

    public List<PokemonObject> getPokemonObjectComputerList() {
        return pokemonObjectComputerList;
    }

    public void setPokemonObjectComputerList(List<PokemonObject> pokemonObjectComputerList) {
        this.pokemonObjectComputerList = pokemonObjectComputerList;
    }
}
