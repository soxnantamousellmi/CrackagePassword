public class PasswordCrackerFactory {
    public PasswordCracker createPasswordCracker(String method) {
        switch (method) {
            case "DICTIONNARY":
                return new DictionnaryCracker();
            case "BRUTE_FORCE":
                return new BruteForceCracker();
            default:
                throw new IllegalArgumentException("methode de craquage invalide: " + method);
        }
    }
}
