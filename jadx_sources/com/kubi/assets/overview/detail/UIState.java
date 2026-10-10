package com.kubi.assets.overview.detail;

import com.kubi.assets.entity.AssetCoinDetailEntity;
import com.kubi.assets.entity.ShowOnGoingEntity;
import com.kubi.assets.entity.ShowOnGoingFutureEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.overview.detail.AssetCoinDetailContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetCoinDetailContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UIState;", "Lcom/kubi/mvi/state/IState;", "assetCoinDetail", "Lcom/kubi/assets/entity/AssetCoinDetailEntity;", "showOnGoingEntity", "Lcom/kubi/assets/entity/ShowOnGoingEntity;", "showOnGoingFutureEntity", "Lcom/kubi/assets/entity/ShowOnGoingFutureEntity;", "<init>", "(Lcom/kubi/assets/entity/AssetCoinDetailEntity;Lcom/kubi/assets/entity/ShowOnGoingEntity;Lcom/kubi/assets/entity/ShowOnGoingFutureEntity;)V", "getAssetCoinDetail", "()Lcom/kubi/assets/entity/AssetCoinDetailEntity;", "getShowOnGoingEntity", "()Lcom/kubi/assets/entity/ShowOnGoingEntity;", "getShowOnGoingFutureEntity", "()Lcom/kubi/assets/entity/ShowOnGoingFutureEntity;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final AssetCoinDetailEntity assetCoinDetail;

    @Nullable
    private final ShowOnGoingEntity showOnGoingEntity;

    @Nullable
    private final ShowOnGoingFutureEntity showOnGoingFutureEntity;

    public UIState() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.assetCoinDetail, uIState.assetCoinDetail) && Intrinsics.areEqual(this.showOnGoingEntity, uIState.showOnGoingEntity) && Intrinsics.areEqual(this.showOnGoingFutureEntity, uIState.showOnGoingFutureEntity);
    }

    public UIState(@Nullable AssetCoinDetailEntity assetCoinDetailEntity, @Nullable ShowOnGoingEntity showOnGoingEntity, @Nullable ShowOnGoingFutureEntity showOnGoingFutureEntity) {
        this.assetCoinDetail = assetCoinDetailEntity;
        this.showOnGoingEntity = showOnGoingEntity;
        this.showOnGoingFutureEntity = showOnGoingFutureEntity;
    }

    public static /* synthetic */ UIState copy$default(UIState uIState, AssetCoinDetailEntity assetCoinDetailEntity, ShowOnGoingEntity showOnGoingEntity, ShowOnGoingFutureEntity showOnGoingFutureEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            assetCoinDetailEntity = uIState.assetCoinDetail;
        }
        if ((i11 & 2) != 0) {
            showOnGoingEntity = uIState.showOnGoingEntity;
        }
        if ((i11 & 4) != 0) {
            showOnGoingFutureEntity = uIState.showOnGoingFutureEntity;
        }
        return uIState.copy(assetCoinDetailEntity, showOnGoingEntity, showOnGoingFutureEntity);
    }

    @NotNull
    public final UIState copy(@Nullable AssetCoinDetailEntity assetCoinDetail, @Nullable ShowOnGoingEntity showOnGoingEntity, @Nullable ShowOnGoingFutureEntity showOnGoingFutureEntity) {
        return new UIState(assetCoinDetail, showOnGoingEntity, showOnGoingFutureEntity);
    }

    @Nullable
    public final AssetCoinDetailEntity getAssetCoinDetail() {
        return this.assetCoinDetail;
    }

    @Nullable
    public final ShowOnGoingEntity getShowOnGoingEntity() {
        return this.showOnGoingEntity;
    }

    @Nullable
    public final ShowOnGoingFutureEntity getShowOnGoingFutureEntity() {
        return this.showOnGoingFutureEntity;
    }

    public int hashCode() {
        AssetCoinDetailEntity assetCoinDetailEntity = this.assetCoinDetail;
        int iHashCode = (assetCoinDetailEntity == null ? 0 : assetCoinDetailEntity.hashCode()) * 31;
        ShowOnGoingEntity showOnGoingEntity = this.showOnGoingEntity;
        int iHashCode2 = (iHashCode + (showOnGoingEntity == null ? 0 : showOnGoingEntity.hashCode())) * 31;
        ShowOnGoingFutureEntity showOnGoingFutureEntity = this.showOnGoingFutureEntity;
        return iHashCode2 + (showOnGoingFutureEntity != null ? showOnGoingFutureEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(assetCoinDetail=" + this.assetCoinDetail + ", showOnGoingEntity=" + this.showOnGoingEntity + ", showOnGoingFutureEntity=" + this.showOnGoingFutureEntity + ')';
    }

    public /* synthetic */ UIState(AssetCoinDetailEntity assetCoinDetailEntity, ShowOnGoingEntity showOnGoingEntity, ShowOnGoingFutureEntity showOnGoingFutureEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : assetCoinDetailEntity, (i11 & 2) != 0 ? null : showOnGoingEntity, (i11 & 4) != 0 ? null : showOnGoingFutureEntity);
    }
}
