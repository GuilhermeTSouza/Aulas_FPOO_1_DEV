package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    public static void main(String[] args) 
    throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Cliente cliente1 = new Cliente("João Antônio");
        System.out.println(cliente1);
        Cliente c2 = new Cliente("José Manuel", "jose@gmail.com");
        System.out.println(c2);
    }
    
}
