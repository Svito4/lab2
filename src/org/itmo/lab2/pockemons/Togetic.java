package org.itmo.lab2.pockemons;

import org.itmo.lab2.moves.MagicalLeaf;
import ru.ifmo.se.pokemon.Type;

public class Togetic extends Togepi {
    public Togetic(String name, int level){
        super(name, level);
        setStats(55, 40, 85, 80, 105, 40);
        setType(Type.FLYING, Type.FAIRY);
        addMove(new MagicalLeaf());
    }
}

