package fahim.bmi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

public class FXMLController implements Initializable {
    
    private DecimalFormat df = new DecimalFormat("#.##");
    
    private double height,weight,bmi;
    String BMI;
    
    @FXML
    private Button BCalMet;
    
    @FXML
    private Label LHeight;
    @FXML
    private Label Lweight;
    @FXML
    private Label LBmi;
    @FXML
    private TextField FBmi;
    @FXML
    private TextField FWeight;
    @FXML
    private TextField FHeight;
    @FXML
    private Button BCalculateimp;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
            if(event.getSource() == BCalculateimp){
            height = Double.parseDouble(FHeight.getText());
            weight = Double.parseDouble(FWeight.getText());
            bmi = (weight*703)/(height*height);
            BMI = df.format(bmi);
            FBmi.setText(BMI);
        }
        
            else if(event.getSource() == BCalMet){
            height = Double.parseDouble(FHeight.getText());
            weight = Double.parseDouble(FWeight.getText());
            bmi = weight/(height*height);
            BMI = df.format(bmi);
            FBmi.setText(BMI);
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
