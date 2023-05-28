import java.util.Arrays;

public class BruteForceCracker implements PasswordCracker {
    public static void main(String[] args) throws Exception {
        BruteForceCracker bf = new BruteForceCracker();
       // bf.trouverMdpSimple("anta");
       String hash =Hasheur.hashMd5("aajk", "MD5");
        bf.trouverMdpHash(hash);
    }

    @Override
    public String trouverMdpSimple(String password) {
        String attempt = ""; // Tentative actuelle
        boolean pasEncore = true;

        while (pasEncore) {
            // Générer la prochaine tentative
            attempt = generateNextString(attempt);

            System.out.println("Essai : " + attempt); // Affichage de la tentative

            // Vérifier si la tentative correspond au mot de passe
            if (attempt.equals(password)) {
                System.out.println("Mot de passe trouvé : " + attempt);
                pasEncore = false;
            } else if (attempt.length() > password.length()) {
                // Le mot de passe généré est plus long que le mot de passe cible, terminer la recherche
                System.out.println("Mot de passe introuvable.");
                pasEncore = false;
            }
        }
        
        return attempt;
    }

    
    @Override
    public String trouverMdpHash(String hash) throws Exception {
        String attempt = ""; // Tentative actuelle
        boolean pasEncore = true;

        while (pasEncore) {
            // Générer la prochaine tentative
            attempt = generateNextString(attempt);
            String hashAttempt= Hasheur.hashMd5(attempt, "MD5");
            if (hashAttempt.equals(hash)) {
                System.out.println("Mot de passe trouvé : " + attempt);
                pasEncore = false;
            } else if (attempt.length() > hash.length()) {
                // Le mot de passe généré est plus long que le mot de passe cible, terminer la recherche
                System.out.println("Mot de passe introuvable.");
                pasEncore = false;
            }
    }
    return attempt;
}

    public static String generateNextString(String previous) {
        if (previous.equals("")) {
            return "a"; // Première tentative
        }

        char[] chars = previous.toCharArray();

        // Incrémenter le dernier caractère de la chaîne
        int index = chars.length - 1;
        while (index >= 0 && chars[index] == 'z') {
            chars[index] = 'a';
            index--;
        }
        if (index >= 0) {
            chars[index]++;
        } else {
            // Ajouter un nouveau caractère 'a' à la fin de la chaîne
            chars = Arrays.copyOf(chars, chars.length + 1);
            chars[chars.length - 1] = 'a';
        }

        return new String(chars);
    }

}
