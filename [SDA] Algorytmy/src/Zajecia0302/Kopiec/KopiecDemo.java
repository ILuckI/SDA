package Zajecia0302.Kopiec;

public class KopiecDemo {
    public static void main(String[] args) {

        Kopiec kopiec = new Kopiec();
        kopiec.addElementToKopiec(15);
        kopiec.addElementToKopiec(24);
        kopiec.addElementToKopiec(1);
        kopiec.addElementToKopiec(123);
        kopiec.addElementToKopiec(11);
        kopiec.addElementToKopiec(15);
        kopiec.addElementToKopiec(25);
        System.out.println("---|---||---|||---||---|---");
        kopiec.printElement();
        System.out.println("---|---||---|o|---|00|---|o|---||---|---");

        kopiec.deleteKopiec();

        kopiec.addElementToKopiec(666);
    }
}
