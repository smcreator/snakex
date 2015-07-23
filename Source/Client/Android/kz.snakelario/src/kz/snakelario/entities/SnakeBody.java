package kz.snakelario.entities;

import java.util.ArrayList;
import java.util.LinkedList;

import kz.snakelario.Constants;
import kz.snakelario.Textures;
import kz.snakelario.Vector2;

import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class SnakeBody implements Constants {
	private Snake _snake;
	
	private ArrayList<SnakeBodyPart> _body;
	private Textures _textures;
	private VertexBufferObjectManager _vertexBufferObjectManager;
	
	public SnakeBody(Snake snake, Textures textures,
			VertexBufferObjectManager pSpriteVertexBufferObject) {
		_snake = snake;
		_body = new ArrayList<SnakeBodyPart>();
		_textures = textures;
		_vertexBufferObjectManager = pSpriteVertexBufferObject;
	}
	
	public void grow() {
		float x = 0;
		float y = 0;
		Vector2 direction;
		
		SnakeBodyPart firstPart = first();
		if (firstPart == null) {		
			x = _snake.getHead().getX();
			y = _snake.getHead().getY();
			direction = _snake.getHead().direction;						
		} else {
			x = firstPart.getX();
			y = firstPart.getY();
			direction = firstPart.direction;
		}
		Vector2 translate = direction.mul(SNAKE_WIDTH);
		Vector2 newPos = Vector2.sub(new Vector2(x, y), translate);		
		
		SnakeBodyPart bodyPart = new SnakeBodyPart(newPos.x, newPos.y, _textures, _vertexBufferObjectManager);
		bodyPart.direction = direction.copy();
		_body.add(0, bodyPart);
		_snake.attachChild(bodyPart);
	}
	
	public void clear() {
		for (int i = 0; i < _body.size(); i++) {
			_snake.detachChild(_body.get(i));
		}
		_body.clear();
	}
	
	public void move(boolean isTurned) {
		Vector2 headPos = Vector2.add(new Vector2(
			_snake.getHead().getX(), 
			_snake.getHead().getY()), 
			_snake.getHead().direction);
		_snake.getHead().setPosition(headPos.x, headPos.y);
		
		for (int i = 0; i < _body.size(); i++) {
			SnakeBodyPart bodyPart = _body.get(i);
			
			Vector2 pos = Vector2.add(new Vector2(bodyPart.getX(), bodyPart.getY()), bodyPart.direction);
			bodyPart.setPosition(pos.x, pos.y);
			
			if (isTurned) {
				SnakeBodyPart nextPart = i < _body.size() - 1 ? _body.get(i + 1) : null;
				if (nextPart != null)
					bodyPart.direction.set(nextPart.direction);
				else
					bodyPart.direction.set(_snake.getHead().direction);
			}
		}
	}
	
	public boolean selfCollision() {
		if (_body.size() == 0)
			return false;
		
		SnakeHead head = _snake.getHead();
		
		for (int i = 0; i < _body.size() - 1; i++) {
			SnakeBodyPart bodyPart = _body.get(i);
			if (bodyPart.contains(head.getX() + SNAKE_WIDTH * 0.6f, head.getY() + SNAKE_WIDTH * 0.6f))
				return true;
		}
		
		return false;
	}
	
	private SnakeBodyPart first() {
		if (_body.size() == 0)
			return null;
		return _body.get(0);
	}	
}