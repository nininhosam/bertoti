public class Caesar implements EncryptionMethod{
    @Override
    public String encrypt(String encrypted){
        char[] cArray = encrypted.toCharArray();
        StringBuilder decrypted = new StringBuilder();

        for (char c: cArray) {
            int i = c + 3;
            if ((i >= 91 && i <= 93) || (i>= 123 && i<= 125)) i -= 26;
            if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
                decrypted.append((char) i);
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
