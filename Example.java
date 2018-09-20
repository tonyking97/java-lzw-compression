import compression.lzw;

public class Example {

    public static void main(String[] args){

        lzw lzw_compression = new lzw();

        String OriginalString = "test example test test test test";

        System.out.println("Original String-> "+OriginalString);

        System.out.println("Original String length -> "+OriginalString.length());

        String compressed = lzw_compression.lzw_compress(OriginalString);

        System.out.println("Compressed String -> "+compressed);

        System.out.println("Compressed length String -> "+compressed.length());

        String decompressed = lzw_compression.lzw_extract(compressed);
        
        System.out.println("Decompressed String -> "+decompressed);

    }
}
