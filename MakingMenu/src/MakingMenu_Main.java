import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MakingMenu_Main extends Application{

	Stage window;
	
	BorderPane layout;
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Menu");
		
		
		//File Menu
		Menu fileMenu = new Menu("File");
		
		//Menu items
		MenuItem newFile = new MenuItem("New...");
		newFile.setOnAction( e-> {
			System.out.println("Create a new file...");
		} );
		fileMenu.getItems().add(newFile);
		fileMenu.getItems().add(new MenuItem("New Drawing..."));
		fileMenu.getItems().add(new MenuItem("New Module..."));
		fileMenu.getItems().add(new MenuItem("New Pen..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Settings..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Exit..."));
		
		
		//Edit Menu
		Menu editMenu = new Menu("_Edit");//'_' helps us to create a shortcut (keyboard shortcut) for the specific menu item
		editMenu.getItems().add(new MenuItem("Cut"));
		editMenu.getItems().add(new MenuItem("Copy"));
		MenuItem pasteFile = new MenuItem("Paste");
		pasteFile.setOnAction( e-> {
			System.out.println("Pasting cart curt");
		} );
		pasteFile.setDisable(true);
		editMenu.getItems().add(pasteFile);
		
		
		//Help Menu
		Menu helpMenu = new Menu("Help");
		CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
		showLines.setOnAction( e-> {
			if(showLines.isSelected()) {
				System.out.println("Program will now display the lines");
			}else {
				System.out.println("Hiding the line numbers");
			}
		} );
		
		helpMenu.getItems().addAll(showLines);
		
		
		//Difficulty RadioMenuItems
		Menu diffcultyMenu = new Menu("Difficulty");
		ToggleGroup difficultyToggle = new ToggleGroup();
		
		RadioMenuItem easy = new RadioMenuItem("Easy");
		RadioMenuItem medium = new RadioMenuItem("Medium");
		RadioMenuItem hard = new RadioMenuItem("Hard");
		
		easy.setToggleGroup(difficultyToggle);
		medium.setToggleGroup(difficultyToggle);
		hard.setToggleGroup(difficultyToggle);
		
		diffcultyMenu.getItems().addAll(easy, medium, hard);
		
		//Main Menu Bar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, diffcultyMenu);
		
		layout = new BorderPane();
		layout.setTop(menuBar);
		Scene scene = new Scene(layout, 400, 400);
		window.setScene(scene);
		window.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
