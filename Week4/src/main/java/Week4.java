public class Week4 {
    public static int max2Int (int a, int b) {
        if (a < b) return b;
        return a;
    }
    public static int minArray (int[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public static String calculateBMI (double weight, double height) {
        double BMI = Math.round((weight / (height * height)) * 10) / 10.0;
        System.out.println(BMI);
        if (BMI < 18.5) return "Thiếu cân";
        else if (BMI <= 22.9) return "Bình thường";
        else if (BMI <= 24.9) return "Thừa cân";
        else return "Béo phì";
    }
}
