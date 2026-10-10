package com.kubi.core.biz.leverbar;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverageSettingData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/core/biz/leverbar/LeverageSettingData;", "", "tradeType", "", "leverage", "Ljava/math/BigDecimal;", "rbMode", "isUnifiedAccount", "", "<init>", "(ILjava/math/BigDecimal;IZ)V", "getTradeType", "()I", "getLeverage", "()Ljava/math/BigDecimal;", "getRbMode", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverageSettingData {
    private final boolean isUnifiedAccount;

    @NotNull
    private final BigDecimal leverage;
    private final int rbMode;
    private final int tradeType;

    public LeverageSettingData() {
        this(0, null, 0, false, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeverageSettingData)) {
            return false;
        }
        LeverageSettingData leverageSettingData = (LeverageSettingData) other;
        return this.tradeType == leverageSettingData.tradeType && Intrinsics.areEqual(this.leverage, leverageSettingData.leverage) && this.rbMode == leverageSettingData.rbMode && this.isUnifiedAccount == leverageSettingData.isUnifiedAccount;
    }

    public LeverageSettingData(int i11, @NotNull BigDecimal leverage, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        this.tradeType = i11;
        this.leverage = leverage;
        this.rbMode = i12;
        this.isUnifiedAccount = z11;
    }

    public static /* synthetic */ LeverageSettingData copy$default(LeverageSettingData leverageSettingData, int i11, BigDecimal bigDecimal, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = leverageSettingData.tradeType;
        }
        if ((i13 & 2) != 0) {
            bigDecimal = leverageSettingData.leverage;
        }
        if ((i13 & 4) != 0) {
            i12 = leverageSettingData.rbMode;
        }
        if ((i13 & 8) != 0) {
            z11 = leverageSettingData.isUnifiedAccount;
        }
        return leverageSettingData.copy(i11, bigDecimal, i12, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTradeType() {
        return this.tradeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRbMode() {
        return this.rbMode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsUnifiedAccount() {
        return this.isUnifiedAccount;
    }

    @NotNull
    public final LeverageSettingData copy(int tradeType, @NotNull BigDecimal leverage, int rbMode, boolean isUnifiedAccount) {
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        return new LeverageSettingData(tradeType, leverage, rbMode, isUnifiedAccount);
    }

    @NotNull
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    public final int getRbMode() {
        return this.rbMode;
    }

    public final int getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.tradeType) * 31) + this.leverage.hashCode()) * 31) + Integer.hashCode(this.rbMode)) * 31) + Boolean.hashCode(this.isUnifiedAccount);
    }

    public final boolean isUnifiedAccount() {
        return this.isUnifiedAccount;
    }

    @NotNull
    public String toString() {
        return "LeverageSettingData(tradeType=" + this.tradeType + ", leverage=" + this.leverage + ", rbMode=" + this.rbMode + ", isUnifiedAccount=" + this.isUnifiedAccount + ')';
    }

    public /* synthetic */ LeverageSettingData(int i11, BigDecimal bigDecimal, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1 : i11, (i13 & 2) != 0 ? new BigDecimal(5) : bigDecimal, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? false : z11);
    }
}
