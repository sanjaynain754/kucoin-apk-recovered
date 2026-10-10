package io.trtc.tuikit.atomicxcore.api.live;

import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "", "index", "", "isLocked", "", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", TtmlNode.TAG_REGION, "Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;", "(IZLio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;)V", "getIndex", "()I", "setIndex", "(I)V", "()Z", "setLocked", "(Z)V", "getRegion", "()Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;", "setRegion", "(Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;)V", "getUserInfo", "()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "setUserInfo", "(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class SeatInfo {
    private int index;
    private boolean isLocked;

    @NotNull
    private RegionInfo region;

    @NotNull
    private SeatUserInfo userInfo;

    public SeatInfo() {
        this(0, false, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeatInfo)) {
            return false;
        }
        SeatInfo seatInfo = (SeatInfo) other;
        return this.index == seatInfo.index && this.isLocked == seatInfo.isLocked && Intrinsics.areEqual(this.userInfo, seatInfo.userInfo) && Intrinsics.areEqual(this.region, seatInfo.region);
    }

    public SeatInfo(int i11, boolean z11, @NotNull SeatUserInfo userInfo, @NotNull RegionInfo region) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(region, "region");
        this.index = i11;
        this.isLocked = z11;
        this.userInfo = userInfo;
        this.region = region;
    }

    public static /* synthetic */ SeatInfo copy$default(SeatInfo seatInfo, int i11, boolean z11, SeatUserInfo seatUserInfo, RegionInfo regionInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = seatInfo.index;
        }
        if ((i12 & 2) != 0) {
            z11 = seatInfo.isLocked;
        }
        if ((i12 & 4) != 0) {
            seatUserInfo = seatInfo.userInfo;
        }
        if ((i12 & 8) != 0) {
            regionInfo = seatInfo.region;
        }
        return seatInfo.copy(i11, z11, seatUserInfo, regionInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SeatUserInfo getUserInfo() {
        return this.userInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RegionInfo getRegion() {
        return this.region;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final RegionInfo getRegion() {
        return this.region;
    }

    @NotNull
    public final SeatUserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        boolean z11 = this.isLocked;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return this.region.hashCode() + ((this.userInfo.hashCode() + ((iHashCode + r11) * 31)) * 31);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final void setIndex(int i11) {
        this.index = i11;
    }

    public final void setLocked(boolean z11) {
        this.isLocked = z11;
    }

    public final void setRegion(@NotNull RegionInfo regionInfo) {
        Intrinsics.checkNotNullParameter(regionInfo, "<set-?>");
        this.region = regionInfo;
    }

    public final void setUserInfo(@NotNull SeatUserInfo seatUserInfo) {
        Intrinsics.checkNotNullParameter(seatUserInfo, "<set-?>");
        this.userInfo = seatUserInfo;
    }

    @NotNull
    public String toString() {
        return "SeatInfo(index=" + this.index + ", isLocked=" + this.isLocked + ", userInfo=" + this.userInfo + ", region=" + this.region + ')';
    }

    @NotNull
    public final SeatInfo copy(int index, boolean isLocked, @NotNull SeatUserInfo userInfo, @NotNull RegionInfo region) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(region, "region");
        return new SeatInfo(index, isLocked, userInfo, region);
    }

    public /* synthetic */ SeatInfo(int i11, boolean z11, SeatUserInfo seatUserInfo, RegionInfo regionInfo, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) == 0 ? z11 : false, (i12 & 4) != 0 ? new SeatUserInfo(null, null, null, null, null, null, false, null, false, null, 1023, null) : seatUserInfo, (i12 & 8) != 0 ? new RegionInfo(0, 0, 0, 0, 0, 31, null) : regionInfo);
    }
}
