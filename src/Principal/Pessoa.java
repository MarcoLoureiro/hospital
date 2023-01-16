package Principal;

public abstract class Pessoa extends Hospital{

    private String nome;
    private Integer idade;


    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nomeHospital, Boolean isTrabalhando,String nome, Integer idade){
        super(nomeHospital,isTrabalhando);
        this.nome = nome;
        this.idade = idade;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
