package controller;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modele.Utilisateur;
import service.UtilisateurDao;
import utulitaire.LoadView;
import utulitaire.Utils;

public class LoginController implements Initializable{
	@FXML
    private TextField pseudo;

    @FXML
    private PasswordField motdepasse;

    @FXML
    private Button btnConnexion;
    
    @FXML
    private Text info;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		info.setVisible(false);
	}
	
	@FXML
	void connexion(ActionEvent event) {
		try 
   	 	{
 		    Utilisateur user = new Utilisateur();
	  		
	  		user = UtilisateurDao.authentification(pseudo.getText(),motdepasse.getText());
	  		
	  		if(user == null) {
	  			info.setVisible(true);
	  		}
	  		else {
	  			info.setVisible(false);
	  			LoadView.showView("My Pharmacie", "Menu.fxml", 1);
	  			
	  		}
	  		
 		    
 		   
		} 
    	catch (Exception ex) 
    	{
			 
		}

	}
	

}
