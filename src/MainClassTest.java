import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
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

    @Test
    public void testGetClassString(){
        MainClass mainClass = new MainClass();
        String substring1 = "Hello";
        String substring2 = "hello";
        String classString = mainClass.getClassString();
        boolean containsSubstring = classString.contains(substring1) || classString.contains(substring2);
        Assert.assertTrue("Class string doesn't contain " + substring1 + "or"+ substring2, containsSubstring);
    }
}
