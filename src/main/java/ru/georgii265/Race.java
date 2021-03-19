package ru.georgii265;


import java.util.Random;

/**
 * В этом классе описываю базовый фунуционал для классов наследников.
 * А производные классов будут реализовывать его функционал.
 */
public abstract class Race implements ActionSquadOfRace {
    private static final Random RM = new Random();
    private int hp;
    private final int hit;
    private boolean privilege = false;

    public Race(int hp, int hit) {
        this.hp = hp;
        this.hit = hit;
    }

    public void upgrade(ActionSquadOfRace comrade) {
        comrade.upgrade(comrade);
    }

    public void degrade(ActionSquadOfRace enemy) {
        enemy.damage((this.privilege ? 10 : 1) * this.hit);
    }

    public void damage(int value) {
        this.hp -= value;
    }

    public boolean isLive() {
        return this.hp > 0;
    }

    public boolean actionToTeam() {
        return false;
    }

    public void skills(boolean up) {
        this.privilege = up;
    }
}

