import java.io.*;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList<Person>people =new ArrayList<Person>();
    people.add(new Person("Owen",20,"blue"));
    people.add(new Person("A",87,"pink"));
    people.add(new Person("B",13,"yellow"));
    people.add(new Person("C",55,"black"));
    people.add(new Person("D",4,"green"));
    String name="",age="",color="";

    try{
      FileWriter toWriteFile;
      toWriteFile = new FileWriter("data.txt");
      BufferedWriter output=new BufferedWriter(toWriteFile);
      for(int i=0; i<people.size();i++)
      {
        output.write(people.get(i).getName());
        output.newLine();
        output.write(people.get(i).getAge()+"");
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        output.flush();
      }
      output.close();
    }catch(IOException exception){
        System.out.println("Error: "+ exception);
      }

      try{
        FileReader myFile;
        myFile= new FileReader("data.txt");
        BufferedReader reader = new BufferedReader(myFile);
        while(reader.ready())
        {
          name=reader.readLine();
          age=reader.readLine()+"";
          color=reader.readLine();

          System.out.printf("%-10s %-10s %-10s %n",name,age,color);
        }
        reader.close();
      }catch(IOException exception){
        System.out.println("Error: "+ exception);
      }
    
  }
}