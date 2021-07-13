package bai6_kethua.BT.BaiTap_Book;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ProgrammingBook pb1 = new ProgrammingBook("pb001", "Code C##",
                1000, "AA", "C##", "programmingBook");
        ProgrammingBook pb2 = new ProgrammingBook("pb002", "Code javaCore",
                2000, "AB", "Java", "programmingBook");
        ProgrammingBook pb3 = new ProgrammingBook("pb003", "Code javaWed",
                3000, "AC", "Java", "programmingBook");
        ProgrammingBook pb4 = new ProgrammingBook("pb004", "Code javaScript",
                4000, "AD", "javaScript", "programmingBook");
        ProgrammingBook pb5 = new ProgrammingBook("pb005", "Code javaScript basic",
                5000, "AE", "html", "programmingBook");

        FictionBook fb1 = new FictionBook("fb01",
                "Tao", 1000, "AA", "hoa qua");
        FictionBook fb2 = new FictionBook("fb02",
                "Dua", 1100, "AA", "hoa qua");
        FictionBook fb3 = new FictionBook("fb03",
                "Chanh", 1200, "AA", "hoa qua");
        FictionBook fb4 = new FictionBook("fb04",
                "Quyt", 1300, "AA", "hoa qua");
        FictionBook fb5 = new FictionBook("fb05",
                "Cam", 1400, "AA", "hoa qua");

        Book[] arrBook = {pb1, pb2, pb3, pb4, pb5, fb1, fb2, fb3, fb4, fb5};

        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhan 1 de xem tong so tien :");
        scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arrBook.length; i++) {
            sum += arrBook[i].getPrice();
        }
        System.out.println(" Total price :" + sum + "\n");
        System.out.println(" Nhan 2 xem so lan sach co langguage Jvava xuat hien");
        scanner.nextInt();
        String a = "Java";
        int sum2 = 0;
        for (int i = 0; i < arrBook.length; i++) {
            if (arrBook[i]instanceof ProgrammingBook) {
                if ((((ProgrammingBook)arrBook[i]).getLanguage()).equals(a)){
                    sum2+=1;
                }
            }
        }
//        System.out.println(((ProgrammingBook)arrBook[2]).getLanguage().equals(a));
        System.out.println(sum2);

        System.out.println("Nhap ten cua cuon sach can tim  : ");
        String name = sc.nextLine();
        int index = -1;
        for (int i = 0; i < arrBook.length; i++) {
            if (arrBook[i].getName().equals(name)) {
                index = i;
                break;
            }
        }
        if(index == -1) System.out.println("khong co cuon sach can tim");
        else System.out.println(" Cuon sach " + arrBook[index].getName()
                + ", Co gia tien la :" + arrBook[index].getPrice() );
    }
}




