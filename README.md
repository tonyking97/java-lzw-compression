# java-lzw-compression
###This is the Implementation of LZW Compression in java

lzw.java file contains two methods named lzw_compress and lzw_extract which takes the input argument as String and returns a String.

###Compression Example:
```
lzw lzw_compression = new lzw();
String OriginalString = "String to compress";
String compressed = lzw_compression.lzw_compress(OriginalString);
```

###Decompression Example:
```
lzw lzw_compression = new lzw();
String compressed = ....
String decompressed = lzw_compression.lzw_extract(compressed);
```

###Do the following to run the Example.java file

Pull the repository by executing the below code in your terminal:
```
git clone https://github.com/tonyking97/java-lzw-compression.git & cd java-lzw-compression

```
Then Run the Example.java file by executing the below code in your terminal:
```
javac Example.java & java Example
```

