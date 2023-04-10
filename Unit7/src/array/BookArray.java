package array;

import java.sql.ClientInfoStatus;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];   //Book 클래스 형으로 객체 배열 생성

        for(int i = 0; i <library.length; i++){
            System.out.println(library[i]);
        }

        library[0] = new Book("태백산맥","조정래");    //인스턴스 생성 후 배열에 저장
        library[1] = new Book("데미안","헤르만 헤세");
        library[2] = new Book("데미안","헤르만 헤세");
        library[3] = new Book("토지","박경리");
        library[4] = new Book("어린왕자","생텍쥐페리");

        for(int i =0; i <library.length; i++){
            library[i].showBookInfo();
        }
        for(int i=0; i < library.length; i++){
            System.out.println(library[i]);
        }
    }
}