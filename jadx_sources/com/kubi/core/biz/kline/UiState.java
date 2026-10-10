package com.kubi.core.biz.kline;

import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p756xc.NTFInfo;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfContract$UiState, reason: from toString */
/* JADX INFO: compiled from: KLineNtfContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014¨\u0006\""}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfContract$UiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "symbol", "", "nftInfo", "Lcom/kubi/core/base/arch/api/data/NTFInfo;", "kLinePosition", "Lcom/kubi/core/biz/kline/KLinePosition;", "isInCallAuctionTrade", "", "isShowKLineContent", "isShowNftContent", "<init>", "(Ljava/lang/String;Lcom/kubi/core/base/arch/api/data/NTFInfo;Lcom/kubi/core/biz/kline/KLinePosition;ZZZ)V", "getSymbol", "()Ljava/lang/String;", "getNftInfo", "()Lcom/kubi/core/base/arch/api/data/NTFInfo;", "getKLinePosition", "()Lcom/kubi/core/biz/kline/KLinePosition;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiState implements InterfaceC19284f {
    private final boolean isInCallAuctionTrade;
    private final boolean isShowKLineContent;
    private final boolean isShowNftContent;

    @NotNull
    private final KLinePosition kLinePosition;

    @NotNull
    private final NTFInfo nftInfo;

    @Nullable
    private final String symbol;

    public UiState() {
        this(null, null, null, false, false, false, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiState)) {
            return false;
        }
        UiState uiState = (UiState) other;
        return Intrinsics.areEqual(this.symbol, uiState.symbol) && Intrinsics.areEqual(this.nftInfo, uiState.nftInfo) && Intrinsics.areEqual(this.kLinePosition, uiState.kLinePosition) && this.isInCallAuctionTrade == uiState.isInCallAuctionTrade && this.isShowKLineContent == uiState.isShowKLineContent && this.isShowNftContent == uiState.isShowNftContent;
    }

    public UiState(@Nullable String str, @NotNull NTFInfo nftInfo, @NotNull KLinePosition kLinePosition, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(nftInfo, "nftInfo");
        Intrinsics.checkNotNullParameter(kLinePosition, "kLinePosition");
        this.symbol = str;
        this.nftInfo = nftInfo;
        this.kLinePosition = kLinePosition;
        this.isInCallAuctionTrade = z11;
        this.isShowKLineContent = z12;
        this.isShowNftContent = z13;
    }

    public static /* synthetic */ UiState copy$default(UiState uiState, String str, NTFInfo nTFInfo, KLinePosition kLinePosition, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uiState.symbol;
        }
        if ((i11 & 2) != 0) {
            nTFInfo = uiState.nftInfo;
        }
        if ((i11 & 4) != 0) {
            kLinePosition = uiState.kLinePosition;
        }
        if ((i11 & 8) != 0) {
            z11 = uiState.isInCallAuctionTrade;
        }
        if ((i11 & 16) != 0) {
            z12 = uiState.isShowKLineContent;
        }
        if ((i11 & 32) != 0) {
            z13 = uiState.isShowNftContent;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return uiState.copy(str, nTFInfo, kLinePosition, z11, z14, z15);
    }

    @NotNull
    public final UiState copy(@Nullable String str, @NotNull NTFInfo nftInfo, @NotNull KLinePosition kLinePosition, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(nftInfo, "nftInfo");
        Intrinsics.checkNotNullParameter(kLinePosition, "kLinePosition");
        return new UiState(str, nftInfo, kLinePosition, z11, z12, z13);
    }

    @NotNull
    public final KLinePosition getKLinePosition() {
        return this.kLinePosition;
    }

    @NotNull
    public final NTFInfo getNftInfo() {
        return this.nftInfo;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.nftInfo.hashCode()) * 31) + this.kLinePosition.hashCode()) * 31) + Boolean.hashCode(this.isInCallAuctionTrade)) * 31) + Boolean.hashCode(this.isShowKLineContent)) * 31) + Boolean.hashCode(this.isShowNftContent);
    }

    /* JADX INFO: renamed from: isInCallAuctionTrade, reason: from getter */
    public final boolean getIsInCallAuctionTrade() {
        return this.isInCallAuctionTrade;
    }

    /* JADX INFO: renamed from: isShowKLineContent, reason: from getter */
    public final boolean getIsShowKLineContent() {
        return this.isShowKLineContent;
    }

    /* JADX INFO: renamed from: isShowNftContent, reason: from getter */
    public final boolean getIsShowNftContent() {
        return this.isShowNftContent;
    }

    @NotNull
    public String toString() {
        return "UiState(symbol=" + this.symbol + ", nftInfo=" + this.nftInfo + ", kLinePosition=" + this.kLinePosition + ", isInCallAuctionTrade=" + this.isInCallAuctionTrade + ", isShowKLineContent=" + this.isShowKLineContent + ", isShowNftContent=" + this.isShowNftContent + ')';
    }

    public /* synthetic */ UiState(String str, NTFInfo nTFInfo, KLinePosition kLinePosition, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? new NTFInfo(null, null, false, null, 15, null) : nTFInfo, (i11 & 4) != 0 ? KLinePosition.c.f20421a : kLinePosition, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13);
    }
}
