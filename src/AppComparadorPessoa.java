public class AppComparadorPessoa {
    public static void main(String[] args) {
        OrdenacaoPessoa pessoa =new OrdenacaoPessoa();

        pessoa.adicionarPessoa("Ronald", 12, 1.68);
        pessoa.adicionarPessoa("Rond", 72, 1.48);
        pessoa.adicionarPessoa("ald", 52, 1.38);


        System.out.println(pessoa.ordenadoIdade());
        System.out.println(pessoa.ordenarAltura());
    }
}
