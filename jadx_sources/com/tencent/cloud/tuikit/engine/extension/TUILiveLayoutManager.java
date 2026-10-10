package com.tencent.cloud.tuikit.engine.extension;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUILiveLayoutManager {

    public static class SeatLayout {
        public int canvasHeight;
        public int canvasWidth;
        public List<TUIRoomDefine.SeatFullInfo> seatList;
        public int templateId;
    }

    public abstract void addObserver(Observer observer);

    public abstract void removeObserver(Observer observer);

    public abstract void setLiveStreamLayoutInfo(String str, String str2, TUIRoomDefine.ActionCallback actionCallback);

    public static abstract class Observer {
        @Deprecated
        public void onLiveVideoLayoutChanged(String str, String str2) {
        }

        public void onSeatLayoutChanged(String str, SeatLayout seatLayout) {
        }
    }
}
