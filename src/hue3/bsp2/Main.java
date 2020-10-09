/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue3.bsp2;

import java.text.Normalizer;
import java.util.Random;

/**
 *
 * @author holzm
 */
public class Main {

    public static int[] zufall = new int[10000];
    public static String[] line = new String[10];

    public static void main(String[] args) {

    }

    public void befuellenInt() {
        for (int i = 0; i < zufall.length; i++) {
            zufall[i] = (int) (Math.random() * 101);

        }
    }

    public void befuellenString() {

        String grossB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String kleinB = grossB.toLowerCase();

        String all = grossB + kleinB;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length; i++) {

            int j = 0;
            Random rand = new Random();
            while (j < 10) {
                sb.append(all.charAt(rand.nextInt(all.length())));
                j++;

            }

            line[i] = sb.toString();

        }
    }
}
