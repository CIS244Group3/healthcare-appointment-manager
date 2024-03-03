import java.time.LocalDate;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Appointment extends Application {
   public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    VBox vbox = new VBox(20);
    Scene scene = new Scene(vbox, 400, 400);
    stage.setScene(scene);
    DatePicker startDatePicker = new DatePicker();

    
    startDatePicker.setValue(LocalDate.now());
    Button button = new Button("Read Date");

    button.setOnAction(action -> {
      LocalDate value = startDatePicker.getValue();
      System.out.println(value.getDayOfMonth());

    });
    ComboBox doctorComboBox = new ComboBox();
      doctorComboBox.getItems().addAll(
            "Dermatologist",
            "Gynecologist",
            "General Practitioner",
            "ENT",
            "Pulmonologist"  
        );
    
        doctorComboBox.setOnAction(action -> {
          String value = doctorComboBox.getValue().toString();
          System.out.println(value);
    
        });
    Label label = new Label("Appointment Date:");
    label.setPadding(new Insets(20,20,20,20));
		label.setMaxWidth(Double.MAX_VALUE);
		label.setAlignment(Pos.CENTER);
    vbox.getChildren().add(label);
    vbox.getChildren().add(startDatePicker);
    vbox.getChildren().add(button);
    vbox.getChildren().add(doctorComboBox);

    vbox.setAlignment(Pos.BASELINE_CENTER);


    stage.show();
  }
}
