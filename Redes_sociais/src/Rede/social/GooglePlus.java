package Rede.social;

import Rede.social.Compartilhamento;
import Rede.social.RedeSocial;
import Rede.social.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public void postarFoto(){
        System.out.println("Postou foto no googleplus");
    }

    public void postarComentario(){
        System.out.println("Postou comentario no googleplus");
    }
    public void postarVideo(){
        System.out.println("Postou video no googleplus");
    }
    public void curtirPublicacao(){
        System.out.println("curtiu publicacao no googleplus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no googleplus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez video conferencia no googleplus");
    }
}
