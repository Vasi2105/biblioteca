package dao;

import model.Autor;
import model.Carti;
import model.Clienti;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientiDao {
    static String connectionUrl = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String user = "root";
    private static final String password = "Ironman.2105";

    public Clienti findById(int id) {
        Clienti clienti = new Clienti();
        String query = "select id, nume, prenume, telefon, email, adresa " +
                "from clienti where id=" + id;
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                clienti.setId(resultSet.getInt(1));
                clienti.setNume(resultSet.getString(2));
                clienti.setPrenume(resultSet.getString(3));
                clienti.setTelefon(resultSet.getString(4));
                clienti.setEmail(resultSet.getString(5));
                clienti.setAdresa(resultSet.getString(6));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return clienti;
    }


    public void save(Clienti clienti) {
        String query = "INSERT into clienti(nume, prenume, telefon, email, adresa) VALUES (?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, clienti.getNume());
            preparedStatement.setString(2, clienti.getPrenume());
            preparedStatement.setString(3, clienti.getTelefon());
            preparedStatement.setString(4, clienti.getEmail());
            preparedStatement.setString(5, clienti.getAdresa());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }

        public List<Clienti> getAll()

        {
            List<Clienti> clientis = new ArrayList<>();
            String query = "SELECT * From clienti";


            try {
                Connection connection = DriverManager.getConnection(connectionUrl, user, password);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    Clienti clienti = new Clienti();
                    clienti.setId(resultSet.getInt(1));
                    clienti.setNume(resultSet.getString(2));
                    clienti.setPrenume(resultSet.getString(3));
                    clienti.setTelefon(resultSet.getString(4));
                    clienti.setEmail(resultSet.getString(5));
                    clienti.setAdresa(resultSet.getString(6));

                    clientis.add(clienti);

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return clientis;

        }

    public void deleteById(int id ){

        String query="DELETE FROM clienti WHERE id=?";
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

