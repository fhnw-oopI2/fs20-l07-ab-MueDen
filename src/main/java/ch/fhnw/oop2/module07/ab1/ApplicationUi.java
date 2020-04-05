package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

class ApplicationUi extends FlowPane {
    private Button button;
    private Label label;
    int n = 1;

    public ApplicationUi(){
        init();
        layoutCtr();
    }
    private void init(){
        button = new Button("Add Label");
        button.setOnAction(event -> {
            label = new Label("Label" + n);
            label.setPadding(new Insets(8));
            getChildren().add(label);
            n++;
        });
    }
    private void layoutCtr(){
        setVgap(4);
        setHgap(4);
        setPadding(new Insets(8));
        getChildren().add(button);
    }

}