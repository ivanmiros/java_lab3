package dilib;


import org.fpm.di.Environment;
import org.junit.Test;

public class LibTest {
    
    private final Environment environment = new DiEnvironment();
 
    // Step 2
    @Test(expected = CircularInjectException.class)
    public void CircularInjectException() {

        environment.configure((binder) -> {
            binder.bind(A.class);
            //binder.bind(B.class);
            //binder.bind(C.class);
        });
    }

    // Step 3    
    @Test(expected = BindException.class)
    public void RebindWithClassException() {
        environment.configure((binder) -> {
            binder.bind(Shape.class, FigureCircle.class);
            binder.bind(Shape.class, FigureSquare.class);
        });
    }    

    @Test(expected = BindException.class)
    public void RebindWithInstanceException() {
        environment.configure((binder) -> {
            binder.bind(Shape.class, FigureCircle.class);
            binder.bind(Shape.class, new FigureSquare());
        });
    }   

}
