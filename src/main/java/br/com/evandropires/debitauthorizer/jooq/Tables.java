/*
 * This file is generated by jOOQ.
 */
package br.com.evandropires.debitauthorizer.jooq;


import br.com.evandropires.debitauthorizer.jooq.tables.Account;
import br.com.evandropires.debitauthorizer.jooq.tables.Balance;
import br.com.evandropires.debitauthorizer.jooq.tables.Debitcard;
import br.com.evandropires.debitauthorizer.jooq.tables.Provisionaldebit;
import br.com.evandropires.debitauthorizer.jooq.tables.Transaction;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.account</code>.
     */
    public static final Account ACCOUNT = br.com.evandropires.debitauthorizer.jooq.tables.Account.ACCOUNT;

    /**
     * The table <code>public.balance</code>.
     */
    public static final Balance BALANCE = br.com.evandropires.debitauthorizer.jooq.tables.Balance.BALANCE;

    /**
     * The table <code>public.debitcard</code>.
     */
    public static final Debitcard DEBITCARD = br.com.evandropires.debitauthorizer.jooq.tables.Debitcard.DEBITCARD;

    /**
     * The table <code>public.provisionaldebit</code>.
     */
    public static final Provisionaldebit PROVISIONALDEBIT = br.com.evandropires.debitauthorizer.jooq.tables.Provisionaldebit.PROVISIONALDEBIT;

    /**
     * The table <code>public.transaction</code>.
     */
    public static final Transaction TRANSACTION = br.com.evandropires.debitauthorizer.jooq.tables.Transaction.TRANSACTION;
}