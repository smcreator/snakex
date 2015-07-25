package kz.snakelario.entities;

import kz.snakelario.Textures;

import org.andengine.entity.Entity;
import org.andengine.entity.IEntityFactory;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class EntityFactory implements IEntityFactory<Entity> {
	private Textures _textures;
	private VertexBufferObjectManager _vertexBufferObjectManager;
	
	public EntityFactory(Textures textures, VertexBufferObjectManager vertexBufferObjectManager) {
		_textures = textures;
		_vertexBufferObjectManager = vertexBufferObjectManager;
	}
	
	@Override
	public Entity create(float pX, float pY) {
		// TODO Auto-generated method stub		
		return null;
	}
	
	public Snake createSnake(float pX, float pY, SnakeDirection direction) {
		return new Snake(pX, pY, direction, _textures, _vertexBufferObjectManager);
	}
	
}
