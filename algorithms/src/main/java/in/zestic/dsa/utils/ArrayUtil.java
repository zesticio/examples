package in.zestic.dsa.utils;

public class ArrayUtil {

    /**
     * This function is going to remove all elements from an array divisible by number
     *
     * @param array
     * @param number
     * @return
     */
    public static Integer[] remove(Integer[] array, Integer number) {
        Integer[] result = new Integer[array.length];
        Integer j = 0;

        for (Integer i = 0; i < array.length; i++) {
            if (array[i] % number != 0) {                //if the element is divisible by number then add the number in result
                result[j] = array[i];
                j++;
            }
        }
        return java.util.Arrays.copyOf(result, j);
    }

    /**
     * Reverse an array of an object
     *
     * @param array
     */
    public static void reverse(Object[] array) {
        Integer left = 0, right = array.length - 1;

        while (left < right) {
            Object temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Reverse the array elements from start position to end
     *
     * @param array
     * @param start
     * @param end
     */
    public static void reverse(Object[] array, Integer start, Integer end) {
        while (start < end) {
            Object temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * find minimum value from an integer array
     *
     * @param array
     * @return
     */
    public static Integer findMinimumValue(Integer[] array) {
        Integer min = array[0];

        for (Integer i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Find second maximum valye in an given array
     *
     * @param array
     * @return
     */
    public static Integer findSecondMaximumValue(Integer[] array) {
        Integer max = Integer.MIN_VALUE;
        Integer result = Integer.MIN_VALUE;

        for (Integer i = 0; i < array.length; i++) {
            if (array[i] > max) {
                result = max;
                max = array[i];
            } else if (array[i] > result && array[i] != max) {
                result = array[i];
            }
        }
        return result;
    }

    /**
     * Function to move an element to end of it while maintaining the relative order of rest of the elements
     *
     * @param array
     */
    public static void shiftElementToEnd(Integer[] array, Integer value) {
        Integer pointer = 0;
        Integer length = array.length;
        for (Integer index = 0; index < length; index++) {
            if (array[index] != value) {
                array[pointer++] = array[index];
            }
        }
        while (pointer < length) {
            array[pointer++] = value;
        }
    }

    /**
     * Function to find the largest three distinct elements in an array
     * @param array
     */
    public static void largestThreeDistinctElements(Integer[] array) {
        //{10, 4, 3, 50, 23, 90}
        Integer first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for(Integer index = 0; index < array.length; index++) {
            if(array[index] > first) {
                second = first;
                third = second;
                first = array[index];
            }
        }
    }
}
