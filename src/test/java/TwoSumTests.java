import org.testng.Assert;
import org.testng.annotations.Test;


public class TwoSumTests {

    @Test
    public void TestZeroOne() {
        Solution solution = new Solution();
        int[] testData = {2, 7, 11, 15, 7, 2};
        int target = 9;
        int[] actual = solution.twoSum(testData, target);
        int[] expected = {0, 1};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestOneTwo() {
        Solution solution = new Solution();
        int[] testData = {3, 2, 4, 0, 1};
        int target = 6;
        int[] actual = solution.twoSum(testData, target);
        int[] expected = {1, 2};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestZeroOne2() {
        Solution solution = new Solution();
        int[] testData = {3, 3};
        int target = 6;
        int[] actual = solution.twoSum(testData, target);
        int[] expected = {0, 1};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestZeroThree() {
        Solution solution = new Solution();
        int[] testData = {1, 9, 4, 7, 0, 5, 3, 5};
        int target = 8;
        int[] actual = solution.twoSum(testData, target);
        int[] expected = {0, 3};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestOneFive() {
        Solution solution = new Solution();
        int[] testData = {1, 2, 4, 7, 0, 9, 3};
        int target = 11;
        int[] actual = solution.twoSum(testData, target);
        int[] expected = {1, 5};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestThreeFour() {
        Solution solution = new Solution();
        int[] testData = {1, 2, 4, 7, 0, 9, 3};
        int target = 7;
        int[] actual = solution.twoSum(testData, target);
        int[] expected = {2, 6};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void TestSixSeven() {
        Solution solution = new Solution();
        int[] testData = {1, 2, 4, 7, 0, 9, 12, 99};
        int target = 111;
        int[] actual = solution.twoSum(testData, target);
        int[] expected = {6, 7};
        Assert.assertEquals(actual, expected);
    }
}