package com.company;

public class Main {

    public static void main(String[] args) {
	GameMap.show();
	GameMap.init();
	GameMap.show();
	GameMap.moveRight();
	GameMap.show();
    GameMap.moveLeft();
	GameMap.show();
    GameMap.moveUp();
	GameMap.show();
    GameMap.moveDown();
	GameMap.show();
	GameMap.placeMine();
	GameMap.show();
	GameMap.placedefects();
	GameMap.show();

    }
}
