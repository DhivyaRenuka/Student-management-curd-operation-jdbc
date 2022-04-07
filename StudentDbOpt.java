package StudentManagementApp;

import java.sql.*;

public class StudentDbOpt {
	public static int insertstudentToDB(Student st) {
		int affectedRows = 0;

		// dynamic insert query
		String SQL = "insert into student(sname,scity,course,sphone) values(?,?,?,?)";
		 
		try(Connection conn= ConnectionProvider.connect();
		PreparedStatement pstmt = conn.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {
			

			// set the values of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudnetCity());
			pstmt.setString(3, st.getCourse());
			pstmt.setString(4, Integer.toString(st.getStudentPhone()));

			// execute query using executeUpdate

			affectedRows = pstmt.executeUpdate();
			

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		return affectedRows;
	}

	public static int deleteStudent(int id) {
		String SQL = "DELETE FROM student WHERE sid = ?";

		int affectedrows = 0;

		try (Connection conn = ConnectionProvider.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {

			pstmt.setInt(1, id);

			affectedrows = pstmt.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return affectedrows;
	}

	public static int updatestudentToDB(Student st, int id) {
		String SQL = "UPDATE student " + "SET sname = ? , scity=? ,course=?,sphone=?" + "WHERE sid = ?";

		int affectedrows = 0;

		try (Connection conn = ConnectionProvider.connect(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {

			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudnetCity());
			pstmt.setString(3, st.getCourse());
			pstmt.setString(4, Integer.toString(st.getStudentPhone()));
			pstmt.setInt(5, id);

			affectedrows = pstmt.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return affectedrows;
	}

	public static void getDetails() {
		String SQL = "SELECT *from student";

		try (Connection conn = ConnectionProvider.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL)) {
			// display information
			while (rs.next()) {
				System.out.println(rs.getString("sid") + "\t" + rs.getString("sname") + "\t" + rs.getString("sphone")
						+ "\t" + rs.getString("course") + "\t" + rs.getString("scity"));

			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return;

	}

}
