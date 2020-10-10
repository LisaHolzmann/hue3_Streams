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

        erg = erg.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        return erg;

    }

    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }

    public List<String> toNameList(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }

    public int sumUpValues(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        throw new UnsupportedOperationException();
    }
}
