package Rede.social;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook("123",5000);
        Instagram instagram = new Instagram("456",2000);
        Twitter twitter = null;
        GooglePlus googlePlus = new GooglePlus("789", 500);

        Set<RedeSocial> hashredes = new HashSet<>();
        hashredes.add(facebook);
        hashredes.add(instagram);
        hashredes.add(twitter);
        hashredes.add(googlePlus);

        Usuario user = new Usuario(hashredes);
        user.setNome("Eduardo");
        user.setEmail("eduardo.bento@ges.inatel.br");

        user.mostraInfo();

    }
}