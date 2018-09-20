import compression.lzw;

public class Example {
    public static void main(String[] args){
        lzw enc = new lzw();
        String org = "test example test test test test";
        System.out.println("Original -> "+org);
        System.out.println("Original length -> "+org.length());
        String com = enc.lzw_compress(org);
        System.out.println("Compressed -> "+com);
        System.out.println("Compressed length -> "+com.length());
        String dcom = enc.lzw_extract(com);
        System.out.println("Decompressed -> "+dcom);
    }
}
