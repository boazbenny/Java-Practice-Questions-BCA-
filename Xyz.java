import java.sql.*;

class Xyz {
		public static void main(String ar[])
		{
			String ch;
			ch=ar[0];
			int x;
			int choice=Integer.parseInt(ch);
			if(ar.length==0)
			{
				System.out.println("Please insert a query");

			}
			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:Thread");
				Statement st=con.createStatement();
				switch(choice)
			{
				case 1 :
						ResultSet rs=st.executeQuery("select * from STUDENT");
						while (rs.next()) {
							System.out.println(rs.getString(1));
							System.out.println(rs.getString(2));
							System.out.println(rs.getString(3));
						}
						rs.close();				
				break;
				case 2 :
						x=st.executeUpdate("INSERT into STUDENT (rollno,fname,city) VALUES (26,'ARJUN','Kottayam')");
						if(x==1)
						{
							System.out.println("Inserted sucessfully");
						}
						else{
							System.out.println("inserted unsucessfull");
						}

				break;
				case 3 :
						x=st.executeUpdate("delete from STUDENT where rollno=13");
						if(x==1)
						{
							System.out.println("Deleted sucessfully");
						}
						else{
							System.out.println("Deleted unsucessfull");
						}
				break;
				case 4:
						x=st.executeUpdate("update STUDENT set fname='Arjun' where rollno=13");
						if(x==1)
						{
							System.out.println("Updated sucessfully");
						}
						else{
							System.out.println("Updated unsucessfull");
						}
				break;
				default:
				System.out.println("Invalid day");
			}
			}catch(Exception e){
				System.out.println(e);
			}
		}
}