import com.saponko.model.StreetDancer;
import org.junit.Assert;
import org.junit.Test;

public class StreetDancerTest {

    @Test
    public void getStepsShouldReturnExpectNumber() {
        StreetDancer dancer = new StreetDancer();
        int [] testArray1 = {2, 0, 7}; //expected 4
        int [] testArray2 = {2, 2, 1}; //expected 4
        int [] testArray3 = {4, 2, 0, 2, 3}; //expected 12
        int [] testArray4 = {4, 2, 9, 2, 3}; //expected 12
        int [] testArray5 = {6, 2, 2, 4, 9, 1, 3}; //expected 12
        int [] testArray6 = {6, 9, 5, 9, 9, 6, 1, 7, 7, 5, 5, 9}; //expected 24
        int [] testArray7 = {2, 1, 1}; //expected -1
        int [] testArray8 = {2, 3, 4, 5, 6, 7, 8, 9}; //expected 12
        int [] testArray9 = {2, 4, 6, 8, 8, 6, 4, 2, 1, 2, 5, 2, 1}; //expected 24
        int [] testArray10 = {7, 0, 2}; //expected 0
        dancer.setStepsMap(testArray1);
        Assert.assertEquals(4, dancer.getSteps());
        dancer.setStepsMap(testArray2);
        Assert.assertEquals(4, dancer.getSteps());
        dancer.setStepsMap(testArray3);
        Assert.assertEquals(12, dancer.getSteps());
        dancer.setStepsMap(testArray4);
        Assert.assertEquals(12, dancer.getSteps());
        dancer.setStepsMap(testArray5);
        Assert.assertEquals(12, dancer.getSteps());
        dancer.setStepsMap(testArray6);
        Assert.assertEquals(24, dancer.getSteps());
        dancer.setStepsMap(testArray7);
        Assert.assertEquals(-1, dancer.getSteps());
        dancer.setStepsMap(testArray8);
        Assert.assertEquals(12, dancer.getSteps());
        dancer.setStepsMap(testArray9);
        Assert.assertEquals(24, dancer.getSteps());
        dancer.setStepsMap(testArray10);
        Assert.assertEquals(0, dancer.getSteps());
    }

    @Test
    public void initializeFieldMethodShouldInitialStepsMapGivenArray() throws Exception {
        int[] testArray = {2, 3, 3, 1};
        String[] stringTestArray = {"2", "3", "3", "1"};
        StreetDancer dancer = new StreetDancer();
        dancer.initializeField(stringTestArray);
        Assert.assertArrayEquals(testArray, dancer.getStepsMap());
    }
    @Test
    public void initializeFieldMethodShouldReturnFalseIfInputIsWrong() throws Exception {
        String[] stringTestArray = {"wrong", "3", "3", "1"};
        StreetDancer dancer = new StreetDancer();
        Assert.assertFalse(dancer.initializeField(stringTestArray));
    }
}