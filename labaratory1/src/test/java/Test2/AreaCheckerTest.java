package Test2;

import task2.AreaChecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvSource;

public class AreaCheckerTest {
    @ParameterizedTest
            (name = "Test {index}: x = {0} and y = {1}")
    @CsvSource({
            "4, 4, true",
            "-1, 3, true",
            "0, 0, true",
            "-6, -3, true",
            "7, 7, false"
    })
    public void isPointInArea(int x, int y, boolean result){
        boolean res = AreaChecker.isPointInArea(x,y);
        Assertions.assertEquals(result,res);
    }
}
