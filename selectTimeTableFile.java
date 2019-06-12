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

public class selectTimeTableFile {
  //boolean that determines if button is pressed
  static boolean init;
  public static boolean fileSelector() {
    //creates window
    Stage window = new Stage();
    //user has to take care of this window
    window.initModality(Modality.APPLICATION_MODAL);
    //sets title
    window.setTitle("File Selector");
    
    VBox box = new VBox(20);
    //button to select file
    Button initButton = new Button("Select File");
    //creates label
    Label warningLabel = new Label("Please Select Time Table File");
    
    //gets label and button and adds it to box
    box.getChildren().addAll(initButton);
    
    //button action
    initButton.setOnAction(e -> {
      init = true;
      window.close();
    });
    
    Scene scene = new Scene(box, 300, 200);
    window.setScene(scene);
    //waits for user input 
    window.showAndWait();
    
    //returns boolean
    return init;
    
  }
  
  
  
  
  
  
  
}