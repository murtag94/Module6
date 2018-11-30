package birds;

public class Frog extends Vertebrata
{

    @Override
    public void eat() {
        //catch insects
    }

    @Override
    public void move() {
        //jump
    }

    @Override
    public void voice() {
        System.out.println("Kva-kva My weight is " + weight + " gramms");
    }
}
