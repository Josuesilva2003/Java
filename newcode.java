public class newcode {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        

int j = 0;
do {
   System.out.println(j);
 j++;
}
while (j < 9);


int countDonw = 3; 

while (countDonw > 0) {
    System.out.println(countDonw);
countDonw--;
}
       
System.out.println("Happy new yeard");
        
int Dice = 1; 

while (Dice <= 6) {
    if (Dice < 6){
       System.out.println("No Yatzy"); 
    }else {
        System.out.println("Yes Yatzy");
    }
    Dice = Dice + 1; 
}


for (int q = 0; q < 5; q++ ){
    System.out.println(q);
}


for ( int k = 0; k <= 10; k = k +2){
    System.out.println(k);
}
 

 for (int a = 1; a <= 2; a++ ){
    System.out.println("Outer: " + a);
 }

 for ( int ñ = 1; ñ <= 2; ñ++){
    System.out.println("inter: " + ñ);
 }
 String[] cars ={"volvo", "BMW", "Mazda" };
 for (String c: cars){
    System.out.println(c);
 }

for (int z = 0; z <= 100; z += 10){
    System.out.println(z);
}

    
for (int p = 0; p <= 10; p = p +2){
System.out.println(p);
}




int numb = 2;

for (int g = 1; g <= 10; g++ ){
    System.out.println(numb + "x" + g + "=" + (numb * g));
}


for ( int r = 0; r < 10; r++){
    if (r == 4) {
        break;
    }
    System.out.println(r);
}

for ( int y = 0; y < 10; y++){
    if (y == 4) {
        continue;
    }
    System.out.println(y);
}


int o = 0;
while (o < 10){
    System.out.println(o);

    o ++;
if (o == 4 ){
    break;
}

}

   

int u = 0;
  while(u < 10){
   if (u ==4){
 u++;
    continue;
   }
   
System.out.println(u);
u++;
    }


String[] auto = {"volvo", "Bmw", "Mazda", "audi"} ;
auto[0] = "opel"; 
System.out.println(auto[0]);


//para ver cuantos elementos tiene en una matriz usar length

String[] auro = {"volvo", "bmw", "ford", "mazda"};
System.out.println(auro.length);
// va a decir cuantos elementos tengo q son 4





    }
}