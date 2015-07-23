package kz.snakelario.entities;

import kz.snakelario.Textures;
import kz.snakelario.Vector2;

import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class SnakeBodyPart extends Sprite {
	public Vector2 direction = new Vector2();
	
	public SnakeBodyPart(float pX, float pY,
			Textures textures,
			VertexBufferObjectManager pSpriteVertexBufferObject) {
		super(pX, pY, textures.getSnakeBody(), pSpriteVertexBufferObject);
	}
}
