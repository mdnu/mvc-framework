/*
 * application starting point.
 */
package javahellocollections;

import JavaMVCControllers.*;

/**
 *
 * @author m
 */
public class JavaHelloCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HelloWorldController controller = new HelloWorldController();
        // Start the application
        controller.startApplication();
    }
}
