package orientacaoobjetos.atividades;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RedeSocial {
    public static void main(String[] args)  throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
       Post post1 = new Post("Aula DEV", "Aprendendo JAVA", 3, 3);
       post1.classificarPostBom(post1.getEstrelas());
        System.out.println(post1);
        
        Post post2 = new Post("Festa de 15", "Melhor festa que ja fui", 20, 5);
       post1.classificarPostMuitoBom(post2.getEstrelas());
        System.out.println(post2);
        
        Post post3 = new Post("Aula DEV", "Aprendendo HTML", 7, 1);
       post3.classificarPostComum(post3.getEstrelas());
        System.out.println(post3);
    }
 
}
