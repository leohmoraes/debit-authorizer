/*
 * This file is generated by jOOQ.
 */
package br.com.evandropires.debitauthorizer.jooq.tables;


import br.com.evandropires.debitauthorizer.jooq.Indexes;
import br.com.evandropires.debitauthorizer.jooq.Keys;
import br.com.evandropires.debitauthorizer.jooq.Public;
import br.com.evandropires.debitauthorizer.jooq.tables.records.DebitcardRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Debitcard extends TableImpl<DebitcardRecord> {

    private static final long serialVersionUID = -1306291424;

    /**
     * The reference instance of <code>public.debitcard</code>
     */
    public static final Debitcard DEBITCARD = new Debitcard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DebitcardRecord> getRecordType() {
        return DebitcardRecord.class;
    }

    /**
     * The column <code>public.debitcard.cardnumber</code>.
     */
    public final TableField<DebitcardRecord, BigDecimal> CARDNUMBER = createField("cardnumber", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.debitcard.agency</code>.
     */
    public final TableField<DebitcardRecord, Integer> AGENCY = createField("agency", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.debitcard.account</code>.
     */
    public final TableField<DebitcardRecord, Integer> ACCOUNT = createField("account", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.debitcard.status</code>.
     */
    public final TableField<DebitcardRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>public.debitcard</code> table reference
     */
    public Debitcard() {
        this(DSL.name("debitcard"), null);
    }

    /**
     * Create an aliased <code>public.debitcard</code> table reference
     */
    public Debitcard(String alias) {
        this(DSL.name(alias), DEBITCARD);
    }

    /**
     * Create an aliased <code>public.debitcard</code> table reference
     */
    public Debitcard(Name alias) {
        this(alias, DEBITCARD);
    }

    private Debitcard(Name alias, Table<DebitcardRecord> aliased) {
        this(alias, aliased, null);
    }

    private Debitcard(Name alias, Table<DebitcardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Debitcard(Table<O> child, ForeignKey<O, DebitcardRecord> key) {
        super(child, key, DEBITCARD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DEBITCARD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DebitcardRecord> getPrimaryKey() {
        return Keys.DEBITCARD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DebitcardRecord>> getKeys() {
        return Arrays.<UniqueKey<DebitcardRecord>>asList(Keys.DEBITCARD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Debitcard as(String alias) {
        return new Debitcard(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Debitcard as(Name alias) {
        return new Debitcard(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Debitcard rename(String name) {
        return new Debitcard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Debitcard rename(Name name) {
        return new Debitcard(name, null);
    }
}
