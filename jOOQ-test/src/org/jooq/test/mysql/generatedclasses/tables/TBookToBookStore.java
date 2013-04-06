/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TBookToBookStore extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = 1897209899;

	/**
	 * The singleton instance of <code>test.t_book_to_book_store</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.mysql.generatedclasses.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord.class;
	}

	/**
	 * The column <code>test.t_book_to_book_store.book_store_name</code>. The book store name
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("book_store_name", org.jooq.impl.SQLDataType.VARCHAR.length(400), T_BOOK_TO_BOOK_STORE);

	/**
	 * The column <code>test.t_book_to_book_store.book_id</code>. The book ID
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * The column <code>test.t_book_to_book_store.stock</code>. The number of books on stock
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("stock", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super("t_book_to_book_store", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOK_TO_BOOK_STORE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOK_TO_BOOK_STORE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.mysql.generatedclasses.Keys.FK_B2BS_BS_NAME, org.jooq.test.mysql.generatedclasses.Keys.FK_B2BS_B_ID);
	}
}
