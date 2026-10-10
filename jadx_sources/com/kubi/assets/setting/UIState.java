package com.kubi.assets.setting;

import com.kubi.assets.entity.AssetV2SettingEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.setting.AssetV2SettingContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetV2SettingContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J6\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/setting/AssetV2SettingContract$UIState;", "Lcom/kubi/mvi/state/IState;", "settingEntityList", "", "Lcom/kubi/assets/entity/AssetV2SettingEntity;", "getSingleCurrencyStatus", "", "uiHideNumberFlag", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Z)V", "getSettingEntityList", "()Ljava/util/List;", "getGetSingleCurrencyStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUiHideNumberFlag", "()Z", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Z)Lcom/kubi/assets/setting/AssetV2SettingContract$UIState;", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2SettingContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SettingContract.kt\ncom/kubi/assets/setting/AssetV2SettingContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,33:1\n135#2,2:34\n*S KotlinDebug\n*F\n+ 1 AssetV2SettingContract.kt\ncom/kubi/assets/setting/AssetV2SettingContract$UIState\n*L\n31#1:34,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final Boolean getSingleCurrencyStatus;

    @Nullable
    private final List<AssetV2SettingEntity> settingEntityList;
    private final boolean uiHideNumberFlag;

    public UIState() {
        this(null, null, false, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.settingEntityList, uIState.settingEntityList) && Intrinsics.areEqual(this.getSingleCurrencyStatus, uIState.getSingleCurrencyStatus) && this.uiHideNumberFlag == uIState.uiHideNumberFlag;
    }

    public UIState(@Nullable List<AssetV2SettingEntity> list, @Nullable Boolean bool, boolean z11) {
        this.settingEntityList = list;
        this.getSingleCurrencyStatus = bool;
        this.uiHideNumberFlag = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, Boolean bool, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uIState.settingEntityList;
        }
        if ((i11 & 2) != 0) {
            bool = uIState.getSingleCurrencyStatus;
        }
        if ((i11 & 4) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        return uIState.copy(list, bool, z11);
    }

    @NotNull
    public final UIState copy(@Nullable List<AssetV2SettingEntity> settingEntityList, @Nullable Boolean getSingleCurrencyStatus, boolean uiHideNumberFlag) {
        return new UIState(settingEntityList, getSingleCurrencyStatus, uiHideNumberFlag);
    }

    @Nullable
    public final Boolean getGetSingleCurrencyStatus() {
        return this.getSingleCurrencyStatus;
    }

    @Nullable
    public final List<AssetV2SettingEntity> getSettingEntityList() {
        return this.settingEntityList;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public int hashCode() {
        List<AssetV2SettingEntity> list = this.settingEntityList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.getSingleCurrencyStatus;
        return ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.uiHideNumberFlag);
    }

    @NotNull
    public String toString() {
        return "UIState(settingEntityList=" + this.settingEntityList + ", getSingleCurrencyStatus=" + this.getSingleCurrencyStatus + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ')';
    }

    public /* synthetic */ UIState(List list, Boolean bool, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11);
    }
}
