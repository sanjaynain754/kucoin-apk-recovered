package com.kubi.profit.loss.analysis.lib;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragmentContract.kt */
/* JADX INFO: loaded from: classes35.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/ValueEntity;", "", "value", "", "valueStr", "", "currentRange", "hasGetPreTotalAsset", "", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getValueStr", "()Ljava/lang/String;", "getCurrentRange", "getHasGetPreTotalAsset", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/profit/loss/analysis/lib/ValueEntity;", "equals", "other", "hashCode", "", "toString", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ValueEntity {

    @Nullable
    private final String currentRange;

    @Nullable
    private final Boolean hasGetPreTotalAsset;

    @Nullable
    private final Double value;

    @Nullable
    private final String valueStr;

    public ValueEntity() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValueEntity)) {
            return false;
        }
        ValueEntity valueEntity = (ValueEntity) other;
        return Intrinsics.areEqual((Object) this.value, (Object) valueEntity.value) && Intrinsics.areEqual(this.valueStr, valueEntity.valueStr) && Intrinsics.areEqual(this.currentRange, valueEntity.currentRange) && Intrinsics.areEqual(this.hasGetPreTotalAsset, valueEntity.hasGetPreTotalAsset);
    }

    public ValueEntity(@Nullable Double d11, @Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.value = d11;
        this.valueStr = str;
        this.currentRange = str2;
        this.hasGetPreTotalAsset = bool;
    }

    public static /* synthetic */ ValueEntity copy$default(ValueEntity valueEntity, Double d11, String str, String str2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = valueEntity.value;
        }
        if ((i11 & 2) != 0) {
            str = valueEntity.valueStr;
        }
        if ((i11 & 4) != 0) {
            str2 = valueEntity.currentRange;
        }
        if ((i11 & 8) != 0) {
            bool = valueEntity.hasGetPreTotalAsset;
        }
        return valueEntity.copy(d11, str, str2, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValueStr() {
        return this.valueStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentRange() {
        return this.currentRange;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHasGetPreTotalAsset() {
        return this.hasGetPreTotalAsset;
    }

    @NotNull
    public final ValueEntity copy(@Nullable Double value, @Nullable String valueStr, @Nullable String currentRange, @Nullable Boolean hasGetPreTotalAsset) {
        return new ValueEntity(value, valueStr, currentRange, hasGetPreTotalAsset);
    }

    @Nullable
    public final String getCurrentRange() {
        return this.currentRange;
    }

    @Nullable
    public final Boolean getHasGetPreTotalAsset() {
        return this.hasGetPreTotalAsset;
    }

    @Nullable
    public final Double getValue() {
        return this.value;
    }

    @Nullable
    public final String getValueStr() {
        return this.valueStr;
    }

    public int hashCode() {
        Double d11 = this.value;
        int iHashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        String str = this.valueStr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentRange;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasGetPreTotalAsset;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ValueEntity(value=" + this.value + ", valueStr=" + this.valueStr + ", currentRange=" + this.currentRange + ", hasGetPreTotalAsset=" + this.hasGetPreTotalAsset + ')';
    }

    public /* synthetic */ ValueEntity(Double d11, String str, String str2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? Boolean.FALSE : bool);
    }
}
