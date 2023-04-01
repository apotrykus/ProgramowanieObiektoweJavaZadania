// Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer.
// Dodaj metody: - sum(), zwraca sumę liczb; - average(), zwraca średnią arytmetyczną liczb; - min(),
// zwraca najmniejszą z liczb; - max(), zwraca największą z liczb; - geometric(), zwraca średnią geometryczną liczb;
// Przetestuj zaimplementowany program.
// Wykonawca: Adrianna Potrykus

class Numbers {
    private final int[] nums = new int[3];

    Numbers(int num1, int num2, int num3) {
        this.nums[0] = num1;
        this.nums[1] = num2;
        this.nums[2] = num3;
    }

    public int sum() {
        return nums[0] + nums[1] + nums[2];
    }

    public float average() {
        return (float)(nums[0] + nums[1] + nums[2]) / nums.length;
    }

    public int min() {
        return Math.min(Math.min(nums[0], nums[1]), nums[2]);
    }

    public int max() {
        return Math.max(Math.max(nums[0], nums[1]), nums[2]);
    }

    public float geometric() {
        return Math.round(Math.pow((float)(nums[0] * nums[1] * nums[2]), 1.0 / 3.0));
    }
}

public class Main {
    public static void printNumbers(Numbers nums) {
        System.out.println("Sum: " + nums.sum());
        System.out.println("Average: " + nums.average());
        System.out.println("Min: " + nums.min());
        System.out.println("Max: " + nums.max());
        System.out.println("Geometric: " + nums.geometric());
    }
    public static void main(String[] args) {
        Numbers nums1 = new Numbers(5, 5, 5);
        printNumbers(nums1);

        Numbers nums2 = new Numbers(10, 20, 30);
        printNumbers(nums2);
    }
}