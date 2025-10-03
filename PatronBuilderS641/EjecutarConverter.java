public class EjecutarConverter {
    public static void main(String[] args) {
        
        Converter ASCII =new ASCIIConverter();
        Converter PostScript = new PostscriptConverter();
        Converter PDF = new PDFConverter();


        Reader lector1 = new Reader("LINE", ASCII);
         lector1.parseInput();

        Reader lector2 = new Reader("TABLE", PDF);
        lector2.parseInput();


         Reader lector3 = new Reader("PRAGRAPH", PostScript);
         lector3.parseInput();
    }
    
}
