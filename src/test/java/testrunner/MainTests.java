package testrunner;
import common.CalcTrackAndField;
import common.InputName;
import decathlon.*;
import excel.ExcelPrinter;
import heptathlon.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static junit.framework.TestCase.assertEquals;

public class MainTests {

    //<editor-fold desc="Tests concerning name input">
    //Tests inputting a normal name into the name method.
    @Test
    public void testInputNormalName() {
        //Arrange
        String input = "Gunwald";
        InputName myInputName = new InputName();

        //Act
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //Assert
        assertEquals("Gunwald", myInputName.addCompetitor());

    }
    //</editor-fold>

    //<editor-fold desc="Tests concerning Decathlon results">
    @Test
    public void testDeca100() {
        //Arrange
        CalcTrackAndField deca = new CalcTrackAndField();

        //Act
        int actual = deca.calculateTrack(25.4347,18,1.81,10);
        int expected = 1096;

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testDeca110() {
        //Arrange
        Deca110MHurdles deca = new Deca110MHurdles();

        //Act
        double actual = deca.calculateResult(15);
        double expected = 850;

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testDeca400() {
        //Arrange
        Deca400M deca = new Deca400M();

        //Act
        double actual = deca.calculateResult(20);
        double expected = 2698;

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testDeca1500() {
        //Arrange
        Deca1500M deca = new Deca1500M();

        //Act
        double actual = deca.calculateResult(3);
        double expected = 3399;

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testDecaDiscus() {
        //Arrange
        DecaDiscusThrow deca = new DecaDiscusThrow();

        //Act
        double actual = deca.calculateResult(25);
        double expected = 367;

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testDecaHighJump() {
        //Arrange
        DecaHighJump deca = new DecaHighJump();

        //Act
        double actual = deca.calculateResult(200);
        double expected = 803;

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testDecaJavelinThrow() {
        //Arrange
        DecaJavelinThrow deca = new DecaJavelinThrow();

        //Act
        double actual = deca.calculateResult(50);
        double expected = 589;

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testLongJump() {
        //Arrange
        DecaLongJump deca = new DecaLongJump();

        //Act
        double actual = deca.calculateResult(400);
        double expected = 206;

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testDecaPoleVault() {
        //Arrange
        DecaPoleVault deca = new DecaPoleVault();

        //Act
        double actual = deca.calculateResult(200);
        double expected = 140;

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testDecaShotPut() {
        //Arrange
        DecaShotPut deca = new DecaShotPut();

        //Act
        double actual = deca.calculateResult(25);
        double expected = 1414;

        //Assert
        assertEquals(expected, actual);
    }

    //</editor-fold>

    //<editor-fold desc="Tests concerning Heptathlon results">
    @Test
    public void testHep100MHurdles() {
        //Arrange
        Hep100MHurdles hep = new Hep100MHurdles();

        //Act
        double actual = hep.calculateResult(25);
        double expected = 24;

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testHep200M() {
        //Arrange
        Hep200M hep = new Hep200M();

        //Act
        double actual = hep.calculateResult(25);
        double expected = 887;

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testHep800() {
        //Arrange
        Hep800M hep = new Hep800M();

        //Act
        double actual = hep.calculateResult(100);
        double expected = 1450;

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testHepHighJump() {
        //Arrange
        HeptHighJump hep = new HeptHighJump();

        //Act
        double actual = hep.calculateResult(100);
        double expected = 141;

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testHepJavelinThrow() {
        //Arrange
        HeptJavelinThrow hep = new HeptJavelinThrow();

        //Act
        double actual = hep.calculateResult(15);
        double expected = 197;

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testHepLongJump() {
        //Arrange
        HeptLongJump hep = new HeptLongJump();

        //Act
        double actual = hep.calculateResult(400);
        double expected = 308;

        //Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testHepShotPut() {
        //Arrange
        HeptShotPut hep = new HeptShotPut();

        //Act
        double actual = hep.calculateResult(50);
        double expected = 3298;

        //Assert
        assertEquals(expected,actual);

    }
    //</editor-fold>



    }
