package com.carsonak.solid;

import com.badlogic.gdx.Game;

/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all
 * platforms.
 */
public class SolidGame extends Game {
    @Override
    public void create() {
        setScreen(new FirstScreen());
    }
}
