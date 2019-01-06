package hu.kuncystem.dao.database;

import hu.kuncystem.pojo.database.Table;

/**
 * this for comment of classes
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Jan 6, 2019
 *  
 * @version 1.0
 */
abstract public class DefaultTableBuilder implements TableBuilder {
    protected DatabaseType databaseType;
    
    protected DatabaseType getType() {
        return databaseType; 
    }
}
