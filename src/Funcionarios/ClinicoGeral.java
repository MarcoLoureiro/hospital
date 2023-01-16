package Funcionarios;

import java.util.List;

public final class ClinicoGeral extends Medico{

    private Boolean isSolicitandoExames;

    public ClinicoGeral(String nomeHospital, Boolean isTrabalhando,String nome,Integer idade){
        super(nomeHospital,isTrabalhando,nome,idade);
    }

    public Boolean getSolicitandoExames() {
        return isSolicitandoExames;
    }

    public void setSolicitandoExames(Boolean solicitandoExames) {
        isSolicitandoExames = solicitandoExames;
    }

    @Override
    public void mostrarDadosEspecialidade(){
        setIsPlantonista(false);
        setSolicitandoExames(true);
        setEspecialidade("Clínico Geral");
        System.out.printf("%s trabalha como %s\n",getNome(),getEspecialidade());
        System.out.println("Solicitando exames: "+ getSolicitandoExames());
        System.out.println("Plantonista: "+getIsPlantonista());

    }

    @Override
    public void realizarDiagnostico(List<String> sintomas){

        boolean isSintomaIdentificado = false;

        switch (sintomas.get(0)){
            case "Febre":
                setEspecialidade("Clínico Geral");
                isSintomaIdentificado = true;
                break;
            case "Vômito":
                setEspecialidade("Clínico Geral");
                isSintomaIdentificado = true;
                break;
            case "Pressão alta":
                setEspecialidade("Clínico Geral");
                isSintomaIdentificado = true;
                break;
            default:
                setEspecialidade("");
                System.out.println("???");
        }

        switch (sintomas.get(1)){
            case "Dor":
                setEspecialidade("Clínico Geral");
                isSintomaIdentificado = true;
                break;
            case "Diarréia":
                setEspecialidade("Clínico Geral");
                isSintomaIdentificado = true;
                break;
            case "Arritmia":
                setEspecialidade("Clínico Geral");
                isSintomaIdentificado = true;
                break;

        }

        identificarDiagnostico(isSintomaIdentificado);

    }
}
