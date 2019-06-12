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
//seperate class for popup window
public class selectTimeTableFile {
    //boolean that determines if button is pressed
    static boolean init;
    public static  boolean fileSelector() {
        //creates window
        Stage window = new Stage();
        //user has to take care of this window
        window.initModality(Modality.APPLICATION_MODAL);
        //sets title
        window.setTitle("File Selector");
        
        //creates VBox layout
        VBox box = new VBox(20);
        //sets it to the center
        box.setAlignment(Pos.CENTER);
        //button to select file
        Button initButton = new Button("Select File");
        //creates label
        Label warningLabel = new Label("Please select the time table file");
        
        //gets label and button and adds it to box
        box.getChildren().addAll(warningLabel, initButton);
        
        //button action
        initButton.setOnAction(e -> {
            //sets init as true
            init = true;
            //closes window
            window.close();
        });
        
        //creates Scene with main layout box and dimensions 300 x 100
        Scene scene = new Scene(box, 300, 100);
        window.setScene(scene);
        //waits for user input and displays window
        window.showAndWait();
        
        //returns boolean once button is pressed and file has been selected
        return init;
        
    }
    
    
    
    
    
    
    //END
}
