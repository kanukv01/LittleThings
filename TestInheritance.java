public class TestInheritance {
    public static void main(String[] args) {
      //Single Inheritance Dog extends Animal
      Dog d=new Dog();
      d.bark();
      d.sound();

 
      //Multi Level BabyDog extends Dog extends Animal
      Babdydog b=new Babdydog();
      b.bark();
      b.weep();
      b.sound();
       //Heirarchile
      //  TestInheritance t=new TestInheritance();
      Bus baby=new Bus(); //Bus extends Vehile,Car extends Vehile
    //  baby.bus();
      baby.run();
    }
}
