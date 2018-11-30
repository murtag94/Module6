package birds;

public class Hen extends FlightlessBirds
{
    public void dabGrains()
    {

    }

    public void eat()
    {
        dabGrains();
        ingest();
        digest();
    }

    @Override
    public void voice() {
        System.out.println("Ko-ko-ko My weight is " + weight + " gramms");
    }
}
