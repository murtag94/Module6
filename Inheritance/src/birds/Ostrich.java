package birds;

public class Ostrich extends FlightlessBirds
{
    public void eat()
    {

    }

    @Override
    public void voice() {
        System.out.println("Boom-boom-boooom My weight is " + weight + " gramms");
    }
}
