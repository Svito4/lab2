package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90, 100);
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (Math.random() <= 0.1) {
            Effect.freeze(opp);
        }
    }

    @Override
    protected String describe() {
        return "Айсбимит";
    }
}
