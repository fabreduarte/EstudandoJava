package aula8;

public class servico {
    public static void main(String[] args) {
        Pessoa pFisica = new Pessoa();
        Pessoa pJuridica = new Pessoa();

        pFisica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pFisica.setNumeroDocumento(pFisica.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pFisica);
        
        System.out.println("---------------");

        pJuridica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pJuridica.setNumeroDocumento((pJuridica.getTipoDocumento().gerarNumeroTeste()));
        System.out.println(pJuridica);
    }
}
