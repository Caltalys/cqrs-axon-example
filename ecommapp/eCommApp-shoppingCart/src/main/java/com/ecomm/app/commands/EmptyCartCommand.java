package com.ecomm.app.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

public class EmptyCartCommand {

	@TargetAggregateIdentifier
	private String cartId;
	
	public EmptyCartCommand(String cartId){
		this.cartId = cartId;
	}

	public String getCartId() {
		return cartId;
	}
	
}
