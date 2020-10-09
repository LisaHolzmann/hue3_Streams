package hue3.bsp2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    public double average(int[] numbers) {

        return IntStream.of(numbers).average().getAsDouble();
    }

    public List<String> upperCase(String[] strings) {

        List<String> erg = Arrays.asList(strings);

        erg.stream().map(s -> s.toUpperCase());
        return erg;

    }

    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        //implement this
    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        //implement this
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        //implement this
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        //implement this
    }

    public List<String> toNameList(List<Weapon> weapons) {
        //implement this
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        //implement this
    }

    public int sumUpValues(List<Weapon> weapons) {
        //implement this
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        //implement this
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        //implement this
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        //implement this
    }
}
