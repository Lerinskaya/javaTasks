import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        MainClass mainClass = new MainClass();
        int expectedResult = 14;
        int actualResult = MainClass.getLocalNumber();
        Assert.assertEquals("Expected result is not 14", expectedResult, actualResult);
    }

    @Test
    public void testGetClassNumber(){
        MainClass mainClass = new MainClass();
        int controlNumber = 45;
        int actualNumber = mainClass.getClassNumber();
        Assert.assertTrue("Class number should be greater than " + controlNumber,actualNumber>controlNumber);
    }
}
