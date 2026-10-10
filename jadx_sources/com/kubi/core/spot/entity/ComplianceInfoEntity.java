package com.kubi.core.spot.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotBannerEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/core/spot/entity/ComplianceInfoEntity;", "", "type", "", "symbol", "", "value", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSymbol", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/spot/entity/ComplianceInfoEntity;", "equals", "", "other", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ComplianceInfoEntity {

    @Nullable
    private final String symbol;

    @Nullable
    private final Integer type;

    @Nullable
    private final String value;

    public ComplianceInfoEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplianceInfoEntity)) {
            return false;
        }
        ComplianceInfoEntity complianceInfoEntity = (ComplianceInfoEntity) other;
        return Intrinsics.areEqual(this.type, complianceInfoEntity.type) && Intrinsics.areEqual(this.symbol, complianceInfoEntity.symbol) && Intrinsics.areEqual(this.value, complianceInfoEntity.value);
    }

    public ComplianceInfoEntity(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.type = num;
        this.symbol = str;
        this.value = str2;
    }

    public static /* synthetic */ ComplianceInfoEntity copy$default(ComplianceInfoEntity complianceInfoEntity, Integer num, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = complianceInfoEntity.type;
        }
        if ((i11 & 2) != 0) {
            str = complianceInfoEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            str2 = complianceInfoEntity.value;
        }
        return complianceInfoEntity.copy(num, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final ComplianceInfoEntity copy(@Nullable Integer type, @Nullable String symbol, @Nullable String value) {
        return new ComplianceInfoEntity(type, symbol, value);
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ComplianceInfoEntity(type=" + this.type + ", symbol=" + this.symbol + ", value=" + this.value + ')';
    }

    public /* synthetic */ ComplianceInfoEntity(Integer num, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
