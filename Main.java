public class Main {
    
    // Das Programm beginnt hier
    public static void main(String[] args) {
        
     
        System.out.println("Ein neuer Hund: ");   
        Hund h1 = new Hund("Lemmi");
        
        h1.infosAusgeben();
        
        System.out.println("Noch ein neuer Hund: ");   
        Hund h2 = new Hund("Fiffi");
        
        h2.infosAusgeben();
        
        
    }
}