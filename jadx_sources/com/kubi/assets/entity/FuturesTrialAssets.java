package com.kubi.assets.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesTrialAssets.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003Ji\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\nHÖ\u0001J\t\u00100\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001d\"\u0004\b \u0010!¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/entity/FuturesTrialAssets;", "", "balance", "", "balanceLegal", "realizedPnl", "realizedPnlLegal", "realizedPnlNum", "", "version", "", "code", "", "status", "prizeType", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/CharSequence;", "getBalanceLegal", "getRealizedPnl", "getRealizedPnlLegal", "getRealizedPnlNum", "()D", "getVersion", "()I", "setVersion", "(I)V", "getCode", "()Ljava/lang/String;", "getStatus", "getPrizeType", "setPrizeType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesTrialAssets {

    @NotNull
    private final CharSequence balance;

    @NotNull
    private final CharSequence balanceLegal;

    @Nullable
    private final String code;

    @Nullable
    private String prizeType;

    @NotNull
    private final CharSequence realizedPnl;

    @NotNull
    private final CharSequence realizedPnlLegal;
    private final double realizedPnlNum;

    @Nullable
    private final String status;
    private int version;

    public FuturesTrialAssets(@NotNull CharSequence balance, @NotNull CharSequence balanceLegal, @NotNull CharSequence realizedPnl, @NotNull CharSequence realizedPnlLegal, double d11, int i11, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(balanceLegal, "balanceLegal");
        Intrinsics.checkNotNullParameter(realizedPnl, "realizedPnl");
        Intrinsics.checkNotNullParameter(realizedPnlLegal, "realizedPnlLegal");
        this.balance = balance;
        this.balanceLegal = balanceLegal;
        this.realizedPnl = realizedPnl;
        this.realizedPnlLegal = realizedPnlLegal;
        this.realizedPnlNum = d11;
        this.version = i11;
        this.code = str;
        this.status = str2;
        this.prizeType = str3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesTrialAssets)) {
            return false;
        }
        FuturesTrialAssets futuresTrialAssets = (FuturesTrialAssets) other;
        return Intrinsics.areEqual(this.balance, futuresTrialAssets.balance) && Intrinsics.areEqual(this.balanceLegal, futuresTrialAssets.balanceLegal) && Intrinsics.areEqual(this.realizedPnl, futuresTrialAssets.realizedPnl) && Intrinsics.areEqual(this.realizedPnlLegal, futuresTrialAssets.realizedPnlLegal) && Double.compare(this.realizedPnlNum, futuresTrialAssets.realizedPnlNum) == 0 && this.version == futuresTrialAssets.version && Intrinsics.areEqual(this.code, futuresTrialAssets.code) && Intrinsics.areEqual(this.status, futuresTrialAssets.status) && Intrinsics.areEqual(this.prizeType, futuresTrialAssets.prizeType);
    }

    public static /* synthetic */ FuturesTrialAssets copy$default(FuturesTrialAssets futuresTrialAssets, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, double d11, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = futuresTrialAssets.balance;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = futuresTrialAssets.balanceLegal;
        }
        if ((i12 & 4) != 0) {
            charSequence3 = futuresTrialAssets.realizedPnl;
        }
        if ((i12 & 8) != 0) {
            charSequence4 = futuresTrialAssets.realizedPnlLegal;
        }
        if ((i12 & 16) != 0) {
            d11 = futuresTrialAssets.realizedPnlNum;
        }
        if ((i12 & 32) != 0) {
            i11 = futuresTrialAssets.version;
        }
        if ((i12 & 64) != 0) {
            str = futuresTrialAssets.code;
        }
        if ((i12 & 128) != 0) {
            str2 = futuresTrialAssets.status;
        }
        if ((i12 & 256) != 0) {
            str3 = futuresTrialAssets.prizeType;
        }
        double d12 = d11;
        CharSequence charSequence5 = charSequence3;
        CharSequence charSequence6 = charSequence4;
        return futuresTrialAssets.copy(charSequence, charSequence2, charSequence5, charSequence6, d12, i11, str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CharSequence getBalance() {
        return this.balance;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CharSequence getBalanceLegal() {
        return this.balanceLegal;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CharSequence getRealizedPnl() {
        return this.realizedPnl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CharSequence getRealizedPnlLegal() {
        return this.realizedPnlLegal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getRealizedPnlNum() {
        return this.realizedPnlNum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @NotNull
    public final FuturesTrialAssets copy(@NotNull CharSequence balance, @NotNull CharSequence balanceLegal, @NotNull CharSequence realizedPnl, @NotNull CharSequence realizedPnlLegal, double realizedPnlNum, int version, @Nullable String code, @Nullable String status, @Nullable String prizeType) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(balanceLegal, "balanceLegal");
        Intrinsics.checkNotNullParameter(realizedPnl, "realizedPnl");
        Intrinsics.checkNotNullParameter(realizedPnlLegal, "realizedPnlLegal");
        return new FuturesTrialAssets(balance, balanceLegal, realizedPnl, realizedPnlLegal, realizedPnlNum, version, code, status, prizeType);
    }

    @NotNull
    public final CharSequence getBalance() {
        return this.balance;
    }

    @NotNull
    public final CharSequence getBalanceLegal() {
        return this.balanceLegal;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @NotNull
    public final CharSequence getRealizedPnl() {
        return this.realizedPnl;
    }

    @NotNull
    public final CharSequence getRealizedPnlLegal() {
        return this.realizedPnlLegal;
    }

    public final double getRealizedPnlNum() {
        return this.realizedPnlNum;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.balance.hashCode() * 31) + this.balanceLegal.hashCode()) * 31) + this.realizedPnl.hashCode()) * 31) + this.realizedPnlLegal.hashCode()) * 31) + Double.hashCode(this.realizedPnlNum)) * 31) + Integer.hashCode(this.version)) * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prizeType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setPrizeType(@Nullable String str) {
        this.prizeType = str;
    }

    public final void setVersion(int i11) {
        this.version = i11;
    }

    @NotNull
    public String toString() {
        return "FuturesTrialAssets(balance=" + ((Object) this.balance) + ", balanceLegal=" + ((Object) this.balanceLegal) + ", realizedPnl=" + ((Object) this.realizedPnl) + ", realizedPnlLegal=" + ((Object) this.realizedPnlLegal) + ", realizedPnlNum=" + this.realizedPnlNum + ", version=" + this.version + ", code=" + this.code + ", status=" + this.status + ", prizeType=" + this.prizeType + ')';
    }

    public /* synthetic */ FuturesTrialAssets(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, double d11, int i11, String str, String str2, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, charSequence2, charSequence3, charSequence4, d11, i11, (i12 & 64) != 0 ? null : str, (i12 & 128) != 0 ? null : str2, (i12 & 256) != 0 ? null : str3);
    }
}
