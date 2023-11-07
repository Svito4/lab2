package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MagicalLeaf extends SpecialMove {
    public MagicalLeaf(){
        super(Type.ROCK, 60, 100);
    }

    @Override
    public void applySelfEffects(Pokemon opp) {
        opp.setMod(Stat.EVASION, 1);
        opp.setMod(Stat.ACCURACY, 1);
    }

    @Override
    protected String describe() {
        return "Мэджиклифит";
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (opp.getHP() < opp.getStat(Stat.HP)/2.0){
            System.out.println("Неплохо");
        }
    }

}



//Magical Leaf deals damage and ignores changes to the Accuracy and Evasion stats.
