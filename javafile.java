import java.io.*;
import java.util.Scanner;

public class javafile {
    public static void fileclass()throws Exception{
        File ujjawaltxt=new File("ujjawal.txt");

        if(!ujjawaltxt.exists()){
           ujjawaltxt.createNewFile();
        }

        FileWriter wr=new FileWriter(ujjawaltxt);
        System.out.println("write some code here for printing purpose ok just enter anythink for user input ");
        String userinput=new Scanner(System.in).nextLine();
        wr.write("ujjawal is in a way to become great coder ");
        wr.write("java is best for ujjawal ");

        wr.write(userinput);
        wr.flush();
        wr.close();
        wr=null; // alligible the wr variable for gc
        Runtime.getRuntime().gc(); //calling to garbage collector for exicution of the gc


        // now we can create the reader file for reading purpose ok

        FileReader fr=new FileReader(ujjawaltxt);
        char[] a=new char[(int)new File("ujjawal.txt").length()];
        fr.read(a);
        fr.close();


        //displaying the file content by using array foreach method

        for(char ch:a){
            System.out.print(ch);
        }
    }

    public static void BufferReader() throws IOException {
        File a=new File("ujjawal.txt");
        if(a.exists()){
            BufferedWriter bw=new BufferedWriter(new FileWriter(a));
            bw.write("hello ujjawal");
            bw.newLine();
            System.out.println("enter the line for user input ");
            bw.write(new Scanner(System.in).nextLine());
            bw.flush();
            bw.close();

            bw=null;
            Runtime.getRuntime().gc();
            System.out.println("did you want to see the text from the file you write right now ");

            boolean auth=new Scanner(System.in).nextBoolean();
            if(auth){
                BufferedReader br=new BufferedReader(new FileReader(a));
                while(br.ready())
                {
                    System.out.println(br.readLine());
                }
            }
            else{
                System.out.println("${goodbye}");
            }

        }
    }
    public static void printWriter(String filename) throws FileNotFoundException {
        PrintWriter a=new PrintWriter(filename);
        a.print("hello ujjawal how are you ");
        a.println("this is good to see you again ");
        a.println("here is how you can beat entire man generation ");
        System.out.println("data inserted successfully ");

    }


    public static void main(String[] args)throws Exception{
printWriter("bhumi.txt");
    }
}
