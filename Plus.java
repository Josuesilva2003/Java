public class Plus {
     static int PlusMethodint(int x, int y ){
        return x + y;
     }
     static Double PlusMethodDouble(Double x, Double y){
        return x + y; 
     }
     public static void main(String[] args) {
     int Mynumb1 = PlusMethodint(8, 9);
     Double Mynumb2 = PlusMethodDouble(4.5, 7.6);
   System.err.println("int: " + Mynumb1);
   System.out.println("Double : " + Mynumb2);
}
}