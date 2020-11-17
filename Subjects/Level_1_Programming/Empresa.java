import java.util.Scanner;

// Classe principal
class Empresa {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        CadCliente cadUm = new CadCliente("","", "","");

        while (true) {
            System.out.println("\n\n***************************************\n*   Digite uma opcao do Menu, sendo:  *\n*   [1] Cadastro de Cliente           *\n*   [2] Cadastro de Empresa           *\n*   [3] Consulta                      *\n*************************************** \n: ");
            int opcao = info.nextInt();
            System.out.print("\n");

            if (opcao == 1) {
                cadUm.setNumero(info.nextLine());
            }

            if (opcao == 2) {
                cadUm.setNome(info.nextLine());
            }

            if (opcao == 3) {
                cadUm.setEmbalagem(info.nextLine());
            }

            {
                break;
            }
        }

        System.out.print("---------------------------------------\n");
        System.out.print("         Cadastro de Cliente\n");
        System.out.print("---------------------------------------\n");
        System.out.print("Digite o numero do cliente: ");
        cadUm.setNumero(info.nextLine());
        System.out.print("Digite o nome do cliente: ");
        cadUm.setNome(info.nextLine());
        System.out.print("Digite o tipo de embalagem do cliente (T1 - papelão | T2 - plastico | T3 - cartucho):\n");
        cadUm.setEmbalagem(info.nextLine());

        System.out.print("\n** Cadastro efetuado com sucesso! A melhor indicação para sua empresa é a parceira: Industria de Plasticos\n");
        System.out.print("\n----- Deseja continuar o cadastro -----? (S / N): ");
        cadUm.setSim(info.nextLine());

        CadEmpresa cadDois = new CadEmpresa("", "", "");

        System.out.print("Digite o cnpj da empresa: ");
        cadDois.setCnpj(info.nextLine());
        System.out.print("Digite o razao social da empresa: ");
        cadDois.setNome(info.nextLine());
        System.out.print("Digite o tipo de embalagem da empresa: ");
        cadDois.setEmbalagem(info.nextLine());

        info.close();

    }
}

class CadCliente {
    private String numero;
    private String nome;
    private String embalagem;
    private String sim;

    // Construtor
    public CadCliente (String numero, String nome, String embalagem, String sim) {
        this.numero = numero;
        this.nome = nome;
        this.embalagem = embalagem;
        this.sim = sim;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String toString() {
        return "\n\n-----------------------------\n Numero Cliente: " + numero + "\n Nome Cliente: " + nome
                + "\n Tipo de Embalagem: " + embalagem;
    }
}

class CadEmpresa {
    // private Aluga numero;
    private String cnpj;
    private String nome;
    private String embalagem;

    public CadEmpresa(String cnpj, String nome, String embalagem) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.embalagem = embalagem;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String toString() {
        return "-----------------------------\nCNPJ: " + cnpj + "\nNome: " + nome + "\nEmbalagem: " + embalagem;
    }
}