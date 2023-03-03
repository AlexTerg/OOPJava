package HomeWorks.TaskManager;

import java.util.Comparator;

public class ComparatorPriority implements Comparator<Tasks>{

    @Override
    public int compare(Tasks o1, Tasks o2) {
        return o1.getPriority().compareTo(o2.getPriority());
    }


    
}
