public class test {
    public static void main(String[] args) {
        Huffman huffman=new Huffman();
        Integer[] frequent=huffman.calculateFrequencies("ABRACADABRA");
        for(int i=0;i<frequent.length;i++){
            System.out.println((char)i+" - "+frequent[i]);
        }
        //HNode wurzel= huffman.constructPrefixCode(frequent);
        huffman.constructPrefixCode(frequent);
        System.out.println(huffman.encode("ABRACADABRA",false));
        huffman.dumpPrefixCodes(false);
        huffman.dumpPrefixCodes(true);
    }
}
