package com.kubi.core.biz.banner;

import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.banner.SpotBannerContract$SpotBannerUiState, reason: from toString */
/* JADX INFO: compiled from: SpotBannerContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/biz/banner/SpotBannerContract$SpotBannerUiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "bannerNoticeList", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "complianceNoticeList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getBannerNoticeList", "()Ljava/util/List;", "getComplianceNoticeList", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotBannerUiState implements InterfaceC19284f {

    @Nullable
    private final List<SpotBannerItemEntity> bannerNoticeList;

    @Nullable
    private final List<SpotBannerItemEntity> complianceNoticeList;

    /* JADX WARN: Multi-variable type inference failed */
    public SpotBannerUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotBannerUiState)) {
            return false;
        }
        SpotBannerUiState spotBannerUiState = (SpotBannerUiState) other;
        return Intrinsics.areEqual(this.bannerNoticeList, spotBannerUiState.bannerNoticeList) && Intrinsics.areEqual(this.complianceNoticeList, spotBannerUiState.complianceNoticeList);
    }

    public SpotBannerUiState(@Nullable List<SpotBannerItemEntity> list, @Nullable List<SpotBannerItemEntity> list2) {
        this.bannerNoticeList = list;
        this.complianceNoticeList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotBannerUiState copy$default(SpotBannerUiState spotBannerUiState, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = spotBannerUiState.bannerNoticeList;
        }
        if ((i11 & 2) != 0) {
            list2 = spotBannerUiState.complianceNoticeList;
        }
        return spotBannerUiState.copy(list, list2);
    }

    @NotNull
    public final SpotBannerUiState copy(@Nullable List<SpotBannerItemEntity> bannerNoticeList, @Nullable List<SpotBannerItemEntity> complianceNoticeList) {
        return new SpotBannerUiState(bannerNoticeList, complianceNoticeList);
    }

    @Nullable
    public final List<SpotBannerItemEntity> getBannerNoticeList() {
        return this.bannerNoticeList;
    }

    @Nullable
    public final List<SpotBannerItemEntity> getComplianceNoticeList() {
        return this.complianceNoticeList;
    }

    public int hashCode() {
        List<SpotBannerItemEntity> list = this.bannerNoticeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SpotBannerItemEntity> list2 = this.complianceNoticeList;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpotBannerUiState(bannerNoticeList=" + this.bannerNoticeList + ", complianceNoticeList=" + this.complianceNoticeList + ')';
    }

    public /* synthetic */ SpotBannerUiState(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2);
    }
}
