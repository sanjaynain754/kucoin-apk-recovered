package com.tencent.cloud.tuikit.engine.extension;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUILiveListManager {

    public static class LiveInfo {
        public int activityStatus;
        public String backgroundUrl;
        public List<Integer> categoryList;
        public String coverUrl;
        public long createTime;
        public boolean isMessageDisableForAllUser;
        public boolean isPublicVisible;
        public boolean isSeatEnabled;
        public boolean keepOwnerOnSeat;
        public int maxSeatCount;
        public String name;
        public String notice;
        public String ownerAvatarUrl;
        public String ownerId;
        public String ownerName;
        public String roomId;

        @Deprecated
        public TUIRoomDefine.RoomInfo roomInfo;
        public int seatLayoutTemplateId;
        public TUIRoomDefine.SeatMode seatMode = TUIRoomDefine.SeatMode.FREE_TO_TAKE;
        public int viewCount;
    }

    public interface LiveInfoCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(LiveInfo liveInfo);
    }

    public interface LiveInfoListCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(LiveInfoListResult liveInfoListResult);
    }

    public static class LiveInfoListResult {
        public String cursor;
        public List<LiveInfo> liveInfoList;
    }

    public enum LiveModifyFlag {
        NONE(0),
        NAME(1),
        NOTICE(2),
        DISABLE_MESSAGE(4),
        PUBLISH(32),
        TAKE_SEAT_MODE(64),
        COVER_URL(128),
        BACKGROUND_URL(256),
        CATEGORY(512),
        ACTIVITY_STATUS(1024),
        SEAT_LAYOUT_TEMPLATE_ID(2048);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        LiveModifyFlag(int i11) {
            this.mValue = i11;
        }

        public static LiveModifyFlag fromInt(int i11) {
            for (LiveModifyFlag liveModifyFlag : values()) {
                if (liveModifyFlag.mValue == i11) {
                    return liveModifyFlag;
                }
            }
            return NONE;
        }
    }

    public interface LiveStatisticsCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(LiveStatisticsData liveStatisticsData);
    }

    public static class LiveStatisticsData {
        public int liveDuration;
        public int totalGiftCoins;
        public int totalGiftsSent;
        public int totalLikesReceived;
        public int totalMessageCount;
        public int totalUniqueGiftSenders;
        public int totalViewers;
    }

    public enum LiveStatisticsModifyFlag {
        NONE(0),
        TOTAL_VIEWERS(1),
        TOTAL_GIFTS_SENT(2),
        TOTAL_GIFT_COINS(4),
        TOTAL_UNIQUE_GIFT_SENDERS(8),
        TOTAL_LIKES_RECEIVED(16),
        TOTAL_MESSAGE_COUNT(32);

        int mValue;

        public int getValue() {
            return this.mValue;
        }

        LiveStatisticsModifyFlag(int i11) {
            this.mValue = i11;
        }

        public static LiveStatisticsModifyFlag fromInt(int i11) {
            for (LiveStatisticsModifyFlag liveStatisticsModifyFlag : values()) {
                if (liveStatisticsModifyFlag.mValue == i11) {
                    return liveStatisticsModifyFlag;
                }
            }
            return NONE;
        }
    }

    public interface StopLiveCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(LiveStatisticsData liveStatisticsData);
    }

    public abstract void addObserver(Observer observer);

    public abstract void fetchLiveList(String str, int i11, LiveInfoListCallback liveInfoListCallback);

    public abstract void getLiveInfo(String str, LiveInfoCallback liveInfoCallback);

    public abstract void getLiveStatistics(String str, LiveStatisticsCallback liveStatisticsCallback);

    public abstract void joinLive(String str, LiveInfoCallback liveInfoCallback);

    public abstract void leaveLive(TUIRoomDefine.ActionCallback actionCallback);

    public abstract void removeObserver(Observer observer);

    public abstract void setLiveInfo(LiveInfo liveInfo, List<LiveModifyFlag> list, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void startLive(LiveInfo liveInfo, LiveInfoCallback liveInfoCallback);

    public abstract void startPreloadVideoStream(String str, boolean z11, TUIVideoView tUIVideoView, TUIRoomDefine.PlayCallback playCallback);

    public abstract void stopLive(StopLiveCallback stopLiveCallback);

    public abstract void stopPreloadVideoStream(String str);

    public static abstract class Observer {
        public void onLiveInfoChanged(LiveInfo liveInfo, List<LiveModifyFlag> list) {
        }

        public void onLiveStatisticsChanged(String str, LiveStatisticsData liveStatisticsData, List<LiveStatisticsModifyFlag> list) {
        }
    }
}
