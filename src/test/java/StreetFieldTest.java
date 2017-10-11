import org.junit.Assert;
import org.junit.Test;

public class StreetFieldTest {


    @Test
    public void initializeFieldMethodShouldInitialStepsMapGivenArray() throws Exception {
        int[] testArray = {2, 3, 3, 1};
        String[] stringTestArray = {"2", "3", "3", "1"};
        StreetField streetField = new StreetField();
        Assert.assertArrayEquals(testArray, streetField.initializeField(stringTestArray));
    }

}
