package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
    private Slider slider;
    private Label label;

    ApplicationUI(){
        init();
        layoutCtr();
    }
    private void init(){
        label = new Label("0");
        slider = new Slider();
        slider.setSnapToTicks(true);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            label.setText(String.valueOf(newValue));
        });
    }
    private void layoutCtr(){
        setAlignment(Pos.CENTER);
        setPadding(new Insets(10));
        getChildren().add(label);
        getChildren().add(slider);
    }
}
