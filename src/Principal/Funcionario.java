package Principal;
import Principal.*;

public abstract class Funcionario extends Pessoa {
    private String cargo;
    private Hospital hospital;

    public Funcionario(String nome, Integer idade,String nomeHospital){
        super(nome,idade);
        this.hospital = new Hospital();
        hospital.setNomeHospital(nomeHospital);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract void definirCargo(); //Definir função dele no hospital...


}
