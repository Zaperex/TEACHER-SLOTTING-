//Imports 
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
import javafx.scene.shape.Rectangle;
import javafx.collections.*;

public class courseSchedulingGUI extends Application {
    ObservableList <CheckBox> qualificationsArr = FXCollections.observableArrayList();
    ObservableList <CheckBox> restrictionsArr = FXCollections.observableArrayList();
    Stage window;
    Button saveButton;
    Button cancelButton;
    
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        window = primaryStage;
        execute();
        
        
    }
    
    public void execute() {
        if (BeginClass.startProgramWindow() == 2) {
            createQualifications();
        }
    }
    
    public void createQualifications() {
      //clears if used multiple times in a session
      qualificationsArr.clear();
      restrictionsArr.clear();
        BorderPane bp = new BorderPane();
        VBox box1 = new VBox(10);
        VBox box2 = new VBox(10);
        
        Label restrictionsLabel = new Label("Check restrictions that apply:");
        Label titleLabel = new Label("Check qualifications that apply:");
        Label nameLabel = new Label("Enter full name of instructor:");
        TextField teacherNameInput = new TextField();
        saveButton = new Button("Finish");
        cancelButton = new Button("Cancel");
        
        teacherNameInput.setPromptText("Firstname, Lastname");
        titleLabel.setPadding(new Insets(10, 10, 10, 10));
        nameLabel.setPadding(new Insets(50, 0, 0, 0));
        
        
        CheckBox p1Box = new CheckBox("No Period 1");
        restrictionsArr.add(p1Box);
        CheckBox p2Box = new CheckBox("No Period 2");
        restrictionsArr.add(p2Box);
        CheckBox p4Box = new CheckBox("No Period 4");
        restrictionsArr.add(p4Box);
        CheckBox p5Box = new CheckBox("No Period 5");
        restrictionsArr.add(p5Box);
        
        
        box2.getChildren().addAll(restrictionsLabel, p1Box, p2Box, p4Box, p5Box, nameLabel, teacherNameInput, saveButton, cancelButton);
        box2.setMinWidth(200);
        
        box1.setPadding(new Insets(20, 20, 20, 20));
        box2.setPadding(new Insets(0, 20, 20, 20));
        
        ScrollPane scroller = new ScrollPane();
        scroller.setPrefSize(60, 120);
        
        for (int i = 0; i < 100; i++) {
            qualificationsArr.add(new CheckBox("Course Code"));
            box1.getChildren().addAll(qualificationsArr.get(i));
            
        }
        
        scroller.setContent(box1);
        bp.setCenter(scroller);
        bp.setRight(box2);
        bp.setTop(titleLabel);
        bp.setPadding(new Insets(10, 10, 10, 10));
        
         
        window.setTitle("Course Scheduler");
        saveButton.setOnAction(e -> {
          retrieveCheckBoxes();
        });
        cancelButton.setOnAction(e -> {
          cancelQual();
        });
        
        Scene qualScene = new Scene(bp, 500, 450);
        window.setScene(qualScene);
        window.show();
    }
    public void retrieveCheckBoxes() {
        for (int i = 0; i < 100; i++) {
            if (qualificationsArr.get(i).isSelected()) {
                System.out.println(qualificationsArr.get(i).getText());
            }
        }
        for (int i = 0; i < restrictionsArr.size(); i++) {
            if (restrictionsArr.get(i).isSelected()) {
                System.out.println(restrictionsArr.get(i).getText());
            }
        } 
    }
    
    public void cancelQual() {
      window.close();
      execute();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
