package com.kubi.spot.business.mvi;

import com.kubi.core.spot.entity.ComplianceInfoEntity;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.mvi.SpotTradeContract$UIState, reason: from toString */
/* JADX INFO: compiled from: SpotTradeContract.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m90084d2 = {"Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;", "Lcom/kubi/mvi/state/IState;", "showCouponRedView", "", "bannerNoticeList", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "importantNoticeList", "complianceNoticeList", "riskWarningTips", "", "complianceInfo", "Lcom/kubi/core/spot/entity/ComplianceInfoEntity;", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/kubi/core/spot/entity/ComplianceInfoEntity;)V", "getShowCouponRedView", "()Z", "getBannerNoticeList", "()Ljava/util/List;", "getImportantNoticeList", "getComplianceNoticeList", "getRiskWarningTips", "()Ljava/lang/String;", "getComplianceInfo", "()Lcom/kubi/core/spot/entity/ComplianceInfoEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final List<SpotBannerItemEntity> bannerNoticeList;

    @Nullable
    private final ComplianceInfoEntity complianceInfo;

    @Nullable
    private final List<SpotBannerItemEntity> complianceNoticeList;

    @Nullable
    private final List<SpotBannerItemEntity> importantNoticeList;

    @Nullable
    private final String riskWarningTips;
    private final boolean showCouponRedView;

    public UIState() {
        this(false, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return this.showCouponRedView == uIState.showCouponRedView && Intrinsics.areEqual(this.bannerNoticeList, uIState.bannerNoticeList) && Intrinsics.areEqual(this.importantNoticeList, uIState.importantNoticeList) && Intrinsics.areEqual(this.complianceNoticeList, uIState.complianceNoticeList) && Intrinsics.areEqual(this.riskWarningTips, uIState.riskWarningTips) && Intrinsics.areEqual(this.complianceInfo, uIState.complianceInfo);
    }

    public UIState(boolean z11, @Nullable List<SpotBannerItemEntity> list, @Nullable List<SpotBannerItemEntity> list2, @Nullable List<SpotBannerItemEntity> list3, @Nullable String str, @Nullable ComplianceInfoEntity complianceInfoEntity) {
        this.showCouponRedView = z11;
        this.bannerNoticeList = list;
        this.importantNoticeList = list2;
        this.complianceNoticeList = list3;
        this.riskWarningTips = str;
        this.complianceInfo = complianceInfoEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, boolean z11, List list, List list2, List list3, String str, ComplianceInfoEntity complianceInfoEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = uIState.showCouponRedView;
        }
        if ((i11 & 2) != 0) {
            list = uIState.bannerNoticeList;
        }
        if ((i11 & 4) != 0) {
            list2 = uIState.importantNoticeList;
        }
        if ((i11 & 8) != 0) {
            list3 = uIState.complianceNoticeList;
        }
        if ((i11 & 16) != 0) {
            str = uIState.riskWarningTips;
        }
        if ((i11 & 32) != 0) {
            complianceInfoEntity = uIState.complianceInfo;
        }
        String str2 = str;
        ComplianceInfoEntity complianceInfoEntity2 = complianceInfoEntity;
        return uIState.copy(z11, list, list2, list3, str2, complianceInfoEntity2);
    }

    @NotNull
    public final UIState copy(boolean showCouponRedView, @Nullable List<SpotBannerItemEntity> bannerNoticeList, @Nullable List<SpotBannerItemEntity> importantNoticeList, @Nullable List<SpotBannerItemEntity> complianceNoticeList, @Nullable String riskWarningTips, @Nullable ComplianceInfoEntity complianceInfo) {
        return new UIState(showCouponRedView, bannerNoticeList, importantNoticeList, complianceNoticeList, riskWarningTips, complianceInfo);
    }

    @Nullable
    public final List<SpotBannerItemEntity> getBannerNoticeList() {
        return this.bannerNoticeList;
    }

    @Nullable
    public final ComplianceInfoEntity getComplianceInfo() {
        return this.complianceInfo;
    }

    @Nullable
    public final List<SpotBannerItemEntity> getComplianceNoticeList() {
        return this.complianceNoticeList;
    }

    @Nullable
    public final List<SpotBannerItemEntity> getImportantNoticeList() {
        return this.importantNoticeList;
    }

    @Nullable
    public final String getRiskWarningTips() {
        return this.riskWarningTips;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showCouponRedView) * 31;
        List<SpotBannerItemEntity> list = this.bannerNoticeList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SpotBannerItemEntity> list2 = this.importantNoticeList;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SpotBannerItemEntity> list3 = this.complianceNoticeList;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.riskWarningTips;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        ComplianceInfoEntity complianceInfoEntity = this.complianceInfo;
        return iHashCode5 + (complianceInfoEntity != null ? complianceInfoEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(showCouponRedView=" + this.showCouponRedView + ", bannerNoticeList=" + this.bannerNoticeList + ", importantNoticeList=" + this.importantNoticeList + ", complianceNoticeList=" + this.complianceNoticeList + ", riskWarningTips=" + this.riskWarningTips + ", complianceInfo=" + this.complianceInfo + ')';
    }

    public /* synthetic */ UIState(boolean z11, List list, List list2, List list3, String str, ComplianceInfoEntity complianceInfoEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : list2, (i11 & 8) != 0 ? null : list3, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : complianceInfoEntity);
    }
}
