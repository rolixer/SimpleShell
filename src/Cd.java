import java.io.File;
import java.io.IOException;

public class Cd {
  public static void cd(String path) throws IOException {

    File directory = new File(path).getAbsoluteFile();
    if (!directory.exists()) {
      System.out.println("No such directory");
      return;
    }
    if (!directory.isDirectory()){
      System.out.println(path + " is not a directory");
    return;
    }


      System.setProperty("user.dir", directory.getCanonicalPath());
  }
}
