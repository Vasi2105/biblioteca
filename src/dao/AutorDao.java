package dao;

import model.Autor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutorDao {
    static String connectionUrl = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String user = "root";
    private static final String password = "Ironman.2105";

    public Autor findById(int id) {
        Autor autor = new Autor();
        String query = "select id, nume, prenume " +
                "from autor where id=" + id;
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                autor.setId(resultSet.getInt(1));
                autor.setNume(resultSet.getString(2));
                autor.setPrenume(resultSet.getString(3));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return autor;


    }

    public void save(Autor autor) {
        String query = "INSERT into autor(nume, prenume) VALUES (?,?)";

        PreparedStatement preparedStatement = null;
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, autor.getNume());
            preparedStatement.setString(2, autor.getPrenume());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }


    }

    public List<Autor> getAll()

    {
        List<Autor> autors = new ArrayList<>();
        String query = "SELECT * From autor";


        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Autor autor = new Autor();
                autor.setId(resultSet.getInt(1));
                autor.setNume(resultSet.getString(2));
                autor.setPrenume(resultSet.getString(3));

                autors.add(autor);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return autors;

    }


    public void deleteById(int id ){

        String query="DELETE FROM autor WHERE id=?";
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}



