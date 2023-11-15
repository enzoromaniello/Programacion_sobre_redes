    package Utils;
    import java.io.BufferedReader;
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.PrintStream;
    import java.util.LinkedList;


    public class Read {

        static PrintStream ps = new PrintStream(System.out);;
        static InputStreamReader isr = new InputStreamReader( System.in );
        public static BufferedReader br = new BufferedReader( isr );

        public static String read(String question){
            System.out.flush();
            
            try {
                
                ps.print(question);
                
                int Byte = 0;
                String cadena = "";
                while(   ( Byte = System.in.read() )  != '\n'  )
                {
                    if(Byte != '\r') {
                        cadena += (char)Byte;
                    }
                    
                }
                
                
                return cadena;
                
            } catch (IOException e) {
                // TODO Auto-generated catch block
                
            }
        
            return null;
        }
        
        
        
        
        public static int readInt(String question){
            

                String cadena = read(question);
                int numero = Integer.parseInt(cadena);
                return numero;

        }
        
        public static Double readDouble(String question){
            

            String cadena = read(question);
            Double numero = Double.parseDouble(cadena);
            return numero;

    }
        
        
        
        public static String readR(String question) {
            ps.print(question);
            String cadena = null;
            try {
                cadena = br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return cadena;
        }
        
        public static Double readRDouble(String question){
            
            String cadena = readR(question);
            if(cadena.trim().isEmpty()) {
                return null;
            }else {
                Double numero = Double.parseDouble(cadena);
                return numero;
            }
            
        
        }
        
        public static int readRInt(String question){
        
            Double doubleN = readRDouble(question);
            if(doubleN == null) {
                return -1;
            }
            int numero = (int) Math.floor(doubleN);
            return numero;

        }
        
        
        public static LinkedList<String> readFileBuffered(File file)
        {
            LinkedList<String> data = new LinkedList<String>() ;
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader( fr );
                
                String line = "";
                while( (line = br.readLine() ) !=  null)
                {
                    data.add(line);
                }		
                fr.close();
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            return data;
        }
    }