package com.tencent.cloud.tuikit.engine.extension;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUISongListManager {

    public static class SongInfo {
        public String songId = "";
        public String songName = "";
        public String artistName = "";
        public String coverUrl = "";
        public int duration = 0;
        public TUIRoomDefine.UserInfo requester = new TUIRoomDefine.UserInfo();
    }

    public interface SongListCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(SongListResult songListResult);
    }

    public enum SongListChangeReason {
        UNKNOWN(0),
        ADD(1),
        REMOVE(2),
        ORDER_CHANGED(3);

        private final int mValue;

        public int getValue() {
            return this.mValue;
        }

        SongListChangeReason(int i11) {
            this.mValue = i11;
        }

        public static SongListChangeReason fromInt(int i11) {
            for (SongListChangeReason songListChangeReason : values()) {
                if (songListChangeReason.mValue == i11) {
                    return songListChangeReason;
                }
            }
            return UNKNOWN;
        }
    }

    public static class SongListResult {
        public String cursor = "";
        public int totalCount = 0;
        public List<SongInfo> songList = new ArrayList();
    }

    public abstract void addObserver(Observer observer);

    public abstract void addSong(List<SongInfo> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void getPlayedList(String str, int i11, SongListCallback songListCallback);

    public abstract void getWaitingList(String str, int i11, SongListCallback songListCallback);

    public abstract void playNextSong(TUIRoomDefine.ActionCallback actionCallback);

    public abstract void removeObserver(Observer observer);

    public abstract void removeSong(List<String> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void setNextSong(String str, TUIRoomDefine.ActionCallback actionCallback);

    public static abstract class Observer {
        public void onPlayedListChanged(List<SongInfo> list) {
        }

        public void onWaitingListChanged(SongListChangeReason songListChangeReason, List<SongInfo> list) {
        }
    }
}
