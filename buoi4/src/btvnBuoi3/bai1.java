package btvnBuoi3;

public class bai1 {
    public static void main(String[] args) {
    int tong = 200000;

    int tien1 = 1000;
    int tien2 = 2000;
    int tien3 = 5000;

    int tongSoTo1 = tong / tien1;
    int tongSoTo2 = tong / tien2;
    int tongSoTo3 = tong / tien3;

    tongSoTo(tien1,tien2,tien3, tong, tongSoTo1, tongSoTo2, tongSoTo3);
    }

    private static void tongSoTo(int tien1, int tien2, int tien3, int tong, int tongSoTo1, int tongSoTo2, int tongSoTo3) {
        for(int i = 1; i <= tongSoTo1;i++){
            for(int j = 1; j <= tongSoTo2;j++){
                for(int k = 1; k <= tongSoTo3;k++){

                    int tongTien1 = i * tien1;
                    int tongTien2 = j * tien2;
                    int tongTien3 = k * tien3;

                    int temp = tongTien1 + tongTien2 + tongTien3;
                    if(temp == tong){
                        System.out.println("Can "+ i + " tien " + tien1);
                        System.out.println("Can "+ j + " tien " + tien2);
                        System.out.println("Can "+ k + " tien " + tien3);
                        System.out.println("---------------------------------");
                    }
                }
            }
        }
    }
}
