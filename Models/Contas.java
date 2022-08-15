package Models;

public class Contas {
    private int clienteID;
    private String tipoConta;
    private int conta;
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Contas(){}
    public Contas(int clienteID, String tipoConta, Integer conta, double saldo) {
        this.clienteID = clienteID;
        this.tipoConta = tipoConta;
        this.conta = conta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Contas{" +
                "nomeCliente='" + clienteID + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }

    public void depositar(double quantia) {
        this.saldo += quantia;
    }

    public boolean sacar(double quantia) {
        return false;
    }

}
