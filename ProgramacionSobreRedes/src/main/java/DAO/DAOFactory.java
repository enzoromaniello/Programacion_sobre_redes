package DAO;

public class DAOFactory {
	
	private static DAOFactory fabrica = null;
	private static stockDAO stock = null;
	

	private DAOFactory() {

	}

	public static DAOFactory getInstance() {
		if (fabrica == null)
			fabrica = new DAOFactory();

		return fabrica;
	}

	public GeneralDAO getDAO(String type) {
		switch (type) {
		case "stock":
			if (stock == null)stock = new stockDAO();
			return stock;
		}

		return null;
	}

}