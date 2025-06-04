public class met {
     static int PlusMethod(int x, int y){
return x + y;
     }
     static Double PlusMethod(Double x, Double y){
        return x + y;
     }

     public static void main(String[] args) {
        int Mynumb1 = PlusMethod(6, 8);
        Double Mynumb2 = PlusMethod(6.5 , 7.5);
        System.out.println("Int: " + Mynumb1);
        System.out.println("Double: " + Mynumb2);
     }
}
