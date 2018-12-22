package unitTestingPractice;

import org.testng.Assert;

public class TestSimpleMath {
    public static void main(String[] args) {


        SimpleMath cal = new SimpleMath();
        int resultOfAddition = cal.addition(10, 20);

        Assert.assertEquals(resultOfAddition, 30);
    }
}
