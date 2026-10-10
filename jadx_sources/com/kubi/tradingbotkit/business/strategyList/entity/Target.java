package com.kubi.tradingbotkit.business.strategyList.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StrategyItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/entity/Target;", "", FirebaseAnalytics.Param.CURRENCY, "", "percent", "Ljava/math/BigDecimal;", "triggerPrice", "isTriggered", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)V", "getCurrency", "()Ljava/lang/String;", "getPercent", "()Ljava/math/BigDecimal;", "getTriggerPrice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)Lcom/kubi/tradingbotkit/business/strategyList/entity/Target;", "equals", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Target {

    @Nullable
    private final String currency;

    @Nullable
    private final Boolean isTriggered;

    @Nullable
    private final BigDecimal percent;

    @Nullable
    private final BigDecimal triggerPrice;

    public Target() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Target)) {
            return false;
        }
        Target target = (Target) other;
        return Intrinsics.areEqual(this.currency, target.currency) && Intrinsics.areEqual(this.percent, target.percent) && Intrinsics.areEqual(this.triggerPrice, target.triggerPrice) && Intrinsics.areEqual(this.isTriggered, target.isTriggered);
    }

    public Target(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Boolean bool) {
        this.currency = str;
        this.percent = bigDecimal;
        this.triggerPrice = bigDecimal2;
        this.isTriggered = bool;
    }

    public static /* synthetic */ Target copy$default(Target target, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = target.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = target.percent;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = target.triggerPrice;
        }
        if ((i11 & 8) != 0) {
            bool = target.isTriggered;
        }
        return target.copy(str, bigDecimal, bigDecimal2, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPercent() {
        return this.percent;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsTriggered() {
        return this.isTriggered;
    }

    @NotNull
    public final Target copy(@Nullable String currency, @Nullable BigDecimal percent, @Nullable BigDecimal triggerPrice, @Nullable Boolean isTriggered) {
        return new Target(currency, percent, triggerPrice, isTriggered);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getPercent() {
        return this.percent;
    }

    @Nullable
    public final BigDecimal getTriggerPrice() {
        return this.triggerPrice;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.percent;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.triggerPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Boolean bool = this.isTriggered;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTriggered() {
        return this.isTriggered;
    }

    @NotNull
    public String toString() {
        return "Target(currency=" + this.currency + ", percent=" + this.percent + ", triggerPrice=" + this.triggerPrice + ", isTriggered=" + this.isTriggered + ')';
    }

    public /* synthetic */ Target(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bool);
    }
}
