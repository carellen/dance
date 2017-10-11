import com.saponko.model.StreetDancer;
import org.junit.Assert;
import org.junit.Test;

public class StreetDancerTest {

    @Test
    public void getStepsShouldReturnExpectNumber() {
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
        Assert.assertEquals(4, new StreetDancer().getSteps(testArray1));
        Assert.assertEquals(4, new StreetDancer().getSteps(testArray2));
        Assert.assertEquals(12, new StreetDancer().getSteps(testArray3));
        Assert.assertEquals(12, new StreetDancer().getSteps(testArray4));
        Assert.assertEquals(12, new StreetDancer().getSteps(testArray5));
        Assert.assertEquals(24, new StreetDancer().getSteps(testArray6));
        Assert.assertEquals(-1, new StreetDancer().getSteps(testArray7));
        Assert.assertEquals(12, new StreetDancer().getSteps(testArray8));
        Assert.assertEquals(24, new StreetDancer().getSteps(testArray9));
        Assert.assertEquals(0, new StreetDancer().getSteps(testArray10));
    }
}