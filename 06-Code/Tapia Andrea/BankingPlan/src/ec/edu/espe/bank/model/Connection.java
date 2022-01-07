package ec.edu.espe.bank.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Andrea Tapia
 */
public class Connection {

    ConnectionString connectionString = new ConnectionString("mongodb+srv://atapiaa:080301@clusteroop.t2zfe.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("BankingPlan");

    public MongoDatabase obtenerDB() {
        return database;
    }
}