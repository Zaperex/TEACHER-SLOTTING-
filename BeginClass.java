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

public class BeginClass {
    static int input;
    public static int startProgramWindow() {
        
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Course Scheduler");
        
        HBox box = new HBox(20);
        box.setAlignment(Pos.CENTER);
        
        Button viewButton = new Button("View Timetable");
        Button addButton = new Button("Add Teacher");
        viewButton.setOnAction(e -> {
            input = 1;
            window.close();
        });
        addButton.setOnAction(e -> {
            input = 2;
            window.close();
        });
        window.setOnCloseRequest(e -> {
            e.consume();
            input = 0;
            window.close();
        });
        
        box.getChildren().addAll(viewButton, addButton);
        Scene scene = new Scene(box, 300, 100);
        window.setScene(scene);
        window.showAndWait();
        
        return input;
    }
}