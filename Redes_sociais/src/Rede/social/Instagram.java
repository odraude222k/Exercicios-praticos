package Rede.social;

import Rede.social.RedeSocial;

public class Instagram extends RedeSocial {


    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public void postarFoto(){
        System.out.println("Postou foto no instagra ");
    }

    public void postarComentario(){
        System.out.println("Postou comentario no instagram");
    }
    public void postarVideo(){
        System.out.println("Postou video no instagram");
    }
    public void curtirPublicacao(){
        System.out.println("Curtiu publicacao no instagram");
    }

}
