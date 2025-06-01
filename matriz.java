public class matriz {
    public static void main(String[] args) {
        String[] car = {"Volvo", "Mazda", "Ford", "Audi"};
        for ( int i = 0; i < car.length;  i++ ){
System.out.println(car[i]);
        }
String [] cars = {"Volvo", "Mazda", "Ford", "Audi"};
for ( String r: cars ){
System.out.println(r);
}

    
int ages[] = {20, 30, 35, 70, 85, 50, 65, 20, 40, 18};

int avg, sum = 0;

int length = ages.length;

for (int age : ages){
    sum += age;
}

avg= sum/ length;

System.out.println("The average age is: " + avg );



int [][] Mynumnber = {{1,2,3,4},{5,6,7,8}};
System.out.println(Mynumnber[0][1]);



int [][] number = {{1,2,3,4}, {5,6,7}};
for (int i = 0; i < number.length; ++i){
for  ( int j = 0; j < number[i].length; ++j){

System.out.println(number[i][j]);

}
  }
int [][] num = {{1,2,3,4}, {5,6,7}};
for ( int[] row : num){
    for (int i: row){
        System.err.println(i);
    }
}





}


    } 

