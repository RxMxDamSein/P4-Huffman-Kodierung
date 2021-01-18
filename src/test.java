public class test {
    public static void main(String[] args) {
        Huffman huffman=new Huffman();
        Integer[] frequent=huffman.calculateFrequencies("ABRACADABRA");
        for(int i=0;i<frequent.length;i++){
            if(frequent[i]==0)
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

        Huffman huffman2=new Huffman();
        huffman2.calculateFrequencies(null);
        huffman2.constructPrefixCode(null);
        huffman2.constructPrefixCode(huffman2.calculateFrequencies("☻ é"));

        System.out.println(huffman2.canEncode("AAAAAAEEEEEEEEEFHHHHHMMNNNNNNNNUUUU"));
        String txt2= huffman2.encode("AAAAAAEEEEEEEEEFHHHHHMMNNNNNNNNUUUU",true);
        System.out.println(huffman2.canEncode("AAAAAAEEEEEEEEEFHHHHHMMNNNNNNNNUUUU"));
        System.out.println(huffman2.canEncode(null));
        huffman2.dumpPrefixCodes(false);
        huffman2.dumpPrefixCodes(true);
        System.out.println(huffman2.encode("HUFFMAN",false));
        System.out.println(huffman2.decode("111001000001111110000110"));
        System.out.println(huffman2.encode(null,true));
        System.out.println(huffman2.decode(null,wurzel));
        System.out.println(huffman2.decode("111001000001111110000110",wurzel));
        HNode wurzel2=new Huffman().constructPrefixCode(new Huffman().calculateFrequencies("AAAAAAEEEEEEEEEFHHHHHMMNNNNNNNNUUUU"));
        System.out.println(huffman2.decode("111001000001111110000110",wurzel2));
        System.out.println(huffman.encode("HUFFMAN",false));

        Huffman huffman3=new Huffman();
        System.out.println(huffman3.canEncode("LOL"));
        System.out.println(huffman3.decode("LOL"));
        HNode wurzel3 = huffman.constructPrefixCode(huffman.calculateFrequencies("CCCAAABBB"));
        Integer[] exampleFrequencies = new Integer[]{
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 3676, 3, 160, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 472, 1, 252, 8, 39, 38,
                18, 12, 13, 14, 13, 9, 9, 15, 45, 12,
                1, 1, 1, 18, 1, 23, 76, 110, 160, 62, // 65 = A
                66, 104, 19, 33, 9, 74, 148, 108, 402, 11,
                44, 1, 300, 270, 270, 12, 40, 62, 2, 11,
                42, 0, 0, 0, 0, 0, 0, 1164, 389, 593, // 97 = a
                832, 3186, 332, 525, 908, 1666, 46, 370, 739, 541,
                2010, 560, 220, 5, 1508, 1382, 1348, 648, 199, 313,
                13, 56, 214, 1, 1, 1, 1, 1
        };
        wurzel3=huffman3.constructPrefixCode(exampleFrequencies);
        System.out.println(huffman3.canEncode("lol"));
        System.out.println(huffman3.decode("01011001110011110101100",wurzel));
        System.out.println(huffman3.encode("",true));
    }
}
