package hu.kuncystem.dao.database;

import hu.kuncystem.pojo.database.Table;

/**
 * This interface create or alter the tables.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Jan 3, 2019
 *  
 * @version 1.0
 */
public interface TableBuilder {
    /**
     * Creating new table. If the table has already exists then this method will modify the table.
     * 
     * @param table Table POJO object which contains the table's definitions.
     * 
     * @return Table POJO object which contains the new table's data.
     * */
    abstract public Table create(Table table);
    
    /**
     * Delete table from database.
     * 
     * @param table Table POJO object which contains the table's definitions.
     * 
     * @return Table POJO object which contains the deleted table's data.
     * */
    abstract public Table delete(Table table);
    
    /**
     * Alter table.
     * 
     * @param table Table POJO object which contains the table's definitions.
     * 
     * @return Table POJO object which contains the altered table's data.
     * */
    abstract public Table alter(Table table);
    
    /**
     * Check that the table if exists or not.
     * 
     * @param table Table POJO object which contains the table's definitions(table unique id).
     * 
     * @return If exists true otherwise false
     * */
    abstract public boolean exists(Table table);
    
    abstract public Table get(Table table);
}
