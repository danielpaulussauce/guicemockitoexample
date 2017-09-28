package main.services;

import main.annoyingdepencies.AnnonyDependency1;

public class Database implements IDatabase {
    public void printTables() {
        System.out.println("All the database tables");
    }

    public AnnonyDependency1 dependency() {
        return null;
    }
}
