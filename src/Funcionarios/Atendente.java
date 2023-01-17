package Funcionarios;

import Principal.Funcionario;

public class Atendente extends Funcionario {

    private Boolean isAtendendo;

    public Atendente(String nome,Integer idade,String nomeHospital){
        super(nome,idade,nomeHospital);
        this.isAtendendo = false;
    }

    public Boolean getAtendendo() {
        return isAtendendo;
    }

    public void setAtendendo(Boolean atendendo) {
        isAtendendo = atendendo;
    }

    public final void iniciarAtendimento(){
        setAtendendo(true);
        System.out.println(getNome() + " de "+getIdade() + " anos realizando atendimento: "+getAtendendo());
    }

    @Override
    public void definirCargo(){
        setCargo("HospitalFuncionarios.Atendente");
        System.out.printf("%s trabalha como %s\n",getNome(), getCargo());
    }
}
