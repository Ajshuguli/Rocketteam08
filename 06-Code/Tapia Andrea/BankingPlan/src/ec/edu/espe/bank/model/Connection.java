<<<<<<< HEAD

=======
<<<<<<< HEAD
package ec.edu.espe.bank.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
>>>>>>> 1e7e49f98f94db6a6a08144df422a2cb6d36a438
package ec.edu.espe.bank.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
>>>>>>> 8b8e8d99f1ce479f9cf8d1f83f0f8d71de627031
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
<<<<<<< HEAD
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
=======
 * @author Sebas
 */
public class Connection {
    
        ConnectionString connectionString = new ConnectionString("mongodb+srv://SebasTar:1993dragonballz@clusteroop.vlogp.mongodb.net/ClusterOOP?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("BankingPlan");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
>>>>>>> 8b8e8d99f1ce479f9cf8d1f83f0f8d71de627031
