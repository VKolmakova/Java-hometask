package kolmakova;

import java.util.*;

import static java.lang.Math.random;


public class Main {

    public static void main(String[] args) {
        findSumOfArrayElementsThatMultiplesOfNumber();
        countNumberOfSubstitutionsOfMembersOfSequenceOfNumbers();
        countNegativePositiveZeroArrayElements();
        swapLargestAndSmallestElements();
        printNumbersThatGreaterThanTheirIndex();
        calculateSumOfNumbersWhoseSerialNumbersPrimeNumbers();
        formNewSequenceOfNumbersRemovedFromOriginalTermsThatEqualToMinElement();
        findMostFrequentlyOccurringNumbersDetermineSmallestOfThem();
        fillInEverySecondArrayElementZero();
        printOddColumnsOfMatrixWhoseFirstElementGreaterThanLast();
        displayElementsOfMatrixThatOnDiagonal();
        outputGivenRowAndColumnOfMatrix();
        formSquareMatrixAccordingToGivenPattern1();
        formSquareMatrixAccordingToGivenPattern2();
        formSquareMatrixAccordingToGivenPattern3();
        formMatrixByRuleCountNumberOfPositiveElements();
        swapTwoColumnsInMatrix();
        defineColumnContainingMaxSumOfElements();
        findPositiveElementsOfMainDiagonalOfSquareMatrix();
        fillMatrixWithRandomNumbersFrom0To15PrintRowNumbersInWhereNumber5Occurs3OrMoreTimes();
        sortMatrixRowsInAscendingAndDescendingOrderOfElementValues();
        sortMatrixColumnsInAscendingAndDescendingOrderOfElementValues();
        formRandomMatrixConsistingOfZerosAndOnesInEachColumnNumberUnitsIsEqualToColumnNumber();
    }

    /**
     * Method  finds the sum of those elements that are multiples of a given number
     */
    static void findSumOfArrayElementsThatMultiplesOfNumber() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = num.nextInt();
        int[] arr = new int[]{1, 2, 4, 5, 20, 22, 40};
        int a;
        int sum = 0;
        for (int i : arr) {
            a = i % number;
            if (a == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of elements of multiples of " + number + ": " + sum);
    }

    /**
     * Method replaces all members of the sequence greater than the specified
     * number by this number and counts the number of replacements
     */
    static void countNumberOfSubstitutionsOfMembersOfSequenceOfNumbers() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number:");
        double number = num.nextDouble();
        double[] arr = new double[]{1.5, 2.9, 4.8, 5.7, 20.2, 22.1, 40.6};
        int numberOfSubstitutions = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number) {
                arr[i] = number;
                numberOfSubstitutions++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of substitutions: " + numberOfSubstitutions);
    }

    /**
     * Method counts the number of negative, positive, zero elements of the array
     */
    static void countNegativePositiveZeroArrayElements() {
        float[] arr = new float[]{0.0f, -2.9f, 4.8f, 5.7f, -20.2f, 22.1f, 40.6f};
        int quantityZero = 0;
        int quantityPositive = 0;
        int quantityNegative = 0;
        float a;
        for (float i : arr) {
            a = Math.signum(i);
            if (a == 0.0f) {
                quantityZero++;
            }
            if (a == -1.0f) {
                quantityNegative++;
            }
            if (a == 1.0f) {
                quantityPositive++;
            }
        }
        String str = String.format("quantity zero: %d,  quantity negative: %d, quantity positive: %d", quantityZero,
                quantityNegative, quantityPositive);
        System.out.println(str);
    }

    static void swapLargestAndSmallestElements() {
        double[] arr = {1.5, 1.3, 4.8, 5.7, 20.2, 22.1, 40.6};
        double max = 0;
        int maxIndex = 0;
        int minIndex = 0;
        double min = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        arr[minIndex] = max;
        arr[maxIndex] = min;
        System.out.println("min: " + min + ", max: " + max);
        System.out.println(Arrays.toString(arr));
    }

    static void printNumbersThatGreaterThanTheirIndex() {
        int[] arr = new int[]{0, 2, 1, 7, 3, 22, 40};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.println(arr[i]);
            }
        }
    }

    // todo:wtf

    /**
     * Method to calculate the sum of numbers whose ordinal numbers are prime numbers
     */

    static void calculateSumOfNumbersWhoseSerialNumbersPrimeNumbers() {
        double[] arr = new double[]{10.0, 1.3, 4.8, 5.7, 20.2, 22.1, 40.6};
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        System.out.println("Sum: " + sum);

    }

    static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method finds the most frequently occurring number. If such there are several numbers,
     * then determines the smallest of them
     */
    static void formNewSequenceOfNumbersRemovedFromOriginalTermsThatEqualToMinElement() {
        int[] arr = {1, 2, 1, 7, 3, 22, 40};
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    // todo:!!!

    /**
     * Method to find the most frequently occurring numbers to determine the smallest of them
     */
    static void findMostFrequentlyOccurringNumbersDetermineSmallestOfThem() {
        int[] arr = {1, 1, 3, 5, 3, 40, 3};
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j] && i != j) {
                        list.add(arr[i]);
//                    set.add(arr[i]);
                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(i) < list.get(j) && i != j) {
                    set2.add(list.get(i));

                }
        }
        System.out.println(list);
        System.out.println("Most frequently occurring number values: " + set);
        System.out.println("The smallest of the values" + set2);
    }


    static void fillInEverySecondArrayElementZero() {
        int[] arr = {1, 2, 1, 7, 3, 3, 40};
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Method displays odd columns of a matrix whose first element is greater than the last
     */
    static void printOddColumnsOfMatrixWhoseFirstElementGreaterThanLast() {
        int[][] matrix = {{9, 1, 2, 1}, {3, 4, 5, 4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Required matrix columns:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j += 2) {
                if (matrix[0][j] > matrix[2 - 1][j]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    static void displayElementsOfMatrixThatOnDiagonal() {
        int[][] matrix = {{9, 1, 2, 1}, {3, 4, 5, 4}, {5, 6, 7, 4}, {8, 3, 5, 1}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i] == matrix[j]) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    static void outputGivenRowAndColumnOfMatrix() {
        int[][] matrix = {{9, 1, 2, 1}, {3, 4, 5, 4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        Scanner num = new Scanner(System.in);
        System.out.println("Enter line number:");
        int lineNum = num.nextInt();
        System.out.println(Arrays.toString(matrix[lineNum]));
        System.out.println("Enter column number: ");
        int columnNum = num.nextInt();
        for (int i = 0; i < 2; i++) {
            System.out.println(matrix[i][columnNum]);
        }
    }

    /**
     * Method generates a square matrix according to a given template 1
     */
    static void formSquareMatrixAccordingToGivenPattern1() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter an even number: ");
        int number = num.nextInt();
        int[][] matrix = new int[number][number];

        for (int i = 0; i < number; i++) {
            int count;
            if (i % 2 == 0) {
                count = 1;
                for (int j = 0; j < number; j++) {
                    matrix[i][j] = count;
                    count++;
                }
            } else {
                count = number;
                for (int j = 0; j < number; j++) {
                    matrix[i][j] = count;
                    count--;
                }
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Method generates a square matrix according to a given template 2
     */
    static void formSquareMatrixAccordingToGivenPattern2() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter an even number: ");
        int number = num.nextInt();
        int[][] matrix = new int[number][number];
        int count = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j == number - count) {
                    for (; j < number; j++) {
                        matrix[i][j] = 0;
                    }
                } else
                    matrix[i][j] = i + 1;
            }
            count++;
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //todo: wtf

    /**
     * Method generates a square matrix according to a given template 3
     */
    static void formSquareMatrixAccordingToGivenPattern3() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter an even number: ");
        int number = num.nextInt();
        int[][] matrix = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
//                if (i == 0 || i == number - 1 || j != 0 && j != number - 1) {
//                    matrix[i][j] = 1;
//                }
                if (i == 0 || i == number - 1 || i == j || i + j == number - 1 || j + j + 1 == number - 1) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     *Method generates a square matrix of order N according to the rule A[I,J]=sin((I*2-J*2)/N))
     * and counts the number of positive elements in it
     */

    static void formMatrixByRuleCountNumberOfPositiveElements() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number: ");
        double number = num.nextInt();
        double[][] matrix = new double[(int) number][(int) number];
        int numberPositiveElements = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / number);
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] >= 0) {
                    numberPositiveElements++;
                }
            }
            System.out.println();
        }
        System.out.println("The number of positive elements in the matrix: " + numberPositiveElements);
    }

    static void swapTwoColumnsInMatrix() {
        int[][] matrix = {{9, 1, 2, 1}, {3, 4, 5, 7}, {8, 4, 7, 6}, {9, 1, 3, 8}};
        printMatrix(matrix);
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number of the first column: ");
        int firstColumn = num.nextInt();
        System.out.println("Enter the number of the second column: ");
        int secondColumn = num.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            int x = matrix[i][firstColumn];
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = x;
        }
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }

    /**
     * Method to determine the column containing the maximum sum of elements
     */
    static void defineColumnContainingMaxSumOfElements() {
        int[][] matrix = {{9, 1, 2, 1}, {3, 4, 5, 7}, {8, 4, 7, 6}, {9, 1, 3, 8}};
        int sumColumn1 = 0;
        int sumColumn2 = 0;
        int sumColumn3 = 0;
        int sumColumn4 = 0;
        for (int[] i : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == 0) {
                    sumColumn1 += i[j];
                }
                if (j == 1) {
                    sumColumn2 += i[j];
                }
                if (j == 2) {
                    sumColumn3 += i[j];
                }
                if (j == 3) {
                    sumColumn4 += i[j];
                }

            }
        }
        int maxSum = Math.max(Math.max(sumColumn1, sumColumn2), Math.max(sumColumn3, sumColumn4));
        System.out.println("Sum of elements of the first column = " + sumColumn1 + "\n" +
                "Sum of elements of the second column = "
                + sumColumn2 + "\n" + "Sum of elements of the third column = " + sumColumn3 + "\n" +
                "Sum of elements of the fourth column = " + sumColumn4);
        System.out.println("Max sum = " + maxSum);
    }

    static void findPositiveElementsOfMainDiagonalOfSquareMatrix() {
        int[][] matrix = {{9, 1, 2, 1}, {3, -4, 5, 7}, {8, 4, 7, 6}, {9, 1, 3, -8}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j && matrix[i][j] > 0) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    //todo:wtf
    static void fillMatrixWithRandomNumbersFrom0To15PrintRowNumbersInWhereNumber5Occurs3OrMoreTimes() {
        int[][] matrix = new int[10][20];
        ArrayList<Integer> list = new ArrayList<>();
        int quantity5 = 0;
        int c = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = ((int) (Math.random() * 16));
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] == 5) {
                    quantity5 += 1;

                    if (quantity5 >= 3) {
                        list.add(i);
                    }
                }
            }
            System.out.println();
        }
        System.out.println(list);
    }

    static void sortMatrixRowsInAscendingAndDescendingOrderOfElementValues() {
        int[][] matrix = {{9, 1, 2, 1}, {3, 4, 5, 7}, {8, 4, 7, 6}, {9, 1, 3, 8}};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int j = 0; j < matrix.length; j++) {
            list1.add(matrix[0][j]);
            list2.add(matrix[1][j]);
            list3.add(matrix[2][j]);
            list4.add(matrix[3][j]);
        }
        System.out.println(list1 + "\n" + list2);
        System.out.println(list3 + "\n" + list4);
        System.out.println("Rows in descending order:");
        Collections.sort(list1);
        for (int counter : list1) {
            System.out.print(counter + " ");
        }
        System.out.println();
        Collections.sort(list2);
        for (int counter : list2) {
            System.out.print(counter + " ");
        }
        System.out.println();
        Collections.sort(list3);
        for (int counter : list3) {
            System.out.print(counter + " ");
        }
        System.out.println();
        Collections.sort(list4);
        for (int counter : list4) {
            System.out.print(counter + " ");
        }
        System.out.println();
        System.out.println("Rows in ascending order: ");
        list1.sort(Collections.reverseOrder());

        for (Integer str : list1) {
            System.out.print(str + " ");
        }
        System.out.println();
        list2.sort(Collections.reverseOrder());

        for (Integer str : list2) {
            System.out.print(str + " ");
        }
        System.out.println();
        list3.sort(Collections.reverseOrder());

        for (Integer str : list3) {
            System.out.print(str + " ");
        }
        System.out.println();
        list4.sort(Collections.reverseOrder());

        for (Integer str : list4) {
            System.out.print(str + " ");
        }
    }

    //todo:wtf
    static void sortMatrixColumnsInAscendingAndDescendingOrderOfElementValues() {
        int[][] matrix = {{9, 1, 2, 1}, {3, 4, 5, 7}, {8, 4, 7, 6}, {9, 1, 3, 8}};
        for (int[] i : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int[] i : matrix) {
            list1.add(i[0]);
            list2.add(i[1]);
            list3.add(i[2]);
            list4.add(i[3]);
        }
        System.out.println("Rows in descending order:");
        Collections.sort(list1);
        for (int counter : list1) {
            System.out.print(counter + " ");
        }
        System.out.println();
        Collections.sort(list2);
        for (int counter : list2) {
            System.out.print(counter + " ");
        }
        System.out.println();
        Collections.sort(list3);
        for (int counter : list3) {
            System.out.print(counter + " ");
        }
        System.out.println();
        Collections.sort(list4);
        for (int counter : list4) {
            System.out.print(counter + " ");
        }
        System.out.println();
        System.out.println("Rows in ascending order: ");
        list1.sort(Collections.reverseOrder());

        for (Integer str : list1) {
            System.out.print(str + " ");
        }
        System.out.println();
        list2.sort(Collections.reverseOrder());

        for (Integer str : list2) {
            System.out.print(str + " ");
        }
        System.out.println();
        list3.sort(Collections.reverseOrder());

        for (Integer str : list3) {
            System.out.print(str + " ");
        }
        System.out.println();
        list4.sort(Collections.reverseOrder());

        for (Integer str : list4) {
            System.out.print(str + " ");
        }
    }

    static void formRandomMatrixConsistingOfZerosAndOnesInEachColumnNumberUnitsIsEqualToColumnNumber() {
        Random rnd = new Random();
        int m = (int) (Math.random() * 11);
        int n = (int) (Math.random() * 11);
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
                if (i < matrix[i].length && i <= j) {
                    for (int h = i; h >= 0; h--) {
                        matrix[h][j] = 1;
                    }
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}











