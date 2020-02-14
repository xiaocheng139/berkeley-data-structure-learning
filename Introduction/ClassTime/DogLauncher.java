package Introduction.ClassTime;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(12);
        Dog d2 = new Dog(34);
        Dog bigger = Dog.maxDog(d, d2);
        Dog bigger2 = d.maxDog(d2);
//        bigger2.makeNoise();
        System.out.println(Dog.binomen);
    }
}
