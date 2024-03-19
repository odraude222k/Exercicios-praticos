import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        //instancia do computador
        //Computador[] pc = new Computador[10];
        //instancia do cliente
        Cliente cliente = new Cliente("dudu",111111111);
        int i = 0;


        boolean flag = true;

        while (flag){
            System.out.println("Bem vindo a loja PCmania, qual promocao voce deseja?: ");
            System.out.println("1 - promocao 1");
            System.out.println("2 - promocao 2");
            System.out.println("3 - promocao 3");
            System.out.println("0 - para sair do programa");
            int op = cin.nextInt();
            switch (op){
                case 1:
                    cliente.pc[i] = new Computador();
                    cliente.pc[i].memousb = new MemoriaUSB(16);
                    cliente.pc[i].marca = "Positivo";
                    cliente.pc[i].preco = 3300.00f;
                    cliente.pc[i].hb.nome = "Pentium core i3 (2200Mhz) 8 GB de memoria RAM";
                    cliente.pc[i].hb.tipo = 500;
                    cliente.pc[i].op.nome = "Sistema operacional Linux Ubuntu";
                    cliente.pc[i].op.tipo = 32;
                    cliente.pc[i].memousb.nome = "Pendrive";
                    cliente.pc[i].memousb.capacidade = 16;
                    System.out.println("Deseja adicionar mais memoria USB? (1 - sim) (2 - nao)");
                    int mem = cin.nextInt();
                    if(mem == 1){
                        int novacapacidade = 16;
                        MemoriaUSB novamemoria = new MemoriaUSB(novacapacidade);
                        novamemoria.nome = "Pendrive";
                        cliente.pc[i].addMemoriaUSB(novamemoria,novacapacidade);
                    }
                    break;
                case 2:
                    cliente.pc[i] = new Computador();
                    cliente.pc[i].memousb = new MemoriaUSB(32);
                    cliente.pc[i].marca = "Acer";
                    cliente.pc[i].preco = 8800.00f;
                    cliente.pc[i].hb.nome = "Pentium core i5 (3370Mhz) 16 GB de memoria RAM";
                    cliente.pc[i].hb.tipo = 1000;
                    cliente.pc[i].op.nome = "Sistema operacional Windows 8 ";
                    cliente.pc[i].op.tipo = 64;
                    cliente.pc[i].memousb.nome = "Pendrive";
                    cliente.pc[i].memousb.capacidade = 32;
                    System.out.println("Deseja adicionar mais memoria USB? (1 - sim) (2 - nao)");
                    mem = cin.nextInt();
                    if(mem == 1){
                        int novacapacidade = 32;
                        MemoriaUSB novamemoria = new MemoriaUSB(novacapacidade);
                        cliente.pc[i].addMemoriaUSB(novamemoria,novacapacidade);
                    }
                    break;
                case 3:
                    cliente.pc[i] = new Computador();
                    cliente.pc[i].memousb = new MemoriaUSB(64);
                    cliente.pc[i].marca = "Vaio";
                    cliente.pc[i].preco = 4800.00f;
                    cliente.pc[i].hb.nome = "Pentium core i7 (4500Mhz) 32 GB de memoria RAM";
                    cliente.pc[i].hb.tipo = 2000;
                    cliente.pc[i].op.nome = "Sistema operacional Windows 10";
                    cliente.pc[i].op.tipo = 64;
                    cliente.pc[i].memousb.nome = "HD Externo";
                    cliente.pc[i].memousb.capacidade = 1000;
                    System.out.println("Deseja adicionar mais memoria USB? (1 - sim) (2 - nao)");
                    mem = cin.nextInt();
                    if(mem == 1){
                        int novacapacidade = 1000;
                        MemoriaUSB novamemoria = new MemoriaUSB(novacapacidade);
                        novamemoria.nome = "HD externo";
                        cliente.pc[i].addMemoriaUSB(novamemoria,novacapacidade);
                    }
                    break;
                case 0:
                    flag = false;
                    break;
            }
            i++;
        }
        System.out.println("Informacoes do cliente: ");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("PC's adquiridos: ");

        for (i = 0; i < cliente.pc.length; i++){
            if(cliente.pc[i] != null){
                cliente.pc[i].mostraPCConfigs();
            }
        }

        System.out.println("Preco total da compra $" + cliente.calculaTotalCompra());


    }
}