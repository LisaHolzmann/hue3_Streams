/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue3.bsp1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 *
 * @author lholzm
 */
public class Main {

    private static List<Weapon> list = new LinkedList<>();

    public static void main(String[] args) throws InterruptedException, IOException {

        // reads a file in one line using lambdas
        list = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapon(
                s[0],
                CombatType.valueOf(s[1]),
                DamageType.valueOf(s[2]),
                Integer.parseInt(s[3]),
                Integer.parseInt(s[4]),
                Integer.parseInt(s[5]),
                Integer.parseInt(s[6])
        ))
                .collect(Collectors.toList());

        // lambda for own functional interfaces
        Printable printable = w -> System.out.println("name=" + w.getName() + ", combatType=" + w.getCombatType() + ", damageType=" + w.getDamageType() + ", damage=" + w.getDamage() + ", speed=" + w.getSpeed() + ", minStrength=" + w.getMinStrength() + ", value=" + w.getValue());

        Main.sort(list);
        for (int i = 0; i < list.size(); i++) {
            printable.print(list.get(i));

        }

        Main.sort2(list);
        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            printable.print(list.get(i));

        }

        System.out.println("");
        Main.printListAsTable();

    }

    public static void sort(List<Weapon> liste) {
        //1.2
        // lambda for interface Comparator
        liste.sort((w1, w2) -> Integer.compare(w1.getDamage(), w2.getDamage()));
    }

    public static void sort2(List<Weapon> liste) {

        liste.sort((w1, w2) -> {
            int comp = w1.getCombatType().compareTo(w2.getCombatType());
            if (comp == 0) {
                comp = w1.getDamageType().compareTo(w2.getDamageType());
            }
            if (comp == 0) {
                comp = w1.getName().compareTo(w2.getName());
            }
            return comp;
        });
    }

    public static void printListAsTable() {
        System.out.println("-----------------------------------------------------------------");

        Printable tablePrint = (w) -> {
            System.out.printf("%-20s", " | " + w.getName());
            System.out.printf("%-9s", " | " + w.getCombatType());
            System.out.printf("%-11s ", " | " + w.getDamageType());
            System.out.printf("%-6s", " | " + w.getDamage());
            System.out.printf("%-3s", " | " + w.getSpeed());
            System.out.printf("%-6s", " | " + w.getMinStrength());
            System.out.printf("%-7s %n", " | " + w.getValue());
            System.out.println("+---------------------------------------------------------------+");
        };
        list.forEach(w -> tablePrint.print(w));

    }

}
