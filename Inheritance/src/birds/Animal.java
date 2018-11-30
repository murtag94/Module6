package birds;

abstract public class Animal
{
    public double weight;

    public Animal()
    {
        weight = 10 + 100 * Math.random();
    }

    abstract public void eat();

    abstract public void move();
}
