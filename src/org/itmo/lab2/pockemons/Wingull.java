package org.itmo.lab2.pockemons;

import org.itmo.lab2.moves.AerialAce;
import org.itmo.lab2.moves.DoubleTeam;
import org.itmo.lab2.moves.IceBeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wingull extends Pokemon {
    public Wingull(String name, int level){
        super(name, level);
        setStats(40, 30, 30, 55, 30, 85);
        setType(Type.WATER, Type.FLYING);
        setMove(new AerialAce(), new DoubleTeam(), new IceBeam());
    }
}
