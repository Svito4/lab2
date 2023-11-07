package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class FirePunch extends PhysicalMove {
    public FirePunch(){
        super(Type.FIRE, 75, 100);
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (opp.getHP() < opp.getStat(Stat.HP)/2.0){
            System.out.println("Неплохо");
        }
    }
    
    @Override
    protected String describe() {
        return "файрпанч";
    }
}





//            System.out.println("OOOOOO");
//            System.out.println(opp.getHP());
//            System.out.println(opp.getStat(Stat.HP));
