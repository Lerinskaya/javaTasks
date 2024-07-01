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
}
