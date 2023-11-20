package lab2;

import java.util.ArrayList;

public class VendaCQ {

    private Aluno aluno;
    private ArrayList<CachorroQuente> cachorrosQuentes;

    public VendaCQ(Aluno aluno) {
        this.aluno = aluno;
        cachorrosQuentes = new ArrayList<>();
    }

    public void realizarVenda(CachorroQuente cachorroQuente) {
        cachorrosQuentes.add(cachorroQuente);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public ArrayList<CachorroQuente> getCachorrosQuentes() {
        return new ArrayList<>(cachorrosQuentes);
    }
}
