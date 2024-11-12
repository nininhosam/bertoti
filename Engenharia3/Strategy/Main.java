class Strategy {
    public static void main (String[] args){
        EncryptionTool tool = new EncryptionTool(new Atbash());
        tool.encrypt("The Quick Brown Fox Jumps Over The Lazy Dog");

        tool.setMethod(new A1Z26());
        tool.encrypt("The Quick Brown Fox Jumps Over The Lazy Dog");

        tool.setMethod(new Caesar());
        tool.encrypt("The Quick Brown Fox Jumps Over The Lazy Dog");
    }
}