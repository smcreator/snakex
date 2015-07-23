package kz.snakelario.entities;

import kz.snakelario.Textures;
import kz.snakelario.Vector2;

import org.andengine.entity.sprite.Sprite;
import org.andengine.entity.sprite.vbo.ISpriteVertexBufferObject;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class SnakeHead extends Sprite {
	public Vector2 direction = new Vector2();
	
	public SnakeHead(float pX, float pY,
			Textures textures,
			VertexBufferObjectManager pSpriteVertexBufferObject) {
		super(pX, pY, textures.getSnakeHead(), pSpriteVertexBufferObject);
	}
}
