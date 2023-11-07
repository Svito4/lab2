package org.itmo.lab2.pockemons;

import org.itmo.lab2.moves.AerialAce;
import ru.ifmo.se.pokemon.Type;

public class Togekiss extends Togetic {
    public Togekiss(String name, int level){
        super(name, level);
        setStats(85, 50, 95, 120, 115, 80);
        setType(Type.FAIRY, Type.FLYING);
        addMove(new AerialAce());
    }
}
