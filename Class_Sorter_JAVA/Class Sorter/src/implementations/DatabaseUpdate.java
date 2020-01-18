
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class Alter {

	public static void main(String[] args) throws SQLException {

		Object conn = Connection.class;
		{
			 String query = "INSERT INTO school.students (First_Name, Last_Name, Gender, Grade_Level, IEP, Disruptive_1to5_LowtoHigh, OffTask_1to5_LowtoHigh, Not_Responsible_1to5_LowtoHigh, Not_GetAlong_1to5_LowtoHigh) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			 PreparedStatement s = ((Connection) conn).prepareStatement(query);

			 		s.setInt(1, 1);
					s.setInt(1 , 1);
					s.setString(2, "Erich");
					s.setString(3, "Gamma");
					s.addBatch();

					s.setString(1, "2" );
					s.setString(2, "Richard");
					s.setString(3, "Helm");
					s.addBatch();

					s.setInt(1, 3);
					s.setString(2, "Ralph");
					s.setString(3, "Johnson");
					s.addBatch();

					int[] result = s.executeBatch();

					System.out.println(result + " were added to the database.");

		      }


		 }
		// Close conn and stmt - Done automatically by try-with-resources (JDK 7)

	}
