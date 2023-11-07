package org.itmo.lab2.pockemons;

import org.itmo.lab2.moves.HydroPump;
import ru.ifmo.se.pokemon.Type;

public class Pelipper extends Wingull {
    public Pelipper(String name, int level){
        super(name, level);
        setStats(60, 50, 100, 95, 70, 65);
        setType(Type.WATER, Type.FLYING);
        addMove(new HydroPump());
    }
}
