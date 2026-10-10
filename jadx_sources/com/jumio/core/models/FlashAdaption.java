package com.jumio.core.models;

import cn.jiguang.privates.push.constants.JPushConstants;
import java.io.Serializable;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/core/models/FlashAdaption;", "Ljava/io/Serializable;", "luxThreshold", "", "timeout", "", "luxTimeWindow", "<init>", "(DJJ)V", "getLuxThreshold", "()D", "getTimeout", "()J", "getLuxTimeWindow", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FlashAdaption implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final double f14246a;

    /* JADX INFO: renamed from: b */
    public final long f14247b;

    /* JADX INFO: renamed from: c */
    public final long f14248c;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/FlashAdaption$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/FlashAdaption;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final FlashAdaption fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            double d11 = 1000;
            return new FlashAdaption(json.optDouble("luxThreshold", 0.15d), (long) (json.optDouble("timeout", 0.8d) * d11), (long) (json.optDouble("luxTimeWindow", 0.2d) * d11));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public FlashAdaption() {
        this(0.0d, 0L, 0L, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashAdaption)) {
            return false;
        }
        FlashAdaption flashAdaption = (FlashAdaption) other;
        return Double.compare(this.f14246a, flashAdaption.f14246a) == 0 && this.f14247b == flashAdaption.f14247b && this.f14248c == flashAdaption.f14248c;
    }

    public FlashAdaption(double d11, long j11, long j12) {
        this.f14246a = d11;
        this.f14247b = j11;
        this.f14248c = j12;
    }

    public static /* synthetic */ FlashAdaption copy$default(FlashAdaption flashAdaption, double d11, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = flashAdaption.f14246a;
        }
        double d12 = d11;
        if ((i11 & 2) != 0) {
            j11 = flashAdaption.f14247b;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            j12 = flashAdaption.f14248c;
        }
        return flashAdaption.copy(d12, j13, j12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getF14246a() {
        return this.f14246a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getF14247b() {
        return this.f14247b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getF14248c() {
        return this.f14248c;
    }

    @NotNull
    public final FlashAdaption copy(double luxThreshold, long timeout, long luxTimeWindow) {
        return new FlashAdaption(luxThreshold, timeout, luxTimeWindow);
    }

    public final double getLuxThreshold() {
        return this.f14246a;
    }

    public final long getLuxTimeWindow() {
        return this.f14248c;
    }

    public final long getTimeout() {
        return this.f14247b;
    }

    public int hashCode() {
        return Long.hashCode(this.f14248c) + AbstractC40749x1.m89269a(this.f14247b, Double.hashCode(this.f14246a) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "FlashAdaption(luxThreshold=" + this.f14246a + ", timeout=" + this.f14247b + ", luxTimeWindow=" + this.f14248c + ')';
    }

    public FlashAdaption(double d11, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.15d : d11, (i11 & 2) != 0 ? (long) (((double) 1000) * 0.8d) : j11, (i11 & 4) != 0 ? (long) (((double) 1000) * 0.2d) : j12);
    }
}
