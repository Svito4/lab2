package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ThunderPunch extends PhysicalMove {
    public ThunderPunch() {
        super(Type.ELECTRIC, 75, 100);
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (Math.random() <= 0.1)
            Effect.flinch(opp);
    }

    @Override
    protected String describe() {
        return "Тандер Панч";
    }
}
