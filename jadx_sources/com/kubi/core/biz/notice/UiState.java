package com.kubi.core.biz.notice;

import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.notice.ImportNoticeContract$UiState, reason: from toString */
/* JADX INFO: compiled from: ImportNoticeContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006$"}, m90084d2 = {"Lcom/kubi/core/biz/notice/ImportNoticeContract$UiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "symbol", "", "importantNoticeList", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "riskTips", "showImportantNotice", "", "showRiskTips", "showEtfTips", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZ)V", "getSymbol", "()Ljava/lang/String;", "getImportantNoticeList", "()Ljava/util/List;", "getRiskTips", "getShowImportantNotice", "()Z", "getShowRiskTips", "getShowEtfTips", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiState implements InterfaceC19284f {

    @Nullable
    private final List<SpotBannerItemEntity> importantNoticeList;

    @Nullable
    private final String riskTips;
    private final boolean showEtfTips;
    private final boolean showImportantNotice;
    private final boolean showRiskTips;

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
        return Intrinsics.areEqual(this.symbol, uiState.symbol) && Intrinsics.areEqual(this.importantNoticeList, uiState.importantNoticeList) && Intrinsics.areEqual(this.riskTips, uiState.riskTips) && this.showImportantNotice == uiState.showImportantNotice && this.showRiskTips == uiState.showRiskTips && this.showEtfTips == uiState.showEtfTips;
    }

    public UiState(@Nullable String str, @Nullable List<SpotBannerItemEntity> list, @Nullable String str2, boolean z11, boolean z12, boolean z13) {
        this.symbol = str;
        this.importantNoticeList = list;
        this.riskTips = str2;
        this.showImportantNotice = z11;
        this.showRiskTips = z12;
        this.showEtfTips = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiState copy$default(UiState uiState, String str, List list, String str2, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uiState.symbol;
        }
        if ((i11 & 2) != 0) {
            list = uiState.importantNoticeList;
        }
        if ((i11 & 4) != 0) {
            str2 = uiState.riskTips;
        }
        if ((i11 & 8) != 0) {
            z11 = uiState.showImportantNotice;
        }
        if ((i11 & 16) != 0) {
            z12 = uiState.showRiskTips;
        }
        if ((i11 & 32) != 0) {
            z13 = uiState.showEtfTips;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return uiState.copy(str, list, str2, z11, z14, z15);
    }

    @NotNull
    public final UiState copy(@Nullable String symbol, @Nullable List<SpotBannerItemEntity> importantNoticeList, @Nullable String riskTips, boolean showImportantNotice, boolean showRiskTips, boolean showEtfTips) {
        return new UiState(symbol, importantNoticeList, riskTips, showImportantNotice, showRiskTips, showEtfTips);
    }

    @Nullable
    public final List<SpotBannerItemEntity> getImportantNoticeList() {
        return this.importantNoticeList;
    }

    @Nullable
    public final String getRiskTips() {
        return this.riskTips;
    }

    public final boolean getShowEtfTips() {
        return this.showEtfTips;
    }

    public final boolean getShowImportantNotice() {
        return this.showImportantNotice;
    }

    public final boolean getShowRiskTips() {
        return this.showRiskTips;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SpotBannerItemEntity> list = this.importantNoticeList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.riskTips;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showImportantNotice)) * 31) + Boolean.hashCode(this.showRiskTips)) * 31) + Boolean.hashCode(this.showEtfTips);
    }

    @NotNull
    public String toString() {
        return "UiState(symbol=" + this.symbol + ", importantNoticeList=" + this.importantNoticeList + ", riskTips=" + this.riskTips + ", showImportantNotice=" + this.showImportantNotice + ", showRiskTips=" + this.showRiskTips + ", showEtfTips=" + this.showEtfTips + ')';
    }

    public /* synthetic */ UiState(String str, List list, String str2, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13);
    }
}
