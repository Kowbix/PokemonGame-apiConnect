package com.example.demo;

import java.util.*;

public class GetRandomPokemon {

    private final Map<Integer, String> test;
    private final List<String> pokemon;
    Random r = new Random();

    public GetRandomPokemon() {
        this.test = new HashMap<>();
        this.pokemon = new ArrayList<>();
        addPokemonToList();
    }

    public String getRandomPokemon(){
        String a = pokemon.get(r.nextInt(248));

        return a;
    }


    public void addPokemonToList(){
        pokemon.add( "pl3-1");
        pokemon.add( "ex12-1");
        pokemon.add( "xy5-1");
        pokemon.add( "mcd19-1");
        pokemon.add( "ex7-1");
        pokemon.add( "det1-1");
        pokemon.add( "ru1-1");
        pokemon.add( "ex3-1");
        pokemon.add( "hgss4-1");
        pokemon.add( "ex11-1");
        pokemon.add( "base4-1");
        pokemon.add( "pl1-1");
        pokemon.add( "dv1-1");
        pokemon.add( "dp3-1");
        pokemon.add( "ecard2-H1");
        pokemon.add( "hgss1-1");
        pokemon.add( "gym1-1");
        pokemon.add( "base3-1");
        pokemon.add( "sm9-1");
        pokemon.add( "xy2-1");
        pokemon.add( "pop6-1");
        pokemon.add( "pl1-2");
        pokemon.add( "xy2-2");
        pokemon.add( "ecard2-H2");
        pokemon.add( "hgss4-2");
        pokemon.add( "pop6-2");
        pokemon.add( "base3-2");
        pokemon.add( "ex3-2");
        pokemon.add( "base4-2");
        pokemon.add( "pl3-2");
        pokemon.add( "ex11-2");
        pokemon.add( "dp3-2");
        pokemon.add( "sm9-2");
        pokemon.add( "ru1-2");
        pokemon.add( "gym1-2");
        pokemon.add( "xy5-2");
        pokemon.add( "ex7-2");
        pokemon.add( "det1-2");
        pokemon.add( "mcd19-2");
        pokemon.add( "ex12-2");
        pokemon.add( "hgss1-2");
        pokemon.add( "ex14-1");
        pokemon.add( "xy11-1");
        pokemon.add( "sm12-1");
        pokemon.add( "swsh35-1");
        pokemon.add( "sm3-1");
        pokemon.add( "xy7-1");
        pokemon.add( "ex9-1");
        pokemon.add( "sm115-1");
        pokemon.add( "sm1-1");
        pokemon.add( "dp1-1");
        pokemon.add( "pop7-1");
        pokemon.add( "si1-1");
        pokemon.add( "col1-1");
        pokemon.add( "bw1-1");
        pokemon.add( "ex13-1");
        pokemon.add( "gym2-1");
        pokemon.add( "bw10-1");
        pokemon.add( "dv1-2");
        pokemon.add( "bw10-2");
        pokemon.add( "si1-2");
        pokemon.add( "ex11-3");
        pokemon.add( "bw1-2");
        pokemon.add( "dv1-3");
        pokemon.add( "pl3-3");
        pokemon.add( "xy2-3");
        pokemon.add( "ex12-3");
        pokemon.add( "swsh35-2");
        pokemon.add( "det1-3");
        pokemon.add( "xy7-2");
        pokemon.add( "sm9-3");
        pokemon.add( "ex3-3");
        pokemon.add( "gym2-2");
        pokemon.add( "ex9-2");
        pokemon.add( "pl1-3");
        pokemon.add( "hgss1-3");
        pokemon.add( "ecard2-H3");
        pokemon.add( "ex7-3");
        pokemon.add( "xy5-3");
        pokemon.add( "sm12-2");
        pokemon.add( "ru1-3");
        pokemon.add( "ex13-2");
        pokemon.add( "mcd19-3");
        pokemon.add( "col1-2");
        pokemon.add( "pop6-3");
        pokemon.add( "base4-3");
        pokemon.add( "hgss4-3");
        pokemon.add( "pop7-2");
        pokemon.add( "xy11-2");
        pokemon.add( "sm2-1");
        pokemon.add( "dp3-3");
        pokemon.add( "sm115-2");
        pokemon.add( "sm1-2");
        pokemon.add( "gym1-3");
        pokemon.add( "hgss2-1");
        pokemon.add( "pop5-1");
        pokemon.add( "bw5-1");
        pokemon.add( "neo4-1");
        pokemon.add( "sm8-1");
        pokemon.add( "base1-1");
        pokemon.add( "basep-1");
        pokemon.add( "xy4-1");
        pokemon.add( "sm5-1");
        pokemon.add( "pop1-1");
        pokemon.add( "pop9-1");
        pokemon.add( "xy1-1");
        pokemon.add( "ex4-1");
        pokemon.add( "base6-1");
        pokemon.add( "pop4-1");
        pokemon.add( "base5-1");
        pokemon.add( "pl4-1");
        pokemon.add( "dp4-1");
        pokemon.add( "bw11-1");
        pokemon.add( "dpp-DP01");
        pokemon.add( "pop3-1");
        pokemon.add( "bw4-1");
        pokemon.add( "xy10-1");
        pokemon.add( "ex8-1");
        pokemon.add( "bw7-1");
        pokemon.add( "swsh1-1");
        pokemon.add( "bw8-1");
        pokemon.add( "bw9-1");
        pokemon.add( "swsh4-1");
        pokemon.add( "neo3-1");
        pokemon.add( "base4-4");
        pokemon.add( "pop7-3");
        pokemon.add( "ex8-2");
        pokemon.add( "ecard2-H4");
        pokemon.add( "pop6-4");
        pokemon.add( "sm115-3");
        pokemon.add( "dp3-4");
        pokemon.add( "pl1-4");
        pokemon.add( "swsh35-3");
        pokemon.add( "hgss1-4");
        pokemon.add( "pop3-2");
        pokemon.add( "base5-2");
        pokemon.add( "ex3-4");
        pokemon.add( "pl4-2");
        pokemon.add( "pop9-2");
        pokemon.add( "dp1-2");
        pokemon.add( "pop5-2");
        pokemon.add( "ex13-3");
        pokemon.add( "bw5-2");
        pokemon.add( "sm2-2");
        pokemon.add( "ex4-2");
        pokemon.add( "base6-2");
        pokemon.add( "dp4-2");
        pokemon.add( "xy1-2");
        pokemon.add( "bw10-3");
        pokemon.add( "xy11-3");
        pokemon.add( "xy2-4");
        pokemon.add( "bw7-2");
        pokemon.add( "col1-3");
        pokemon.add( "bw4-2");
        pokemon.add( "mcd19-4");
        pokemon.add( "gym2-3");
        pokemon.add( "si1-3");
        pokemon.add( "ex12-4");
        pokemon.add( "xy7-3");
        pokemon.add( "sm5-2");
        pokemon.add( "neo4-2");
        pokemon.add( "ex11-4");
        pokemon.add( "dv1-4");
        pokemon.add( "sm3-2");
        pokemon.add( "det1-4");
        pokemon.add( "pop1-2");
        pokemon.add( "hgss4-4");
        pokemon.add( "bw11-2");
        pokemon.add( "pop4-2");
        pokemon.add( "sm9-4");
        pokemon.add( "bw8-2");
        pokemon.add( "xy4-2");
        pokemon.add( "base3-4");
        pokemon.add( "dpp-DP02");
        pokemon.add( "ex9-3");
        pokemon.add( "swsh1-2");
        pokemon.add( "sm75-1");
        pokemon.add( "ex10-1");
        pokemon.add( "bw6-1");
        pokemon.add( "ex11-5");
        pokemon.add( "sm12-3");
        pokemon.add( "ex3-5");
        pokemon.add( "pl1-5");
        pokemon.add( "pop4-3");
        pokemon.add( "bw4-3");
        pokemon.add( "ex8-3");
        pokemon.add( "dp3-5");
        pokemon.add( "swsh4-2");
        pokemon.add( "xy5-4");
        pokemon.add( "ex4-3");
        pokemon.add( "dv1-5");
        pokemon.add( "dp4-3");
        pokemon.add( "hgss4-5");
        pokemon.add( "sm75-2");
        pokemon.add( "swsh35-4");
        pokemon.add( "swsh1-3");
        pokemon.add( "gym2-4");
        pokemon.add( "ex7-4");
        pokemon.add( "bw11-3");
        pokemon.add( "dp1-3");
        pokemon.add( "bw7-3");
        pokemon.add( "pl4-3");
        pokemon.add( "xy4-3");
        pokemon.add( "bw10-4");
        pokemon.add( "sm5-3");
        pokemon.add( "xy7-4");
        pokemon.add( "mcd19-5");
        pokemon.add( "bw6-2");
        pokemon.add( "pop7-4");
        pokemon.add( "ex9-4");
        pokemon.add( "ecard2-H5");
        pokemon.add( "basep-2");
        pokemon.add( "base6-3");
        pokemon.add( "ex10-2");
        pokemon.add( "xy11-4");
        pokemon.add( "bw1-3");
        pokemon.add( "neo4-3");
        pokemon.add( "hgss2-2");
        pokemon.add( "hgss1-5");
        pokemon.add( "bw5-3");
        pokemon.add( "ru1-4");
        pokemon.add( "sm9-5");
        pokemon.add( "ex12-5");
        pokemon.add( "sm8-2");
        pokemon.add( "pop3-3");
        pokemon.add( "pop1-3");
        pokemon.add( "pop9-3");
        pokemon.add( "neo3-2");
        pokemon.add( "si1-4");
        pokemon.add( "pl3-4");
        pokemon.add( "base3-5");
        pokemon.add( "dpp-DP03");
        pokemon.add( "xy10-2");
        pokemon.add( "sm115-4");
        pokemon.add( "base1-2");
        pokemon.add( "sm3-3");
        pokemon.add( "xy2-5");
        pokemon.add( "ex14-2");
        pokemon.add( "det1-5");
        pokemon.add( "xy1-3");
        pokemon.add( "basep-3");
        pokemon.add( "xy5-5");
        pokemon.add( "sm9-6");
        pokemon.add( "ex7-5");
        pokemon.add( "bw4-4");
        pokemon.add( "det1-6");
        pokemon.add( "xy10-3");
        pokemon.add( "pop6-5");
        pokemon.add( "pl4-4");

    }
}