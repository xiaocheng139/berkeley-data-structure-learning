package introduction.ClassTime;

public class Dog {
    public int weightInPounds;
    public static String binomen = "Jack Smith";

    /* Constructor */
    public Dog(int startingWeight)
    {
        weightInPounds = startingWeight;
    }

    public void makeNoise ()
    {
        if(weightInPounds < 10)
        {
            System.out.println("Whaffff");
        }
        else
        {
            System.out.println("Bark");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2)
    {
        if (d1.weightInPounds > d2.weightInPounds)
        {
            return d1;
        }
        else
        {
            return d2;
        }
    }

    public Dog maxDog(Dog d2)
    {
        if(this.weightInPounds > d2.weightInPounds)
        {
            return this;
        }
        else
        {
            return d2;
        }
    }
}
