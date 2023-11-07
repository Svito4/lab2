package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90, 100);
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (Math.random() <= 0.1) {
            Effect.freeze(opp);
        }
        if (opp.getHP() < opp.getStat(Stat.HP)/2.0){
            System.out.println("Неплохо");
        }
    }

    @Override
    protected String describe() {
        return "Айсбимит";
    }
}
