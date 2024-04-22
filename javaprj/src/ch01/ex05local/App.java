package ch01.ex05local;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        
        int kor1 = 0;
        int kor2 = 0;
        int kor3 = 0;

        //성적 로드
        {
            FileInputStream fis = new FileInputStream("res/kors.txt");
            Scanner scan = new Scanner(fis);

            kor1 = scan.nextInt(); // 85
            kor2 = scan.nextInt(); // 90
            kor3 = scan.nextInt(); // 90
            kor1++;

            scan.close();
            fis.close();
        }

        // 성적 입력
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("kor1:");
            kor1 =  scan.nextInt();
            System.out.print("kor2:");
            kor2 =  scan.nextInt();
            System.out.print("kor3:");
            kor3 =  scan.nextInt();

            scan.close();
        }

        // 성적 저장
        {
            FileOutputStream fos = new FileOutputStream("res/kors.txt");
            PrintStream out = new PrintStream(fos);

            out.print(kor1);
            out.print(" ");
            out.print(kor2);
            out.print(" ");
            out.print(kor3);
            
            out.close();
            fos.close();
        }

        // 성적 출력
        {
            System.out.println("┌─────────────────────┐");
            System.out.println("│     성적 출력       │");
            System.out.println("└─────────────────────┘");


            System.out.printf("kor1 : %d(%x)\n", kor1, kor1);
            System.out.printf("kor2 : %d\n", kor2);
            System.out.printf("kor3 : %d\n", kor3);
        }
    }
    
}
