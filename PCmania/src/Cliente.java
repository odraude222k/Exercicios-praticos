public class Cliente {
    //variaveis do cliente
    String nome;
    long cpf;
    // instanciando o pc no cliente
    Computador[] pc = new Computador[10];
    // constructor para cliente
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    //calcula o total da compra
    float calculaTotalCompra(){
        float precototal = 0.0f;

        for(int i = 0; i < pc.length; i++){
            if(pc[i] != null){
                precototal += pc[i].preco;
            }
        }

        return precototal;
    }


}
