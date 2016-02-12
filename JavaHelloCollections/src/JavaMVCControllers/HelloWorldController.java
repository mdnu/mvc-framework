/*
 * controller class
 * contains the back-end code and the logic of our application,
 * for connecting the application's views with the models.
 * whenever the view needs to do something, the controller must
 * have a function defined to be triggered, as well as for the model,
 * to load the data from the model into the view, or to load the data
 * from the view into the model; to let the model save the data in
 * the disk.
 */
package JavaMVCControllers;

import JavaMVCViews.*;
import JavaMVCModels.*;

/**
 *
 * @author m
 */
public class HelloWorldController {
    
    public void startApplication() {
        // View the application's GUI
        HelloWorldView view = new HelloWorldView();
        view.setVisible(true);
    }
    
    // called by view's loadDataMouseClicked(...) method.
    public String getMessage() {
        try {
            HelloWorldModel model = new HelloWorldModel();
            // calls model's getData() method.
            return model.getData();
        } catch (Exception er) {
            return "There was an error.";
        }
    }
    
    // called by view's writeDataMouseClicked(...) method.
    public boolean writeMessage(String message) {
        try {
            HelloWorldModel model = new HelloWorldModel();
            // calls model's writeData(...) method.
            return model.writeData(message);
        } catch (Exception er) {
            return false;
        }
    }
}
