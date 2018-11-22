/*
 * This file is generated by jOOQ.
 */
package br.com.evandropires.debitauthorizer.jooq.tables.records;


import br.com.evandropires.debitauthorizer.jooq.tables.Transaction;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TransactionRecord extends UpdatableRecordImpl<TransactionRecord> implements Record5<Integer, Integer, Integer, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 1770578331;

    /**
     * Setter for <code>public.transaction.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.transaction.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.transaction.agency</code>.
     */
    public void setAgency(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.transaction.agency</code>.
     */
    public Integer getAgency() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.transaction.accountnumber</code>.
     */
    public void setAccountnumber(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.transaction.accountnumber</code>.
     */
    public Integer getAccountnumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.transaction.transactionvalue</code>.
     */
    public void setTransactionvalue(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.transaction.transactionvalue</code>.
     */
    public BigDecimal getTransactionvalue() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.transaction.transactiondate</code>.
     */
    public void setTransactiondate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.transaction.transactiondate</code>.
     */
    public Timestamp getTransactiondate() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, BigDecimal, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, BigDecimal, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Transaction.TRANSACTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Transaction.TRANSACTION.AGENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Transaction.TRANSACTION.ACCOUNTNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Transaction.TRANSACTION.TRANSACTIONVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Transaction.TRANSACTION.TRANSACTIONDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAgency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getAccountnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getTransactionvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getTransactiondate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAgency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAccountnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getTransactionvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getTransactiondate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value2(Integer value) {
        setAgency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value3(Integer value) {
        setAccountnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value4(BigDecimal value) {
        setTransactionvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value5(Timestamp value) {
        setTransactiondate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionRecord
     */
    public TransactionRecord() {
        super(Transaction.TRANSACTION);
    }

    /**
     * Create a detached, initialised TransactionRecord
     */
    public TransactionRecord(Integer id, Integer agency, Integer accountnumber, BigDecimal transactionvalue, Timestamp transactiondate) {
        super(Transaction.TRANSACTION);

        set(0, id);
        set(1, agency);
        set(2, accountnumber);
        set(3, transactionvalue);
        set(4, transactiondate);
    }
}