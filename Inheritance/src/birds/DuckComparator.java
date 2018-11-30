package birds;

import java.util.Comparator;

public class DuckComparator implements Comparator<Duck>
{

    @Override
    public int compare(Duck d1, Duck d2) {
        return (int) Math.round(d1.weight - d2.weight);
    }
}
