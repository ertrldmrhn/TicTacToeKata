/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

 package com.example.project;

 import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Disabled;
 
class TicTacToeTests {
	
	@Test
	void gameStartsWithNineFields() {
		TicTacToe game = new TicTacToe();
		assertEquals(9, game.availableFieldsCount(), "There should be 9 available fields");
	}

	@Test
	void playerCanTakeAvailableField(){
		TicTacToe game = new TicTacToe();
		game.takeField(0);
		assertEquals("X", game.getField(0));
	};

	
}