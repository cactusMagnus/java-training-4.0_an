import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                {5, 1, 5},
                {1, 1, 1}
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                {-5, -2},
                {0, 2}
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int c) {
        assertEquals(ExampleException.rectangleArea(a, b), c, "Area is not correct");
    }


    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        try {
            ExampleException.rectangleArea(a, b);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "input value is below zero!", "Incorrect exception message!");
        }
    }
}