package com.kubi.futures.trade.position.vm;

import cm.InterfaceC5005j;
import com.facebook.react.uimanager.ViewProps;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.c0, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: AddMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/trade/position/vm/FetchUnifyCalculateParams;", "Lcom/kubi/kumex/data/trade/model/ICalculateParams;", "symbol", "", "lastMargin", "Ljava/math/BigDecimal;", ViewProps.MARGIN, "positionSide", "side", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getLastMargin", "()Ljava/math/BigDecimal;", "getMargin", "getPositionSide", "getSide", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FetchUnifyCalculateParams implements InterfaceC5005j {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final BigDecimal lastMargin;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final BigDecimal margin;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String positionSide;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final String side;

    public FetchUnifyCalculateParams() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchUnifyCalculateParams)) {
            return false;
        }
        FetchUnifyCalculateParams fetchUnifyCalculateParams = (FetchUnifyCalculateParams) other;
        return Intrinsics.areEqual(this.symbol, fetchUnifyCalculateParams.symbol) && Intrinsics.areEqual(this.lastMargin, fetchUnifyCalculateParams.lastMargin) && Intrinsics.areEqual(this.margin, fetchUnifyCalculateParams.margin) && Intrinsics.areEqual(this.positionSide, fetchUnifyCalculateParams.positionSide) && Intrinsics.areEqual(this.side, fetchUnifyCalculateParams.side);
    }

    public FetchUnifyCalculateParams(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str2, @Nullable String str3) {
        this.symbol = str;
        this.lastMargin = bigDecimal;
        this.margin = bigDecimal2;
        this.positionSide = str2;
        this.side = str3;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getLastMargin() {
        return this.lastMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getMargin() {
        return this.margin;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.lastMargin;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.margin;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.positionSide;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.side;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FetchUnifyCalculateParams(symbol=" + this.symbol + ", lastMargin=" + this.lastMargin + ", margin=" + this.margin + ", positionSide=" + this.positionSide + ", side=" + this.side + ')';
    }

    public /* synthetic */ FetchUnifyCalculateParams(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
    }
}
