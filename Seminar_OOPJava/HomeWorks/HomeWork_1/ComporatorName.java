package HomeWorks.HomeWork_1;

import java.util.Comparator;

public class ComporatorName implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
    
}
