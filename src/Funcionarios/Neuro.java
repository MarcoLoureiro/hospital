package Funcionarios;

import java.util.ArrayList;
import java.util.List;

public final class Neuro extends Medico{
    private List<String> procedimentosNeurologicos = new ArrayList<>();

    public Neuro(String nome,Integer idade,String nomeHospital){
        super(nome,idade,nomeHospital);
    }

    public List<String> getProcedimentosNeurologicos() {
        return procedimentosNeurologicos;
    }

    public void setProcedimentosNeurologicos(String procedimentosNeurologicos) {
       this.procedimentosNeurologicos.add(procedimentosNeurologicos);
    }

    @Override
    public void mostrarDadosEspecialidade(){
        setIsPlantonista(true);
        setEspecialidade("Neuro");
        System.out.printf("%s é %s\n",getNome(),getEspecialidade());
        setProcedimentosNeurologicos("teste psicológico");
        setProcedimentosNeurologicos("aconselhamento");
        System.out.println("Faz "+ getProcedimentosNeurologicos());
        System.out.println("Plantonista: "+getIsPlantonista());

    }

    @Override
    public void realizarDiagnostico(List<String> sintomas){

        boolean isSintomaIdentificado = false;

        switch (sintomas.get(0)){
            case "Dor de cabeça":
                setEspecialidade("Neuro");
                isSintomaIdentificado = true;
                break;
        }

        switch (sintomas.get(1)){
            case "Enxaqueca":
                setEspecialidade("Neuro");
                isSintomaIdentificado = true;
                break;
        }

        identificarDiagnostico(isSintomaIdentificado);
    }
}
