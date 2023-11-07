package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.*;

public class ThunderPunch extends PhysicalMove {
    public ThunderPunch() {
        super(Type.ELECTRIC, 75, 100);
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (Math.random() <= 0.1)
            Effect.flinch(opp);
        if (opp.getHP() < opp.getStat(Stat.HP)/2.0){
            System.out.println("Неплохо");
        }
    }

    @Override
    protected String describe() {
        return "Тандер Панч";
    }
}
