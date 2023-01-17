package Principal;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa{

    private List<String> sintomas = new ArrayList<>();

    public Paciente(String nome,Integer idade){
        super(nome,idade);
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }

    public final void descreverSintomas(List<String> sintomas){
        setSintomas(sintomas);
        System.out.println("Paciente apresenta "+getSintomas());
    }
}
