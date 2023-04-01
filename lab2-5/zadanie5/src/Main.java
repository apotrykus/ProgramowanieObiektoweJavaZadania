// Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer.
// Dodaj metody: - sum(), zwraca sumę liczb; - average(), zwraca średnią arytmetyczną liczb; - min(),
// zwraca najmniejszą z liczb; - max(), zwraca największą z liczb; - geometric(), zwraca średnią geometryczną liczb;
// Przetestuj zaimplementowany program.
// Wykonawca: Adrianna Potrykus

class Numbers {
    private int[] nums = new int[3];

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
    public static void main(String[] args) {
        Numbers nums1 = new Numbers(5, 5, 5);
        System.out.println("Sum: " + nums1.sum());
        System.out.println("Average: " + nums1.average());
        System.out.println("Min: " + nums1.min());
        System.out.println("Max: " + nums1.max());
        System.out.println("Geometric: " + nums1.geometric());

        Numbers nums2 = new Numbers(10, 20, 30);
        System.out.println("Sum: " + nums2.sum());
        System.out.println("Average: " + nums2.average());
        System.out.println("Min: " + nums2.min());
        System.out.println("Max: " + nums2.max());
        System.out.println("Geometric: " + nums2.geometric());
    }
}