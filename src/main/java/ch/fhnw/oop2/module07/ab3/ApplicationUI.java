package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.text.NumberFormat;

public class ApplicationUI extends VBox {
    private Slider slider;
    private TextField field;

    ApplicationUI(){
        init();
        layoutCtr();
    }
    private void init(){
        field = new TextField("0");
        slider = new Slider();
        slider.setSnapToTicks(true);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        field.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());
    }
    private void layoutCtr(){
        setAlignment(Pos.CENTER);
        setPadding(new Insets(10));
        getChildren().add(field);
        getChildren().add(slider);
    }
}
