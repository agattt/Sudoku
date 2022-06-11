package com.example.sudoku;

public class MainState {

    protected GameState currentState;

    public MainState() {

        this.currentState = new GameState();

    }

    public GameState getCurrentState() {

        return currentState;

    }

}
