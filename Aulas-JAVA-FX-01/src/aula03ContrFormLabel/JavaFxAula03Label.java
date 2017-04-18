/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03ContrFormLabel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author josemalcher
 */
public class JavaFxAula03Label extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) {

        //Image img = new Image(JavaFxAula03Label.class.getResourceAsStream("imagens/sorriso.jpg"));
        
        //final Label lb = new Label("Label com imagem de fechar!", new ImageView(img));
        final Label lb = new Label("Label com imagem de fechar!");
        lb.setRotate(30);
        
        lb.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                lb.setScaleX(1.5);
                lb.setScaleY(1.5);
            }
        });
        lb.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                lb.setScaleX(1);
                lb.setScaleY(1);
            }
        });
        
        
        
        StackPane root = new StackPane();
        root.getChildren().add(lb);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
