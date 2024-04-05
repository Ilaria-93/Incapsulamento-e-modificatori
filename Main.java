/*Scrivere un programma che contenga una classe che definisce un Auto
che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto
accessibili solo attraverso i metodi.*/

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1500, "UD04TWZ", "Mercedes", "5W");
        System.out.println(auto1);
        System.out.println("La marca dell'auto è: " + auto1.getMarca());
    }
}