package com.sudokus.dominio;

import org.json.JSONException;
import org.json.JSONObject;
import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.jsonMessages.JSONable;

public class SudokuBoardMessage extends JSONMessage{
	@JSONable
	private String winner;

	public SudokuBoardMessage(String winner) {
		super(false);
		this.setWinner(winner);
	}

	public SudokuBoardMessage (JSONObject jso) throws JSONException {
		this(jso.getString("winner"));
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
}