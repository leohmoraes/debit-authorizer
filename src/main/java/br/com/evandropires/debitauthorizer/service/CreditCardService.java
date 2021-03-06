package br.com.evandropires.debitauthorizer.service;

import br.com.evandropires.debitauthorizer.jooq.tables.records.DebitcardRecord;
import com.google.gson.JsonObject;

/**
 * Created by evandro on 14/11/2018.
 */
public class CreditCardService {

	private CreditCardProvider provider;

	public CreditCardService(CreditCardProvider provider) {
		this.provider = provider;
	}

	public JsonObject findCreditCard(Long cardNumber) {
		DebitcardRecord debitCard = provider.getCreditCardDAO().findCreditCard(cardNumber);
		if (debitCard == null) {
			return null;
		}
		JsonObject response = new JsonObject();
		response.addProperty("agency", debitCard.getAgency());
		response.addProperty("account", debitCard.getAccount());
		response.addProperty("cardNumber", debitCard.getCardnumber());
		response.addProperty("status", debitCard.getStatus());
		return response;
	}

}
