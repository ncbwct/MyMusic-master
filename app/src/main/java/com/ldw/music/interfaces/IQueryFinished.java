
package com.ldw.music.interfaces;

import com.ldw.music.model.MusicInfo;

import java.util.List;

public interface IQueryFinished {
	
	public void onFinished(List<MusicInfo> list);

}
