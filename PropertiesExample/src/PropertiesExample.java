import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PropertiesExample extends Application{

	Stage window;
	Scene scene;
	GridPane layout;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		Person person = new Person();
		
		window = primaryStage;
		
		window.setTitle("Bella Ciao");

		Label firstNameLabel = new Label("Enter the first Name:");
		GridPane.setConstraints(firstNameLabel, 0, 0);
		
		TextField firstNameTF = new TextField();
		GridPane.setConstraints(firstNameTF, 1, 0);
		
		Label outputLabel = new Label("");
		GridPane.setConstraints(outputLabel, 3, 2);
		

		
		Label ageLabel = new Label("Enter your age : ");
		GridPane.setConstraints(ageLabel, 0, 3);
		
		
		TextField ageTF = new TextField();
		GridPane.setConstraints(ageTF, 1, 3);

		
		Label cgpaLabel = new Label("Enter the cgpa: ");
		GridPane.setConstraints(cgpaLabel, 0, 4);
		
		TextField cgpaTF = new TextField();
		GridPane.setConstraints(cgpaTF, 1, 4);
		
		
		person.cgpaProperty().addListener( (v, oldValue, newValue) -> {
			System.out.println(person.cgpaProperty());
		} );
		
		person.ageProperty().addListener( (v, oldValue, newValue)-> {
			System.out.println(person.ageProperty());
		} );
		
		person.firstNameProperty().addListener( (v, oldValue, newValue)-> {
			System.out.println(newValue);
			System.out.println(oldValue);
		} );
		
		
		person.lastNameProperty().addListener( (v, oldValue, newValue) -> {
			System.out.println(person.lastNameProperty());
		} );
		
		
		ComboBox<Integer> ageComboBox = new ComboBox<>();
		
		ageComboBox.getItems().addAll(18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29);
		
		
		
		Button submitBtn = new Button("Submit your information!");
		GridPane.setConstraints(submitBtn, 2, 0);
		
		submitBtn.setOnAction( e-> {
			
			person.setFirstName(firstNameTF.getText());
			person.setAge( Integer.parseInt(ageTF.getText()));
			person.setCgpa( Double.parseDouble( cgpaTF.getText() ) );
			
		});
		
		layout = new GridPane();
		
		layout.getChildren().addAll(firstNameLabel, firstNameTF, submitBtn, outputLabel, ageLabel, ageTF, cgpaLabel, cgpaTF);
		
		scene = new Scene(layout, 800, 600);
		
		window.setScene(scene);
		window.show();
		
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
