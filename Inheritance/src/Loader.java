import birds.*;

import java.util.ArrayList;
import java.util.Collections;

public class Loader
{
    public static void main(String[] args)
    {
        ArrayList<Vertebrata> animals = new ArrayList<>();
        addAnimals(animals);

        Collections.sort(animals, new AnimalComparator());
        for(Vertebrata animal : animals)
        {
            animal.voice();
        }

    }

    public static void addAnimals(ArrayList<Vertebrata> animals)
    {
        animals.add(new Duck());
        animals.add(new Duck());
        animals.add(new Frog());
        animals.add(new Ostrich());
        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Ostrich());
        animals.add(new Sparrow());
        animals.add(new Frog());
        animals.add(new Sparrow());
        animals.add(new Hen());
        animals.add(new Sparrow());
        animals.add(new Frog());
        animals.add(new Ostrich());
    }
}
