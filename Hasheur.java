import java.security.MessageDigest;

public class Hasheur {
    // public static void main(String[] args) throws Exception {
    //     Hasheur antash = new Hasheur();
    //     String hash1 = antash.hashMd5("rodudu", "MD5");
    //     String hash2 = antash.hashMd5("rodudu", "SHA-1");
    //     System.out.println(hash2.length());
    //     System.out.println(hash1.length());


    // }
    public static String hashMd5(String motAHacher, String method) throws Exception {
       
        String hash = "";

        MessageDigest md = MessageDigest.getInstance(method);
        md.update(motAHacher.getBytes());

        byte byteData[] = md.digest();

        // convertir le tableau de bits en une format hexadécimal - méthode 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        hash = sb.toString();
        return hash;
    }
}
