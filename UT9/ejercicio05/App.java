package UT9.ejercicio05;

public class App {
    public static void main(String[] args) {
        Pizza pepperonni = new Pizza("queso","tomate","peperonni","oregano");
        System.out.println(pepperonni.toString());
        pepperonni.añadirIngrediente("queso2");
        pepperonni.añadirIngrediente("pimenton");
        System.out.println(pepperonni.toString());
    }
}
