package btvn4;

import java.util.ArrayList;
import java.util.Arrays;

public class bai1 {
    public static void main(String[] args) {
        String str = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi " +
                "Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. " +
                "Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến " +
                "bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng" +
                " để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh" +
                " nghiệp, J2ME cho các ứng dụng di động.";
        String[] words = str.split(" ");
        ArrayList<String> listWord = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        for (String word : words){
            if(listWord.contains(word)){
                int index = listWord.indexOf(word);
                counts.set(index, counts.get(index) + 1);
            }else {
                listWord.add(word);
                counts.add(1);
            }
        }
        for(int i = 0; i < listWord.size(); i++){
            System.out.println("Từ ("+listWord.get(i)+ ") xuất hiện: " + counts.get(i));
        }
    }

}
