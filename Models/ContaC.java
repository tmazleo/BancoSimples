package Models;

public class ContaC extends Contas {

    private double chequeEspecial;

    public ContaC(int clienteID, String tipoConta, Integer conta, double saldo, double chequeEspecial) {
        super(clienteID, tipoConta, conta, saldo);
        this.chequeEspecial = chequeEspecial;

    }


    public void depositar(double quantia) {
        super.depositar(quantia);

    }

    @Override
    public boolean sacar(double quantia) {
        super.sacar(quantia);
        double disponivel = this.chequeEspecial + this.saldo;
        if (disponivel < quantia) {
            System.out.println("Sem saldo");
            return false;
        } else {
            this.saldo -= quantia;
            return true;
        }

    }
}

