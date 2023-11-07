package org.itmo.lab2.pockemons;

import org.itmo.lab2.moves.AerialAce;
import org.itmo.lab2.moves.FirePunch;
import org.itmo.lab2.moves.StoneEdge;
import org.itmo.lab2.moves.ThunderPunch;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Regigigas extends Pokemon {
    public Regigigas(String name, int level){
        super(name, level);
        setStats(110, 160, 110, 80, 110, 100);
        setType(Type.NORMAL);
        setMove(new ThunderPunch(), new AerialAce(), new FirePunch(), new StoneEdge());
    }
}



////final double public healthopp = 110.0;
