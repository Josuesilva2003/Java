import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main { 

public static void main(String[] args){
    
    System.out.println("Hola mundo");

   String myString = "Esto es una cadena de texto";

   myString = "He cambiado mi cadena de texto";

   System.out.println(myString);

   Integer myInt = 7;
        myInt = myInt + 4;
System.out.println(myInt);

System.out.println(myInt -1);

Double myDouble = 6.5;
System.out.println(myDouble);

Float myFloat = 6.5f;
System.out.println(myFloat);

System.out.println(myDouble + myFloat );

Boolean myBoolean = true; 
myBoolean = false;

System.out.println(myBoolean);

myBoolean = null; 
System.out.println(myBoolean);

myFloat = null;
if (myFloat != null){
System.out.println(myFloat + 10);
System.out.println("my float es distinto de nulo");

}else {
    System.out.println("my float es null");

 }


 if (myInt == 11 ) {
System.out.println("myInt == 11" );
 }else if (myInt == 12 ) {
    System.out.println("myInt == 12" );
    
 }else {
    System.out.println("myInt no es 11 ni 12 ");
 }
  List<String> myList= new ArrayList<>(); 
   myList.add(myString);
   myList.add(myInt.toString());
   System.out.println(myList);

    Map<String,String > myMap = new HashMap<>();
      myMap.put("String", myString);
     myMap.put("int", myInt.toString());
     System.out.println(myMap);
     System.out.println(myMap.get("int"));

     for (int index = 0; index <myList.size(); index++) {
        myList.get(index);
         System.out.println(myList.get(index));

     }

      Main myMain = new Main();
    myMain.myFunction(5, 6);
    myMain.myFunction(3, 12390);

   }

    
    
  public void  myFunction(int myFirstNumber, int mySecondNumber) {
        System.out.println(myFirstNumber + mySecondNumber);

  }


}
