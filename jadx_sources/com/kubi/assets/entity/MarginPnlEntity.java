package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/entity/MarginPnlEntity;", "", "todayPnlAmount", "Ljava/math/BigDecimal;", "todayPnlRatio", "positionType", "", "baseCurrency", "baseFiatCurrency", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTodayPnlAmount", "()Ljava/math/BigDecimal;", "setTodayPnlAmount", "(Ljava/math/BigDecimal;)V", "getTodayPnlRatio", "setTodayPnlRatio", "getPositionType", "()Ljava/lang/String;", "setPositionType", "(Ljava/lang/String;)V", "getBaseCurrency", "setBaseCurrency", "getBaseFiatCurrency", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginPnlEntity {

    @Nullable
    private String baseCurrency;

    @Nullable
    private final String baseFiatCurrency;

    @Nullable
    private String positionType;

    @Nullable
    private BigDecimal todayPnlAmount;

    @Nullable
    private BigDecimal todayPnlRatio;

    public MarginPnlEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.todayPnlAmount = bigDecimal;
        this.todayPnlRatio = bigDecimal2;
        this.positionType = str;
        this.baseCurrency = str2;
        this.baseFiatCurrency = str3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginPnlEntity)) {
            return false;
        }
        MarginPnlEntity marginPnlEntity = (MarginPnlEntity) other;
        return Intrinsics.areEqual(this.todayPnlAmount, marginPnlEntity.todayPnlAmount) && Intrinsics.areEqual(this.todayPnlRatio, marginPnlEntity.todayPnlRatio) && Intrinsics.areEqual(this.positionType, marginPnlEntity.positionType) && Intrinsics.areEqual(this.baseCurrency, marginPnlEntity.baseCurrency) && Intrinsics.areEqual(this.baseFiatCurrency, marginPnlEntity.baseFiatCurrency);
    }

    public static /* synthetic */ MarginPnlEntity copy$default(MarginPnlEntity marginPnlEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = marginPnlEntity.todayPnlAmount;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = marginPnlEntity.todayPnlRatio;
        }
        if ((i11 & 4) != 0) {
            str = marginPnlEntity.positionType;
        }
        if ((i11 & 8) != 0) {
            str2 = marginPnlEntity.baseCurrency;
        }
        if ((i11 & 16) != 0) {
            str3 = marginPnlEntity.baseFiatCurrency;
        }
        String str4 = str3;
        String str5 = str;
        return marginPnlEntity.copy(bigDecimal, bigDecimal2, str5, str2, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getTodayPnlAmount() {
        return this.todayPnlAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTodayPnlRatio() {
        return this.todayPnlRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPositionType() {
        return this.positionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseFiatCurrency() {
        return this.baseFiatCurrency;
    }

    @NotNull
    public final MarginPnlEntity copy(@Nullable BigDecimal todayPnlAmount, @Nullable BigDecimal todayPnlRatio, @Nullable String positionType, @Nullable String baseCurrency, @Nullable String baseFiatCurrency) {
        return new MarginPnlEntity(todayPnlAmount, todayPnlRatio, positionType, baseCurrency, baseFiatCurrency);
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final String getBaseFiatCurrency() {
        return this.baseFiatCurrency;
    }

    @Nullable
    public final String getPositionType() {
        return this.positionType;
    }

    @Nullable
    public final BigDecimal getTodayPnlAmount() {
        return this.todayPnlAmount;
    }

    @Nullable
    public final BigDecimal getTodayPnlRatio() {
        return this.todayPnlRatio;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.todayPnlAmount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.todayPnlRatio;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.positionType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.baseCurrency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.baseFiatCurrency;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBaseCurrency(@Nullable String str) {
        this.baseCurrency = str;
    }

    public final void setPositionType(@Nullable String str) {
        this.positionType = str;
    }

    public final void setTodayPnlAmount(@Nullable BigDecimal bigDecimal) {
        this.todayPnlAmount = bigDecimal;
    }

    public final void setTodayPnlRatio(@Nullable BigDecimal bigDecimal) {
        this.todayPnlRatio = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "MarginPnlEntity(todayPnlAmount=" + this.todayPnlAmount + ", todayPnlRatio=" + this.todayPnlRatio + ", positionType=" + this.positionType + ", baseCurrency=" + this.baseCurrency + ", baseFiatCurrency=" + this.baseFiatCurrency + ')';
    }

    public /* synthetic */ MarginPnlEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, str, str2, (i11 & 16) != 0 ? null : str3);
    }
}
