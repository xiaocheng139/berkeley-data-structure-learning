package lists.discussion;

public class Cat
{
    public String name;
    public static String noise;

    public Cat(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public void play() {
        System.out.println(noise + " I'm " + name + " the cat!");
    }

    public static void anger() {
        noise = noise.toUpperCase();
    }

    public static void calm() {
        noise = noise.toLowerCase();
    }

    public static void main(String[] args) {
        Cat a = new Cat("Cream", "Meow!");
        Cat b = new Cat("Tubbs", "Nyan!");
        a.play(); // Nyan! I'am Cream the cat!
        b.play(); // Nyan! I'am Tubbs the cat!
        Cat.anger(); // Noise = "NYAN"
        a.calm(); // Noise = "nyan"
        a.play(); // nyan! I'am Cream the cat!
        b.play(); // nyan! I'am Cream the cat!
    }
}
