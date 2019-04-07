import java.io.File;

public class Ls {
  public static void ls() {
    File d = new File(System.getProperty("user.dir"));

    File[] list = d.listFiles();

    for ( File f: list){
      System.out.print(f.getName());
      if(f.isDirectory())
        System.out.print("/");

      System.out.println();
    }

  }
}
