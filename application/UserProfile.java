package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class UserProfile extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Profile");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label firstNameLabel = new Label("First Name:");
        TextField firstNameTextField = new TextField();
        grid.add(firstNameLabel, 0, 0);
        grid.add(firstNameTextField, 1, 0);

        Label lastNameLabel = new Label("Last Name:");
        TextField lastNameTextField = new TextField();
        grid.add(lastNameLabel, 2, 0);
        grid.add(lastNameTextField, 3, 0);

        Label emailLabel = new Label("Email Address:");
        TextField emailTextField = new TextField();
        grid.add(emailLabel, 0, 1);
        grid.add(emailTextField, 1, 1);

        Label phoneLabel = new Label("Phone Number:");
        TextField phoneTextField = new TextField();
        grid.add(phoneLabel, 2, 1);
        grid.add(phoneTextField, 3, 1);

        Label clinicAddressLabel = new Label("Primary Clinic Address:");
        TextField clinicAddressTextField = new TextField();
        grid.add(clinicAddressLabel, 0, 2);
        grid.add(clinicAddressTextField, 1, 2);

        Label doctorNameLabel = new Label("Primary Doctor Name:");
        TextField doctorNameTextField = new TextField();
        grid.add(doctorNameLabel, 2, 2);
        grid.add(doctorNameTextField, 3, 2);

        Label homeAddressLabel = new Label("Home Address:");
        TextField homeAddressTextField = new TextField();
        grid.add(homeAddressLabel, 0, 3, 4, 1);
        grid.add(homeAddressTextField, 1, 3, 3, 1);

        Label dobLabel = new Label("Date of Birth:");
        TextField dobTextField = new TextField();
        grid.add(dobLabel, 0, 4);
        grid.add(dobTextField, 1, 4);

        Label currentPasswordLabel = new Label("Current Password:");
        TextField currentPasswordTextField = new TextField();
        grid.add(currentPasswordLabel, 0, 5);
        grid.add(currentPasswordTextField, 1, 5);

        Label newPasswordLabel = new Label("New Password:");
        TextField newPasswordTextField = new TextField();
        grid.add(newPasswordLabel, 2, 5);
        grid.add(newPasswordTextField, 3, 5);

        Label confirmPasswordLabel = new Label("Confirm Password:");
        TextField confirmPasswordTextField = new TextField();
        grid.add(confirmPasswordLabel, 0, 6);
        grid.add(confirmPasswordTextField, 1, 6);

        Button btnSaveChanges = new Button("Save Changes");
        btnSaveChanges.setOnAction(e -> showAlert("Changes Saved"));
        Button btnCancel = new Button("Cancel");
        btnCancel.setOnAction(e -> showAlert("Changes Not Saved"));

        HBox hBoxButtons = new HBox(10);
        hBoxButtons.setAlignment(Pos.BOTTOM_RIGHT);
        hBoxButtons.getChildren().addAll(btnCancel, btnSaveChanges);
        grid.add(hBoxButtons, 1, 7, 3, 1);

        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(grid);
        Scene scene = new Scene(vBox, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

