package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST, 80, 100);
    }

    //Shadow Ball deals damage and has a 20% chance of lowering
    //the target's Special Defense by one stage.
    //Stats can be lowered to a minimum of -6 stages each.

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (Math.random() <= 0.2) {
            opp.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
        if (opp.getHP() < opp.getStat(Stat.HP)/2.0){
            System.out.println("Неплохо");
        }
    }

    @Override
    protected String describe() {
        return "Шаддоуболлит";
    }
}