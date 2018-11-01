package com.ezbob.hw.data;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Operator {
	PLUS("plus") {
		@Override
		public int apply(int num1, int num2) {
			return num1 + num2;
		}
	},
	MINUS("minus"){
		@Override
		public int apply(int num1, int num2) {
			return num1 - num2;
		}
	};
	
	private final String text;

    private Operator(String text) {
        this.text = text;
    }
    
    public abstract int apply(int num1, int num2);

    @JsonValue
	public String getText() {
		return text;
	}
}