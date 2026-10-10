package com.kubi.assets.margin.cross;

import com.kubi.assets.entity.MarginPnlEntity;
import com.kubi.margin.api.entity.FundsInfo;
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

/* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetV2CrossContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jc\u0010\"\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\fHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UIState;", "Lcom/kubi/mvi/state/IState;", "uiCrossAssetsShowList", "", "Lcom/kubi/margin/api/entity/FundsInfo;", "uiHideNumberFlag", "", "uiHideSmallSwitch", "crossAssetsSourceList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "filterKeywords", "", "marginPnlEntity", "Lcom/kubi/assets/entity/MarginPnlEntity;", "<init>", "(Ljava/util/List;ZZLjava/util/ArrayList;Ljava/lang/String;Lcom/kubi/assets/entity/MarginPnlEntity;)V", "getUiCrossAssetsShowList", "()Ljava/util/List;", "getUiHideNumberFlag", "()Z", "getUiHideSmallSwitch", "getCrossAssetsSourceList", "()Ljava/util/ArrayList;", "getFilterKeywords", "()Ljava/lang/String;", "getMarginPnlEntity", "()Lcom/kubi/assets/entity/MarginPnlEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2CrossContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2CrossContract.kt\ncom/kubi/assets/margin/cross/AssetV2CrossContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,63:1\n135#2,2:64\n135#2,2:66\n*S KotlinDebug\n*F\n+ 1 AssetV2CrossContract.kt\ncom/kubi/assets/margin/cross/AssetV2CrossContract$UIState\n*L\n45#1:64,2\n49#1:66,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final ArrayList<FundsInfo> crossAssetsSourceList;

    @NotNull
    private final String filterKeywords;

    @Nullable
    private final MarginPnlEntity marginPnlEntity;

    @Nullable
    private final List<FundsInfo> uiCrossAssetsShowList;
    private final boolean uiHideNumberFlag;
    private final boolean uiHideSmallSwitch;

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
        return Intrinsics.areEqual(this.uiCrossAssetsShowList, uIState.uiCrossAssetsShowList) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && this.uiHideSmallSwitch == uIState.uiHideSmallSwitch && Intrinsics.areEqual(this.crossAssetsSourceList, uIState.crossAssetsSourceList) && Intrinsics.areEqual(this.filterKeywords, uIState.filterKeywords) && Intrinsics.areEqual(this.marginPnlEntity, uIState.marginPnlEntity);
    }

    public UIState(@Nullable List<FundsInfo> list, boolean z11, boolean z12, @Nullable ArrayList<FundsInfo> arrayList, @NotNull String filterKeywords, @Nullable MarginPnlEntity marginPnlEntity) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        this.uiCrossAssetsShowList = list;
        this.uiHideNumberFlag = z11;
        this.uiHideSmallSwitch = z12;
        this.crossAssetsSourceList = arrayList;
        this.filterKeywords = filterKeywords;
        this.marginPnlEntity = marginPnlEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, boolean z11, boolean z12, ArrayList arrayList, String str, MarginPnlEntity marginPnlEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uIState.uiCrossAssetsShowList;
        }
        if ((i11 & 2) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 4) != 0) {
            z12 = uIState.uiHideSmallSwitch;
        }
        if ((i11 & 8) != 0) {
            arrayList = uIState.crossAssetsSourceList;
        }
        if ((i11 & 16) != 0) {
            str = uIState.filterKeywords;
        }
        if ((i11 & 32) != 0) {
            marginPnlEntity = uIState.marginPnlEntity;
        }
        String str2 = str;
        MarginPnlEntity marginPnlEntity2 = marginPnlEntity;
        return uIState.copy(list, z11, z12, arrayList, str2, marginPnlEntity2);
    }

    @NotNull
    public final UIState copy(@Nullable List<FundsInfo> uiCrossAssetsShowList, boolean uiHideNumberFlag, boolean uiHideSmallSwitch, @Nullable ArrayList<FundsInfo> crossAssetsSourceList, @NotNull String filterKeywords, @Nullable MarginPnlEntity marginPnlEntity) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        return new UIState(uiCrossAssetsShowList, uiHideNumberFlag, uiHideSmallSwitch, crossAssetsSourceList, filterKeywords, marginPnlEntity);
    }

    @Nullable
    public final ArrayList<FundsInfo> getCrossAssetsSourceList() {
        return this.crossAssetsSourceList;
    }

    @Nullable
    public final MarginPnlEntity getMarginPnlEntity() {
        return this.marginPnlEntity;
    }

    @Nullable
    public final List<FundsInfo> getUiCrossAssetsShowList() {
        return this.uiCrossAssetsShowList;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public final boolean getUiHideSmallSwitch() {
        return this.uiHideSmallSwitch;
    }

    public int hashCode() {
        List<FundsInfo> list = this.uiCrossAssetsShowList;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31) + Boolean.hashCode(this.uiHideSmallSwitch)) * 31;
        ArrayList<FundsInfo> arrayList = this.crossAssetsSourceList;
        int iHashCode2 = (((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.filterKeywords.hashCode()) * 31;
        MarginPnlEntity marginPnlEntity = this.marginPnlEntity;
        return iHashCode2 + (marginPnlEntity != null ? marginPnlEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(uiCrossAssetsShowList=" + this.uiCrossAssetsShowList + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", uiHideSmallSwitch=" + this.uiHideSmallSwitch + ", crossAssetsSourceList=" + this.crossAssetsSourceList + ", filterKeywords=" + this.filterKeywords + ", marginPnlEntity=" + this.marginPnlEntity + ')';
    }

    public /* synthetic */ UIState(List list, boolean z11, boolean z12, ArrayList arrayList, String str, MarginPnlEntity marginPnlEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 4) != 0 ? C46392a.m102322d(C42153h.f93593a.m92533w(), false) : z12, (i11 & 8) != 0 ? null : arrayList, (i11 & 16) != 0 ? "" : str, (i11 & 32) != 0 ? null : marginPnlEntity);
    }
}
