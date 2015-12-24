package com.bkula.sskirmish;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by bkula on 24.12.15.
 */
public class SplashScreen extends ScreenAdapter {

    private SpriteBatch batch;
    private Sprite texture;

    @Override
    public void show() {
        batch = new SpriteBatch();
        texture = new Sprite(new Texture("splash_screen.jpg"));
        texture.setPosition(Gdx.graphics.getWidth() / 2 - texture.getWidth() / 2, Gdx.graphics.getHeight() / 2 - texture.getHeight() / 2);
        // TODO: 24.12.15 scale texture
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        texture.draw(batch);
        batch.end();
    }
}
