import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DictionnaryCracker implements PasswordCracker{
    @Override
    public String trouverMdpHash(String hash) throws Exception{
        String dictionnaire = "facebook-firstnames.txt"; // Chemin du fichier dictionnaire
        String mdpATester = hash; // Mot de passe cible
        String mdpRetourner = "";
        
        boolean correspondanceTrouvee = false;

        try (BufferedReader br = new BufferedReader(new FileReader(dictionnaire))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String mot = ligne.trim();
                System.out.println("Comparaison avec : " + mot);
                String motDictionnaireHashe = Hasheur.hashMd5(mot, "MD5");
                
                if (motDictionnaireHashe.equals(mdpATester)) {
                    correspondanceTrouvee = true;
                    mdpRetourner = mot;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        // Afficher le résultat
        if (correspondanceTrouvee) {
            System.out.println(" trouvée !");
            
        } else {
            System.out.println("Cnon trouvée.");
            
        }
        return mdpRetourner;
        
    }
    
    // methode pour retrouver le mot de passe non hashe 
    @Override
    public String trouverMdpSimple(String motDePasse){

        String dictionnaire = "facebook-firstnames.txt"; // Chemin du fichier dictionnaire
        String mdpATester = motDePasse; // Mot de passe cible
        String mdpRetourner = "";
        
        boolean correspondanceTrouvee = false;

        try (BufferedReader br = new BufferedReader(new FileReader(dictionnaire))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String mot = ligne.trim();
                System.out.println("Comparaison avec : " + mot);
                
                if (mot.equals(mdpATester)) {
                    correspondanceTrouvee = true;
                    mdpRetourner = mot;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        // Afficher le résultat
        if (correspondanceTrouvee) {
            System.out.println(" trouvée !");
            
        } else {
            System.out.println(" non trouvée.");
            
        }
        return mdpRetourner;

    }

}