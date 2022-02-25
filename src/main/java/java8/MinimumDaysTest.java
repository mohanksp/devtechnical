package java8;

public class MinimumDaysTest {
    public static void main(String[] args) {
        System.out.println("MinimumDaysTest");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        System.out.println(minimumDays(x, y,z));

    }

    private static int minimumDays(int x, int y, int z) {
        if(x >= y && z >=0){
            return -1;
        }
        if(x+z <= y){
            return 1;
        }
        int days=0;
        while(x+z<y){
            x +=x;
            y +=y;
            ++days;
        }
        return days;
    }
}
