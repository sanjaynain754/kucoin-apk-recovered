package com.tencent.cloud.tuikit.engine.extension;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUILiveGiftManager {

    public interface GetGiftCountCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(long j11, long j12, long j13);
    }

    public interface GetGiftListCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(List<GiftCategory> list);
    }

    public interface GetLikesCountCallback {
        void onError(TUICommonDefine.Error error, String str);

        void onSuccess(long j11);
    }

    public static class GiftCategory {
        public String categoryId;
        public String desc;
        public Map<String, String> extensionInfo;
        public List<GiftInfo> giftList;
        public String name;
    }

    public static class GiftInfo {
        public long coins;
        public String desc;
        public Map<String, String> extensionInfo;
        public String giftId;
        public String iconUrl;
        public long level;
        public String name;
        public String resourceUrl;
    }

    public abstract void addObserver(Observer observer);

    public abstract void getGiftCountByAnchor(String str, GetGiftCountCallback getGiftCountCallback);

    public abstract void getGiftList(String str, GetGiftListCallback getGiftListCallback);

    public abstract void getLikesCount(String str, GetLikesCountCallback getLikesCountCallback);

    public abstract void removeObserver(Observer observer);

    public abstract void sendGift(String str, String str2, int i11, TUIRoomDefine.ActionCallback actionCallback);

    public abstract void sendLike(String str, int i11, TUIRoomDefine.ActionCallback actionCallback);

    public static abstract class Observer {
        public void onReceiveLikesMessage(String str, long j11, TUIRoomDefine.UserInfo userInfo) {
        }

        public void onGiftCountChanged(String str, long j11, long j12, long j13) {
        }

        public void onReceiveGiftMessage(String str, GiftInfo giftInfo, long j11, TUIRoomDefine.UserInfo userInfo) {
        }
    }
}
