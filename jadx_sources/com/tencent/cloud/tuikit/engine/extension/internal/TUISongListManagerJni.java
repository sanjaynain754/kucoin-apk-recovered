package com.tencent.cloud.tuikit.engine.extension.internal;

import com.tencent.cloud.tuikit.engine.extension.TUISongListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::extension")
public class TUISongListManagerJni {
    private long mNativeTUISongListManagerJni;
    private final List<TUISongListManager.Observer> mObserverList = new CopyOnWriteArrayList();

    private static native void nativeSetObserver(long j11, Object obj);

    @CalledByNative
    public static void addToList(List<TUISongListManager.SongInfo> list, TUISongListManager.SongInfo songInfo) {
        if (list == null || songInfo == null) {
            return;
        }
        list.add(songInfo);
    }

    @CalledByNative
    public static List<TUISongListManager.SongInfo> createArrayList() {
        return new ArrayList();
    }

    @CalledByNative
    public static TUISongListManager.SongInfo createSongInfo(String str, String str2, String str3, int i11, String str4, TUIRoomDefine.UserInfo userInfo) {
        TUISongListManager.SongInfo songInfo = new TUISongListManager.SongInfo();
        if (str == null) {
            str = "";
        }
        songInfo.songId = str;
        if (str2 == null) {
            str2 = "";
        }
        songInfo.songName = str2;
        if (str3 == null) {
            str3 = "";
        }
        songInfo.artistName = str3;
        songInfo.duration = i11;
        if (str4 == null) {
            str4 = "";
        }
        songInfo.coverUrl = str4;
        if (userInfo == null) {
            userInfo = new TUIRoomDefine.UserInfo();
        }
        songInfo.requester = userInfo;
        return songInfo;
    }

    @CalledByNative
    public static TUIRoomDefine.UserInfo createUserInfo(String str, String str2, String str3) {
        TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
        if (str == null) {
            str = "";
        }
        userInfo.userId = str;
        if (str2 == null) {
            str2 = "";
        }
        userInfo.userName = str2;
        if (str3 == null) {
            str3 = "";
        }
        userInfo.avatarUrl = str3;
        return userInfo;
    }

    public void addObserver(TUISongListManager.Observer observer) {
        if (observer == null || this.mObserverList.contains(observer)) {
            return;
        }
        this.mObserverList.add(observer);
    }

    @CalledByNative
    public void onPlayedListChanged(List<TUISongListManager.SongInfo> list) {
        Iterator<TUISongListManager.Observer> it = this.mObserverList.iterator();
        while (it.hasNext()) {
            it.next().onPlayedListChanged(list);
        }
    }

    public void removeObserver(TUISongListManager.Observer observer) {
        if (observer == null) {
            return;
        }
        this.mObserverList.remove(observer);
    }

    public TUISongListManagerJni(long j11) {
        this.mNativeTUISongListManagerJni = j11;
        if (j11 != 0) {
            nativeSetObserver(j11, this);
        }
    }

    @CalledByNative
    public void onWaitingListChanged(int i11, List<TUISongListManager.SongInfo> list) {
        TUISongListManager.SongListChangeReason songListChangeReasonFromInt = TUISongListManager.SongListChangeReason.fromInt(i11);
        Iterator<TUISongListManager.Observer> it = this.mObserverList.iterator();
        while (it.hasNext()) {
            it.next().onWaitingListChanged(songListChangeReasonFromInt, list);
        }
    }
}
