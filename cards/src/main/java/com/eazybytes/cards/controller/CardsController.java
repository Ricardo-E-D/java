/**
 * 
 */
package com.eazybytes.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.cards.config.CardsServiceConfig;
import com.eazybytes.cards.model.Cards;
import com.eazybytes.cards.model.Customer;
import com.eazybytes.cards.model.Properties;
import com.eazybytes.cards.repository.CardsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
public class CardsController {

	@Autowired
	private CardsRepository cardsRepository;
	
	@Autowired
	CardsServiceConfig cardsConfig;
	
	@GetMapping("/api/cards")
	@ResponseBody
	public List<Cards> getCardDetails(@RequestParam int customerId) {

		List<Cards> cards = cardsRepository.findByCustomerId(customerId);
		if (cards != null) {
			return cards;
		} else {
			return null;
		}
	}
	
	@GetMapping("/api/cards/properties")
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		Properties properties = new Properties(cardsConfig.getMsg(), cardsConfig.getBuildVersion(), cardsConfig.getMailDetails(), cardsConfig.getActiveBranches());
		String jsonStr = ow.writeValueAsString(properties);
		return jsonStr;
	}
}
