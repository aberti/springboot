/**
 * This class is generated by jOOQ
 */
package com.example.project.db.mysql.tables;


import com.example.project.db.mysql.Aber;
import com.example.project.db.mysql.Keys;
import com.example.project.db.mysql.tables.records.BookStoreRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookStore extends TableImpl<BookStoreRecord> {

	private static final long serialVersionUID = 1811177902;

	/**
	 * The reference instance of <code>aber.book_store</code>
	 */
	public static final BookStore BOOK_STORE = new BookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BookStoreRecord> getRecordType() {
		return BookStoreRecord.class;
	}

	/**
	 * The column <code>aber.book_store.name</code>.
	 */
	public static final TableField<BookStoreRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), BOOK_STORE, "");

	/**
	 * No further instances allowed
	 */
	private BookStore() {
		this("book_store", null);
	}

	private BookStore(String alias, Table<BookStoreRecord> aliased) {
		this(alias, aliased, null);
	}

	private BookStore(String alias, Table<BookStoreRecord> aliased, Field<?>[] parameters) {
		super(alias, Aber.ABER, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BookStoreRecord> getPrimaryKey() {
		return Keys.KEY_BOOK_STORE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BookStoreRecord>> getKeys() {
		return Arrays.<UniqueKey<BookStoreRecord>>asList(Keys.KEY_BOOK_STORE_PRIMARY);
	}
}
