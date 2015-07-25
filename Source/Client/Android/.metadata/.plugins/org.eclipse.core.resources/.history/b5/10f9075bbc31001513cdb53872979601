package kz.snakelario;

import org.andengine.engine.Engine;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.ui.activity.BaseGameActivity;

import android.util.Log;

public class Textures implements Constants {
	private BitmapTextureAtlas mEntitiesTexture;
	private ITextureRegion mSnakeHeadTextureRegion;
	private ITextureRegion mSnakeBodyTextureRegion;
	
	public Textures(final BaseGameActivity activity, final Engine engine) {
	    mEntitiesTexture = new BitmapTextureAtlas(activity.getTextureManager(), 128, 128);
	    mSnakeHeadTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(mEntitiesTexture, activity, 
		    "snake_head.png", 0, 0);
	    mSnakeBodyTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(mEntitiesTexture, activity, 
	    	"snake_body.png", SNAKE_WIDTH + 1, 0);
	    mEntitiesTexture.load();
	  }
	  
	  public ITextureRegion getSnakeHead() {
		  return mSnakeHeadTextureRegion;
	  }
	  
	  public ITextureRegion getSnakeBody() {
		  return mSnakeBodyTextureRegion;
	  }
}
