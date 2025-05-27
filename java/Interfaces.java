public class Interfaces{
    interface A {
        public void Speek();
    }
    public static void main(String[] args) {
     
        Dog bruno = new Dog("Bruno");
        bruno.bark();
        bruno.Sound();
    }
}

class Animal{
    String Animal_name;
    public void Sound(){
        System.out.println("this was "+Animal_name+"'s Sound !");
    }
}

class Dog extends Animal implements A {
    String name;
    Dog(String name){
        Animal_name = name;
    }
    public void bark(){
        System.out.println("Woof !");
    }
}