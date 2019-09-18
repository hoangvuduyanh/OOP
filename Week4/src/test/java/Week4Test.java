import org.junit.Test;
public class Week4Test {
    @Test
    public void testMax2Int1(){
        int a = 4, b = 5;
        assert (Week4.max2Int(a, b) == 5);
    }
    @Test
    public void testMax2Int2(){
        int a = -4, b = 4;
        assert (Week4.max2Int(a, b) == 4);
    }
    @Test
    public void testMax2Int3(){
        int a = 5, b = 4;
        assert (Week4.max2Int(a, b) == 5);

    }


    @Test
    public void testMax2Int4(){
        int a = -10, b = -4;
        assert (Week4.max2Int(a, b) == -4);

    }

    @Test
    public void testMax2Int5(){
        int a = -100, b = 90;
        assert (Week4.max2Int(a, b) == 90);

    }

    @Test
    public void testMinArray1(){
        int[] a = {1, 2, 3, 4, 5};
        assert(Week4.minArray(a) == 1);
    }

    @Test
    public void testMinArray2(){
        int[] a = {-50, 2, 3, 4, 5};
        assert(Week4.minArray(a) == -50);

    }

    @Test
    public void testMinArray3(){
        int[] a = {100, 2, 3, 4, 5};
        assert(Week4.minArray(a) == 2);

    }

    @Test
    public void testMinArray4(){
        int[] a = {-10, 2, 3, 4, 5};
        assert(Week4.minArray(a) == -10);

    }

    @Test
    public void testMinArray5(){
        int[] a = {1, 2, 3, 4, 5};
        assert(Week4.minArray(a) == 1);

    }

    @Test
    public void testCalculateBMI1(){
        double weight = 50, height = 1.5;
        assert (Week4.calculateBMI(weight, height) == "Bình thường");
    }

    @Test
    public void testCalculateBMI2(){
        double weight = 60, height = 1.6;
        assert (Week4.calculateBMI(weight, height) == "Thừa cân");

    }

    @Test
    public void testCalculateBMI3(){
        double weight = 70, height = 1.7;
        assert (Week4.calculateBMI(weight, height) == "Thừa cân");

    }

    @Test
    public void testCalculateBMI4(){
        double weight = 72.1633, height = 1.7;
        assert (Week4.calculateBMI(weight, height) == "Béo phì");

    }

    @Test
    public void testCalculateBMI5(){
        double weight = 17, height = 1.3;
        assert (Week4.calculateBMI(weight, height) == "Thiếu cân");

    }
}
