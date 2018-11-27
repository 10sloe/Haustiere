public class Hund
{
    // Attribute
    String name;   // Der Name des Hundes wird im Konstruktor gesetzt!
    int alter = 2;
    double groesse = 15;
    
    // Konstruktor
    Hund(String name_)
    {
        name = name_;
    }
    
    // Methoden
    void wachsen()
    {
        groesse = groesse + 5;
    }
    
    void bellen()
    {
        System.out.println("Wuff wuff");
    }
    
    void infosAusgeben()
    {
        System.out.println("*********************");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Groesse: " + groesse);
        System.out.println("*********************");
    }
}