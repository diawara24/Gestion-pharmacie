package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class MenuController implements Initializable
{
	 @FXML
	 private Label menu;
	 
	 @FXML
	 private Label gesprod;

     @FXML
     private Label gesclient;

     @FXML
     private Label gesfourni;
 
     @FXML
     private Label gescomm;
     
     @FXML
     private Label gesvente;

     @FXML
     private Label gespaiement;
     
     @FXML
     private Label gesreglement;

     @FXML
     private Label gesadmin;

     @FXML
     private Label gessta;

     @FXML
     private Label titleMenu;
     
     @FXML
     private GridPane pnDashboard;

     @FXML
     private GridPane pnGesprod;
     
     @FXML
     private GridPane pnFournisseur;
     
     @FXML
     private GridPane pnClient;
     
     @FXML
     private GridPane pnGescommande;
     
     @FXML
     private GridPane pngesVente;
     
     @FXML
     private GridPane pngesReglement;
     
     @FXML
     private GridPane pngesPaiement;
     
     @FXML
     private GridPane pnStatistique;
     
     @FXML
     private GridPane pngesAdmin;

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		pnDashboard.toFront();
		
		
	}
	
	@FXML
	void handleclic(MouseEvent event) 
	{
		if(event.getSource() == menu)
		{
			titleMenu.setText("Dashboard");
			pnDashboard.toFront();
		}
		else if (event.getSource() == gesadmin)
		{
			titleMenu.setText("Gestion d'Administration");
			pngesAdmin.toFront();
		}
		else if (event.getSource() == gesfourni)
		{
			titleMenu.setText("Gestion des fournisseurs");
			pnFournisseur.toFront();
		}
		else if (event.getSource() == gesvente)
		{
			titleMenu.setText("Gestion des Ventes");
			pngesVente.toFront();
		}
		else if (event.getSource() == gescomm)
		{
			titleMenu.setText("Gestion des Commandes");
			pnGescommande.toFront();
		}
		else if (event.getSource() == gesclient)
		{
			titleMenu.setText("Gestion des Clients");
			pnClient.toFront();
		}
		else if (event.getSource() == gesprod)
		{
			titleMenu.setText("Gestion des Produits");
			pnGesprod.toFront();
		}
		else if (event.getSource() == gessta)
		{
			titleMenu.setText("Statistiques");
			pnStatistique.toFront();
		}
		else if (event.getSource() == gesreglement)
		{
			titleMenu.setText("Règlement des Ventes");
			pngesReglement.toFront();
		}
		else if (event.getSource() == gespaiement)
		{
			titleMenu.setText("Paiement des Commandes");
			pngesPaiement.toFront();
		}
		
    }

}
