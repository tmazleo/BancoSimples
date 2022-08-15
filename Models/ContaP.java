package Models;

public class ContaP extends Contas {

    private double acrescimo = 10;


    public ContaP(int clienteID, String tipoConta, Integer conta, double saldo) {
        super(clienteID, tipoConta, conta, saldo);
    }

    @Override
    public void depositar(double quantia) {
        super.depositar(quantia);
        this.saldo = quantia + acrescimo;
    }

    @Override
    public boolean sacar(double quantia) {
        super.sacar(quantia);
        if (this.saldo < quantia) {
            System.out.println("Sem saldo");
            return false;
        } else {
            this.saldo -= quantia;
            return true;
        }
    }
}
