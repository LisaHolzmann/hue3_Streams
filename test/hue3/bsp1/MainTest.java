/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue3.bsp1;

import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author holzm
 */
public class MainTest {

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class Main.
     */
    @Test
    public void testSort() {
        System.out.println("sort");

        Main main = new Main();
        List<Weapon> list = new LinkedList<>();
        list.add(new Weapon("X-13", CombatType.MELEE, DamageType.MISSILE, 30, 23, 55, 3));
        list.add(new Weapon("A-23", CombatType.NONE, DamageType.PIERCING, 21, 34, 2, 34));

        List<Weapon> expected = new LinkedList<>();
        expected.add(new Weapon("A-23", CombatType.NONE, DamageType.PIERCING, 21, 34, 2, 34));
        expected.add(new Weapon("X-13", CombatType.MELEE, DamageType.MISSILE, 30, 23, 55, 3));

        main.sort(list);

        assertEquals(expected, list);

    }

    /**
     * Test of sort2 method, of class Main.
     */
    @Test
    public void testSort2() {
        System.out.println("sort2");
        //Main.sort2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
