package dilib;


import org.fpm.di.Environment;
import org.junit.Test;

public class LibTest {
    
    private final Environment environment = new DiEnvironment();
 
    @Test(expected = CircularInjectException.class)
    public void CircularInjectException() {

        environment.configure((binder) -> {
            binder.bind(A.class);
            //binder.bind(B.class);
            //binder.bind(C.class);
        });
    }

}
