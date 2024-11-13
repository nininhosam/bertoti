class Facade {
    public static void main (String[] args){
        DocConverterFacade docConvert= new DocConverterFacade();
        docConvert.convertFile("file.png", ".jpg");
    }
}