package Principal;

public abstract class Hospital {
    private String nomeHospital;
    private Boolean isTrabalhando;



    public Hospital(){

    }

    public Hospital(String nomeHospital){
        this.nomeHospital = nomeHospital;
    }

    public Hospital(String nomeHospital, Boolean isTrabalhando){
        if(isTrabalhando){
                this.nomeHospital = nomeHospital;
        }else{
            this.nomeHospital = "";
        }

    }


    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public Boolean getTrabalhando() {
        return isTrabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        isTrabalhando = trabalhando;
    }

    public abstract void definirPoloHospital(String nomeHospitalEmQueTrabalha);


}
