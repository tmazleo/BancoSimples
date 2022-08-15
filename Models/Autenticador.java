package Models;

@FunctionalInterface
public interface Autenticador {
    public abstract boolean autentica(int senha);
}
