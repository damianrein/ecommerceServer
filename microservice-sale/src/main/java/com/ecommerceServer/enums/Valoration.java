package com.ecommerceServer.enums;

public enum Valoration {
	ONE_STARTS(1),
	TWO_STARTS(2),
	THREE_STARTS(3),
	FOUR_STARTS(4),
	FIVE_STARTS(5);
	
    private final int value;

    Valoration(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
