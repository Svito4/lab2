package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK, 100, 80);
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (opp.getHP() < opp.getStat(Stat.HP)/2.0){
            System.out.println("Неплохо");
        }
    }

    @Override
    protected String describe() {
        return "стонэдж";
    }



}
