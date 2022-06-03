package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;

/**
 * 主程序类
 * classe de programme principal
 */
public class AppMain extends Application {
    public AppMain() {
    }

    public void start(Stage stage) throws Exception {
        Parent root = (Parent)(new FXMLLoader(AppMain.class.getResource("menu_accueil.fxml"))).load();
        stage.setTitle("Ricochet Robots!");
        stage.setScene(new Scene(root, 760.0D, 760.0D));
        stage.show();
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        launch();
    }
}



