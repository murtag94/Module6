package birds;

public class Duck extends FlyingBirds
{
    public void swim()
    {

    }

    public void catchFish()
    {

    }

    public void eat()
    {
        catchFish();
        ingest();
        digest();
    }

    @Override
    public void voice() {
        System.out.println("Krya! Krya! My weight is " + weight + " gramms");
    }
}
