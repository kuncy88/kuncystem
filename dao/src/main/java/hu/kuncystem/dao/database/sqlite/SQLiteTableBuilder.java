package hu.kuncystem.dao.database.sqlite;

import org.springframework.stereotype.Repository;

import hu.kuncystem.dao.database.TableBuilder;
import hu.kuncystem.pojo.database.Table;

/**
 * this for comment of classes
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Jan 6, 2019
 *  
 * @version 1.0
 */
@Repository("SQLiteBuilder")
public class SQLiteTableBuilder /*implements TableBuilder*/ {

    /* (non-Javadoc)
     * @see hu.kuncystem.dao.database.TableBuilder#create(hu.kuncystem.pojo.database.Table)
     */
    public Table create(Table table) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see hu.kuncystem.dao.database.TableBuilder#delete(hu.kuncystem.pojo.database.Table)
     */
    public Table delete(Table table) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see hu.kuncystem.dao.database.TableBuilder#alter(hu.kuncystem.pojo.database.Table)
     */
    public Table alter(Table table) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see hu.kuncystem.dao.database.TableBuilder#exists(hu.kuncystem.pojo.database.Table)
     */
    public boolean exists(Table table) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see hu.kuncystem.dao.database.TableBuilder#get(hu.kuncystem.pojo.database.Table)
     */
    public Table get(Table table) {
        // TODO Auto-generated method stub
        return null;
    }
}
