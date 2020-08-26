package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int i = 0;

        while (i < result.length) {
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, i, a.length - aIndex);
                break;
            }
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            i++;
        }
        return result;
    }
}
