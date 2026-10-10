package com.kubi.futures.trade.position;

import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesPositionAggregateManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/futures/trade/position/KLineShowEntity;", "", "pnl", "", "pnlRate", "liqPrice", "leverage", "openPrice", "qty", ViewProps.MARGIN, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPnl", "()Ljava/lang/String;", "getPnlRate", "getLiqPrice", "getLeverage", "getOpenPrice", "getQty", "getMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KLineShowEntity {

    @Nullable
    private final String leverage;

    @Nullable
    private final String liqPrice;

    @Nullable
    private final String margin;

    @Nullable
    private final String openPrice;

    @Nullable
    private final String pnl;

    @Nullable
    private final String pnlRate;

    @Nullable
    private final String qty;

    public KLineShowEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KLineShowEntity)) {
            return false;
        }
        KLineShowEntity kLineShowEntity = (KLineShowEntity) other;
        return Intrinsics.areEqual(this.pnl, kLineShowEntity.pnl) && Intrinsics.areEqual(this.pnlRate, kLineShowEntity.pnlRate) && Intrinsics.areEqual(this.liqPrice, kLineShowEntity.liqPrice) && Intrinsics.areEqual(this.leverage, kLineShowEntity.leverage) && Intrinsics.areEqual(this.openPrice, kLineShowEntity.openPrice) && Intrinsics.areEqual(this.qty, kLineShowEntity.qty) && Intrinsics.areEqual(this.margin, kLineShowEntity.margin);
    }

    public KLineShowEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.pnl = str;
        this.pnlRate = str2;
        this.liqPrice = str3;
        this.leverage = str4;
        this.openPrice = str5;
        this.qty = str6;
        this.margin = str7;
    }

    public static /* synthetic */ KLineShowEntity copy$default(KLineShowEntity kLineShowEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kLineShowEntity.pnl;
        }
        if ((i11 & 2) != 0) {
            str2 = kLineShowEntity.pnlRate;
        }
        if ((i11 & 4) != 0) {
            str3 = kLineShowEntity.liqPrice;
        }
        if ((i11 & 8) != 0) {
            str4 = kLineShowEntity.leverage;
        }
        if ((i11 & 16) != 0) {
            str5 = kLineShowEntity.openPrice;
        }
        if ((i11 & 32) != 0) {
            str6 = kLineShowEntity.qty;
        }
        if ((i11 & 64) != 0) {
            str7 = kLineShowEntity.margin;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return kLineShowEntity.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPnlRate() {
        return this.pnlRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLiqPrice() {
        return this.liqPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOpenPrice() {
        return this.openPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQty() {
        return this.qty;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMargin() {
        return this.margin;
    }

    @NotNull
    public final KLineShowEntity copy(@Nullable String pnl, @Nullable String pnlRate, @Nullable String liqPrice, @Nullable String leverage, @Nullable String openPrice, @Nullable String qty, @Nullable String margin) {
        return new KLineShowEntity(pnl, pnlRate, liqPrice, leverage, openPrice, qty, margin);
    }

    @Nullable
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getLiqPrice() {
        return this.liqPrice;
    }

    @Nullable
    public final String getMargin() {
        return this.margin;
    }

    @Nullable
    public final String getOpenPrice() {
        return this.openPrice;
    }

    @Nullable
    public final String getPnl() {
        return this.pnl;
    }

    @Nullable
    public final String getPnlRate() {
        return this.pnlRate;
    }

    @Nullable
    public final String getQty() {
        return this.qty;
    }

    public int hashCode() {
        String str = this.pnl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pnlRate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.liqPrice;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leverage;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.openPrice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.qty;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.margin;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KLineShowEntity(pnl=" + this.pnl + ", pnlRate=" + this.pnlRate + ", liqPrice=" + this.liqPrice + ", leverage=" + this.leverage + ", openPrice=" + this.openPrice + ", qty=" + this.qty + ", margin=" + this.margin + ')';
    }

    public /* synthetic */ KLineShowEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }
}
