package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {

    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public void applySelfEffects(Pokemon opp) {
        opp.setMod(Stat.EVASION, 2);
    }

    @Override
     protected String describe() {
        return "Даблтимит";
    }

    @Override
    public void applyOppEffects(Pokemon opp) {
        if (opp.getHP() < opp.getStat(Stat.HP)/2.0){
            System.out.println("Неплохо");
        }
    }

}




    //    public final void applySelfDamage(Pokemon var1, double var2) {
    //        var1.setMod(Stat.HP, (int)var2);
    //    }
    //Double Team raises the user's Evasiveness by one stage,
    //thus making the user more difficult to hit.
    //Stats can be raised to a maximum of +6 stages each.


