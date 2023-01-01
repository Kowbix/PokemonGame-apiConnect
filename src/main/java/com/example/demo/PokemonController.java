package com.example.demo;


import com.example.demo.game.Fighting;
import com.example.demo.model.Data;
import com.example.demo.model.Pokemon;
import com.example.demo.model.PokemonObject;
import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class PokemonController {

    GetRandomPokemon rand = new GetRandomPokemon();
    PokemonServiceImpl service = new PokemonServiceImpl();


    @GetMapping("/")
    public String guiPokemon( Model model) {

        List<PokemonObject> pokemonObject = service.getPokemonObjectList();
        List<PokemonObject> pokemonComputerObject = service.getPokemonObjectComputerList();


        model.addAttribute("pokemonObject", pokemonObject);
        model.addAttribute("pokemonComputerObject", pokemonComputerObject);

        return "gui";
    }

    @GetMapping("/draw")
    public String drawPokemon() {
        RestTemplate rest = new RestTemplate();
        service.clearLists();
        String randNum, randNum2;



        for (int i = 0; i < 5; i++) {
//            randNum = "ex14-1";
//            randNum2 = "ex14-1";
            randNum = rand.getRandomPokemon();
            randNum2 = rand.getRandomPokemon();
            System.out.println("RandNum: " + randNum);
            System.out.println("RandNum2: " + randNum2);

            ResponseEntity<Pokemon> exchange = rest.getForEntity("https://api.pokemontcg.io/v2/cards/" + randNum,
                    Pokemon.class);

            ResponseEntity<Pokemon> exchange2 = rest.getForEntity("https://api.pokemontcg.io/v2/cards/" + randNum2,
                    Pokemon.class);

            PokemonObject pokemon = new PokemonObject(exchange.getBody().getData().getId(),
            exchange.getBody().getData().getName(),
            exchange.getBody().getData().getHp(),
            exchange.getBody().getData().getImages().getLarge(),
            exchange.getBody().getData().getAttacks().get(0).getDamage());

            PokemonObject pokemonComputer = new PokemonObject(exchange2.getBody().getData().getId(),
                    exchange2.getBody().getData().getName(),
                    exchange2.getBody().getData().getHp(),
                    exchange2.getBody().getData().getImages().getLarge(),
                    exchange2.getBody().getData().getAttacks().get(0).getDamage());

            service.addPokemon(pokemon);
            service.addComputerPokemon(pokemonComputer);
        }

        return "redirect:/";
    }

    @GetMapping("/gamepanel")
    public String gamePanel(Model model){
        if(!service.getPokemonObjectList().isEmpty() || !service.getPokemonObjectComputerList().isEmpty()) {
            PokemonObject pokemonObject = service.getPokemonObjectList().get(0);
            PokemonObject pokemonComputerObject = service.getPokemonObjectComputerList().get(0);

            model.addAttribute("pokemonObject", pokemonObject);
            model.addAttribute("pokemonComputerObject", pokemonComputerObject);

            return "game";
        }else {
            return "redirect:/";
        }


    }

    @GetMapping("/game")
    public String gameFight(Model model) {

        if (!service.getPokemonObjectList().isEmpty()) {
            PokemonObject pokemonObject = service.getPokemonObjectList().get(0);
            PokemonObject pokemonComputerObject = service.getPokemonObjectComputerList().get(0);

            Fighting game = new Fighting(pokemonObject, pokemonComputerObject);

            pokemonObject = game.fightPlayerPokemon();
            pokemonComputerObject = game.fightComputerPokemon();

            if(pokemonObject.getHp() <= 0){
                service.getPokemonObjectList().remove(pokemonObject);
            }else {
                service.updatePlayerPokemon(0, pokemonObject);
            }

            if(pokemonComputerObject.getHp() <= 0){
                service.getPokemonObjectComputerList().remove(pokemonComputerObject);
            } else {
                service.updateComputerPokemon(0, pokemonComputerObject);
            }



            model.addAttribute("pokemonObject", pokemonObject);
            model.addAttribute("pokemonComputerObject", pokemonComputerObject);
            model.addAttribute("game", game);
            if (!service.getPokemonObjectList().isEmpty() && !service.getPokemonObjectComputerList().isEmpty()){
                return "redirect:/gamepanel";
            } else {
                return "redirect:/";
            }


        } else {
            return "redirect:/";
        }
    }



    @GetMapping("/change")
    public String changePokemon(@RequestParam String id) {
        int i =0;

        if(i < 2) {
            RestTemplate rest = new RestTemplate();
            String randNum = rand.getRandomPokemon();
            ResponseEntity<Pokemon> exchange = rest.getForEntity("https://api.pokemontcg.io/v2/cards/" + randNum,
                    Pokemon.class);

//        PokemonObject oldPokemon =

            PokemonObject newPokemon = new PokemonObject(exchange.getBody().getData().getId(),
                    exchange.getBody().getData().getName(),
                    exchange.getBody().getData().getHp(),
                    exchange.getBody().getData().getImages().getLarge(),
                    exchange.getBody().getData().getAttacks().get(0).getDamage());


            service.changePlayerPokemon(id, newPokemon);
            i++;
        }

        return "redirect:/";
    }

}
