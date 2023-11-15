package principal;

    import java.io.PrintStream;
    import java.util.LinkedList;

    import DAO.DAOFactory;
    import DAO.stockDAO;
    import DTO.DTOfactory;
    import DTO.stockDTO;
    import Utils.Read;

    public class main {
        
        public static PrintStream ps = new PrintStream(System.out);

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            menu();
        }
        
        public static void menu() {
            
            int opcion = -1;
            while (opcion != 0) {
                ps.println("\n Eliga una Opcion ");
                ps.println("1- Productos Disponibles ");
                ps.println("2- Crear Producto ");
                ps.println("3- Modificar Producto ");
                ps.println("4- Discontinuar Producto ");
                ps.println("5- Borrar Producto");
                ps.println("0- Salir");
                opcion = Read.readRInt("Opcion: ");
                switch(opcion) {
                case 1:
                    verProductos();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    modificarProducto();
                    break;
                case 4:
                    discontinuarProducto();
                    break;
                case 5:
                    eliminarProducto();
                    break;
                case 0:
                    ps.println("saliendo");
                    break;
                default:
                    ps.println("Opción no válida.");
                    break;
                }
            }
        

            
        }

        public static void verProductos() {
            ps.println(" Stock Disponible ");
            LinkedList<stockDTO> productos = DAOFactory.getInstance().getDAO("stock").getAll();
            for(stockDTO p : productos) {
                ps.println(p.toString());
            }
        }

        public static void agregarProducto() {
            ps.println(" Agregar Producto ");
        
            String nombre = Read.readR("Nombre del producto: ");
            String Descripcion = Read.readR("Descripción: ");
            double PrecioComp = Read.readDouble("Precio de compra: ");
            double PrecioVent = Read.readDouble("Precio de venta: ");
            int cant = Read.readInt("Cantidad: ");
            boolean Discontinuo = false;
            
            stockDTO d= new stockDTO(nombre, Descripcion, PrecioComp, PrecioVent, cant, Discontinuo); 
            
            DAOFactory.getInstance().getDAO("stock").add(d);
            ps.println("Se agrego " +d.getnombre()+" correctamente");
        }
        
        
        public static void modificarProducto() {
            ps.println("\n Modificar Producto ");
            LinkedList<stockDTO> productos = DAOFactory.getInstance().getDAO("stock").getAll();
                for(stockDTO p : productos) {
                    ps.println(p.getId()+" - "+p.getnombre());
                }
            int eleccionP = Read.readRInt("Elija el numero de producto a modificar:"); 
            
            stockDTO st = (stockDTO)DAOFactory.getInstance().getDAO("stock").getById(eleccionP);

            String nombre = Read.readR("Nombre: "+st.getnombre()+"): ");
            String Descripcion = Read.readR("Descripción("+st.getDescripcion()+"): ");
            Double PrecioComp=  Read.readRDouble("Precio de compra("+st.getPrecioComp()+"): ");
            Double PrecioVent = Read.readRDouble("Precio de venta("+st.getPrecioVent()+"): ");
            int cant = Read.readRInt("Cantidad("+st.getCant()+"):");
            
            if(nombre != null || nombre != "") st.setnombre(nombre);
            if(Descripcion != null|| Descripcion != "") st.setDescripcion(Descripcion);
            if(PrecioComp != null) st.setPrecioComp(PrecioComp);
            if(PrecioVent != null) st.setPrecioVent(PrecioVent);
            st.setCant(cant);
            DAOFactory.getInstance().getDAO("stock").update(st);
            ps.println("Se modifico " +st.getnombre()+" con exito!");
        }
        
        
        public static void discontinuarProducto() {
            ps.println(" --------- Descontinuar producto --------");
            LinkedList<stockDTO> productos = DAOFactory.getInstance().getDAO("stock").getAll();
                for(stockDTO p : productos) {
                    ps.println(p.getId()+" - "+p.getnombre());
                }
            int eleccionP = Read.readRInt("Elija el numero de producto a descontinuar:"); 
            
            
            stockDTO st = (stockDTO)DAOFactory.getInstance().getDAO("stock").getById(eleccionP);
            st.setDiscontinuo(true);
            DAOFactory.getInstance().getDAO("stock").update(st);
            ps.println("Se descontinuo " +st.getnombre()+" con exito!");
            
        }
        
        public static void eliminarProducto() {
            ps.println("\n --------- Eliminar producto --------");
            LinkedList<stockDTO> productos = DAOFactory.getInstance().getDAO("stock").getAll();
                for(stockDTO p : productos) {
                    ps.println(p.getId()+" - "+p.getnombre());
                }
            int eleccionP = Read.readRInt("Elija el numero de producto a Eliminar:"); 
            
            
            stockDTO st = (stockDTO)DAOFactory.getInstance().getDAO("stock").getById(eleccionP);
            DAOFactory.getInstance().getDAO("stock").delete(st);
            ps.println("Se elimino " +st.getnombre()+" con exito!");
            
        }


    }