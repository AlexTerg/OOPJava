package HomeWorks.Calculate;

import HomeWorks.Calculate.ILogger.ILogger;
import HomeWorks.Calculate.ILogger.NewLogger;

public abstract class Action implements Result{
    ILogger logger = new NewLogger();
}
