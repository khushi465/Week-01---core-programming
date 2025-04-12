public class P12 {

    public int[] generate4DigitRandomArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) ((Math.random() * (10000 - 1000)) + 1000);
        }
        return arr;
    }

    public double[] findAverageMinMax(int[] numbers) {
        double min = numbers[0];
        double max = numbers[0];
        double total = 0, avg;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        avg = total / numbers.length;
        double arr[] = {avg, min, max};
        return arr;
    }

    public static void main(String[] args) {
        P12 obj = new P12();
        int size = 5;
        int[] arr = obj.generate4DigitRandomArray(size);
        double avgMinMax[] = obj.findAverageMinMax(arr);
        System.out.println("Numbers are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Average: " + avgMinMax[0]);
        System.out.println("Minimum: " + avgMinMax[1]);
        System.out.println("Maximum: " + avgMinMax[2]);
    }
}
