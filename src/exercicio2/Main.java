package exercicio2;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.armazenaPessoa("Rodrigo", 21, 1.7f);
        agenda.armazenaPessoa("João", 13, 1.3f);
        agenda.armazenaPessoa("Maria", 30, 1.65f);
        agenda.armazenaPessoa("Paulo", 16, 1.8f);
        agenda.armazenaPessoa("Joaquim", 103, 1.7f);
        agenda.armazenaPessoa("José", 25, 1.9f);
        agenda.armazenaPessoa("Debora", 38, 1.6f);
        agenda.armazenaPessoa("Alex", 30, 1.75f);
        agenda.armazenaPessoa("Roberto", 50, 1.8f);
        agenda.armazenaPessoa("Marta", 29, 1.6f);
        agenda.armazenaPessoa("rdr2", 13, 1.3f);
        agenda.imprimeAgenda();
    }
}
