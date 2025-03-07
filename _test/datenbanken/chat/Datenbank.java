package _test.datenbanken.chat;
import linear.ListWithViewer;
import datenbank.DatabaseConnector;
import datenbank.QueryResult;
import gui.GUI;


public class Datenbank {
	private DatabaseConnector connector;
	
	public Datenbank() {
		//                                    ip        port database  user   password
		connector = new DatabaseConnector("127.0.0.1", 3306, "demo", "root", "");
		String errorMessage = connector.getErrorMessage();
		if(errorMessage != null) System.err.println(errorMessage);
	}
	
	public void nachrichtSenden(String pText, String pCode, String pNickname){
		//TODO
	}
	
	public String[] neueNachrichtenAbrufen(String pCode){
		//TODO
		return null;
	}
	
	public boolean istSchonDa(String pNick, String pCode){
		//TODO
		return false;
	}
/**
	public ListWithViewer<String> zehnFilmeMit(String pDarsteller){
		ListWithViewer<String> ergebnis = new ListWithViewer<String>();
		String sqlStatement = 
		  " SELECT h.name AS hauptdarstellername, f.name AS filmname, f.oscars AS oscars "+
	      " FROM film f, film_has_hauptdarsteller fh, hauptdarsteller h "+
          " WHERE f.id = fh.film_id "+
	      " AND h.id = fh.hauptdarsteller_id "+
		  " AND h.name LIKE '%"+pDarsteller+"%' "+
	      " LIMIT 10 ";
		System.out.println(sqlStatement);

		connector.executeStatement(sqlStatement);

		String errorMessage = connector.getErrorMessage();
		if(errorMessage != null) System.err.println(errorMessage);
		
		QueryResult queryResult = connector.getCurrentQueryResult();

		String[][] data = queryResult.getData();
		for (int i = 0; i < data.length; i++) {
			String hauptdarsteller = data[i][0];
			String filmName = data[i][1];
			String oscarsString = data[i][2];
			int oscars = Integer.parseInt(oscarsString);
			String zeile = hauptdarsteller+": "+filmName+" ("+oscars+" Oscars)";
			System.out.println(zeile);
			ergebnis.append(zeile);
		}
		return ergebnis;
	}
*/	
	public static void main(String[] args) {
		new GUI(new Datenbank());
	}
}
