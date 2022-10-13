public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplamsonuc = dortIslem.Topla(10,10);
        System.out.println(toplamsonuc);

        int cikarsonuc = dortIslem.Cikar(10,5);
        System.out.println(cikarsonuc);

        int carpsonuc = dortIslem.Carp(5,5);
        System.out.println(carpsonuc);

        int bolsonuc = dortIslem.Bol(10,2);
        System.out.println(bolsonuc);
    }
}