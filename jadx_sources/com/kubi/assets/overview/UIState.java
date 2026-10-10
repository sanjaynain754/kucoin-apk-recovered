package com.kubi.assets.overview;

import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.ChartPoint;
import com.kubi.assets.entity.DynamicsEntity;
import com.kubi.assets.entity.NewOverviewEntity;
import com.kubi.assets.entity.OldOverviewEntity;
import com.kubi.assets.entity.OverviewItemEntity;
import com.kubi.assets.entity.RollbackEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.ArrayList;
import java.util.List;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.overview.AssetV2OverviewContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetV2OverviewContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BË\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010&J\t\u00107\u001a\u00020\fHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u001aHÆ\u0003JÒ\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00052\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\f2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010$R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\u000e\u0010&R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010$R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006G"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "list", "", "Lcom/kubi/assets/entity/OverviewItemEntity;", "throwable", "", "originDataList", "", "isChecked", "", "uiHideNumberFlag", "isNew", "isShowRollBackTip", "rollbackList", "Lcom/kubi/assets/entity/RollbackEntity;", "dynamicsBarList", "Lcom/kubi/assets/entity/DynamicsEntity;", "dynamicsCardList", "lineChartPointList", "Lcom/kubi/assets/entity/ChartPoint;", "newOverviewEntity", "Lcom/kubi/assets/entity/NewOverviewEntity;", "oldOverviewEntity", "Lcom/kubi/assets/entity/OldOverviewEntity;", "<init>", "(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/util/List;Ljava/lang/Throwable;Ljava/util/List;ZZLjava/lang/Boolean;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/entity/NewOverviewEntity;Lcom/kubi/assets/entity/OldOverviewEntity;)V", "getData", "()Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "getList", "()Ljava/util/List;", "getThrowable", "()Ljava/lang/Throwable;", "getOriginDataList", "()Z", "getUiHideNumberFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRollbackList", "getDynamicsBarList", "getDynamicsCardList", "getLineChartPointList", "getNewOverviewEntity", "()Lcom/kubi/assets/entity/NewOverviewEntity;", "getOldOverviewEntity", "()Lcom/kubi/assets/entity/OldOverviewEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/util/List;Ljava/lang/Throwable;Ljava/util/List;ZZLjava/lang/Boolean;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/entity/NewOverviewEntity;Lcom/kubi/assets/entity/OldOverviewEntity;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2OverviewContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2OverviewContract.kt\ncom/kubi/assets/overview/AssetV2OverviewContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,65:1\n135#2,2:66\n*S KotlinDebug\n*F\n+ 1 AssetV2OverviewContract.kt\ncom/kubi/assets/overview/AssetV2OverviewContract$UIState\n*L\n50#1:66,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final AssetV2OverviewEntity data;

    @Nullable
    private final List<DynamicsEntity> dynamicsBarList;

    @Nullable
    private final List<DynamicsEntity> dynamicsCardList;
    private final boolean isChecked;

    @Nullable
    private final Boolean isNew;
    private final boolean isShowRollBackTip;

    @Nullable
    private final List<ChartPoint> lineChartPointList;

    @Nullable
    private final List<OverviewItemEntity> list;

    @Nullable
    private final NewOverviewEntity newOverviewEntity;

    @Nullable
    private final OldOverviewEntity oldOverviewEntity;

    @NotNull
    private final List<OverviewItemEntity> originDataList;

    @Nullable
    private final List<RollbackEntity> rollbackList;

    @Nullable
    private final Throwable throwable;
    private final boolean uiHideNumberFlag;

    public UIState() {
        this(null, null, null, null, false, false, null, false, null, null, null, null, null, null, 16383, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.data, uIState.data) && Intrinsics.areEqual(this.list, uIState.list) && Intrinsics.areEqual(this.throwable, uIState.throwable) && Intrinsics.areEqual(this.originDataList, uIState.originDataList) && this.isChecked == uIState.isChecked && this.uiHideNumberFlag == uIState.uiHideNumberFlag && Intrinsics.areEqual(this.isNew, uIState.isNew) && this.isShowRollBackTip == uIState.isShowRollBackTip && Intrinsics.areEqual(this.rollbackList, uIState.rollbackList) && Intrinsics.areEqual(this.dynamicsBarList, uIState.dynamicsBarList) && Intrinsics.areEqual(this.dynamicsCardList, uIState.dynamicsCardList) && Intrinsics.areEqual(this.lineChartPointList, uIState.lineChartPointList) && Intrinsics.areEqual(this.newOverviewEntity, uIState.newOverviewEntity) && Intrinsics.areEqual(this.oldOverviewEntity, uIState.oldOverviewEntity);
    }

    public UIState(@Nullable AssetV2OverviewEntity assetV2OverviewEntity, @Nullable List<OverviewItemEntity> list, @Nullable Throwable th2, @NotNull List<OverviewItemEntity> originDataList, boolean z11, boolean z12, @Nullable Boolean bool, boolean z13, @Nullable List<RollbackEntity> list2, @Nullable List<DynamicsEntity> list3, @Nullable List<DynamicsEntity> list4, @Nullable List<ChartPoint> list5, @Nullable NewOverviewEntity newOverviewEntity, @Nullable OldOverviewEntity oldOverviewEntity) {
        Intrinsics.checkNotNullParameter(originDataList, "originDataList");
        this.data = assetV2OverviewEntity;
        this.list = list;
        this.throwable = th2;
        this.originDataList = originDataList;
        this.isChecked = z11;
        this.uiHideNumberFlag = z12;
        this.isNew = bool;
        this.isShowRollBackTip = z13;
        this.rollbackList = list2;
        this.dynamicsBarList = list3;
        this.dynamicsCardList = list4;
        this.lineChartPointList = list5;
        this.newOverviewEntity = newOverviewEntity;
        this.oldOverviewEntity = oldOverviewEntity;
    }

    @NotNull
    public final UIState copy(@Nullable AssetV2OverviewEntity data, @Nullable List<OverviewItemEntity> list, @Nullable Throwable throwable, @NotNull List<OverviewItemEntity> originDataList, boolean isChecked, boolean uiHideNumberFlag, @Nullable Boolean isNew, boolean isShowRollBackTip, @Nullable List<RollbackEntity> rollbackList, @Nullable List<DynamicsEntity> dynamicsBarList, @Nullable List<DynamicsEntity> dynamicsCardList, @Nullable List<ChartPoint> lineChartPointList, @Nullable NewOverviewEntity newOverviewEntity, @Nullable OldOverviewEntity oldOverviewEntity) {
        Intrinsics.checkNotNullParameter(originDataList, "originDataList");
        return new UIState(data, list, throwable, originDataList, isChecked, uiHideNumberFlag, isNew, isShowRollBackTip, rollbackList, dynamicsBarList, dynamicsCardList, lineChartPointList, newOverviewEntity, oldOverviewEntity);
    }

    @Nullable
    public final List<DynamicsEntity> getDynamicsBarList() {
        return this.dynamicsBarList;
    }

    @Nullable
    public final List<DynamicsEntity> getDynamicsCardList() {
        return this.dynamicsCardList;
    }

    @Nullable
    public final List<ChartPoint> getLineChartPointList() {
        return this.lineChartPointList;
    }

    @Nullable
    public final List<OverviewItemEntity> getList() {
        return this.list;
    }

    @Nullable
    public final NewOverviewEntity getNewOverviewEntity() {
        return this.newOverviewEntity;
    }

    @NotNull
    public final List<OverviewItemEntity> getOriginDataList() {
        return this.originDataList;
    }

    @Nullable
    public final List<RollbackEntity> getRollbackList() {
        return this.rollbackList;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public int hashCode() {
        AssetV2OverviewEntity assetV2OverviewEntity = this.data;
        int iHashCode = (assetV2OverviewEntity == null ? 0 : assetV2OverviewEntity.hashCode()) * 31;
        List<OverviewItemEntity> list = this.list;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Throwable th2 = this.throwable;
        int iHashCode3 = (((((((iHashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31) + this.originDataList.hashCode()) * 31) + Boolean.hashCode(this.isChecked)) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31;
        Boolean bool = this.isNew;
        int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isShowRollBackTip)) * 31;
        List<RollbackEntity> list2 = this.rollbackList;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<DynamicsEntity> list3 = this.dynamicsBarList;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<DynamicsEntity> list4 = this.dynamicsCardList;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<ChartPoint> list5 = this.lineChartPointList;
        int iHashCode8 = (iHashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        NewOverviewEntity newOverviewEntity = this.newOverviewEntity;
        int iHashCode9 = (iHashCode8 + (newOverviewEntity == null ? 0 : newOverviewEntity.hashCode())) * 31;
        OldOverviewEntity oldOverviewEntity = this.oldOverviewEntity;
        return iHashCode9 + (oldOverviewEntity != null ? oldOverviewEntity.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isShowRollBackTip, reason: from getter */
    public final boolean getIsShowRollBackTip() {
        return this.isShowRollBackTip;
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", list=" + this.list + ", throwable=" + this.throwable + ", originDataList=" + this.originDataList + ", isChecked=" + this.isChecked + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", isNew=" + this.isNew + ", isShowRollBackTip=" + this.isShowRollBackTip + ", rollbackList=" + this.rollbackList + ", dynamicsBarList=" + this.dynamicsBarList + ", dynamicsCardList=" + this.dynamicsCardList + ", lineChartPointList=" + this.lineChartPointList + ", newOverviewEntity=" + this.newOverviewEntity + ", oldOverviewEntity=" + this.oldOverviewEntity + ')';
    }

    public /* synthetic */ UIState(AssetV2OverviewEntity assetV2OverviewEntity, List list, Throwable th2, List list2, boolean z11, boolean z12, Boolean bool, boolean z13, List list3, List list4, List list5, List list6, NewOverviewEntity newOverviewEntity, OldOverviewEntity oldOverviewEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : assetV2OverviewEntity, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : th2, (i11 & 8) != 0 ? new ArrayList() : list2, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z12, (i11 & 64) != 0 ? null : bool, (i11 & 128) == 0 ? z13 : false, (i11 & 256) != 0 ? null : list3, (i11 & 512) != 0 ? null : list4, (i11 & 1024) != 0 ? null : list5, (i11 & 2048) != 0 ? null : list6, (i11 & 4096) != 0 ? null : newOverviewEntity, (i11 & 8192) != 0 ? null : oldOverviewEntity);
    }
}
