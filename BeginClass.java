//imports
import java.lang.String;
import java.util.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.control.cell.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import java.nio.file.*;
import java.io.*;

//class name
public class BeginClass {
    //int value that will be returned for further action
    static int input;
    //method that is called from main class
    public static int startProgramWindow() {
        //creates a window
        Stage window = new Stage();
        //makes it so user has to take care of it (you can't click off the window screen without dealing with it)
        window.initModality(Modality.APPLICATION_MODAL);
        //sets title
        window.setTitle("Course Scheduler");
        
        //creates HBox
        HBox box = new HBox(20);
        //sets it to the center of the screen 
        box.setAlignment(Pos.CENTER);
        //creates Buttons for viewing time table and adding teachers
        Button viewButton = new Button("View Timetable");
        Button addButton = new Button("Add Teacher");
        //if view button is pressed, return 1
        viewButton.setOnAction(e -> {
            input = 1;
            //closes window
            window.close();
        });
        //if add teacher button is presseed, return 2 
        addButton.setOnAction(e -> {
            input = 2;
            //closes window
            window.close();
        });
        //if the window is x'd out, return 0
        window.setOnCloseRequest(e -> {
            e.consume();
            input = 0;
            //closes window
            window.close();
        });
        
        //adds buttons to box
        box.getChildren().addAll(viewButton, addButton);
        //creates Scene
        Scene scene = new Scene(box, 300, 100);
        //sets the scene to Scene
        window.setScene(scene);
        //displays window and waits for user input before going forth
        window.showAndWait();
        
        //returns whatever input was depending on what button the user pressed
        return input;
    }
    //END
}
