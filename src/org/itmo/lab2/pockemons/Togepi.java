package org.itmo.lab2.pockemons;

import org.itmo.lab2.moves.DoubleTeam;
import org.itmo.lab2.moves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togepi extends Pokemon {
    public Togepi(String name, int level){
        super(name, level);
        setStats(35, 20, 65, 40, 65, 20);
        setType(Type.FAIRY);
        setMove(new DoubleTeam(), new ShadowBall());
    }
}
