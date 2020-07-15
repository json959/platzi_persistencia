import java.sql.Connection;

public class app {

    public static void main(String[] arg) {

        Conexion connection = new Conexion();

        try (Connection cnx = connection.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
