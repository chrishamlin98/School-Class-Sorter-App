/*
EmiliaToday at 5:35 AM

Hmmm if I were to structure this one, I'd start off by having general
interfaces that exhibit common database operations. It's up to you if you
want this interface to be database agnostic (e.g: you can have mongodb
implementations and such), but the simplest thing you can have would be:
*/
package operations;

import javax.sql.DataSource;

public class App {

  public static void main(String[] args) {
  }

  public interface DatabaseRead {
    List<YourClassRepHere> findMultiple(Param param);
    List<YourClassRepHere> findOne(Param param);
  }

  public interface DatabaseUpdate {
    // filler

  }
  Public interface DatabaseSort {

  }
}
/*
and then you'll have specific implementation/s for these interfaces.
You can also have another interface to segregate the specific querying role,
like DatabaseQuery and have each of those interfaces above extend from it.
Also pretty sure there are better interface names than what I have on the
example, but I can't think of any atm so yeah, my apologies for that.
