package lsp;

public class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("<звуки пингвина>, ем рыбу, <еще звуки пингвина>");
    }

    public void fly() {
        System.out.println("Пингвины не умеют летать.");
    }
}
