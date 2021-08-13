public class Programa {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.saldo = 200;

        primeiraConta.transfere(50, segundaConta);

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);
      

        
    }


}