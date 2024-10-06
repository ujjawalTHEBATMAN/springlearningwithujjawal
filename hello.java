import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class hello {
    public static void main(String[] args) throws Exception{
        System.out.println("hello ");
        File a=new File("ujjawalcreatetext.txt");
        a.createNewFile();
        System.out.println(a.exists());

        if(a.exists()){
            FileWriter temp=new FileWriter(a);
            temp.write("ujjawal this is text file where we had multiple types of the text ");
            temp.write("bhumi is great but it won't able to do the course of the harry");
            temp.flush();
            temp.close();
        }

        FileReader te=new FileReader(a);
        char[] arr=new char[(int)new File("ujjawalcreatetext.txt").length()];
        te.read(arr);


        // displaying the all text from the file called ujjawalcreatetext.txt

        for(char l:arr){
            System.out.print(l);
        }


    }
}
