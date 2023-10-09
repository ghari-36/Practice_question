package ComparableInterfaceExemple;

import java.util.Comparator;

public class CaeComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.power- o2.power;
    }
}
