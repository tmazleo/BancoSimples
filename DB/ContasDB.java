package DB;

import Models.Contas;

import java.util.ArrayList;
import java.util.List;

public class ContasDB {
    private List<Contas> contasList = new ArrayList<>();

    public List<Contas> getContasList() {
        return contasList;
    }

    public void novaConta(Contas contas) {
        int id = contasList.size() + 1;
        contas.setConta(id);
        contasList.add(contas);
    }
}
