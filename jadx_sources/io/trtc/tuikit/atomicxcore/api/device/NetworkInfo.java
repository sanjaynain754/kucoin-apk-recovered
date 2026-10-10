package io.trtc.tuikit.atomicxcore.api.device;

import com.tencent.bugly.proguard.C33757kf;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;", "", "userID", "", C33757kf.f70665k, "Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;", "upLoss", "", "downLoss", "delay", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;III)V", "getDelay", "()I", "getDownLoss", "getQuality", "()Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;", "getUpLoss", "getUserID", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class NetworkInfo {
    private final int delay;
    private final int downLoss;

    @NotNull
    private final NetworkQuality quality;
    private final int upLoss;

    @NotNull
    private final String userID;

    public NetworkInfo() {
        this(null, null, 0, 0, 0, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInfo)) {
            return false;
        }
        NetworkInfo networkInfo = (NetworkInfo) other;
        return Intrinsics.areEqual(this.userID, networkInfo.userID) && this.quality == networkInfo.quality && this.upLoss == networkInfo.upLoss && this.downLoss == networkInfo.downLoss && this.delay == networkInfo.delay;
    }

    public NetworkInfo(@NotNull String userID, @NotNull NetworkQuality quality, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(quality, "quality");
        this.userID = userID;
        this.quality = quality;
        this.upLoss = i11;
        this.downLoss = i12;
        this.delay = i13;
    }

    public static /* synthetic */ NetworkInfo copy$default(NetworkInfo networkInfo, String str, NetworkQuality networkQuality, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = networkInfo.userID;
        }
        if ((i14 & 2) != 0) {
            networkQuality = networkInfo.quality;
        }
        if ((i14 & 4) != 0) {
            i11 = networkInfo.upLoss;
        }
        if ((i14 & 8) != 0) {
            i12 = networkInfo.downLoss;
        }
        if ((i14 & 16) != 0) {
            i13 = networkInfo.delay;
        }
        int i15 = i13;
        int i16 = i11;
        return networkInfo.copy(str, networkQuality, i16, i12, i15);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkQuality getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUpLoss() {
        return this.upLoss;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDownLoss() {
        return this.downLoss;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDownLoss() {
        return this.downLoss;
    }

    @NotNull
    public final NetworkQuality getQuality() {
        return this.quality;
    }

    public final int getUpLoss() {
        return this.upLoss;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return Integer.hashCode(this.delay) + AbstractC39396a.m88225a(this.downLoss, AbstractC39396a.m88225a(this.upLoss, (this.quality.hashCode() + (this.userID.hashCode() * 31)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "NetworkInfo(userID=" + this.userID + ", quality=" + this.quality + ", upLoss=" + this.upLoss + ", downLoss=" + this.downLoss + ", delay=" + this.delay + ')';
    }

    @NotNull
    public final NetworkInfo copy(@NotNull String userID, @NotNull NetworkQuality quality, int upLoss, int downLoss, int delay) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(quality, "quality");
        return new NetworkInfo(userID, quality, upLoss, downLoss, delay);
    }

    public /* synthetic */ NetworkInfo(String str, NetworkQuality networkQuality, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? NetworkQuality.EXCELLENT : networkQuality, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) != 0 ? 0 : i13);
    }
}
