package com.jumio.commons.camera;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.jumio.liveness.DaClient;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013¨\u0006\""}, m90084d2 = {"Lcom/jumio/commons/camera/CaptureSettings;", "Ljava/io/Serializable;", FirebaseAnalytics.Param.LEVEL, "Lcom/jumio/commons/camera/ExposureLevel;", "whiteBalance", "Lcom/jumio/commons/camera/WhiteBalance;", DaClient.ATTR_DISTANCE, "Lcom/jumio/commons/camera/LensDistance;", "<init>", "(Lcom/jumio/commons/camera/ExposureLevel;Lcom/jumio/commons/camera/WhiteBalance;Lcom/jumio/commons/camera/LensDistance;)V", "getLevel", "()Lcom/jumio/commons/camera/ExposureLevel;", "getWhiteBalance", "()Lcom/jumio/commons/camera/WhiteBalance;", "getDistance", "()Lcom/jumio/commons/camera/LensDistance;", "startChallenge", "", "getStartChallenge", "()Z", "setStartChallenge", "(Z)V", "isAuto", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CaptureSettings implements Serializable {

    /* JADX INFO: renamed from: a */
    public final ExposureLevel f13522a;

    /* JADX INFO: renamed from: b */
    public final WhiteBalance f13523b;

    /* JADX INFO: renamed from: c */
    public final LensDistance f13524c;

    /* JADX INFO: renamed from: d */
    public boolean f13525d;

    public CaptureSettings() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureSettings)) {
            return false;
        }
        CaptureSettings captureSettings = (CaptureSettings) other;
        return this.f13522a == captureSettings.f13522a && this.f13523b == captureSettings.f13523b && this.f13524c == captureSettings.f13524c;
    }

    public CaptureSettings(@NotNull ExposureLevel level, @NotNull WhiteBalance whiteBalance, @NotNull LensDistance distance) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(whiteBalance, "whiteBalance");
        Intrinsics.checkNotNullParameter(distance, "distance");
        this.f13522a = level;
        this.f13523b = whiteBalance;
        this.f13524c = distance;
    }

    public static /* synthetic */ CaptureSettings copy$default(CaptureSettings captureSettings, ExposureLevel exposureLevel, WhiteBalance whiteBalance, LensDistance lensDistance, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            exposureLevel = captureSettings.f13522a;
        }
        if ((i11 & 2) != 0) {
            whiteBalance = captureSettings.f13523b;
        }
        if ((i11 & 4) != 0) {
            lensDistance = captureSettings.f13524c;
        }
        return captureSettings.copy(exposureLevel, whiteBalance, lensDistance);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExposureLevel getF13522a() {
        return this.f13522a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WhiteBalance getF13523b() {
        return this.f13523b;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LensDistance getF13524c() {
        return this.f13524c;
    }

    @NotNull
    public final CaptureSettings copy(@NotNull ExposureLevel level, @NotNull WhiteBalance whiteBalance, @NotNull LensDistance distance) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(whiteBalance, "whiteBalance");
        Intrinsics.checkNotNullParameter(distance, "distance");
        return new CaptureSettings(level, whiteBalance, distance);
    }

    @NotNull
    public final LensDistance getDistance() {
        return this.f13524c;
    }

    @NotNull
    public final ExposureLevel getLevel() {
        return this.f13522a;
    }

    /* JADX INFO: renamed from: getStartChallenge, reason: from getter */
    public final boolean getF13525d() {
        return this.f13525d;
    }

    @NotNull
    public final WhiteBalance getWhiteBalance() {
        return this.f13523b;
    }

    public int hashCode() {
        return this.f13524c.hashCode() + ((this.f13523b.hashCode() + (this.f13522a.hashCode() * 31)) * 31);
    }

    public final boolean isAuto() {
        return this.f13522a == ExposureLevel.AUTO && this.f13523b == WhiteBalance.AUTO && this.f13524c == LensDistance.AUTO;
    }

    public final void setStartChallenge(boolean z11) {
        this.f13525d = z11;
    }

    @NotNull
    public String toString() {
        return "CaptureSettings(level=" + this.f13522a + ", whiteBalance=" + this.f13523b + ", distance=" + this.f13524c + ')';
    }

    public /* synthetic */ CaptureSettings(ExposureLevel exposureLevel, WhiteBalance whiteBalance, LensDistance lensDistance, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ExposureLevel.AUTO : exposureLevel, (i11 & 2) != 0 ? WhiteBalance.AUTO : whiteBalance, (i11 & 4) != 0 ? LensDistance.AUTO : lensDistance);
    }
}
