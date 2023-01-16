package Funcionarios;

import Principal.Funcionario;

import java.util.ArrayList;
import java.util.List;

public abstract class Medico extends Funcionario {

    private Boolean isPlantonista;
    private String especialidade;


    public Medico(String nomeHospital, Boolean isTrabalhando,String nome,Integer idade){
        super(nomeHospital,isTrabalhando,nome,idade);
    }

    public Boolean getIsPlantonista() {
        return isPlantonista;
    }

    public void setIsPlantonista(Boolean isPlantonista) {
        this.isPlantonista = isPlantonista;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override
    public void definirCargo(){
        setCargo("Médico");
        System.out.printf("%s trabalha como %s\n",getNome(), getCargo());
    }

    public abstract void mostrarDadosEspecialidade();

    public void identificarDiagnostico(boolean isSintomaIdentificado){

        if(isSintomaIdentificado){
            System.out.println(getEspecialidade()+" identificou!");
        }
    }

    public abstract void realizarDiagnostico(List<String> sintomas);

}
