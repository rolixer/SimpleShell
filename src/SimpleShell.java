import java.io.IOException;
import java.util.Scanner;

public class SimpleShell {



  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    String command = new String();

    History history = new History();
    while(true){
      command = scanner.nextLine();

      //pwd
      if(command.startsWith("pwd")) Pwd.pwd();
      //ls
      else if(command.startsWith("ls")) Ls.ls();
      //cd
      else if(command.startsWith("cd")) {
        if(command.length() < 3){
          System.out.println("Needs an argument");
          continue;
        }
        Cd.cd(command.substring(3));
      }
      //cat
      else if(command.startsWith("cat")) {
        if(command.length() < 4){
          System.out.print("Needs an argument");
          continue;
        }
        Cat.cat(command.substring(4));
      }
      //history
      else if(command.startsWith("history")) history.list();
      //echo

      //exit
      else if(command.startsWith("exit")) System.exit(0);
      else continue;
      history.add(command);
    }
  }
}
