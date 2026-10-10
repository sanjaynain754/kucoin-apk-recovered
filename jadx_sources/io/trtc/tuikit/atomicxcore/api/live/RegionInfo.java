package io.trtc.tuikit.atomicxcore.api.live;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;", "", "x", "", "y", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "zorder", "(IIIII)V", "getH", "()I", "setH", "(I)V", "getW", "setW", "getX", "setX", "getY", "setY", "getZorder", "setZorder", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class RegionInfo {
    private int h;
    private int w;
    private int x;
    private int y;
    private int zorder;

    public RegionInfo() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionInfo)) {
            return false;
        }
        RegionInfo regionInfo = (RegionInfo) other;
        return this.x == regionInfo.x && this.y == regionInfo.y && this.w == regionInfo.w && this.h == regionInfo.h && this.zorder == regionInfo.zorder;
    }

    public RegionInfo(int i11, int i12, int i13, int i14, int i15) {
        this.x = i11;
        this.y = i12;
        this.w = i13;
        this.h = i14;
        this.zorder = i15;
    }

    public static /* synthetic */ RegionInfo copy$default(RegionInfo regionInfo, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = regionInfo.x;
        }
        if ((i16 & 2) != 0) {
            i12 = regionInfo.y;
        }
        if ((i16 & 4) != 0) {
            i13 = regionInfo.w;
        }
        if ((i16 & 8) != 0) {
            i14 = regionInfo.h;
        }
        if ((i16 & 16) != 0) {
            i15 = regionInfo.zorder;
        }
        int i17 = i15;
        int i18 = i13;
        return regionInfo.copy(i11, i12, i18, i14, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getZorder() {
        return this.zorder;
    }

    @NotNull
    public final RegionInfo copy(int x11, int y11, int w11, int h11, int zorder) {
        return new RegionInfo(x11, y11, w11, h11, zorder);
    }

    public final int getH() {
        return this.h;
    }

    public final int getW() {
        return this.w;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final int getZorder() {
        return this.zorder;
    }

    public int hashCode() {
        return Integer.hashCode(this.zorder) + AbstractC39396a.m88225a(this.h, AbstractC39396a.m88225a(this.w, AbstractC39396a.m88225a(this.y, Integer.hashCode(this.x) * 31, 31), 31), 31);
    }

    public final void setH(int i11) {
        this.h = i11;
    }

    public final void setW(int i11) {
        this.w = i11;
    }

    public final void setX(int i11) {
        this.x = i11;
    }

    public final void setY(int i11) {
        this.y = i11;
    }

    public final void setZorder(int i11) {
        this.zorder = i11;
    }

    @NotNull
    public String toString() {
        return "RegionInfo(x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + ", zorder=" + this.zorder + ')';
    }

    public /* synthetic */ RegionInfo(int i11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i11, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? 0 : i15);
    }
}
