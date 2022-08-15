package Models;

public class ContaSalario extends Contas{
    public ContaSalario(int clienteID, String tipoConta, Integer conta, double saldo) {
        super(clienteID, tipoConta, conta, saldo);
    }

    @Override
    public boolean sacar(double quantia) {
        return super.sacar(quantia);
    }
}
