public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        conta.setAgencia(-50);
        conta.setNumero(-330);

        Conta conta2 = new Conta(1338, 24326);

        System.out.println(Conta.getTotal()); //pode chamar o get pela classe, pois o get foi declarado como 'static'
    }
}
