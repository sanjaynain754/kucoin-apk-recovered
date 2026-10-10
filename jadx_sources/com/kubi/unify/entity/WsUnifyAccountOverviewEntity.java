package com.kubi.unify.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u008d\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u000eHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m90084d2 = {"Lcom/kubi/unify/entity/WsUnifyAccountOverviewEntity;", "", "accountRiskRatio", "Ljava/math/BigDecimal;", "equity", "accountMarginEquity", "unrealisedPnl", "adjustedMargin", "totalLiability", "im", "mm", "availableMargin", "availableIsolatedMargin", FirebaseAnalytics.Param.CURRENCY, "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getAccountRiskRatio", "()Ljava/math/BigDecimal;", "getEquity", "getAccountMarginEquity", "getUnrealisedPnl", "getAdjustedMargin", "getTotalLiability", "getIm", "getMm", "getAvailableMargin", "getAvailableIsolatedMargin", "getCurrency", "()Ljava/lang/String;", "asUnifyAccountOverviewEntity", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsUnifyAccountOverviewEntity {

    @SerializedName("me")
    @Nullable
    private final BigDecimal accountMarginEquity;

    @SerializedName("r")
    @Nullable
    private final BigDecimal accountRiskRatio;

    @SerializedName("adM")
    @Nullable
    private final BigDecimal adjustedMargin;

    @SerializedName("aIM")
    @Nullable
    private final BigDecimal availableIsolatedMargin;

    @SerializedName("aM")
    @Nullable
    private final BigDecimal availableMargin;

    @SerializedName("c")
    @Nullable
    private final String currency;

    @SerializedName("e")
    @Nullable
    private final BigDecimal equity;

    @SerializedName("im")
    @Nullable
    private final BigDecimal im;

    @SerializedName("mm")
    @Nullable
    private final BigDecimal mm;

    @SerializedName("tL")
    @Nullable
    private final BigDecimal totalLiability;

    @SerializedName("uPL")
    @Nullable
    private final BigDecimal unrealisedPnl;

    public WsUnifyAccountOverviewEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ WsUnifyAccountOverviewEntity copy$default(WsUnifyAccountOverviewEntity wsUnifyAccountOverviewEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = wsUnifyAccountOverviewEntity.accountRiskRatio;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = wsUnifyAccountOverviewEntity.equity;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = wsUnifyAccountOverviewEntity.accountMarginEquity;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = wsUnifyAccountOverviewEntity.unrealisedPnl;
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = wsUnifyAccountOverviewEntity.adjustedMargin;
        }
        if ((i11 & 32) != 0) {
            bigDecimal6 = wsUnifyAccountOverviewEntity.totalLiability;
        }
        if ((i11 & 64) != 0) {
            bigDecimal7 = wsUnifyAccountOverviewEntity.im;
        }
        if ((i11 & 128) != 0) {
            bigDecimal8 = wsUnifyAccountOverviewEntity.mm;
        }
        if ((i11 & 256) != 0) {
            bigDecimal9 = wsUnifyAccountOverviewEntity.availableMargin;
        }
        if ((i11 & 512) != 0) {
            bigDecimal10 = wsUnifyAccountOverviewEntity.availableIsolatedMargin;
        }
        if ((i11 & 1024) != 0) {
            str = wsUnifyAccountOverviewEntity.currency;
        }
        BigDecimal bigDecimal11 = bigDecimal10;
        String str2 = str;
        BigDecimal bigDecimal12 = bigDecimal8;
        BigDecimal bigDecimal13 = bigDecimal9;
        BigDecimal bigDecimal14 = bigDecimal6;
        BigDecimal bigDecimal15 = bigDecimal7;
        BigDecimal bigDecimal16 = bigDecimal5;
        BigDecimal bigDecimal17 = bigDecimal3;
        return wsUnifyAccountOverviewEntity.copy(bigDecimal, bigDecimal2, bigDecimal17, bigDecimal4, bigDecimal16, bigDecimal14, bigDecimal15, bigDecimal12, bigDecimal13, bigDecimal11, str2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsUnifyAccountOverviewEntity)) {
            return false;
        }
        WsUnifyAccountOverviewEntity wsUnifyAccountOverviewEntity = (WsUnifyAccountOverviewEntity) other;
        return Intrinsics.areEqual(this.accountRiskRatio, wsUnifyAccountOverviewEntity.accountRiskRatio) && Intrinsics.areEqual(this.equity, wsUnifyAccountOverviewEntity.equity) && Intrinsics.areEqual(this.accountMarginEquity, wsUnifyAccountOverviewEntity.accountMarginEquity) && Intrinsics.areEqual(this.unrealisedPnl, wsUnifyAccountOverviewEntity.unrealisedPnl) && Intrinsics.areEqual(this.adjustedMargin, wsUnifyAccountOverviewEntity.adjustedMargin) && Intrinsics.areEqual(this.totalLiability, wsUnifyAccountOverviewEntity.totalLiability) && Intrinsics.areEqual(this.im, wsUnifyAccountOverviewEntity.im) && Intrinsics.areEqual(this.mm, wsUnifyAccountOverviewEntity.mm) && Intrinsics.areEqual(this.availableMargin, wsUnifyAccountOverviewEntity.availableMargin) && Intrinsics.areEqual(this.availableIsolatedMargin, wsUnifyAccountOverviewEntity.availableIsolatedMargin) && Intrinsics.areEqual(this.currency, wsUnifyAccountOverviewEntity.currency);
    }

    public WsUnifyAccountOverviewEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable String str) {
        this.accountRiskRatio = bigDecimal;
        this.equity = bigDecimal2;
        this.accountMarginEquity = bigDecimal3;
        this.unrealisedPnl = bigDecimal4;
        this.adjustedMargin = bigDecimal5;
        this.totalLiability = bigDecimal6;
        this.im = bigDecimal7;
        this.mm = bigDecimal8;
        this.availableMargin = bigDecimal9;
        this.availableIsolatedMargin = bigDecimal10;
        this.currency = str;
    }

    @NotNull
    public final UnifyAccountOverviewEntity asUnifyAccountOverviewEntity() {
        return new UnifyAccountOverviewEntity(this.accountRiskRatio, this.equity, this.accountMarginEquity, this.unrealisedPnl, this.adjustedMargin, this.totalLiability, this.im, this.mm, this.availableMargin, this.availableIsolatedMargin, null, this.currency);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAccountRiskRatio() {
        return this.accountRiskRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getAvailableIsolatedMargin() {
        return this.availableIsolatedMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getAccountMarginEquity() {
        return this.accountMarginEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getAdjustedMargin() {
        return this.adjustedMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getIm() {
        return this.im;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getMm() {
        return this.mm;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getAvailableMargin() {
        return this.availableMargin;
    }

    @NotNull
    public final WsUnifyAccountOverviewEntity copy(@Nullable BigDecimal accountRiskRatio, @Nullable BigDecimal equity, @Nullable BigDecimal accountMarginEquity, @Nullable BigDecimal unrealisedPnl, @Nullable BigDecimal adjustedMargin, @Nullable BigDecimal totalLiability, @Nullable BigDecimal im2, @Nullable BigDecimal mm2, @Nullable BigDecimal availableMargin, @Nullable BigDecimal availableIsolatedMargin, @Nullable String currency) {
        return new WsUnifyAccountOverviewEntity(accountRiskRatio, equity, accountMarginEquity, unrealisedPnl, adjustedMargin, totalLiability, im2, mm2, availableMargin, availableIsolatedMargin, currency);
    }

    @Nullable
    public final BigDecimal getAccountMarginEquity() {
        return this.accountMarginEquity;
    }

    @Nullable
    public final BigDecimal getAccountRiskRatio() {
        return this.accountRiskRatio;
    }

    @Nullable
    public final BigDecimal getAdjustedMargin() {
        return this.adjustedMargin;
    }

    @Nullable
    public final BigDecimal getAvailableIsolatedMargin() {
        return this.availableIsolatedMargin;
    }

    @Nullable
    public final BigDecimal getAvailableMargin() {
        return this.availableMargin;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    public final BigDecimal getIm() {
        return this.im;
    }

    @Nullable
    public final BigDecimal getMm() {
        return this.mm;
    }

    @Nullable
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.accountRiskRatio;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.equity;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.accountMarginEquity;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.unrealisedPnl;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.adjustedMargin;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.totalLiability;
        int iHashCode6 = (iHashCode5 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.im;
        int iHashCode7 = (iHashCode6 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.mm;
        int iHashCode8 = (iHashCode7 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.availableMargin;
        int iHashCode9 = (iHashCode8 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.availableIsolatedMargin;
        int iHashCode10 = (iHashCode9 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        String str = this.currency;
        return iHashCode10 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsUnifyAccountOverviewEntity(accountRiskRatio=" + this.accountRiskRatio + ", equity=" + this.equity + ", accountMarginEquity=" + this.accountMarginEquity + ", unrealisedPnl=" + this.unrealisedPnl + ", adjustedMargin=" + this.adjustedMargin + ", totalLiability=" + this.totalLiability + ", im=" + this.im + ", mm=" + this.mm + ", availableMargin=" + this.availableMargin + ", availableIsolatedMargin=" + this.availableIsolatedMargin + ", currency=" + this.currency + ')';
    }

    public /* synthetic */ WsUnifyAccountOverviewEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal2, (i11 & 4) != 0 ? BigDecimal.ZERO : bigDecimal3, (i11 & 8) != 0 ? BigDecimal.ZERO : bigDecimal4, (i11 & 16) != 0 ? BigDecimal.ZERO : bigDecimal5, (i11 & 32) != 0 ? BigDecimal.ZERO : bigDecimal6, (i11 & 64) != 0 ? BigDecimal.ZERO : bigDecimal7, (i11 & 128) != 0 ? BigDecimal.ZERO : bigDecimal8, (i11 & 256) != 0 ? BigDecimal.ZERO : bigDecimal9, (i11 & 512) != 0 ? BigDecimal.ZERO : bigDecimal10, (i11 & 1024) != 0 ? null : str);
    }
}
