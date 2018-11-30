package birds;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal>
{
    @Override
    public int compare(Animal a1, Animal a2) {
        if(a1.weight < a2.weight)
            return -1;
        else if(a1.weight > a2.weight)
            return +1;
        else
            return 0;

    }
}
