package com.kubi.assets.futures.coins;

import com.kubi.assets.entity.AssetFuturesEntity;
import com.kubi.assets.entity.FuturesTrialAssets;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import io.chad.library.adapter.base.entity.SectionEntity;
import java.util.List;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetFuturesCoinsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010$\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, m90084d2 = {"Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "", "Lio/chad/library/adapter/base/entity/SectionEntity;", "Lcom/kubi/kumex/entity/BalanceEntity;", "futureData", "Lcom/kubi/assets/entity/AssetFuturesEntity;", "uiHideNumberFlag", "", "trialData", "Lcom/kubi/assets/entity/FuturesTrialAssets;", "hasActiveTrial", "spotPnlOverview", "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;", "<init>", "(Ljava/util/List;Lcom/kubi/assets/entity/AssetFuturesEntity;ZLcom/kubi/assets/entity/FuturesTrialAssets;Ljava/lang/Boolean;Lcom/kubi/assets/entity/SpotAccountOverviewEntity;)V", "getData", "()Ljava/util/List;", "getFutureData", "()Lcom/kubi/assets/entity/AssetFuturesEntity;", "getUiHideNumberFlag", "()Z", "getTrialData", "()Lcom/kubi/assets/entity/FuturesTrialAssets;", "getHasActiveTrial", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSpotPnlOverview", "()Lcom/kubi/assets/entity/SpotAccountOverviewEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Lcom/kubi/assets/entity/AssetFuturesEntity;ZLcom/kubi/assets/entity/FuturesTrialAssets;Ljava/lang/Boolean;Lcom/kubi/assets/entity/SpotAccountOverviewEntity;)Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetFuturesCoinsContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,223:1\n135#2,2:224\n*S KotlinDebug\n*F\n+ 1 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState\n*L\n69#1:224,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final List<SectionEntity<BalanceEntity>> data;

    @Nullable
    private final AssetFuturesEntity futureData;

    @Nullable
    private final Boolean hasActiveTrial;

    @Nullable
    private final SpotAccountOverviewEntity spotPnlOverview;

    @Nullable
    private final FuturesTrialAssets trialData;
    private final boolean uiHideNumberFlag;

    public UIState() {
        this(null, null, false, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.data, uIState.data) && Intrinsics.areEqual(this.futureData, uIState.futureData) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && Intrinsics.areEqual(this.trialData, uIState.trialData) && Intrinsics.areEqual(this.hasActiveTrial, uIState.hasActiveTrial) && Intrinsics.areEqual(this.spotPnlOverview, uIState.spotPnlOverview);
    }

    public UIState(@Nullable List<SectionEntity<BalanceEntity>> list, @Nullable AssetFuturesEntity assetFuturesEntity, boolean z11, @Nullable FuturesTrialAssets futuresTrialAssets, @Nullable Boolean bool, @Nullable SpotAccountOverviewEntity spotAccountOverviewEntity) {
        this.data = list;
        this.futureData = assetFuturesEntity;
        this.uiHideNumberFlag = z11;
        this.trialData = futuresTrialAssets;
        this.hasActiveTrial = bool;
        this.spotPnlOverview = spotAccountOverviewEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, AssetFuturesEntity assetFuturesEntity, boolean z11, FuturesTrialAssets futuresTrialAssets, Boolean bool, SpotAccountOverviewEntity spotAccountOverviewEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uIState.data;
        }
        if ((i11 & 2) != 0) {
            assetFuturesEntity = uIState.futureData;
        }
        if ((i11 & 4) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 8) != 0) {
            futuresTrialAssets = uIState.trialData;
        }
        if ((i11 & 16) != 0) {
            bool = uIState.hasActiveTrial;
        }
        if ((i11 & 32) != 0) {
            spotAccountOverviewEntity = uIState.spotPnlOverview;
        }
        Boolean bool2 = bool;
        SpotAccountOverviewEntity spotAccountOverviewEntity2 = spotAccountOverviewEntity;
        return uIState.copy(list, assetFuturesEntity, z11, futuresTrialAssets, bool2, spotAccountOverviewEntity2);
    }

    @NotNull
    public final UIState copy(@Nullable List<SectionEntity<BalanceEntity>> data, @Nullable AssetFuturesEntity futureData, boolean uiHideNumberFlag, @Nullable FuturesTrialAssets trialData, @Nullable Boolean hasActiveTrial, @Nullable SpotAccountOverviewEntity spotPnlOverview) {
        return new UIState(data, futureData, uiHideNumberFlag, trialData, hasActiveTrial, spotPnlOverview);
    }

    @Nullable
    public final List<SectionEntity<BalanceEntity>> getData() {
        return this.data;
    }

    @Nullable
    public final AssetFuturesEntity getFutureData() {
        return this.futureData;
    }

    @Nullable
    public final Boolean getHasActiveTrial() {
        return this.hasActiveTrial;
    }

    @Nullable
    public final SpotAccountOverviewEntity getSpotPnlOverview() {
        return this.spotPnlOverview;
    }

    @Nullable
    public final FuturesTrialAssets getTrialData() {
        return this.trialData;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public int hashCode() {
        List<SectionEntity<BalanceEntity>> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        AssetFuturesEntity assetFuturesEntity = this.futureData;
        int iHashCode2 = (((iHashCode + (assetFuturesEntity == null ? 0 : assetFuturesEntity.hashCode())) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31;
        FuturesTrialAssets futuresTrialAssets = this.trialData;
        int iHashCode3 = (iHashCode2 + (futuresTrialAssets == null ? 0 : futuresTrialAssets.hashCode())) * 31;
        Boolean bool = this.hasActiveTrial;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        SpotAccountOverviewEntity spotAccountOverviewEntity = this.spotPnlOverview;
        return iHashCode4 + (spotAccountOverviewEntity != null ? spotAccountOverviewEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", futureData=" + this.futureData + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", trialData=" + this.trialData + ", hasActiveTrial=" + this.hasActiveTrial + ", spotPnlOverview=" + this.spotPnlOverview + ')';
    }

    public /* synthetic */ UIState(List list, AssetFuturesEntity assetFuturesEntity, boolean z11, FuturesTrialAssets futuresTrialAssets, Boolean bool, SpotAccountOverviewEntity spotAccountOverviewEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : assetFuturesEntity, (i11 & 4) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 8) != 0 ? null : futuresTrialAssets, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : spotAccountOverviewEntity);
    }
}
