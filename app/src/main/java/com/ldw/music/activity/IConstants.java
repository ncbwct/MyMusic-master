
package com.ldw.music.activity;

/**
 * 常量

 */
public interface IConstants {
	
	public static final String BROADCAST_NAME = "com.ldw.music.broadcast";
//    广播
	public static final String SERVICE_NAME = "com.ldw.music.service.MediaService";
//    服务
	public static final String BROADCAST_QUERY_COMPLETE_NAME = "com.ldw.music.querycomplete.broadcast";
//    广播查询完整
	public static final String BROADCAST_CHANGEBG = "com.ldw.music.changebg";
//    变换背景
	public static final String BROADCAST_SHAKE = "com.ldw.music.shake";
	
	//是否开启了振动模式
	public static final String SHAKE_ON_OFF = "SHAKE_ON_OFF";
//	震动开关
	public static final String SP_NAME = "com.ldw.music_preference";
//储存的名称
	public static final String SP_BG_PATH = "bg_path";
//    背景路径
	public static final String SP_SHAKE_CHANGE_SONG = "shake_change_song";
//    晃动换歌
	public static final String SP_AUTO_DOWNLOAD_LYRIC = "auto_download_lyric";
//    自动下载歌词
	public static final String SP_FILTER_SIZE = "filter_size";
//    过滤歌曲的大小
	public static final String SP_FILTER_TIME = "filter_time";
//    过滤歌曲的时间长度
	
	public final static int REFRESH_PROGRESS_EVENT = 0x100;



	// 播放器状态：
	public static final int MPS_NOFILE = -1; // 无音乐文件
	public static final int MPS_INVALID = 0; // 当前音乐文件无效
	public static final int MPS_PREPARE = 1; // 准备就绪
	public static final int MPS_PLAYING = 2; // 播放中
	public static final int MPS_PAUSE = 3; // 暂停

	// 播放器模式：
	public static final int MPM_LIST_LOOP_PLAY = 0; // 列表循环
	public static final int MPM_ORDER_PLAY = 1; // 顺序播放
	public static final int MPM_RANDOM_PLAY = 2; // 随机播放
	public static final int MPM_SINGLE_LOOP_PLAY = 3; // 单曲循环
	
	public static final String PLAY_STATE_NAME = "PLAY_STATE_NAME";
	public static final String PLAY_MUSIC_INDEX = "PLAY_MUSIC_INDEX";
	
	//歌手和专辑列表点击都会进入MyMusic 此时要传递参数表明是从哪里进入的
	public static final String FROM = "from";
	public static final int START_FROM_ARTIST = 1;
//    歌手
	public static final int START_FROM_ALBUM = 2;
//    专辑
	public static final int START_FROM_LOCAL = 3;
//我的音乐
	public static final int START_FROM_FOLDER = 4;
//    文件夹
	public static final int START_FROM_FAVORITE = 5;
//    我的最爱
	
	public static final int FOLDER_TO_MYMUSIC = 6;
	public static final int ALBUM_TO_MYMUSIC = 7;
	public static final int ARTIST_TO_MYMUSIC = 8;
	
	public static final int MENU_BACKGROUND = 9;


}
