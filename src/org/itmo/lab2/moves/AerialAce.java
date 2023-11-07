package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.NORMAL, 60, 100);
    }


    //infty accuracy

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }

    @Override
    protected String describe() {
        return "AERIALACE";
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (opp.getHP() < opp.getStat(Stat.HP)/2.0){
            System.out.println("Неплохо");
        }
    }

}
