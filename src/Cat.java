import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cat {
  public static void cat(String file) throws IOException {
    Path p = Paths.get(file);
    File f = p.toFile();

    if(f.isDirectory()){
      System.out.println(file + " is a directory)");
      return;
    }
    if(!f.exists()){
      System.out.println("No such file or directory");
      return;
    }

    String read = new String(Files.readAllBytes(p));
    StringReader sr = new StringReader(read);

    int c;
    while((c = sr.read()) != -1)
      System.out.print((char) c);

    sr.close();
    System.out.println();

  }
}
