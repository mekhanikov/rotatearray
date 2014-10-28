package org.mekhanikov.rotatearray.impl;

import org.mekhanikov.rotatearray.RotateArray;
import org.springframework.stereotype.Component;

/**
 * Class for array rotation.
 */
@Component
public class RotateArrayImpl implements RotateArray {

    /**
     * The method rotates array left to right by N.
     * If absolute value of N is greater that array length, N = N mod arrayLength.
     * If N is negative, array is rotated right to left by absolute value of N.
     *
     * @param arrayToRotate the array to rotate.
     * @param rotateN amount to rotate array's elements.
     *
     * @return rotated array.
     */
    public int[] rotate(int[] arrayToRotate, int rotateN) {
        int[] result = null;
        if (arrayToRotate != null) {
            result = new int[arrayToRotate.length];
            if (rotateN != 0 && arrayToRotate.length > 0) {
                rotateN = rotateN % arrayToRotate.length;
            }
            if (rotateN < 0) {
                rotateN += arrayToRotate.length;
            }
            for (int i = 0; i < arrayToRotate.length; i++) {
                int newIndex = (i + rotateN) % arrayToRotate.length;
                result[newIndex] = arrayToRotate[i];
            }
        }
        return result;
    }
}
