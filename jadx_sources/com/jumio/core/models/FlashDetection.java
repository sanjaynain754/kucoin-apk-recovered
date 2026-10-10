package com.jumio.core.models;

import cn.jiguang.privates.push.constants.JPushConstants;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/core/models/FlashDetection;", "Ljava/io/Serializable;", "colorShiftThreshold", "", "timeout", "", "<init>", "(DJ)V", "getColorShiftThreshold", "()D", "getTimeout", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FlashDetection implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final double f14249a;

    /* JADX INFO: renamed from: b */
    public final long f14250b;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/FlashDetection$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/FlashDetection;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final FlashDetection fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new FlashDetection(json.optDouble("colorShiftThreshold", 0.1d), (long) (json.optDouble("timeout", 0.6d) * ((double) 1000)));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public FlashDetection() {
        this(0.0d, 0L, 3, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashDetection)) {
            return false;
        }
        FlashDetection flashDetection = (FlashDetection) other;
        return Double.compare(this.f14249a, flashDetection.f14249a) == 0 && this.f14250b == flashDetection.f14250b;
    }

    public FlashDetection(double d11, long j11) {
        this.f14249a = d11;
        this.f14250b = j11;
    }

    public static /* synthetic */ FlashDetection copy$default(FlashDetection flashDetection, double d11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = flashDetection.f14249a;
        }
        if ((i11 & 2) != 0) {
            j11 = flashDetection.f14250b;
        }
        return flashDetection.copy(d11, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getF14249a() {
        return this.f14249a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getF14250b() {
        return this.f14250b;
    }

    @NotNull
    public final FlashDetection copy(double colorShiftThreshold, long timeout) {
        return new FlashDetection(colorShiftThreshold, timeout);
    }

    public final double getColorShiftThreshold() {
        return this.f14249a;
    }

    public final long getTimeout() {
        return this.f14250b;
    }

    public int hashCode() {
        return Long.hashCode(this.f14250b) + (Double.hashCode(this.f14249a) * 31);
    }

    @NotNull
    public String toString() {
        return "FlashDetection(colorShiftThreshold=" + this.f14249a + ", timeout=" + this.f14250b + ')';
    }

    public FlashDetection(double d11, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.1d : d11, (i11 & 2) != 0 ? (long) (((double) 1000) * 0.6d) : j11);
    }
}
