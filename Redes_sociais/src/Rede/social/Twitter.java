package Rede.social;

import Rede.social.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public void postarFoto(){
        System.out.println("Postou foto no twitter");
    }

    public void postarComentario(){
        System.out.println("Postou comentario no twitter");
    }
    public void postarVideo(){
        System.out.println("Postou video no twitter");
    }
    public void curtirPublicacao(){
        System.out.println("Curtiu publicacao no twitter");
    }
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no twitter");
    }
}
