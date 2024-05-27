package Rede.social;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public void postarFoto(){
        System.out.println("Postar foto no Facebook");
    }

    public void postarComentario(){
        System.out.println("Postar comentario no Facebook");
    }
    public void postarVideo(){
        System.out.println("Postar video no Facebook");
    }
    public void curtirPublicacao(){
        System.out.println("Curtir publicacao no Facebook");
    }
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez um vide conferencia no Facebook");
    }
}
