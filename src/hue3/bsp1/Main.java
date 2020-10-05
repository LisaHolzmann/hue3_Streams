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

        /*

        // lambda for interface Runnable
        Thread t = new Thread(() -> System.out.println("ID = " + Thread.currentThread().getId()));
        t.start();

        // more complex lambda for Runnable
        new Thread(() -> {
            while (true) {
                System.out.println(new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    // do nothing
                }
            }
        }).start();*/
        // lambda for own functional interfaces
        Printable printable = w -> System.out.println(w.getName() + " [" + w.getDamageType() + " = " + w.getDamage() + "]");
        printable.print(list.get(0));
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

}
