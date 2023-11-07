package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump(){
        super(Type.WATER, 110, 80);
    }

    @Override
    protected String describe() {
        return "хидроопампит";
    }
}
