package org.itmo.lab2;

import org.itmo.lab2.pockemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pelipper p1 = new Pelipper("пеллипер", 1);
        Regigigas p2 = new Regigigas("реггигас", 1);
        Wingull p3 = new Wingull("вингулл", 1);
        Togetic p4 = new Togetic("тоггетик", 1);
        Togepi p5 = new Togepi("тогеппи", 1);
        Togekiss p6 = new Togekiss("тоггекис", 1);
        battle.addAlly(p1);
        battle.addAlly(p3);
        battle.addAlly(p5);
        battle.addFoe(p2);
        battle.addFoe(p4);
        battle.addFoe(p6);
        battle.go();
    }
}