/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import static java.util.stream.Collectors.joining;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import problems.CodeWar;

/**
 *
 * @author Administrator
 */
public class CodeWarTest {

    // Quater
    @Test
    public void quarterOfTest1() {
        Assert.assertEquals(CodeWar.quarterOf(3), 1);
    }

    @Test
    public void quarterOfTest2() {
        Assert.assertEquals(CodeWar.quarterOf(8), 3);
    }

    @Test
    public void quarterOfTest3() {
        Assert.assertEquals(CodeWar.quarterOf(11), 4);
    }

    // Create Phone Number
    @Test
    public void quarterOfTest4() {
        Assert.assertEquals(CodeWar.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), "(123) 456-7890");
    }

    @Test
    public void multiplesOf3Or5Test1() {
        int actual = CodeWar.multiplesOf3Or5(20);
        Assert.assertEquals(78, actual);
    }

    @Test
    public void pigItTest1() {
        String test = CodeWar.pigIt("Pig latin is cool");
        Assert.assertEquals("igPay atinlay siay oolcay", test);
    }

    @Test
    public void pigItTest2() {
        String test = CodeWar.pigIt("Hello world !");
        Assert.assertEquals("elloHay orldway !", test);
    }

    @Test
    public void humanReadableTimeTest1() {
        assertEquals("makeReadable(0)", "00:00:00", CodeWar.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", CodeWar.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", CodeWar.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", CodeWar.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", CodeWar.makeReadable(359999));
    }

    @Test
    public void rangeExtractionTest1() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", CodeWar.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
        assertEquals("-3--1,2,10,15,16,18-20", CodeWar.rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
    }

    @Test
    public void snailTest1() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }

    @Test
    public void snailTest2() {
        int[][] array
                = {{1, 2, 3, 9},
                {4, 5, 6, 4},
                {7, 8, 9, 1},
                {1, 2, 3, 4}};
        int[] r = {1, 2, 3, 9, 4, 1, 4, 3, 2, 1, 7, 4, 5, 6, 9, 8};
        test(array, r);
    }

    public String int2dToString(int[][] a) {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        Assert.assertArrayEquals(result, CodeWar.snail(array));
        CodeWar.travelEdge(array, 0, array.length - 1, 0, array[0].length - 1);
    }

//    @Test
    public void testToRoman() throws Exception {
        assertThat("1 converts to 'I'", CodeWar.toRoman(1), is("I"));
        assertThat("2 converts to 'II'", CodeWar.toRoman(2), is("II"));
    }

//    @Test
    public void testFromRoman() throws Exception {
        assertThat("'I' converts to 1", CodeWar.fromRoman("I"), is(1));
        assertThat("'II' converts to 2", CodeWar.fromRoman("II"), is(2));
    }

    @Test
    public void weightSortTest1() {
        assertEquals("2000 103 123 4444 99", CodeWar.orderWeight("103 123 4444 99 2000"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", CodeWar.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
        assertEquals("1 2 200 4 4 6 6 7 7 18 27 72 81 9 91 425 31064 7920 67407 96488 34608557 71899703", CodeWar.orderWeight("71899703 200 6 91 425 4 67407 7 96488 6 4 2 7 31064 9 7920 1 34608557 27 72 18 81"));
    }

//    @Test
    public void mazeShortestPathTest1() {
        String strMaze = ".W.\n"
                + ".W.\n"
                + "...";
        CodeWar.mazeShortestPath(strMaze);
    }
}
