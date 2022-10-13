public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 2;
        boolean varMi = false;

        for(int sayi : sayilar){
            if (sayi==aranacak){
                if(sayi==aranacak){
                    varMi = true;
                    break;
                }
            }
        }
        String mesaj ="";
        if(varMi){
            mesaj = "Sayi mevcuttur : "+aranacak;
            mesajVer(mesaj);
        }
        else {
            mesajVer("Sayi Mevcut Degildir "+aranacak);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}