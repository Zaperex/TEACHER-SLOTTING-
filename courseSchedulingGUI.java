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

public class courseSchedulingGUI extends Application {
    ArrayList<CheckBox> qualificationsArr= new ArrayList<CheckBox>();
    Stage window;
    
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        window = primaryStage;
        execute(); 
        window.setTitle("Course Scheduler");
        window.show();
    }
    
    public void execute() {
        if (BeginClass.startProgramWindow() == 2) {
            createQualifications();
        }
    }
    
    public void createQualifications() {
        BorderPane bp = new BorderPane();
        VBox box1 = new VBox(10);
        VBox box2 = new VBox(10);
        
        Label restrictionsLabel = new Label("Check restrictions that apply:");
        Label titleLabel = new Label("Check qualifications that apply:");
        Label nameLabel = new Label("Enter full name of instructor:");
        TextField teacherNameInput = new TextField();
        Button saveButton = new Button("Finish");
        
        teacherNameInput.setPromptText("Firstname, Lastname");
        titleLabel.setPadding(new Insets(10, 10, 10, 10));
        nameLabel.setPadding(new Insets(50, 0, 0, 0));
        
        
        CheckBox morningBox = new CheckBox("No Mornings");
        CheckBox noonBox = new CheckBox("No Afternoons");
        CheckBox noMon = new CheckBox("No Mondays");
        CheckBox noTues = new CheckBox("No Tuesdays");
        CheckBox noWed = new CheckBox("No Wednesdays");
        CheckBox noThurs = new CheckBox("No Thursdays");
        CheckBox noFri = new CheckBox("No Fridays");
        
        box2.getChildren().addAll(restrictionsLabel, morningBox, noonBox, noMon, noTues, noWed, noThurs, noFri, nameLabel, teacherNameInput, saveButton);
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
        
        Scene qualScene = new Scene(bp, 500, 500);
        window.setScene(qualScene);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}