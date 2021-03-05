package service;

import java.sql.ResultSet;

import modele.Utilisateur;

public class UtilisateurDao {
	
	public static Utilisateur authentification(String pseudo, String mdp) {
		Utilisateur u = null;
		try {
			DataBaseHelper db = DataBaseHelper.getInstance();
			String sql="select * from user where pseudo=? and motdepasse=?";
			db.myPrepareStatement(sql);
			Object[] parameters = {pseudo,mdp};
			db.addParameters(parameters);
			ResultSet rs = db.myExecuteQuery();
			while(rs.next()) {
				u = new Utilisateur();
				u.setId(rs.getInt("id"));
				u.setNom(rs.getString("nom"));
				u.setPrenom(rs.getString("prenom"));
				u.setPseudo(rs.getString("pseudo"));
				u.setMdp(rs.getString("motdepasse"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
		
		
	}

}
