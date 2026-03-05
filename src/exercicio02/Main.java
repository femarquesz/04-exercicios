package exercicio02;

public class Main {
    public static void main(String[] args) {
        SenhaAtendimento s1 = new SenhaAtendimento("BrksEdu");
        SenhaAtendimento s2 = new SenhaAtendimento("Alanzoka");
        SenhaAtendimento s3 = new SenhaAtendimento("Leon");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

    }
}
