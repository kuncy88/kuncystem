package hu.kuncystem.pojo.database;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Csaba Kun
 * @date 2018.11.05
 * */
public class Table {
	//unique table id
	private long id;
	
	//schema of table
	private String schema;
		
	//table name
	private String name;
	
	// size of table
	private int size = 0;
	
	//row number of table
	private int rowNumber = 0;
	
	//table description
	private String description = "";
	
	//field name list which we want to show if this table is an foreign table.
	private List<String> visitedField = new ArrayList<String>();
	
	private List<Field> fieldList = new ArrayList<>();
	
    //when this table was created by user
	private LocalDateTime created;
	
	//if is not null then exists modify follow table
	private Table modTable = null;
	/**
	 * Store data of database table information
	 * */
	public Table(long id) {
	    setId(id);
	}
	public Table(long id, String schema, String name) {
	    setId(id);
		setSchema(schema);
		setName(name);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getVisitedField() {
		return visitedField;
	}
	public void setVisitedField(List<String> visitedField) {
		this.visitedField = visitedField;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public Table getModTable() {
		return modTable;
	}
	public void setModTable(Table modTable) {
		this.modTable = modTable;
	}
	public List<Field> getFieldList() {
        return fieldList;
    }
    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }
}
