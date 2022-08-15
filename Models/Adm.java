package Models;

public class Adm implements Autenticador{
    @Override
    public boolean autentica(int senhaC) {
        if(senhaC != 123) {
            System.out.println("Senha incorreta!");
            return false;
        }else {
            return true;
        }
    }
}
