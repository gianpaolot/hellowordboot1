package com.javacodegeeks.example;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

@Component

public class CancelIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AMAZON.CancelIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		return input.getResponseBuilder().withSpeech("Goodbye").withSimpleCard("HelloWorld", "Goodbye").build();
	}

}
