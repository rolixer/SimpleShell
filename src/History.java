import java.util.LinkedList;

public class History {

  public History()  {
    history = new LinkedList<String>();
  }

  public void add(String toAdd) {
    history.add(toAdd);
  }

  public void list() {
    for (String entry: history) {
      System.out.println(entry);
    }
  }
  private LinkedList<String> history;
}
