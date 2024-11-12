public class EncryptionTool {
    private EncryptionMethod method;
    public EncryptionTool(EncryptionMethod met){
        method = met;
    }
    public void setMethod(EncryptionMethod met) {
        method = met;
    }
    public void encrypt(String str) {
        System.out.println(method.encrypt(str));
    }

}
