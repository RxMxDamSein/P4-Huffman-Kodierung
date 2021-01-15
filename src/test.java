public class test {
    public static void main(String[] args) {
        Huffman huffman=new Huffman();
        Integer[] frequent=huffman.calculateFrequencies("ABRACADABRA");
        for(int i=0;i<frequent.length;i++){
            if(frequent[i]==null)
                continue;
            System.out.println((char)i+" - "+frequent[i]);
        }
        HNode wurzel= huffman.constructPrefixCode(frequent);
        //huffman.constructPrefixCode(frequent);
        huffman.dumpPrefixCodes(false);
        huffman.dumpPrefixCodes(true);
        String txt;
        System.out.println(txt=huffman.encode("ABRACADABRA",false));
        System.out.println(huffman.decode(txt,wurzel));
        System.out.println(huffman.decode(txt));
        System.out.println("Kann man mit einem Präfixbaum für ABRACADABRA EY enconden? "+((huffman.canEncode("EY"))?"ja":"nein"));
        System.out.println("Kann man mit einem Präfixbaum für ABRACADABRA BRA enconden? "+((huffman.canEncode("BRA"))?"ja":"nein"));
        System.out.println("Kann man mit einem Präfixbaum für ABRACADABRA abracadabra enconden? "+((huffman.canEncode("abracadabra"))?"ja":"nein"));
    }
}
