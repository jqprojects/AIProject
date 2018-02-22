package com.jerry.aiproject.ai;

import com.jerry.aiproject.data.TileMap;

/**
 * This interface is for GameObjects that
 * will be using AI algorithms generated 
 * paths to follow. It should be called
 * from the update method in the Game class.
 * @author Jerry
 */
public interface AIMovement {

	// Returns whether the goal node has been reached or not.
	boolean moveAlongPath(TileMap map, Path path);

}