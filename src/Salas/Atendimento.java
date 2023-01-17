package Salas;

public final class Atendimento extends Sala{

    public Atendimento(String nomeDoHospital){
        super(nomeDoHospital);
    }

    private Integer tempoAtendimento;

    public Integer getTempoAtendimento() {
        return tempoAtendimento;
    }

    public void setTempoAtendimento(Integer tempoAtendimento) {
        this.tempoAtendimento = tempoAtendimento;
    }

    @Override
    public void reservar(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
        setReservada(true);
        setTempoAtendimento(10);

        System.out.println("Sala de atendimento reservada: "+getReservada());
        System.out.printf("Sala de atendimento do hospital %s disponível no dia %d, mês %d e ano %d\n",getNomeHospital(),getDia(),getMes(),getAno());
        System.out.println("Tempo de atendimento mínimo: "+ getTempoAtendimento());
    }
}
