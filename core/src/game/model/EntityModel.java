package game.model;

public abstract class EntityModel {
	protected float x,y;
	protected float speed,yspeed;
	public enum ModelType{HERO, GUARD, OGRE,SLUG};
	public enum directionState{LEFT,RIGHT};
	protected directionState dir;
	
	public EntityModel(int x, int y){
		this.x = x;
		this.y = y;
		this.dir = directionState.RIGHT;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public float getSpeed() {
		return this.speed;
	}
	
	public float getYSpeed() {
		return this.yspeed;
	}
	
	public void setYSpeed(float ys2) {
		this.yspeed = ys2;
	}
	
	public directionState getDirection() {
		return this.dir;
	}
	
	public abstract ModelType getModelType();
	
	public void setPosition(float x2, float y2) {
		this.x = x2;
		this.y = y2;
	}
	
	public void setY(float y2) {
		this.y = y2;
	}
}
