package com.travel.model;

import java.io.Serializable;

public class Answer implements Serializable {

	private static final long serialVersionUID = -6680528440245626462L;
	private int id;
	private int pathId;
	private int userId;
	private int score;

	public int getId() {
		return this.id;
	}

	public Answer setId(int id) {
		this.id = id;
		return this;
	}

	public int getPathId() {
		return this.pathId;
	}

	public Answer setPathId(int pathId) {
		this.pathId = pathId;
		return this;
	}

	public int getUserId() {
		return this.userId;
	}

	public Answer setUserId(int userId) {
		this.userId = userId;
		return this;
	}

	public int getScore() {
		return this.score;
	}

	public Answer setScore(int score) {
		this.score = score;
		return this;
	}

}
