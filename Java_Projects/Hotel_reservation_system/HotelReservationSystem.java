package Hotel_reservation_system;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;



public class HotelReservationSystem {
    private static final String url="jdbc:mysql://localhost:3306/hotel_db";
    private static final String username="root";
    private static final String password="Adiat123";


    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection connection=DriverManager.getConnection(url,username,password);
            while (true){
                System.out.println();
                System.out.println("hotel management system");
                Scanner sc=new Scanner(System.in);
                System.out.println("1. reserve a room");
                System.out.println("2. view reservation");
                System.out.println("3. get room number");
                System.out.println("4. update reservation");
                System.out.println("5. delete reservation");
                System.out.println("6. exit");
                System.out.println("choose an option");
                int choice=sc.nextInt();
                switch (choice){
                    case 1:
                        reservation(connection,sc);
                        break;
                    case 2:
                        viewReservation(connection);
                        break;
                    case 3:
                        getRoomNumber(connection,sc);
                        break;
                    case 4:
                        updateReservation(connection,sc);
                        break;
                    case 5:
                        deleteReservation (connection,sc);
                        break;
                    case 6:
                        exit();
                        sc.close();
                        return;
                    default:
                        System.out.println("invalid choice");




                }
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
    public static void reservation(Connection connection,Scanner sc){
        System.out.println("Enter name :");
        String guestname=sc.next();
        sc.nextLine();
        System.out.println("enter room num");
        int roomNum= sc.nextInt();
        System.out.println("enter contact");
        String contact= sc.next();

        String sql="insert into reservations (guest_name, room_number, contact_number)"
                +" values ('"+guestname+"', "+roomNum+", '"+contact+"')";
        try (Statement statement=connection.createStatement()){
                int affectedrows=statement.executeUpdate(sql);
                if (affectedrows >0){
                    System.out.println("reservation succesful");
                }
                else {
                    System.out.println("reservation fail");
                }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static void viewReservation(Connection connection) throws SQLException{
        String sql="select reservation_ud, guest_name, room_number, contact_number, reservation_date from reservations";

        try (Statement statement=connection.createStatement();ResultSet resultSet=statement.executeQuery(sql)){
            while (resultSet.next()){
                int reservationId=resultSet.getInt("reservation_ud");
                String gusetName=resultSet.getString("guest_name");
                int roomNumber=resultSet.getInt("room_number");
                String contactnumber=resultSet.getString("contact_number");
                String reservationdate= resultSet.getTimestamp("reservation_date").toString();

                System.out.printf("| %-14d | %-15s |%-13d | %-20s | %-19s |\n",reservationId,gusetName,roomNumber,contactnumber,reservationdate);
            }

        }
    }
    private static void getRoomNumber(Connection connection,Scanner sc){
        try {
            System.out.println("enter reservation id :");
            int reservationid=sc.nextInt();
            System.out.println("enter guset name: ");
            String guestName= sc.next();

            String sql="select room_number from reservations "+"where reservation_ud = "+reservationid
                       +" and guest_name = '"  +guestName+"'";
            try (Statement statement=connection.createStatement();ResultSet resultSet=statement.executeQuery(sql)) {
                if (resultSet.next()) {
                    int roomNumber =resultSet.getInt("room_number");
                    System.out.println("room number for reservation id "+reservationid+
                            "and guest "+guestName+" is :"+roomNumber);
                }else {
                    System.out.println("reservation not found for the given id");
                }
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
    private static void updateReservation(Connection connection,Scanner sc){
        try {
            System.out.println("enter reservation id ");
            int reservationid= sc.nextInt();
            sc.nextLine();
            if(!reservationExists(connection,reservationid)){
                System.out.println("not found ");
                return;
            }
            System.out.println("new guest name");
            String newGuestName= sc.next();
            System.out.println("enter new room name");
            int newRoom= sc.nextInt();
            System.out.println("new contact");
            String newContact= sc.next();

            String sql="update reservations set guest_name = '"+newGuestName+"', "
                    +"room_number = "+newRoom+", "+"contact_number = '"+newContact+"' "+
                    "where reservation_ud = "+reservationid;
            try (Statement statement=connection.createStatement()){
                int affcetedrows=statement.executeUpdate(sql);
                if(affcetedrows>0){
                    System.out.println("updated ");
                }else {
                    System.out.println("not updated");
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static void deleteReservation(Connection connection,Scanner sc){
        try {
            System.out.println("give id");
            int reservationId= sc.nextInt();
            if (!reservationExists(connection,reservationId)){
                System.out.println("reservation not found");
                return;
            }
            String sql="delete from reservations where reservation_ud = "+reservationId;
            try (Statement statement=connection.createStatement()){
                int affectedrows=statement.executeUpdate(sql);
                if (affectedrows>0){
                    System.out.println("successful");
                }else {
                    System.out.println("not success");
                }
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static boolean reservationExists(Connection connection,int reservationid){
            try {
                String sql="select reservation_ud from reservations where reservation_ud = "+reservationid;

                try (Statement statement=connection.createStatement();ResultSet resultSet=statement.executeQuery(sql)){
                    return resultSet.next();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
                return false;
            }
    }
    public static void exit() throws InterruptedException{
        System.out.println("exitiong system");
        int i=5;
        while (i!=0){
            System.out.print(".");
            Thread.sleep(450);
            i--;
        }
    }
}













