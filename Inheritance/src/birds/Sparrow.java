package birds;

public class Sparrow extends FlyingBirds
{
    public void eat()
    {

    }

    @Override
    public void voice() {
        System.out.println("Chirik-chirik My weight is " + weight + " gramms");
    }
}
