package com.kubi.assets.alpha;

import com.kubi.assets.entity.AlphaAssetEntity;
import com.kubi.assets.entity.AlphaChainInfo;
import com.kubi.assets.entity.AlphaTopTokenInfo;
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

/* JADX INFO: renamed from: com.kubi.assets.alpha.AlphaContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AlphaContract.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0003HÆ\u0003J{\u0010)\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\tHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00060"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "", "Lcom/kubi/assets/entity/AlphaAssetEntity;", "showList", "uiHideNumberFlag", "", "filterKeywords", "", "uiHideSmallSwitch", "networkList", "Lcom/kubi/assets/entity/AlphaChainInfo;", "selectedNetwork", "recommendList", "Lcom/kubi/assets/entity/AlphaTopTokenInfo;", "<init>", "(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/util/List;Lcom/kubi/assets/entity/AlphaChainInfo;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getShowList", "setShowList", "getUiHideNumberFlag", "()Z", "getFilterKeywords", "()Ljava/lang/String;", "getUiHideSmallSwitch", "getNetworkList", "getSelectedNetwork", "()Lcom/kubi/assets/entity/AlphaChainInfo;", "getRecommendList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaContract.kt\ncom/kubi/assets/alpha/AlphaContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,66:1\n135#2,2:67\n135#2,2:69\n*S KotlinDebug\n*F\n+ 1 AlphaContract.kt\ncom/kubi/assets/alpha/AlphaContract$UIState\n*L\n54#1:67,2\n56#1:69,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private List<AlphaAssetEntity> data;

    @NotNull
    private final String filterKeywords;

    @Nullable
    private final List<AlphaChainInfo> networkList;

    @Nullable
    private final List<AlphaTopTokenInfo> recommendList;

    @Nullable
    private final AlphaChainInfo selectedNetwork;

    @Nullable
    private List<AlphaAssetEntity> showList;
    private final boolean uiHideNumberFlag;
    private final boolean uiHideSmallSwitch;

    public UIState() {
        this(null, null, false, null, false, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, List list2, boolean z11, String str, boolean z12, List list3, AlphaChainInfo alphaChainInfo, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uIState.data;
        }
        if ((i11 & 2) != 0) {
            list2 = uIState.showList;
        }
        if ((i11 & 4) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 8) != 0) {
            str = uIState.filterKeywords;
        }
        if ((i11 & 16) != 0) {
            z12 = uIState.uiHideSmallSwitch;
        }
        if ((i11 & 32) != 0) {
            list3 = uIState.networkList;
        }
        if ((i11 & 64) != 0) {
            alphaChainInfo = uIState.selectedNetwork;
        }
        if ((i11 & 128) != 0) {
            list4 = uIState.recommendList;
        }
        AlphaChainInfo alphaChainInfo2 = alphaChainInfo;
        List list5 = list4;
        boolean z13 = z12;
        List list6 = list3;
        return uIState.copy(list, list2, z11, str, z13, list6, alphaChainInfo2, list5);
    }

    @NotNull
    public final UIState copy(@Nullable List<AlphaAssetEntity> data, @Nullable List<AlphaAssetEntity> showList, boolean uiHideNumberFlag, @NotNull String filterKeywords, boolean uiHideSmallSwitch, @Nullable List<AlphaChainInfo> networkList, @Nullable AlphaChainInfo selectedNetwork, @Nullable List<AlphaTopTokenInfo> recommendList) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        return new UIState(data, showList, uiHideNumberFlag, filterKeywords, uiHideSmallSwitch, networkList, selectedNetwork, recommendList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.data, uIState.data) && Intrinsics.areEqual(this.showList, uIState.showList) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && Intrinsics.areEqual(this.filterKeywords, uIState.filterKeywords) && this.uiHideSmallSwitch == uIState.uiHideSmallSwitch && Intrinsics.areEqual(this.networkList, uIState.networkList) && Intrinsics.areEqual(this.selectedNetwork, uIState.selectedNetwork) && Intrinsics.areEqual(this.recommendList, uIState.recommendList);
    }

    public UIState(@Nullable List<AlphaAssetEntity> list, @Nullable List<AlphaAssetEntity> list2, boolean z11, @NotNull String filterKeywords, boolean z12, @Nullable List<AlphaChainInfo> list3, @Nullable AlphaChainInfo alphaChainInfo, @Nullable List<AlphaTopTokenInfo> list4) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        this.data = list;
        this.showList = list2;
        this.uiHideNumberFlag = z11;
        this.filterKeywords = filterKeywords;
        this.uiHideSmallSwitch = z12;
        this.networkList = list3;
        this.selectedNetwork = alphaChainInfo;
        this.recommendList = list4;
    }

    @Nullable
    public final List<AlphaAssetEntity> getData() {
        return this.data;
    }

    @NotNull
    public final String getFilterKeywords() {
        return this.filterKeywords;
    }

    @Nullable
    public final List<AlphaChainInfo> getNetworkList() {
        return this.networkList;
    }

    @Nullable
    public final List<AlphaTopTokenInfo> getRecommendList() {
        return this.recommendList;
    }

    @Nullable
    public final AlphaChainInfo getSelectedNetwork() {
        return this.selectedNetwork;
    }

    @Nullable
    public final List<AlphaAssetEntity> getShowList() {
        return this.showList;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public final boolean getUiHideSmallSwitch() {
        return this.uiHideSmallSwitch;
    }

    public int hashCode() {
        List<AlphaAssetEntity> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AlphaAssetEntity> list2 = this.showList;
        int iHashCode2 = (((((((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31) + this.filterKeywords.hashCode()) * 31) + Boolean.hashCode(this.uiHideSmallSwitch)) * 31;
        List<AlphaChainInfo> list3 = this.networkList;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AlphaChainInfo alphaChainInfo = this.selectedNetwork;
        int iHashCode4 = (iHashCode3 + (alphaChainInfo == null ? 0 : alphaChainInfo.hashCode())) * 31;
        List<AlphaTopTokenInfo> list4 = this.recommendList;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final void setData(@Nullable List<AlphaAssetEntity> list) {
        this.data = list;
    }

    public final void setShowList(@Nullable List<AlphaAssetEntity> list) {
        this.showList = list;
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", showList=" + this.showList + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", filterKeywords=" + this.filterKeywords + ", uiHideSmallSwitch=" + this.uiHideSmallSwitch + ", networkList=" + this.networkList + ", selectedNetwork=" + this.selectedNetwork + ", recommendList=" + this.recommendList + ')';
    }

    public /* synthetic */ UIState(List list, List list2, boolean z11, String str, boolean z12, List list3, AlphaChainInfo alphaChainInfo, List list4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? C46392a.m102322d(C42153h.f93593a.m92519i(), false) : z12, (i11 & 32) != 0 ? null : list3, (i11 & 64) != 0 ? null : alphaChainInfo, (i11 & 128) != 0 ? null : list4);
    }
}
