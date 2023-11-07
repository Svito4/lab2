package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FirePunch extends PhysicalMove {
    public FirePunch(){
        super(Type.FIRE, 75, 100);
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (Math.random() <= 0.1) {
            Effect.burn(opp);
        }
    }
    @Override
    protected String describe() {
        return "файрпанч";
    }
}
