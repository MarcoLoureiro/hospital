package Funcionarios;

import java.util.List;

public final class Cirurgiao extends Medico{
    private Integer numeroDeCirugias;

    public Cirurgiao(String nomeHospital, Boolean isTrabalhando,String nome,Integer idade){
        super(nomeHospital,isTrabalhando,nome,idade);
    }

    public Integer getNumeroDeCirugias() {
        return numeroDeCirugias;
    }

    public void setNumeroDeCirugias(Integer numeroDeCirugias) {
        this.numeroDeCirugias = numeroDeCirugias;
    }

    @Override
    public void mostrarDadosEspecialidade(){
        setIsPlantonista(false);

        if(getNumeroDeCirugias() == null || getNumeroDeCirugias() == 0) {
            setNumeroDeCirugias(1);
        }

        setEspecialidade("Cirurgião");
        setNumeroDeCirugias(getNumeroDeCirugias()+1);
        System.out.printf("%s trabalha como %s\n",getNome(),getEspecialidade());
        System.out.println("Tem: "+ getNumeroDeCirugias() +" cirugias para realizar");
        System.out.println("Plantonista: "+getIsPlantonista());

    }

    @Override
    public void realizarDiagnostico(List<String> sintomas){

        boolean isSintomaIdentificado = false;

        switch (sintomas.get(0)){
            case "Fratura":
                setEspecialidade("Cirurgião");
                isSintomaIdentificado = true;
                break;

        }

        switch (sintomas.get(1)){
            case "Derrame":
                setEspecialidade("Cirurgião");
                isSintomaIdentificado = true;
                break;
        }

        identificarDiagnostico(isSintomaIdentificado);

    }
}
