import Funcionarios.*;
import Principal.Hospital;
import Principal.Paciente;
import Salas.Atendimento;
import Salas.Cirurgia;
import Principal.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ClinicoGeral clinicoGeral = new ClinicoGeral("Carlos",32,"Porto");
        Cirurgiao cirurgiao = new Cirurgiao("Marco",28,"Unimed");
        Neuro neuro = new Neuro("Fernando",25,"Amazônia");
        Funcionario atendente = new Atendente("José",29,"Unimed");
        Cirurgia salaCirugia = new Cirurgia("Porto Dias");
        Atendimento salaAtendimento = new Atendimento("Unimed");
        Paciente paciente = new Paciente("João",19);

        List<String> sintomas = new ArrayList<>();
        sintomas.add("Febre");
        sintomas.add("Dor de cabeça");

        clinicoGeral.mostrarDadosEspecialidade();
        System.out.println();
        cirurgiao.mostrarDadosEspecialidade();
        System.out.println();
        neuro.mostrarDadosEspecialidade();
        System.out.println();

        ((Atendente)atendente).iniciarAtendimento();
        System.out.println();
        salaCirugia.reservar(22,9,2023);
        System.out.println();
        salaAtendimento.reservar(9,02,2023);
        System.out.println();

        paciente.descreverSintomas(sintomas);
        System.out.println();

        cirurgiao.realizarDiagnostico(paciente.getSintomas());
        clinicoGeral.realizarDiagnostico(paciente.getSintomas());
        neuro.realizarDiagnostico(paciente.getSintomas());


        //Hospital -> Pessoa -> Funcionario -> Medico (ClínicoGeral, Cirugiao, Neuro) && Atendente
        //Hospital -> Sala -> Cirurgia && Atendimento

    }
}