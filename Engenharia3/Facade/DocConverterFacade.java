public class DocConverterFacade {
    private FileLoader loader;
    private FormatParser parser;
    private FileConverter converter;
    private FileSaver saver;
    public DocConverterFacade(){
        this.loader = new FileLoader();
        this.parser = new FormatParser();
        this.converter = new FileConverter();
        this.saver = new FileSaver();
    }

    public void convertFile(String name, String outputFormat){
        System.out.println("\t* Começando a conversão de arquivos *");

        loader.load(name);
        parser.parse(name);
        converter.convert(outputFormat);
        saver.save(name, outputFormat);

        System.out.println("\t* Encerrando a conversão de arquivos *");
    }
}
