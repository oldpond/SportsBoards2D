package com.sportsboards2d;

import java.io.InputStream;
import java.util.List;

/**
 * Coded by Nathan King
 */

/**
 * Copyright 2011 5807400 Manitoba Inc. All rights reserved.
 */

public interface FeedParser{
	List<FormationObject> parseFormation(InputStream input);
	List<PlayerInfo> parsePlayers(InputStream input);
}