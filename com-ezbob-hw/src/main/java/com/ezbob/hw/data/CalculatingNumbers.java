package com.ezbob.hw.data;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatingNumbers implements Serializable {

	private static final long serialVersionUID = -1974674616716665345L;
	private List<Integer> numbers;
	private Operator operator;
}