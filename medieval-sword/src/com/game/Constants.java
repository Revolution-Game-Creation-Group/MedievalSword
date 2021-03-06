package com.game;

public class Constants {

	/* SCREENS */
	public static final int HOME_SCREEN = 0;
	public static final int MAP_SCREEN = 1;
	public static final int BATTLE_SCREEN = 2;

	/* SCREEN SIZE */
	public static final int SIZE_W = 1152;
	public static final int SIZE_H = 768;
	public static final int SCALE = 1;

	/* ORIENTATIONS */
	public static final int N_ORIENTATIONS = 4;
	public static final int MAP_ORIENTATIONS = 4;
	public static final int RIGHT = 0;
	public static final int LEFT = 1;
	public static final int TOP = 2;
	public static final int DOWN = 3;

	/* LANGUAGES */
	public static final int LANGUAGE_CODE_EN = 0;
	public static final int LANGUAGE_CODE_ES = 1;
	public static final String LANGUAGES [] = { "en", "es" };

	/* GENERAL */
	public static String LANGUAGE = "es";
	public static int LANGUAGE_CODE = LANGUAGE_CODE_ES;
	public static final int UNDEFINED = -1;
	public static final float FONT1_WIDTH = 7.7f;
	public static final int FONT1_HEIGHT = 8;

	/* BATTLE SIDES */
	public static final int LEFT_SIDE 	= 1;
	public static final int RIGHT_SIDE 	= 2;

	/* TEXTURES COLORS */
	public static final int N_COLORS = 3;
	public static final int GREY = 0;
	public static final int BLUE = 1;
	public static final int RED	 = 2;

	/* HUD */
	public static final int HUD_WIDTH = Constants.SIZE_W / 6;
	public static final int HUD_HEIGHT = Constants.SIZE_H;

	/* PLAYERS */
	public static final int NEUTRAL = 0;
	public static final int PLAYER_1 = 1;
	public static final int PLAYER_2 = 2;

	/* UNITS */
	public static final int VILLAGER = 11;
	public static final int ARCHER = 12;
	public static final int CRUSADER = 13;
	public static final int WIZARD = 14;
	public static final int KNIGHT = 15;

	/* GAME */
	public static final int WEEK_DAYS = 7;
	public static boolean MUSIC_ON = true;

	/* OBJECTIVES */
	public static final int OBJ_NOTHING = -1;
	public static final int OBJ_WIN = -2;
	public static final int OBJ_LOST = -3;

	/* MUSIC */
	public static final String MUSIC_MAP = "map_music";
	public static final String MUSIC_BATTLE = "battle_music";

	public static void setLanguage( int code ) {
		LANGUAGE_CODE = code;
		LANGUAGE = LANGUAGES[ code ];
	}
}
