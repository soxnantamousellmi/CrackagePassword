



public interface PasswordCracker{
    public String trouverMdpSimple(String motDePasse);
    public String trouverMdpHash(String hash) throws Exception;
}
//   public class Main {
//     public static void main(String[] args) {
//         PasswordCrackerFactory factory = new PasswordCrackerFactory();
//         PasswordCracker dictionaryCracker = factory.createPasswordCracker(CrackingMethod.DICTIONARY);
//         PasswordCracker bruteForceCracker = factory.createPasswordCracker(CrackingMethod.BRUTE_FORCE);

//         // Utilisez les instances de PasswordCracker selon vos besoins
//         String dictionaryResult = dictionaryCracker.trouverMdpSimple("password");
//         String bruteForceResult = bruteForceCracker.trouverMdpSimple("password");

//         // Faites ce que vous souhaitez avec les résultats
//         System.out.println("Dictionary Cracker result: " + dictionaryResult);
//         System.out.println("Brute Force Cracker result: " + bruteForceResult);
//     }


 