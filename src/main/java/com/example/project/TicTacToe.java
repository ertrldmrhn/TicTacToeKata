
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

 public class TicTacToe {
	private final String[] board = new String[9];
	public int availableFieldsCount() {
		int count = 0;
        for (String field : board) {
            if (field == null) {
                count++;
            }
        }
		return count;
	}

	public void takeField(int index){
		board[0] = "X";
	}

	public String getField(int index){
		return board[index];
	}
}
 

 