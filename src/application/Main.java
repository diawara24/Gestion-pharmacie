package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import utulitaire.LoadView;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			LoadView.showView("Authentification", "Menu.fxml", 1);
			primaryStage.setResizable(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
