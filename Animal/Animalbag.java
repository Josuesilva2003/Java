package Animal;
interface Animal{

    void MakeSound();
    }

   public class Animalbag{

    public static void main(String[] args) {
        
        Animal[] bag = {new Dog(), new Cat()};
       for (Animal animal : bag) {  
        animal.MakeSound();


            }

         }
    
   }


