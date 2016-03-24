/**
 * This class is generated by jOOQ
 */
package com.example.project.db.mysql.tables;


import com.example.project.db.mysql.Aber;
import com.example.project.db.mysql.Keys;
import com.example.project.db.mysql.tables.records.UserRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class User extends TableImpl<UserRecord> {

	private static final long serialVersionUID = 1207795939;

	/**
	 * The reference instance of <code>aber.user</code>
	 */
	public static final User USER = new User();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserRecord> getRecordType() {
		return UserRecord.class;
	}

	/**
	 * The column <code>aber.user.id</code>.
	 */
	public static final TableField<UserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), USER, "");

	/**
	 * The column <code>aber.user.name</code>.
	 */
	public static final TableField<UserRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(200), USER, "");

	/**
	 * No further instances allowed
	 */
	private User() {
		this("user", null);
	}

	private User(String alias, Table<UserRecord> aliased) {
		this(alias, aliased, null);
	}

	private User(String alias, Table<UserRecord> aliased, Field<?>[] parameters) {
		super(alias, Aber.ABER, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<UserRecord, Integer> getIdentity() {
		return Keys.IDENTITY_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UserRecord> getPrimaryKey() {
		return Keys.KEY_USER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UserRecord>> getKeys() {
		return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY);
	}
}