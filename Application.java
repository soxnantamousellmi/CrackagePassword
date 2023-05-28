import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application{
     public static void main(String[] args) throws Exception {
        // creation d'objets a partir de  la fabrique 
        PasswordCrackerFactory cracker = new PasswordCrackerFactory();
        //objet de type DictionnaryCracker
        PasswordCracker  findPassWithDictionnary = cracker.createPasswordCracker("DICTIONNARY");

        //objet de type BruteForceCracker
        PasswordCracker findPassWithBruteForce = cracker.createPasswordCracker("BRUTE_FORCE");
        //findPassWithDictionnary.trouverMdpSimple("mahan");
        //findPassWithBruteForce.trouverMdpSimple("aaaa");
        //findPassWithBruteForce.trouverMdpHash(Hasheur.hashMd5("anta", "MD5"));
        findPassWithDictionnary.trouverMdpHash(Hasheur.hashMd5("anta", "MD5"));

    }
}