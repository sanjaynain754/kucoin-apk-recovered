package com.kubi.assets.margin.isolated;

import com.kubi.assets.entity.MarginPnlEntity;
import com.kubi.margin.api.entity.MarginPosition;
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

/* JADX INFO: renamed from: com.kubi.assets.margin.isolated.AssetV2IsolatedContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetV2IsolatedContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;", "Lcom/kubi/mvi/state/IState;", "uiIsolatedAssetsShowList", "", "Lcom/kubi/margin/api/entity/MarginPosition;", "uiHideNumberFlag", "", "uiHideSmallSwitch", "isolatedAssetsSourceList", "filterKeywords", "", "marginPnlEntity", "Lcom/kubi/assets/entity/MarginPnlEntity;", "<init>", "(Ljava/util/List;ZZLjava/util/List;Ljava/lang/String;Lcom/kubi/assets/entity/MarginPnlEntity;)V", "getUiIsolatedAssetsShowList", "()Ljava/util/List;", "getUiHideNumberFlag", "()Z", "getUiHideSmallSwitch", "getIsolatedAssetsSourceList", "getFilterKeywords", "()Ljava/lang/String;", "getMarginPnlEntity", "()Lcom/kubi/assets/entity/MarginPnlEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2IsolatedContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2IsolatedContract.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,62:1\n135#2,2:63\n135#2,2:65\n*S KotlinDebug\n*F\n+ 1 AssetV2IsolatedContract.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState\n*L\n44#1:63,2\n48#1:65,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final String filterKeywords;

    @Nullable
    private final List<MarginPosition> isolatedAssetsSourceList;

    @Nullable
    private final MarginPnlEntity marginPnlEntity;
    private final boolean uiHideNumberFlag;
    private final boolean uiHideSmallSwitch;

    @Nullable
    private final List<MarginPosition> uiIsolatedAssetsShowList;

    public UIState() {
        this(null, false, false, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.uiIsolatedAssetsShowList, uIState.uiIsolatedAssetsShowList) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && this.uiHideSmallSwitch == uIState.uiHideSmallSwitch && Intrinsics.areEqual(this.isolatedAssetsSourceList, uIState.isolatedAssetsSourceList) && Intrinsics.areEqual(this.filterKeywords, uIState.filterKeywords) && Intrinsics.areEqual(this.marginPnlEntity, uIState.marginPnlEntity);
    }

    public UIState(@Nullable List<MarginPosition> list, boolean z11, boolean z12, @Nullable List<MarginPosition> list2, @NotNull String filterKeywords, @Nullable MarginPnlEntity marginPnlEntity) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        this.uiIsolatedAssetsShowList = list;
        this.uiHideNumberFlag = z11;
        this.uiHideSmallSwitch = z12;
        this.isolatedAssetsSourceList = list2;
        this.filterKeywords = filterKeywords;
        this.marginPnlEntity = marginPnlEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, boolean z11, boolean z12, List list2, String str, MarginPnlEntity marginPnlEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uIState.uiIsolatedAssetsShowList;
        }
        if ((i11 & 2) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 4) != 0) {
            z12 = uIState.uiHideSmallSwitch;
        }
        if ((i11 & 8) != 0) {
            list2 = uIState.isolatedAssetsSourceList;
        }
        if ((i11 & 16) != 0) {
            str = uIState.filterKeywords;
        }
        if ((i11 & 32) != 0) {
            marginPnlEntity = uIState.marginPnlEntity;
        }
        String str2 = str;
        MarginPnlEntity marginPnlEntity2 = marginPnlEntity;
        return uIState.copy(list, z11, z12, list2, str2, marginPnlEntity2);
    }

    @NotNull
    public final UIState copy(@Nullable List<MarginPosition> uiIsolatedAssetsShowList, boolean uiHideNumberFlag, boolean uiHideSmallSwitch, @Nullable List<MarginPosition> isolatedAssetsSourceList, @NotNull String filterKeywords, @Nullable MarginPnlEntity marginPnlEntity) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        return new UIState(uiIsolatedAssetsShowList, uiHideNumberFlag, uiHideSmallSwitch, isolatedAssetsSourceList, filterKeywords, marginPnlEntity);
    }

    @Nullable
    public final List<MarginPosition> getIsolatedAssetsSourceList() {
        return this.isolatedAssetsSourceList;
    }

    @Nullable
    public final MarginPnlEntity getMarginPnlEntity() {
        return this.marginPnlEntity;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public final boolean getUiHideSmallSwitch() {
        return this.uiHideSmallSwitch;
    }

    @Nullable
    public final List<MarginPosition> getUiIsolatedAssetsShowList() {
        return this.uiIsolatedAssetsShowList;
    }

    public int hashCode() {
        List<MarginPosition> list = this.uiIsolatedAssetsShowList;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31) + Boolean.hashCode(this.uiHideSmallSwitch)) * 31;
        List<MarginPosition> list2 = this.isolatedAssetsSourceList;
        int iHashCode2 = (((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + this.filterKeywords.hashCode()) * 31;
        MarginPnlEntity marginPnlEntity = this.marginPnlEntity;
        return iHashCode2 + (marginPnlEntity != null ? marginPnlEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(uiIsolatedAssetsShowList=" + this.uiIsolatedAssetsShowList + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", uiHideSmallSwitch=" + this.uiHideSmallSwitch + ", isolatedAssetsSourceList=" + this.isolatedAssetsSourceList + ", filterKeywords=" + this.filterKeywords + ", marginPnlEntity=" + this.marginPnlEntity + ')';
    }

    public /* synthetic */ UIState(List list, boolean z11, boolean z12, List list2, String str, MarginPnlEntity marginPnlEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 4) != 0 ? C46392a.m102322d(C42153h.f93593a.m92526p(), false) : z12, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? "" : str, (i11 & 32) != 0 ? null : marginPnlEntity);
    }
}
