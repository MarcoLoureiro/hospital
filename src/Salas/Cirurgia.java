package Salas;

public final class Cirurgia extends Sala{

    private Boolean isEsterilizada;

    public Cirurgia(String nomeDoHospital){
        super(nomeDoHospital);
        this.isEsterilizada = false;
    }



    public Boolean getEsterilizada() {
        return isEsterilizada;
    }

    @Override
    public void definirPoloHospital(String nomeHospitalEmQueTrabalha) {
        setNomeHospital(nomeHospitalEmQueTrabalha);
    }

    public void setEsterilizada(Boolean esterilizada) {
        isEsterilizada = esterilizada;
    }

    @Override
    public void reservar(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
        setReservada(true);
        setEsterilizada(true);

        System.out.println("Sala de cirugia reservada: "+getReservada());
        System.out.printf("Sala de cirurgia do hospital %s reservada para dia %d, mês %d e ano %d\n",getNomeHospital(),getDia(),getMes(),getAno());
        System.out.println("Sala esterelizada: "+getEsterilizada());
    }
}
