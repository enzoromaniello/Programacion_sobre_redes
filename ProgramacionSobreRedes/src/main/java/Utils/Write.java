 package Utils;
    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.io.PrintStream;
    import java.io.PrintWriter;
    import java.util.LinkedList;
    import java.util.Optional;

    public class Write {
        
        public static void writeFile(File file,String text,boolean sobrescribir ) {
            try {
                FileWriter fw = new FileWriter(file,sobrescribir);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(text);
                pw.flush();
                pw.close();
                fw.close();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }
    }