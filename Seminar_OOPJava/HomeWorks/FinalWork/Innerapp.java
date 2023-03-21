package HomeWorks.FinalWork;

import java.util.Objects;

public class Innerapp {
    IInterface v;

    public Innerapp(IInterface v) {
        this.v = Objects.requireNonNullElseGet(v, NullIntercept::new);
    }

    void write() {
        v.print();
    }
}

