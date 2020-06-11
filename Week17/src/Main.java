import java.util.Arrays;
import java.util.Random;

public class Main {

    static int[] createArray() {
        int[] numbers = new int[20];
        Random rng = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rng.nextInt(50);
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = createArray();

        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(numbers));

        selectionSort(numbers);


        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(numbers));
    }

        static void selectionSort(int numbers[]){
             int n = numbers.length;

            for (int i = 0; i < n-1; i++) {
                int minimum = i;
                for (int j = i+1; j < n; j++)
                    if (numbers[j] < numbers[minimum])
                        minimum = j;

                int temp = numbers[minimum];
                numbers[minimum] = numbers[i];
                numbers[i] = temp;
            }
        }
    }


