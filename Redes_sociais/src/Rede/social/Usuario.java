package Rede.social;

import Excecoes.MinimoDeRede;
import Excecoes.nullpointer;

import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    int contador = 0;
    Set<RedeSocial> redes;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(Set<RedeSocial> redes) {

        this.redes = redes;
    }


    public void mostraInfo(){
        System.out.println("Nome do usuario: " + this.nome);
        System.out.println("Email: " + this.email);

        for (RedeSocial redeSocial : redes){
            if(redeSocial != null){
                contador++;
            }
        }

        try{
            if(contador < 2){
                throw new MinimoDeRede("Nao tem redes sociais suficiente");
            }
        }catch (MinimoDeRede e){
            e.printStackTrace();
        }
        for (RedeSocial redeSocial : redes){

            try {
                if (redeSocial == null) {
                    throw new nullpointer("Valor nulo colocado");
                }
                if(redeSocial instanceof  GooglePlus){
                    GooglePlus gx = (GooglePlus) redeSocial;
                    gx.postarComentario();
                    gx.compartilhar();
                    gx.postarFoto();
                }
                if (redeSocial instanceof Facebook) {
                    Facebook fx = (Facebook) redeSocial;
                    fx.postarFoto();
                    fx.postarComentario();
                    fx.fazStreaming();
                }

                if (redeSocial instanceof Instagram) {
                    Instagram ix = (Instagram) redeSocial;
                    ix.curtirPublicacao();
                    ix.postarVideo();
                    ix.postarComentario();
                }
            }catch (nullpointer a){
                System.out.println(a);
            }
        }
    }
}
