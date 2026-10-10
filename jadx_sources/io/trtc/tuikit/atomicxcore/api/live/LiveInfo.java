package io.trtc.tuikit.atomicxcore.api.live;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.live2.impl.V2TXLiveProperty;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\bI\b\u0086\b\u0018\u00002\u00020\u0001:\u0001dBÕ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\u0010\u001dJ\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\fHÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\f0\u0013HÆ\u0003J\t\u0010Q\u001a\u00020\fHÆ\u0003J\t\u0010R\u001a\u00020\u0016HÆ\u0003J\t\u0010S\u001a\u00020\u0018HÆ\u0003J\t\u0010T\u001a\u00020\fHÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\u0015\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cHÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0007HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\t\u0010[\u001a\u00020\u0007HÆ\u0003J\t\u0010\\\u001a\u00020\u0007HÆ\u0003J\t\u0010]\u001a\u00020\fHÆ\u0003J\t\u0010^\u001a\u00020\u000eHÆ\u0003JÙ\u0001\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00072\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cHÆ\u0001J\u0013\u0010`\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\fHÖ\u0001J\t\u0010c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010.\"\u0004\b1\u00100R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010.\"\u0004\b2\u00100R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010.\"\u0004\b3\u00100R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010#\"\u0004\bC\u0010%R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010\u0019\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010!¨\u0006e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "", "liveID", "", "liveName", TUIConstants.TUIChat.NOTICE, "isMessageDisable", "", "isPublicVisible", TUIConstantDefine.IS_SEAT_ENABLE, "keepOwnerOnSeat", TUIConstantDefine.MAX_SEAT_COUNT, "", TUIConstantDefine.SEAT_MODE, "Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;", "seatLayoutTemplateID", "coverURL", "backgroundURL", "categoryList", "", "activityStatus", "liveOwner", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", TUIConstantDefine.CREATE_TIME, "", "totalViewerCount", "isGiftEnabled", "metaData", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZILio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;JIZLjava/util/Map;)V", "getActivityStatus", "()I", "setActivityStatus", "(I)V", "getBackgroundURL", "()Ljava/lang/String;", "setBackgroundURL", "(Ljava/lang/String;)V", "getCategoryList", "()Ljava/util/List;", "setCategoryList", "(Ljava/util/List;)V", "getCoverURL", "setCoverURL", "getCreateTime", "()J", "()Z", "setGiftEnabled", "(Z)V", "setMessageDisable", "setPublicVisible", "setSeatEnabled", "getKeepOwnerOnSeat", "setKeepOwnerOnSeat", "getLiveID", "setLiveID", "getLiveName", "setLiveName", "getLiveOwner", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "getMaxSeatCount", "setMaxSeatCount", "getMetaData", "()Ljava/util/Map;", V2TXLiveProperty.kV2SetMetaData, "(Ljava/util/Map;)V", "getNotice", "setNotice", "getSeatLayoutTemplateID", "setSeatLayoutTemplateID", "getSeatMode", "()Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;", "setSeatMode", "(Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;)V", "getTotalViewerCount", "setTotalViewerCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "ModifyFlag", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class LiveInfo {
    private int activityStatus;

    @NotNull
    private String backgroundURL;

    @NotNull
    private List<Integer> categoryList;

    @NotNull
    private String coverURL;
    private final long createTime;
    private boolean isGiftEnabled;
    private boolean isMessageDisable;
    private boolean isPublicVisible;
    private boolean isSeatEnabled;
    private boolean keepOwnerOnSeat;

    @NotNull
    private String liveID;

    @NotNull
    private String liveName;

    @NotNull
    private final LiveUserInfo liveOwner;
    private int maxSeatCount;

    @NotNull
    private Map<String, String> metaData;

    @NotNull
    private String notice;
    private int seatLayoutTemplateID;

    @NotNull
    private TakeSeatMode seatMode;
    private int totalViewerCount;

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo$ModifyFlag;", "", "rawValue", "", "(Ljava/lang/String;II)V", "getRawValue", "()I", "NONE", "LIVE_NAME", "NOTICE", "IS_MESSAGE_DISABLE", "IS_PUBLIC_VISIBLE", "SEAT_MODE", "COVER_URL", "BACKGROUND_URL", "CATEGORY_LIST", "ACTIVITY_STATUS", "SEAT_LAYOUT_TEMPLATE_ID", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public enum ModifyFlag {
        NONE(0),
        LIVE_NAME(1),
        NOTICE(2),
        IS_MESSAGE_DISABLE(4),
        IS_PUBLIC_VISIBLE(32),
        SEAT_MODE(64),
        COVER_URL(128),
        BACKGROUND_URL(256),
        CATEGORY_LIST(512),
        ACTIVITY_STATUS(1024),
        SEAT_LAYOUT_TEMPLATE_ID(2048);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final int rawValue;

        @NotNull
        public static EnumEntries<ModifyFlag> getEntries() {
            return $ENTRIES;
        }

        public final int getRawValue() {
            return this.rawValue;
        }

        ModifyFlag(int i11) {
            this.rawValue = i11;
        }
    }

    public LiveInfo() {
        this(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveInfo copy$default(LiveInfo liveInfo, String str, String str2, String str3, boolean z11, boolean z12, boolean z13, boolean z14, int i11, TakeSeatMode takeSeatMode, int i12, String str4, String str5, List list, int i13, LiveUserInfo liveUserInfo, long j11, int i14, boolean z15, Map map, int i15, Object obj) {
        Map map2;
        int i16;
        String str6 = (i15 & 1) != 0 ? liveInfo.liveID : str;
        String str7 = (i15 & 2) != 0 ? liveInfo.liveName : str2;
        String str8 = (i15 & 4) != 0 ? liveInfo.notice : str3;
        boolean z16 = (i15 & 8) != 0 ? liveInfo.isMessageDisable : z11;
        boolean z17 = (i15 & 16) != 0 ? liveInfo.isPublicVisible : z12;
        boolean z18 = (i15 & 32) != 0 ? liveInfo.isSeatEnabled : z13;
        boolean z19 = (i15 & 64) != 0 ? liveInfo.keepOwnerOnSeat : z14;
        int i17 = (i15 & 128) != 0 ? liveInfo.maxSeatCount : i11;
        TakeSeatMode takeSeatMode2 = (i15 & 256) != 0 ? liveInfo.seatMode : takeSeatMode;
        int i18 = (i15 & 512) != 0 ? liveInfo.seatLayoutTemplateID : i12;
        String str9 = (i15 & 1024) != 0 ? liveInfo.coverURL : str4;
        String str10 = (i15 & 2048) != 0 ? liveInfo.backgroundURL : str5;
        List list2 = (i15 & 4096) != 0 ? liveInfo.categoryList : list;
        int i19 = (i15 & 8192) != 0 ? liveInfo.activityStatus : i13;
        String str11 = str6;
        LiveUserInfo liveUserInfo2 = (i15 & 16384) != 0 ? liveInfo.liveOwner : liveUserInfo;
        long j12 = (i15 & 32768) != 0 ? liveInfo.createTime : j11;
        int i21 = (i15 & 65536) != 0 ? liveInfo.totalViewerCount : i14;
        boolean z21 = (i15 & 131072) != 0 ? liveInfo.isGiftEnabled : z15;
        if ((i15 & 262144) != 0) {
            i16 = i21;
            map2 = liveInfo.metaData;
        } else {
            map2 = map;
            i16 = i21;
        }
        return liveInfo.copy(str11, str7, str8, z16, z17, z18, z19, i17, takeSeatMode2, i18, str9, str10, list2, i19, liveUserInfo2, j12, i16, z21, map2);
    }

    @NotNull
    public final LiveInfo copy(@NotNull String liveID, @NotNull String liveName, @NotNull String notice, boolean isMessageDisable, boolean isPublicVisible, boolean isSeatEnabled, boolean keepOwnerOnSeat, int maxSeatCount, @NotNull TakeSeatMode seatMode, int seatLayoutTemplateID, @NotNull String coverURL, @NotNull String backgroundURL, @NotNull List<Integer> categoryList, int activityStatus, @NotNull LiveUserInfo liveOwner, long createTime, int totalViewerCount, boolean isGiftEnabled, @NotNull Map<String, String> metaData) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(liveName, "liveName");
        Intrinsics.checkNotNullParameter(notice, "notice");
        Intrinsics.checkNotNullParameter(seatMode, "seatMode");
        Intrinsics.checkNotNullParameter(coverURL, "coverURL");
        Intrinsics.checkNotNullParameter(backgroundURL, "backgroundURL");
        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
        Intrinsics.checkNotNullParameter(liveOwner, "liveOwner");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        return new LiveInfo(liveID, liveName, notice, isMessageDisable, isPublicVisible, isSeatEnabled, keepOwnerOnSeat, maxSeatCount, seatMode, seatLayoutTemplateID, coverURL, backgroundURL, categoryList, activityStatus, liveOwner, createTime, totalViewerCount, isGiftEnabled, metaData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveInfo)) {
            return false;
        }
        LiveInfo liveInfo = (LiveInfo) other;
        return Intrinsics.areEqual(this.liveID, liveInfo.liveID) && Intrinsics.areEqual(this.liveName, liveInfo.liveName) && Intrinsics.areEqual(this.notice, liveInfo.notice) && this.isMessageDisable == liveInfo.isMessageDisable && this.isPublicVisible == liveInfo.isPublicVisible && this.isSeatEnabled == liveInfo.isSeatEnabled && this.keepOwnerOnSeat == liveInfo.keepOwnerOnSeat && this.maxSeatCount == liveInfo.maxSeatCount && this.seatMode == liveInfo.seatMode && this.seatLayoutTemplateID == liveInfo.seatLayoutTemplateID && Intrinsics.areEqual(this.coverURL, liveInfo.coverURL) && Intrinsics.areEqual(this.backgroundURL, liveInfo.backgroundURL) && Intrinsics.areEqual(this.categoryList, liveInfo.categoryList) && this.activityStatus == liveInfo.activityStatus && Intrinsics.areEqual(this.liveOwner, liveInfo.liveOwner) && this.createTime == liveInfo.createTime && this.totalViewerCount == liveInfo.totalViewerCount && this.isGiftEnabled == liveInfo.isGiftEnabled && Intrinsics.areEqual(this.metaData, liveInfo.metaData);
    }

    public LiveInfo(@NotNull String liveID, @NotNull String liveName, @NotNull String notice, boolean z11, boolean z12, boolean z13, boolean z14, int i11, @NotNull TakeSeatMode seatMode, int i12, @NotNull String coverURL, @NotNull String backgroundURL, @NotNull List<Integer> categoryList, int i13, @NotNull LiveUserInfo liveOwner, long j11, int i14, boolean z15, @NotNull Map<String, String> metaData) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(liveName, "liveName");
        Intrinsics.checkNotNullParameter(notice, "notice");
        Intrinsics.checkNotNullParameter(seatMode, "seatMode");
        Intrinsics.checkNotNullParameter(coverURL, "coverURL");
        Intrinsics.checkNotNullParameter(backgroundURL, "backgroundURL");
        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
        Intrinsics.checkNotNullParameter(liveOwner, "liveOwner");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        this.liveID = liveID;
        this.liveName = liveName;
        this.notice = notice;
        this.isMessageDisable = z11;
        this.isPublicVisible = z12;
        this.isSeatEnabled = z13;
        this.keepOwnerOnSeat = z14;
        this.maxSeatCount = i11;
        this.seatMode = seatMode;
        this.seatLayoutTemplateID = i12;
        this.coverURL = coverURL;
        this.backgroundURL = backgroundURL;
        this.categoryList = categoryList;
        this.activityStatus = i13;
        this.liveOwner = liveOwner;
        this.createTime = j11;
        this.totalViewerCount = i14;
        this.isGiftEnabled = z15;
        this.metaData = metaData;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLiveID() {
        return this.liveID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getSeatLayoutTemplateID() {
        return this.seatLayoutTemplateID;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCoverURL() {
        return this.coverURL;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBackgroundURL() {
        return this.backgroundURL;
    }

    @NotNull
    public final List<Integer> component13() {
        return this.categoryList;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getActivityStatus() {
        return this.activityStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final LiveUserInfo getLiveOwner() {
        return this.liveOwner;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getTotalViewerCount() {
        return this.totalViewerCount;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsGiftEnabled() {
        return this.isGiftEnabled;
    }

    @NotNull
    public final Map<String, String> component19() {
        return this.metaData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLiveName() {
        return this.liveName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNotice() {
        return this.notice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMessageDisable() {
        return this.isMessageDisable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsPublicVisible() {
        return this.isPublicVisible;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSeatEnabled() {
        return this.isSeatEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getKeepOwnerOnSeat() {
        return this.keepOwnerOnSeat;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMaxSeatCount() {
        return this.maxSeatCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TakeSeatMode getSeatMode() {
        return this.seatMode;
    }

    public final int getActivityStatus() {
        return this.activityStatus;
    }

    @NotNull
    public final String getBackgroundURL() {
        return this.backgroundURL;
    }

    @NotNull
    public final List<Integer> getCategoryList() {
        return this.categoryList;
    }

    @NotNull
    public final String getCoverURL() {
        return this.coverURL;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final boolean getKeepOwnerOnSeat() {
        return this.keepOwnerOnSeat;
    }

    @NotNull
    public final String getLiveID() {
        return this.liveID;
    }

    @NotNull
    public final String getLiveName() {
        return this.liveName;
    }

    @NotNull
    public final LiveUserInfo getLiveOwner() {
        return this.liveOwner;
    }

    public final int getMaxSeatCount() {
        return this.maxSeatCount;
    }

    @NotNull
    public final Map<String, String> getMetaData() {
        return this.metaData;
    }

    @NotNull
    public final String getNotice() {
        return this.notice;
    }

    public final int getSeatLayoutTemplateID() {
        return this.seatLayoutTemplateID;
    }

    @NotNull
    public final TakeSeatMode getSeatMode() {
        return this.seatMode;
    }

    public final int getTotalViewerCount() {
        return this.totalViewerCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iM88220a = AbstractC39391a.m88220a(this.notice, AbstractC39391a.m88220a(this.liveName, this.liveID.hashCode() * 31, 31), 31);
        boolean z11 = this.isMessageDisable;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iM88220a + r11) * 31;
        boolean z12 = this.isPublicVisible;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.isSeatEnabled;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (i12 + r13) * 31;
        boolean z14 = this.keepOwnerOnSeat;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int iM88225a = AbstractC39396a.m88225a(this.totalViewerCount, (Long.hashCode(this.createTime) + ((this.liveOwner.hashCode() + AbstractC39396a.m88225a(this.activityStatus, (this.categoryList.hashCode() + AbstractC39391a.m88220a(this.backgroundURL, AbstractC39391a.m88220a(this.coverURL, AbstractC39396a.m88225a(this.seatLayoutTemplateID, (this.seatMode.hashCode() + AbstractC39396a.m88225a(this.maxSeatCount, (i13 + r14) * 31, 31)) * 31, 31), 31), 31)) * 31, 31)) * 31)) * 31, 31);
        boolean z15 = this.isGiftEnabled;
        return this.metaData.hashCode() + ((iM88225a + (z15 ? 1 : z15)) * 31);
    }

    public final boolean isGiftEnabled() {
        return this.isGiftEnabled;
    }

    public final boolean isMessageDisable() {
        return this.isMessageDisable;
    }

    public final boolean isPublicVisible() {
        return this.isPublicVisible;
    }

    public final boolean isSeatEnabled() {
        return this.isSeatEnabled;
    }

    public final void setActivityStatus(int i11) {
        this.activityStatus = i11;
    }

    public final void setBackgroundURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundURL = str;
    }

    public final void setCategoryList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.categoryList = list;
    }

    public final void setCoverURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coverURL = str;
    }

    public final void setGiftEnabled(boolean z11) {
        this.isGiftEnabled = z11;
    }

    public final void setKeepOwnerOnSeat(boolean z11) {
        this.keepOwnerOnSeat = z11;
    }

    public final void setLiveID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.liveID = str;
    }

    public final void setLiveName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.liveName = str;
    }

    public final void setMaxSeatCount(int i11) {
        this.maxSeatCount = i11;
    }

    public final void setMessageDisable(boolean z11) {
        this.isMessageDisable = z11;
    }

    public final void setMetaData(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.metaData = map;
    }

    public final void setNotice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notice = str;
    }

    public final void setPublicVisible(boolean z11) {
        this.isPublicVisible = z11;
    }

    public final void setSeatEnabled(boolean z11) {
        this.isSeatEnabled = z11;
    }

    public final void setSeatLayoutTemplateID(int i11) {
        this.seatLayoutTemplateID = i11;
    }

    public final void setSeatMode(@NotNull TakeSeatMode takeSeatMode) {
        Intrinsics.checkNotNullParameter(takeSeatMode, "<set-?>");
        this.seatMode = takeSeatMode;
    }

    public final void setTotalViewerCount(int i11) {
        this.totalViewerCount = i11;
    }

    @NotNull
    public String toString() {
        return "LiveInfo(liveID=" + this.liveID + ", liveName=" + this.liveName + ", notice=" + this.notice + ", isMessageDisable=" + this.isMessageDisable + ", isPublicVisible=" + this.isPublicVisible + ", isSeatEnabled=" + this.isSeatEnabled + ", keepOwnerOnSeat=" + this.keepOwnerOnSeat + ", maxSeatCount=" + this.maxSeatCount + ", seatMode=" + this.seatMode + ", seatLayoutTemplateID=" + this.seatLayoutTemplateID + ", coverURL=" + this.coverURL + ", backgroundURL=" + this.backgroundURL + ", categoryList=" + this.categoryList + ", activityStatus=" + this.activityStatus + ", liveOwner=" + this.liveOwner + ", createTime=" + this.createTime + ", totalViewerCount=" + this.totalViewerCount + ", isGiftEnabled=" + this.isGiftEnabled + ", metaData=" + this.metaData + ')';
    }

    public /* synthetic */ LiveInfo(String str, String str2, String str3, boolean z11, boolean z12, boolean z13, boolean z14, int i11, TakeSeatMode takeSeatMode, int i12, String str4, String str5, List list, int i13, LiveUserInfo liveUserInfo, long j11, int i14, boolean z15, Map map, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? "" : str3, (i15 & 8) != 0 ? false : z11, (i15 & 16) != 0 ? true : z12, (i15 & 32) != 0 ? true : z13, (i15 & 64) != 0 ? false : z14, (i15 & 128) != 0 ? 0 : i11, (i15 & 256) != 0 ? TakeSeatMode.APPLY : takeSeatMode, (i15 & 512) != 0 ? 600 : i12, (i15 & 1024) != 0 ? "" : str4, (i15 & 2048) == 0 ? str5 : "", (i15 & 4096) != 0 ? CollectionsKt.emptyList() : list, (i15 & 8192) != 0 ? 0 : i13, (i15 & 16384) != 0 ? new LiveUserInfo(null, null, null, 7, null) : liveUserInfo, (i15 & 32768) != 0 ? 0L : j11, (i15 & 65536) != 0 ? 0 : i14, (i15 & 131072) != 0 ? true : z15, (i15 & 262144) != 0 ? MapsKt.emptyMap() : map);
    }
}
