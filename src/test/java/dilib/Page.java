package dilib;

import javax.inject.Inject;

public class Page {
    private SingleCircle scircle;

    @Inject
    public Page (SingleCircle sc) {
        this.scircle = sc;
    }

    public SingleCircle getSingleCircle() {
        return scircle;
    }
}
