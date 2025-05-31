public class NUmeros {
    
 public static void main(String[] args) {
    String name = "Josue";
    System.out.println(name);
final   int Mynumber = 15;
     System.out.println(Mynumber);
 
 // pra numeros entero de 128 -128 se usa byte o int
 
 byte myNumb = 100;
 System.out.println(myNumb);

// para numeros como 32 mil o -32 mil usamos Short

short myNum = 5000;

  System.out.println(myNum);


  // para numero de -2147483648 a 2147483647 usamso int

  int mynum= 10000;

  System.out.println(mynum);

  /*  para numeros -9223372036854775808 a 9223372036854775807
  Esto se usa cuando int no es lo suficientemente grande como para almacenar el valor usamos long y poner L al final*/
 
long mynumb = 15000000L;
System.out.println(mynumb);
 

//pra los numeros decimales usamos float cuando es 5.930494 o 1.2 y al final poner una F

float numb = 5.3303030f;
System.out.println(numb);

//para los decimales dolbles usamos double cuando es 12.65 0 23.023893 y al final usamos una d

double num = 12.39484d;
System.out.println(num);


int x = 10;
int y = 9; 
System.out.println(10 > 9 );

int o = 10;
 System.out.println(o == 10);
 System.out.println(o == 15);

int MyAge = 20;
int vointAge = 18;
 if(MyAge >= vointAge) {
System.out.println("You can vote");

 } else { 
System.out.println("you can't vote");
 }
  int time = 20; 
  String result = (time < 18 ) ? "good day." : "Good evenig.";
  System.out.println(result);

int Doorcode = 1337;
if (Doorcode == 1337) {
System.out.println("The door is open");
} else { 
  System.out.println("They CodeDoor is incorrect");

}

int W = 10; 

if(W > 0 ){
System.out.println("The number is mayor que");

} else if (W < 0 ){
System.out.println("the number is menor que");

} else {
  System.out.println("number is invalide");
}

int s = 5;

if( s % 2==0 ){ 
  System.out.println(s + " is even");
}else {
  System.out.println(s + " is odd");
}

int day = 4;
 
switch (day) {
  case 1:
    System.out.println("it's monday");
    break;
  case 2: 
System.out.println("it's Thuesday");
    break;
    case 3: 
    System.out.println("Wednesday");
 case 4: 
System.out.println("it's Thuesday");
    break;
     case 5: 
System.out.println("it's Friday");
    break;
     case 6: 
System.out.println("it's Saturday");
    break;
 case 7: 
System.out.println("it's Sunday");
    break;
    default: 
    System.out.println("Use 7 numbers of the the week");


 int i = 0;
 while (i < 5 ){
 System.out.println(i);
      i++;
    }
}




}




}
