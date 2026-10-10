package com.kubi.tradingbotkit.business.strategyList.entity;

import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StrategyItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/entity/Method;", "", "threshold", "", JPushConstants.Geofence.KEY_INTERVAL, "", "autoChange", "", "intervalTimeSeconds", "", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getThreshold", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getInterval", "()Ljava/lang/String;", "getAutoChange", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIntervalTimeSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/kubi/tradingbotkit/business/strategyList/entity/Method;", "equals", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Method {

    @Nullable
    private final Boolean autoChange;

    @Nullable
    private final String interval;

    @Nullable
    private final Long intervalTimeSeconds;

    @Nullable
    private final Double threshold;

    public Method() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Method)) {
            return false;
        }
        Method method = (Method) other;
        return Intrinsics.areEqual((Object) this.threshold, (Object) method.threshold) && Intrinsics.areEqual(this.interval, method.interval) && Intrinsics.areEqual(this.autoChange, method.autoChange) && Intrinsics.areEqual(this.intervalTimeSeconds, method.intervalTimeSeconds);
    }

    public Method(@Nullable Double d11, @Nullable String str, @Nullable Boolean bool, @Nullable Long l11) {
        this.threshold = d11;
        this.interval = str;
        this.autoChange = bool;
        this.intervalTimeSeconds = l11;
    }

    public static /* synthetic */ Method copy$default(Method method, Double d11, String str, Boolean bool, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = method.threshold;
        }
        if ((i11 & 2) != 0) {
            str = method.interval;
        }
        if ((i11 & 4) != 0) {
            bool = method.autoChange;
        }
        if ((i11 & 8) != 0) {
            l11 = method.intervalTimeSeconds;
        }
        return method.copy(d11, str, bool, l11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getThreshold() {
        return this.threshold;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInterval() {
        return this.interval;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getAutoChange() {
        return this.autoChange;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getIntervalTimeSeconds() {
        return this.intervalTimeSeconds;
    }

    @NotNull
    public final Method copy(@Nullable Double threshold, @Nullable String interval, @Nullable Boolean autoChange, @Nullable Long intervalTimeSeconds) {
        return new Method(threshold, interval, autoChange, intervalTimeSeconds);
    }

    @Nullable
    public final Boolean getAutoChange() {
        return this.autoChange;
    }

    @Nullable
    public final String getInterval() {
        return this.interval;
    }

    @Nullable
    public final Long getIntervalTimeSeconds() {
        return this.intervalTimeSeconds;
    }

    @Nullable
    public final Double getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        Double d11 = this.threshold;
        int iHashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        String str = this.interval;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.autoChange;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l11 = this.intervalTimeSeconds;
        return iHashCode3 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Method(threshold=" + this.threshold + ", interval=" + this.interval + ", autoChange=" + this.autoChange + ", intervalTimeSeconds=" + this.intervalTimeSeconds + ')';
    }

    public /* synthetic */ Method(Double d11, String str, Boolean bool, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : l11);
    }
}
