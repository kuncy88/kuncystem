package hu.kuncystem.dao.database;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hu.kuncystem.pojo.database.Field;
import hu.kuncystem.pojo.database.Table;

/**
 * this for comment of classes
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Jan 6, 2019
 *  
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DatabaseConfiguration.class })
public class PostgresTableBuilderTest {
    
    @Autowired
    @Qualifier("PostgresBuiler")
    private DefaultTableBuilder tableBuilder;
    
    @Test
    public void stage1CreateTableTest() {
        List<Field> fieldList = new ArrayList<>();
        Field field = new Field("id");
        field.setType(tableBuilder.getType().LongType);
       // field.setType(type);
        
        Table table = tableBuilder.create(new Table(-1, "public", "table_definition"));
        assertNotNull(table);
    }
}
