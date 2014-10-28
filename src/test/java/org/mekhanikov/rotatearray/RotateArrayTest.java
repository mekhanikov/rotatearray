package org.mekhanikov.rotatearray;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class RotateArrayTest {
    @Autowired
    RotateArray rotateArray;

    @Test
    public void testRotate_ArrayIsNull() throws Exception {
        int[] result = rotateArray.rotate(null, 2);
        assertTrue(Arrays.equals(result, null));
    }

    @Test
    public void testRotate_ArrayIsEmpty() throws Exception {
        int[] arrayToRotate = {};
        int[] expectedResult = {};
        int[] result = rotateArray.rotate(arrayToRotate, 2);
        assertTrue(Arrays.equals(result, expectedResult));
    }

    @Test
    public void testRotate_N2() throws Exception {
        int[] arrayToRotate = {1, 2, 3, 4, 5, 6};
        int[] expectedResult = {5, 6, 1, 2, 3, 4};
        int[] result = rotateArray.rotate(arrayToRotate, 2);
        assertTrue(Arrays.equals(result, expectedResult));
    }

    @Test
    public void testRotate_NIsPositiveAndGreaterThanArrayLength() throws Exception {
        int[] arrayToRotate = {1, 2, 3, 4, 5, 6};
        int[] expectedResult = {5, 6, 1, 2, 3, 4};
        int[] result = rotateArray.rotate(arrayToRotate, 8);
        assertTrue(Arrays.equals(result, expectedResult));
    }

    @Test
    public void testRotate_NEqualsZero() throws Exception {
        int[] arrayToRotate = {1, 2, 3, 4, 5, 6};
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        int[] result = rotateArray.rotate(arrayToRotate, 0);
        assertTrue(Arrays.equals(result, expectedResult));
    }

    @Test
    public void testRotate_NIsNegative() throws Exception {
        int[] arrayToRotate = {1, 2, 3, 4, 5, 6};
        int[] expectedResult = {3, 4, 5, 6, 1, 2};
        int[] result = rotateArray.rotate(arrayToRotate, -2);
        assertTrue(Arrays.equals(result, expectedResult));
    }

    @Test
    public void testRotate_NIsNegativeAndGreaterThanArrayLength() throws Exception {
        int[] arrayToRotate = {1, 2, 3, 4, 5, 6};
        int[] expectedResult = {3, 4, 5, 6, 1, 2};
        int[] result = rotateArray.rotate(arrayToRotate, -8);
        assertTrue(Arrays.equals(result, expectedResult));
    }
}
