package dilib;


import org.fpm.di.Environment;



public class Main {
    public static void main(String[] args) {
        Environment environment = new DiEnvironment();


        System.out.println(environment); 
    }
}
