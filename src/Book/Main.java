package Book;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] arr = new ProgrammingBook[5];
        arr[0] = new ProgrammingBook(1, "A", 10, "Hung", "Tieng Viet", "C0223G1");
        arr[1] = new ProgrammingBook(2, "B", 20, "Son", "Tieng Nhat", "C0223G1");
        arr[2] = new ProgrammingBook(3, "C", 30, "Giang", "Tieng Anh", "C0223G1");
        arr[3] = new ProgrammingBook(4, "D", 40, "Nam", "Tieng Trung", "C0223G1");
        arr[4] = new ProgrammingBook(5, "E", 50, "Thi", "Tieng Campuchia", "C0223G1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }

        int sum1 = 0;
        int count = 0;
        String vt1 = "Vien Tuong 1";
        FictionBook[] arr1 = new FictionBook[5];
        arr1[0] = new FictionBook(6, "F", 130, "Hai", "Vien Tuong 1");
        arr1[1] = new FictionBook(7, "G", 110, "Tien", "Vien Tuong 2");
        arr1[2] = new FictionBook(8, "H", 20, "Trieu", "Vien Tuong 3");
        arr1[3] = new FictionBook(9, "J", 110, "DUng", "Vien Tuong 4");
        arr1[4] = new FictionBook(10, "F", 10, "HIeu", "Vien Tuong 1");
        for (int j = 0; j < arr1.length; j++) {
            sum1 += arr1[j].getPrice();
            if (arr1[j].getCategory().equals(vt1)) {
                count++;
            }

        }
        int total10Books = 0;
        total10Books = sum + sum1;
        System.out.println( "total10Books = " + total10Books);

        System.out.println("category : " + count);
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() < 100) {
                count1++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].getPrice() < 100) {
                count1++;
            }
        }
        System.out.println("The number of books with price less than 100 : " + count1);


    }
}