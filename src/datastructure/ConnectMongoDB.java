//package datastructure;
//
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//import static sun.plugin.javascript.navig.JSType.Document;
//
///**
// * Created by Asef on 8/21/2016.
// */
//public class ConnectMongoDB {
//    MongoDatabase mdb = null;
//
//    public MongoDatabase connectMongo(String databaseName){
//        MongoClient mClient = new MongoClient();
//        mdb = mClient.getDatabase(databaseName);
//        System.out.println("mongodb is connected");
//        return mdb;
//    }
//    public void insert(String collectionName,String type, String listName){
//        MongoCollection mCollection = mdb.getCollection(collectionName);
//        Document doc = new Document().append(type).append(listName);
//        mCollection.insertOne(doc);
//    }
//}
