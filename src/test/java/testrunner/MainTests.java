package testrunner;
import common.CalcTrackAndField;
import common.InputName;
import decathlon.Deca100M;
import excel.ExcelPrinter;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static junit.framework.TestCase.assertEquals;

public class MainTests {

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

    @Test
    public void testInputBadName() {
        //Arrange
        String input = "01010 huehuehu";
        InputName myInputName = new InputName();

        //Act
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String actual = myInputName.addCompetitor();
        String expected = "Only use letters when putting in competitors name.";

        //Assert
    }
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

}
