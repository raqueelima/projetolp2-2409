/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolp2;


public class Projetolp2 {
   public static String exemplo = """
     Teste aula lp2""";
    
   public static String exemplo2() {
    return """
            <html>

                <body>
                    <span>exemplo da aula de lp2</span>
                </body>
            </html>""";
}
   public static String textomostraaspas() {
    return """
            "abc" texto
            espaco
            mostra aspas \"""
            """;
}
   public static String umalinhaso() {
    return """
            ao usar \
            transforma em uma linha""";
}
   public static String espacos() {
    return """
            line 1=------
            line 2=------\s
            """;
}

   
   
    
    public static void main(String[] args) {
        System.out.println(exemplo);
        System.out.println(exemplo2());
        System.out.println(textomostraaspas());
        System.out.println(umalinhaso());
        System.out.println(espacos());
        
        
    }
    
}
