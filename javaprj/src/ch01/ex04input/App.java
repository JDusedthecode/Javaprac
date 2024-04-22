package ch01.ex04input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws IOException {
        
        int kor1 = 0;
        int kor2 = 0;
        int kor3 = 0;

        FileInputStream fis = new FileInputStream("res/kors.txt");
        int code = fis.read();

        System.out.println(code);//56 -> "56"
        System.out.printf("%c\n",code); //"8\n"
        System.out.write(code); //56 --> console -> '8'
        System.out.println("------------------");






        FileOutputStream fos = new FileOutputStream("res/kors.txt");
        PrintStream out = new PrintStream(fos);

        out.print(kor1);
        out.print(" ");
        out.print(kor2);
        out.print(" ");
        out.print(kor3);
        
        out.close();
        fos.close();


        System.out.println("┌─────────────────────┐");
        System.out.println("│     성적 출력       │");
        System.out.println("└─────────────────────┘");


        System.out.printf("kor1 : %d(%x)\n", kor1, kor1);
        System.out.printf("kor2 : %d\n", kor2);
        System.out.printf("kor3 : %d\n", kor3);
        
    }
    
}
