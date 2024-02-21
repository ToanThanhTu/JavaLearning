public class ConstructorChallenge {

    public static void main(String[] args) {
        Customer trev = new Customer("Trev", 30000.0, "trev@email.com");
        System.out.println(trev.getName());
        System.out.println(trev.getCreditLimit());
        System.out.println(trev.getEmail());

        Customer cat = new Customer();
        System.out.println(cat.getName());
        System.out.println(cat.getCreditLimit());
        System.out.println(cat.getEmail());

        Customer wer = new Customer("Wer", "joe@email.com");
        System.out.println(wer.getName());
        System.out.println(wer.getCreditLimit());
        System.out.println(wer.getEmail());
    }

}
