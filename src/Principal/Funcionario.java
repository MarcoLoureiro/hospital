package Principal;
import Principal.*;

public abstract class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nomeHospital, Boolean isTrabalhando,String nome, Integer idade){
        super(nomeHospital,isTrabalhando,nome,idade);
    }

    @Override
    public void definirPoloHospital(String nomeHospitalEmQueTrabalha) {
        System.out.printf("%s trabalha no polo %s do hospital\n",getNome(), getNomeHospital());
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract void definirCargo(); //Definir função dele no hospital...


}
