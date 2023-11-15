package principal;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    public class connectionFactory {
        
        private static connectionFactory fabrica = null;
        private Connection conn = null;

        private connectionFactory() {
        }

        public static connectionFactory getInstance()
        {
            if( fabrica == null)
            {
                fabrica = new connectionFactory();
            }
                
            return fabrica;
        }
        

        // public synchronized static ConnectionFactory getInstance() {
        public Connection getConection(String db) {

            switch (db) {
            case "MySQL":
                    MySQL sql = new MySQL();
                    conn = sql.getConnection();
                break;

            }

            return conn;
        }

        


        public void close() {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


    class MySQL {
        private String driver = "com.mysql.cj.jdbc.Driver";

        private String db = "/bdd_stock";
        private String port = ":3306";
        private String EngineDB = "mysql";
        private String ip = "://localhost";

        private String url = "jdbc:".concat(EngineDB).concat(ip).concat(port).concat(db);
        private String user = "root";
        private String pass = "";
        
        Connection conn = null;

        public MySQL() {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public Connection getConnection() {

            try {
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return conn;
        }

        public void close() {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }



    }