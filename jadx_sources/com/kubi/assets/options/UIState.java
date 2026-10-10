package com.kubi.assets.options;

import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.options.AssetOptionsContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetOptionsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/assets/options/AssetOptionsContract$UIState;", "Lcom/kubi/mvi/state/IState;", "uiHideNumberFlag", "", "optionsOverviewEntity", "Lcom/kubi/assets/entity/OptionsOverviewEntity;", "<init>", "(ZLcom/kubi/assets/entity/OptionsOverviewEntity;)V", "getUiHideNumberFlag", "()Z", "getOptionsOverviewEntity", "()Lcom/kubi/assets/entity/OptionsOverviewEntity;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOptionsContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOptionsContract.kt\ncom/kubi/assets/options/AssetOptionsContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,41:1\n135#2,2:42\n*S KotlinDebug\n*F\n+ 1 AssetOptionsContract.kt\ncom/kubi/assets/options/AssetOptionsContract$UIState\n*L\n34#1:42,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final OptionsOverviewEntity optionsOverviewEntity;
    private final boolean uiHideNumberFlag;

    /* JADX WARN: Multi-variable type inference failed */
    public UIState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return this.uiHideNumberFlag == uIState.uiHideNumberFlag && Intrinsics.areEqual(this.optionsOverviewEntity, uIState.optionsOverviewEntity);
    }

    public UIState(boolean z11, @Nullable OptionsOverviewEntity optionsOverviewEntity) {
        this.uiHideNumberFlag = z11;
        this.optionsOverviewEntity = optionsOverviewEntity;
    }

    public static /* synthetic */ UIState copy$default(UIState uIState, boolean z11, OptionsOverviewEntity optionsOverviewEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 2) != 0) {
            optionsOverviewEntity = uIState.optionsOverviewEntity;
        }
        return uIState.copy(z11, optionsOverviewEntity);
    }

    @NotNull
    public final UIState copy(boolean uiHideNumberFlag, @Nullable OptionsOverviewEntity optionsOverviewEntity) {
        return new UIState(uiHideNumberFlag, optionsOverviewEntity);
    }

    @Nullable
    public final OptionsOverviewEntity getOptionsOverviewEntity() {
        return this.optionsOverviewEntity;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.uiHideNumberFlag) * 31;
        OptionsOverviewEntity optionsOverviewEntity = this.optionsOverviewEntity;
        return iHashCode + (optionsOverviewEntity == null ? 0 : optionsOverviewEntity.hashCode());
    }

    @NotNull
    public String toString() {
        return "UIState(uiHideNumberFlag=" + this.uiHideNumberFlag + ", optionsOverviewEntity=" + this.optionsOverviewEntity + ')';
    }

    public /* synthetic */ UIState(boolean z11, OptionsOverviewEntity optionsOverviewEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 2) != 0 ? null : optionsOverviewEntity);
    }
}
