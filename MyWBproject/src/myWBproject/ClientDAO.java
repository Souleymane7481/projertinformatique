package myWBproject; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {

    // Paramètres de connexion à la base de données Oracle
    final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    final static String LOGIN = "GMAO2024";
    final static String PASS = "1234";

    /**
     * Constructeur de la classe
     */
    public ClientDAO() {
        // Chargement du pilote de base de données Oracle
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Impossible de charger le pilote de BDD Oracle");
            e.printStackTrace();
        }
    }

    /**
     * Méthode pour ajouter un client dans la table clients
     * 
     * @param client le client à ajouter
     * @return le nombre de lignes ajoutées dans la table
     */
    public int ajouterClient(Client client) {
        Connection con = null;
        PreparedStatement ps = null;
        int retour = 0;

        try {
            con = DriverManager.getConnection(URL, LOGIN, PASS);
            ps = con.prepareStatement("INSERT INTO clients (nomEntreprise, numeroIFU, numeroRCCM, adresseEntreprise, codeAPE) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, client.getNomEntreprise());
            ps.setString(2, client.getNumeroIFU());
            ps.setString(3, client.getNumeroRCCM());
            ps.setString(4, client.getAdresseEntreprise());
            ps.setString(5, client.getCodeAPE());

            retour = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, ps, null);
        }
        return retour;
    }

    /**
     * Méthode pour récupérer un client à partir de son numéro IFU
     * 
     * @param numeroIFU le numéro IFU du client à récupérer
     * @return le client trouvé, ou null si aucun client ne correspond à ce numéro IFU
     */
    public Client getClientParNumeroIFU(String numeroIFU) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Client retour = null;

        try {
            con = DriverManager.getConnection(URL, LOGIN, PASS);
            ps = con.prepareStatement("SELECT * FROM clients WHERE numeroIFU = ?");
            ps.setString(1, numeroIFU);

            rs = ps.executeQuery();
            if (rs.next()) {
                retour = new Client(
                    rs.getString("nomEntreprise"),
                    rs.getString("numeroIFU"),
                    rs.getString("numeroRCCM"),
                    rs.getString("adresseEntreprise"),
                    rs.getString("codeAPE")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, ps, rs);
        }
        return retour;
    }

    /**
     * Méthode pour récupérer tous les clients stockés dans la table clients
     * 
     * @return une liste de clients
     */
    public List<Client> getListeClients() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Client> retour = new ArrayList<>();

        try {
            con = DriverManager.getConnection(URL, LOGIN, PASS);
            ps = con.prepareStatement("SELECT * FROM clients");
            rs = ps.executeQuery();

            while (rs.next()) {
                Client client = new Client(
                    rs.getString("nomEntreprise"),
                    rs.getString("numeroIFU"),
                    rs.getString("numeroRCCM"),
                    rs.getString("adresseEntreprise"),
                    rs.getString("codeAPE")
                );
                retour.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, ps, rs);
        }
        return retour;
    }

    /**
     * Méthode pour mettre à jour un client dans la table clients
     * 
     * @param client le client à mettre à jour
     * @return true si la mise à jour a réussi, false sinon
     */
    public boolean mettreAJourClient(Client client) {
        Connection con = null;
        PreparedStatement ps = null;
        boolean updated = false;

        try {
            con = DriverManager.getConnection(URL, LOGIN, PASS);
            ps = con.prepareStatement("UPDATE clients SET nomEntreprise = ?, numeroRCCM = ?, adresseEntreprise = ?, codeAPE = ? WHERE numeroIFU = ?");
            ps.setString(1, client.getNomEntreprise());
            ps.setString(2, client.getNumeroRCCM());
            ps.setString(3, client.getAdresseEntreprise());
            ps.setString(4, client.getCodeAPE());
            ps.setString(5, client.getNumeroIFU());

            int rowsUpdated = ps.executeUpdate();
            updated = rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, ps, null);
        }
        return updated;
    }

    /**
     * Méthode pour supprimer un client de la table clients à partir de son numéro IFU
     * 
     * @param numeroIFU le numéro IFU du client à supprimer
     * @return true si le client a été supprimé avec succès, false sinon
     */
    public boolean supprimerClient(String numeroIFU) {
        Connection con = null;
        PreparedStatement ps = null;
        boolean deleted = false;

        try {
            con = DriverManager.getConnection(URL, LOGIN, PASS);
            ps = con.prepareStatement("DELETE FROM clients WHERE numeroIFU = ?");
            ps.setString(1, numeroIFU);

            int rowsDeleted = ps.executeUpdate();
            deleted = rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, ps, null);
        }
        return deleted;
    }

    /**
     * Méthode utilitaire pour fermer la connexion, le statement et le result set
     * 
     * @param con la connexion à fermer
     * @param ps le statement à fermer
     * @param rs le result set à fermer
     */
    private void close(Connection con, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}