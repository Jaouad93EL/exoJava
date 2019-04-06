public class DatabaseLogger {

    private MongoDB mongoDB;
    private PostgresDB postgresDB;
    private SqlDB sqlDB;

    public DatabaseLogger() {
	this.mongoDB = new MongoDB();
	this.postgresDB = new PostgresDB();
	this.sqlDB = new SqlDB();
    }

    public void logMongoDB() {this.mongoDB.showLogs();}
    public void logSqlDB() {this.sqlDB.showLogs();}
    public void logPostgresDb() {this.postgresDB.showLogs();}
}
