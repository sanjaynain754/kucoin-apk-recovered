package com.tencent.cloud.tuikit.engine.extension.internal;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::extension")
public class TUILiveListManagerJni {
    private long mNativeTUILiveListManagerJni;
    private HashMap<String, List<Integer>> mCategoryMap = new HashMap<>();
    private final List<TUILiveListManager.Observer> mObserverList = new CopyOnWriteArrayList();

    public static class ActionCallback {
        private TUIRoomDefine.ActionCallback mCallback;

        @CalledByNative("ActionCallback")
        public void onError(int i11, String str) {
            TUIRoomDefine.ActionCallback actionCallback = this.mCallback;
            if (actionCallback != null) {
                actionCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("ActionCallback")
        public void onSuccess() {
            TUIRoomDefine.ActionCallback actionCallback = this.mCallback;
            if (actionCallback != null) {
                actionCallback.onSuccess();
            }
        }

        public ActionCallback(TUIRoomDefine.ActionCallback actionCallback) {
            this.mCallback = actionCallback;
        }
    }

    public static class LiveInfo {
        private TUILiveListManager.LiveInfo mLiveInfo;

        @CalledByNative("LiveInfo")
        public int getActivityStatus() {
            return this.mLiveInfo.activityStatus;
        }

        @CalledByNative("LiveInfo")
        public String getBackgroundUrl() {
            return this.mLiveInfo.backgroundUrl;
        }

        @CalledByNative("LiveInfo")
        public int[] getCategoryList() {
            List<Integer> list = this.mLiveInfo.categoryList;
            if (list == null) {
                return new int[0];
            }
            int[] iArr = new int[list.size()];
            for (int i11 = 0; i11 < this.mLiveInfo.categoryList.size(); i11++) {
                iArr[i11] = this.mLiveInfo.categoryList.get(i11).intValue();
            }
            return iArr;
        }

        @CalledByNative("LiveInfo")
        public String getCoverUrl() {
            return this.mLiveInfo.coverUrl;
        }

        @CalledByNative("LiveInfo")
        public int getMaxSeatCount() {
            return this.mLiveInfo.maxSeatCount;
        }

        @CalledByNative("LiveInfo")
        public String getName() {
            return this.mLiveInfo.name;
        }

        @CalledByNative("LiveInfo")
        public String getNotice() {
            return this.mLiveInfo.notice;
        }

        @CalledByNative("LiveInfo")
        public String getRoomId() {
            return this.mLiveInfo.roomId;
        }

        @CalledByNative("LiveInfo")
        public int getSeatLayoutTemplateId() {
            return this.mLiveInfo.seatLayoutTemplateId;
        }

        @CalledByNative("LiveInfo")
        public int getSeatMode() {
            return this.mLiveInfo.seatMode.getValue();
        }

        @CalledByNative("LiveInfo")
        public boolean isMessageDisabledForAllUser() {
            return this.mLiveInfo.isMessageDisableForAllUser;
        }

        @CalledByNative("LiveInfo")
        public boolean isPublicVisible() {
            return this.mLiveInfo.isPublicVisible;
        }

        @CalledByNative("LiveInfo")
        public boolean isSeatEnabled() {
            return this.mLiveInfo.isSeatEnabled;
        }

        @CalledByNative("LiveInfo")
        public boolean keepOwnerOnSeat() {
            return this.mLiveInfo.keepOwnerOnSeat;
        }

        public LiveInfo(TUILiveListManager.LiveInfo liveInfo) {
            this.mLiveInfo = liveInfo;
        }
    }

    public static class LiveInfoCallback {
        private TUILiveListManager.LiveInfoCallback mCallback;

        @CalledByNative("LiveInfoCallback")
        public void onError(int i11, String str) {
            TUILiveListManager.LiveInfoCallback liveInfoCallback = this.mCallback;
            if (liveInfoCallback != null) {
                liveInfoCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("LiveInfoCallback")
        public void onSuccess(TUILiveListManager.LiveInfo liveInfo) {
            TUILiveListManager.LiveInfoCallback liveInfoCallback = this.mCallback;
            if (liveInfoCallback != null) {
                liveInfoCallback.onSuccess(liveInfo);
            }
        }

        public LiveInfoCallback(TUILiveListManager.LiveInfoCallback liveInfoCallback) {
            this.mCallback = liveInfoCallback;
        }
    }

    public static class LiveInfoListCallback {
        private TUILiveListManager.LiveInfoListCallback mCallback;

        @CalledByNative("LiveInfoListCallback")
        public void onError(int i11, String str) {
            TUILiveListManager.LiveInfoListCallback liveInfoListCallback = this.mCallback;
            if (liveInfoListCallback != null) {
                liveInfoListCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("LiveInfoListCallback")
        public void onSuccess(TUILiveListManager.LiveInfoListResult liveInfoListResult) {
            TUILiveListManager.LiveInfoListCallback liveInfoListCallback = this.mCallback;
            if (liveInfoListCallback != null) {
                liveInfoListCallback.onSuccess(liveInfoListResult);
            }
        }

        public LiveInfoListCallback(TUILiveListManager.LiveInfoListCallback liveInfoListCallback) {
            this.mCallback = liveInfoListCallback;
        }
    }

    @CalledByNative
    public static TUILiveListManager.LiveInfo createLiveInfo(String str, String str2, int[] iArr, boolean z11, int i11, int i12, String str3, String str4, String str5, long j11, String str6, int i13, String str7, boolean z12, boolean z13, int i14, int i15, int i16, String str8, boolean z14) {
        TUIRoomDefine.RoomInfo roomInfo = new TUIRoomDefine.RoomInfo();
        roomInfo.roomId = str6;
        roomInfo.roomType = TUIRoomDefine.RoomType.fromInt(i13);
        roomInfo.name = str7;
        roomInfo.isMessageDisableForAllUser = z12;
        roomInfo.isSeatEnabled = z13;
        roomInfo.seatMode = TUIRoomDefine.SeatMode.fromInt(i15);
        roomInfo.maxSeatCount = i16;
        roomInfo.ownerId = str3;
        roomInfo.ownerName = str4;
        roomInfo.ownerAvatarUrl = str5;
        roomInfo.createTime = j11;
        TUILiveListManager.LiveInfo liveInfo = new TUILiveListManager.LiveInfo();
        liveInfo.roomId = str6;
        liveInfo.name = str7;
        liveInfo.notice = str8;
        liveInfo.isMessageDisableForAllUser = z12;
        liveInfo.isPublicVisible = z11;
        liveInfo.isSeatEnabled = z13;
        liveInfo.keepOwnerOnSeat = z14;
        liveInfo.maxSeatCount = i16;
        liveInfo.seatLayoutTemplateId = i14;
        liveInfo.seatMode = TUIRoomDefine.SeatMode.fromInt(i15);
        liveInfo.coverUrl = str;
        liveInfo.backgroundUrl = str2;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(Integer.valueOf(i17));
        }
        liveInfo.categoryList = arrayList;
        liveInfo.activityStatus = i11;
        liveInfo.ownerId = str3;
        liveInfo.ownerName = str4;
        liveInfo.ownerAvatarUrl = str5;
        liveInfo.createTime = j11;
        liveInfo.viewCount = i12;
        liveInfo.roomInfo = roomInfo;
        return liveInfo;
    }

    private static native void nativeFetchLiveList(long j11, String str, int i11, LiveInfoListCallback liveInfoListCallback);

    private static native void nativeGetLiveInfo(long j11, String str, LiveInfoCallback liveInfoCallback);

    private static native void nativeSetLiveInfo(long j11, LiveInfo liveInfo, int i11, ActionCallback actionCallback);

    private static native void nativeSetObserver(long j11, Object obj);

    @CalledByNative
    public TUILiveListManager.LiveInfoListResult createLiveInfoListResult(String str, String[] strArr, String[] strArr2, boolean[] zArr, int[] iArr, int[] iArr2, String[] strArr3, String[] strArr4, String[] strArr5, long[] jArr, String[] strArr6, int[] iArr3, String[] strArr7, boolean[] zArr2, boolean[] zArr3, int[] iArr4, int[] iArr5, int[] iArr6, String[] strArr8, boolean[] zArr4) {
        TUILiveListManager.LiveInfoListResult liveInfoListResult = new TUILiveListManager.LiveInfoListResult();
        liveInfoListResult.liveInfoList = new ArrayList();
        liveInfoListResult.cursor = str;
        for (int i11 = 0; i11 < strArr6.length; i11++) {
            TUIRoomDefine.RoomInfo roomInfo = new TUIRoomDefine.RoomInfo();
            roomInfo.roomId = strArr6[i11];
            roomInfo.roomType = TUIRoomDefine.RoomType.fromInt(iArr3[i11]);
            roomInfo.name = strArr7[i11];
            roomInfo.isMessageDisableForAllUser = zArr2[i11];
            roomInfo.isSeatEnabled = zArr3[i11];
            roomInfo.seatMode = TUIRoomDefine.SeatMode.fromInt(iArr5[i11]);
            roomInfo.maxSeatCount = iArr6[i11];
            roomInfo.ownerId = strArr3[i11];
            roomInfo.ownerName = strArr4[i11];
            roomInfo.ownerAvatarUrl = strArr5[i11];
            roomInfo.createTime = jArr[i11];
            TUILiveListManager.LiveInfo liveInfo = new TUILiveListManager.LiveInfo();
            liveInfo.roomId = strArr6[i11];
            liveInfo.name = strArr7[i11];
            liveInfo.notice = strArr8[i11];
            liveInfo.isMessageDisableForAllUser = zArr2[i11];
            liveInfo.isPublicVisible = zArr[i11];
            liveInfo.isSeatEnabled = zArr3[i11];
            liveInfo.keepOwnerOnSeat = zArr4[i11];
            liveInfo.maxSeatCount = iArr6[i11];
            liveInfo.seatLayoutTemplateId = iArr4[i11];
            liveInfo.seatMode = TUIRoomDefine.SeatMode.fromInt(iArr5[i11]);
            liveInfo.coverUrl = strArr[i11];
            liveInfo.backgroundUrl = strArr2[i11];
            liveInfo.categoryList = this.mCategoryMap.containsKey(roomInfo.roomId) ? this.mCategoryMap.get(roomInfo.roomId) : new ArrayList<>();
            liveInfo.activityStatus = iArr[i11];
            liveInfo.ownerId = strArr3[i11];
            liveInfo.ownerName = strArr4[i11];
            liveInfo.ownerAvatarUrl = strArr5[i11];
            liveInfo.createTime = jArr[i11];
            liveInfo.viewCount = iArr2[i11];
            liveInfo.roomInfo = roomInfo;
            liveInfoListResult.liveInfoList.add(liveInfo);
        }
        this.mCategoryMap.clear();
        return liveInfoListResult;
    }

    private List<TUILiveListManager.Observer> copyOnReadListeners() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    @CalledByNative
    public static TUILiveListManager.LiveStatisticsData createLiveStatisticsData(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        TUILiveListManager.LiveStatisticsData liveStatisticsData = new TUILiveListManager.LiveStatisticsData();
        liveStatisticsData.totalViewers = i11;
        liveStatisticsData.totalGiftsSent = i12;
        liveStatisticsData.totalGiftCoins = i13;
        liveStatisticsData.totalUniqueGiftSenders = i14;
        liveStatisticsData.totalLikesReceived = i15;
        liveStatisticsData.totalMessageCount = i16;
        liveStatisticsData.liveDuration = i17;
        return liveStatisticsData;
    }

    public void addObserver(TUILiveListManager.Observer observer) {
        if (observer == null || this.mObserverList.contains(observer)) {
            return;
        }
        this.mObserverList.add(observer);
    }

    public void fetchLiveList(String str, int i11, TUILiveListManager.LiveInfoListCallback liveInfoListCallback) {
        nativeFetchLiveList(this.mNativeTUILiveListManagerJni, str, i11, new LiveInfoListCallback(liveInfoListCallback));
    }

    public void getLiveInfo(String str, TUILiveListManager.LiveInfoCallback liveInfoCallback) {
        nativeGetLiveInfo(this.mNativeTUILiveListManagerJni, str, new LiveInfoCallback(liveInfoCallback));
    }

    @CalledByNative
    public void onLiveInfoChanged(TUILiveListManager.LiveInfo liveInfo, int i11) {
        ArrayList arrayList = new ArrayList();
        TUILiveListManager.LiveModifyFlag liveModifyFlag = TUILiveListManager.LiveModifyFlag.NAME;
        if ((liveModifyFlag.getValue() & i11) != 0) {
            arrayList.add(liveModifyFlag);
        }
        TUILiveListManager.LiveModifyFlag liveModifyFlag2 = TUILiveListManager.LiveModifyFlag.NOTICE;
        if ((liveModifyFlag2.getValue() & i11) != 0) {
            arrayList.add(liveModifyFlag2);
        }
        TUILiveListManager.LiveModifyFlag liveModifyFlag3 = TUILiveListManager.LiveModifyFlag.DISABLE_MESSAGE;
        if ((liveModifyFlag3.getValue() & i11) != 0) {
            arrayList.add(liveModifyFlag3);
        }
        TUILiveListManager.LiveModifyFlag liveModifyFlag4 = TUILiveListManager.LiveModifyFlag.PUBLISH;
        if ((liveModifyFlag4.getValue() & i11) != 0) {
            arrayList.add(liveModifyFlag4);
        }
        TUILiveListManager.LiveModifyFlag liveModifyFlag5 = TUILiveListManager.LiveModifyFlag.TAKE_SEAT_MODE;
        if ((liveModifyFlag5.getValue() & i11) != 0) {
            arrayList.add(liveModifyFlag5);
        }
        TUILiveListManager.LiveModifyFlag liveModifyFlag6 = TUILiveListManager.LiveModifyFlag.COVER_URL;
        if ((liveModifyFlag6.getValue() & i11) != 0) {
            arrayList.add(liveModifyFlag6);
        }
        TUILiveListManager.LiveModifyFlag liveModifyFlag7 = TUILiveListManager.LiveModifyFlag.BACKGROUND_URL;
        if ((liveModifyFlag7.getValue() & i11) != 0) {
            arrayList.add(liveModifyFlag7);
        }
        TUILiveListManager.LiveModifyFlag liveModifyFlag8 = TUILiveListManager.LiveModifyFlag.CATEGORY;
        if ((liveModifyFlag8.getValue() & i11) != 0) {
            arrayList.add(liveModifyFlag8);
        }
        TUILiveListManager.LiveModifyFlag liveModifyFlag9 = TUILiveListManager.LiveModifyFlag.ACTIVITY_STATUS;
        if ((liveModifyFlag9.getValue() & i11) != 0) {
            arrayList.add(liveModifyFlag9);
        }
        TUILiveListManager.LiveModifyFlag liveModifyFlag10 = TUILiveListManager.LiveModifyFlag.SEAT_LAYOUT_TEMPLATE_ID;
        if ((i11 & liveModifyFlag10.getValue()) != 0) {
            arrayList.add(liveModifyFlag10);
        }
        Iterator<TUILiveListManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLiveInfoChanged(liveInfo, arrayList);
        }
    }

    @CalledByNative
    public void onLiveStatisticsChanged(String str, TUILiveListManager.LiveStatisticsData liveStatisticsData, int i11) {
        ArrayList arrayList = new ArrayList();
        TUILiveListManager.LiveStatisticsModifyFlag liveStatisticsModifyFlag = TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_VIEWERS;
        if ((liveStatisticsModifyFlag.getValue() & i11) != 0) {
            arrayList.add(liveStatisticsModifyFlag);
        }
        TUILiveListManager.LiveStatisticsModifyFlag liveStatisticsModifyFlag2 = TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_GIFTS_SENT;
        if ((liveStatisticsModifyFlag2.getValue() & i11) != 0) {
            arrayList.add(liveStatisticsModifyFlag2);
        }
        TUILiveListManager.LiveStatisticsModifyFlag liveStatisticsModifyFlag3 = TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_GIFT_COINS;
        if ((liveStatisticsModifyFlag3.getValue() & i11) != 0) {
            arrayList.add(liveStatisticsModifyFlag3);
        }
        TUILiveListManager.LiveStatisticsModifyFlag liveStatisticsModifyFlag4 = TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_UNIQUE_GIFT_SENDERS;
        if ((liveStatisticsModifyFlag4.getValue() & i11) != 0) {
            arrayList.add(liveStatisticsModifyFlag4);
        }
        TUILiveListManager.LiveStatisticsModifyFlag liveStatisticsModifyFlag5 = TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_LIKES_RECEIVED;
        if ((liveStatisticsModifyFlag5.getValue() & i11) != 0) {
            arrayList.add(liveStatisticsModifyFlag5);
        }
        TUILiveListManager.LiveStatisticsModifyFlag liveStatisticsModifyFlag6 = TUILiveListManager.LiveStatisticsModifyFlag.TOTAL_MESSAGE_COUNT;
        if ((i11 & liveStatisticsModifyFlag6.getValue()) != 0) {
            arrayList.add(liveStatisticsModifyFlag6);
        }
        Iterator<TUILiveListManager.Observer> it = copyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLiveStatisticsChanged(str, liveStatisticsData, arrayList);
        }
    }

    public void removeObserver(TUILiveListManager.Observer observer) {
        if (observer == null) {
            return;
        }
        this.mObserverList.remove(observer);
    }

    public void setLiveInfo(TUILiveListManager.LiveInfo liveInfo, int i11, TUIRoomDefine.ActionCallback actionCallback) {
        nativeSetLiveInfo(this.mNativeTUILiveListManagerJni, new LiveInfo(liveInfo), i11, new ActionCallback(actionCallback));
    }

    @CalledByNative
    public void stashLiveInfoCategoryList(String str, int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        this.mCategoryMap.put(str, arrayList);
    }

    public TUILiveListManagerJni(long j11) {
        this.mNativeTUILiveListManagerJni = j11;
        if (j11 != 0) {
            nativeSetObserver(j11, this);
        }
    }
}
