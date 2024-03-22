public class Computador {
    String marca;
    float preco;
    SistemaOperacional op;
    HardwareBasico[] hb;
    MemoriaUSB memousb;
    boolean aux = false;

    public Computador() {
        op = new SistemaOperacional();
        hb = new HardwareBasico[10];
    }
    // mostra as configuracoes do pc que adquiriu
    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Sistema operacional: " + op.nome);
        System.out.println("Tipo do sistema operacional: " + op.tipo);
        for (int i = 0; i < 3; i++){
            if(hb[i] != null){
                System.out.println(hb[i].nome + " " + hb[i].tipo);
            }
        }
        if(aux){
            System.out.println("Memoria USB: " + memousb.nome + " capacidade " + memousb.capacidade);
        }
        System.out.println("------------------------------");
    }
    //verifica se o usuario quer adicinar memoria ou nao
    void addMemoriaUSB(MemoriaUSB musb,int capacidade){
        memousb = musb;
        aux = true;
    }
}
