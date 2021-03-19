package ru.georgii265;

public interface ActionSquadOfRace {
    void upgrade(ActionSquadOfRace comrade);

    void degrade(ActionSquadOfRace enemy);

    void damage(int value);

    boolean isLive();

    boolean actionToTeam();

    public void skills(boolean up);
}
