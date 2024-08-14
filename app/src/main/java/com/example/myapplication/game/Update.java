package com.example.myapplication.game;

/**
 * Interface zum Updaten des Games
 */
@FunctionalInterface
public interface Update
{
    /**
     * Updatemethode, die im Gameloop ausgeführt wird
     */
    public void update();
}
