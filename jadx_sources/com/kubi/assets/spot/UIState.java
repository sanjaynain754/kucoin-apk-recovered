package com.kubi.assets.spot;

import com.kubi.assets.entity.AccountItemEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
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

/* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetV2SpotContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u001d\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u001d\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u008d\u0001\u0010+\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u000eHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR%\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, m90084d2 = {"Lcom/kubi/assets/spot/AssetV2SpotContract$UIState;", "Lcom/kubi/mvi/state/IState;", "uiSpotAssetsShowList", "", "Lcom/kubi/assets/entity/AccountItemEntity;", "uiHideNumberFlag", "", "uiHideSmallSwitch", "uiConvertInfo", "Lcom/kubi/assets/spot/AssetV2SpotContract$CovertFromCoin;", "spotAssetsSourceList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "filterKeywords", "", "productsSourceList", "Lcom/kubi/assets/entity/EarnAccountItem;", "spotPnlOverview", "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;", "<init>", "(Ljava/util/List;ZZLcom/kubi/assets/spot/AssetV2SpotContract$CovertFromCoin;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Lcom/kubi/assets/entity/SpotAccountOverviewEntity;)V", "getUiSpotAssetsShowList", "()Ljava/util/List;", "getUiHideNumberFlag", "()Z", "getUiHideSmallSwitch", "getUiConvertInfo", "()Lcom/kubi/assets/spot/AssetV2SpotContract$CovertFromCoin;", "getSpotAssetsSourceList", "()Ljava/util/ArrayList;", "getFilterKeywords", "()Ljava/lang/String;", "getProductsSourceList", "getSpotPnlOverview", "()Lcom/kubi/assets/entity/SpotAccountOverviewEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2SpotContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SpotContract.kt\ncom/kubi/assets/spot/AssetV2SpotContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,83:1\n135#2,2:84\n135#2,2:86\n*S KotlinDebug\n*F\n+ 1 AssetV2SpotContract.kt\ncom/kubi/assets/spot/AssetV2SpotContract$UIState\n*L\n52#1:84,2\n56#1:86,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final String filterKeywords;

    @Nullable
    private final ArrayList<EarnAccountItem> productsSourceList;

    @Nullable
    private final ArrayList<AccountItemEntity> spotAssetsSourceList;

    @Nullable
    private final SpotAccountOverviewEntity spotPnlOverview;

    @Nullable
    private final CovertFromCoin uiConvertInfo;
    private final boolean uiHideNumberFlag;
    private final boolean uiHideSmallSwitch;

    @Nullable
    private final List<AccountItemEntity> uiSpotAssetsShowList;

    public UIState() {
        this(null, false, false, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.uiSpotAssetsShowList, uIState.uiSpotAssetsShowList) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && this.uiHideSmallSwitch == uIState.uiHideSmallSwitch && Intrinsics.areEqual(this.uiConvertInfo, uIState.uiConvertInfo) && Intrinsics.areEqual(this.spotAssetsSourceList, uIState.spotAssetsSourceList) && Intrinsics.areEqual(this.filterKeywords, uIState.filterKeywords) && Intrinsics.areEqual(this.productsSourceList, uIState.productsSourceList) && Intrinsics.areEqual(this.spotPnlOverview, uIState.spotPnlOverview);
    }

    public UIState(@Nullable List<AccountItemEntity> list, boolean z11, boolean z12, @Nullable CovertFromCoin covertFromCoin, @Nullable ArrayList<AccountItemEntity> arrayList, @NotNull String filterKeywords, @Nullable ArrayList<EarnAccountItem> arrayList2, @Nullable SpotAccountOverviewEntity spotAccountOverviewEntity) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        this.uiSpotAssetsShowList = list;
        this.uiHideNumberFlag = z11;
        this.uiHideSmallSwitch = z12;
        this.uiConvertInfo = covertFromCoin;
        this.spotAssetsSourceList = arrayList;
        this.filterKeywords = filterKeywords;
        this.productsSourceList = arrayList2;
        this.spotPnlOverview = spotAccountOverviewEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, boolean z11, boolean z12, CovertFromCoin covertFromCoin, ArrayList arrayList, String str, ArrayList arrayList2, SpotAccountOverviewEntity spotAccountOverviewEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uIState.uiSpotAssetsShowList;
        }
        if ((i11 & 2) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 4) != 0) {
            z12 = uIState.uiHideSmallSwitch;
        }
        if ((i11 & 8) != 0) {
            covertFromCoin = uIState.uiConvertInfo;
        }
        if ((i11 & 16) != 0) {
            arrayList = uIState.spotAssetsSourceList;
        }
        if ((i11 & 32) != 0) {
            str = uIState.filterKeywords;
        }
        if ((i11 & 64) != 0) {
            arrayList2 = uIState.productsSourceList;
        }
        if ((i11 & 128) != 0) {
            spotAccountOverviewEntity = uIState.spotPnlOverview;
        }
        ArrayList arrayList3 = arrayList2;
        SpotAccountOverviewEntity spotAccountOverviewEntity2 = spotAccountOverviewEntity;
        ArrayList arrayList4 = arrayList;
        String str2 = str;
        return uIState.copy(list, z11, z12, covertFromCoin, arrayList4, str2, arrayList3, spotAccountOverviewEntity2);
    }

    @NotNull
    public final UIState copy(@Nullable List<AccountItemEntity> list, boolean z11, boolean z12, @Nullable CovertFromCoin covertFromCoin, @Nullable ArrayList<AccountItemEntity> arrayList, @NotNull String filterKeywords, @Nullable ArrayList<EarnAccountItem> arrayList2, @Nullable SpotAccountOverviewEntity spotAccountOverviewEntity) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        return new UIState(list, z11, z12, covertFromCoin, arrayList, filterKeywords, arrayList2, spotAccountOverviewEntity);
    }

    @NotNull
    public final String getFilterKeywords() {
        return this.filterKeywords;
    }

    @Nullable
    public final ArrayList<EarnAccountItem> getProductsSourceList() {
        return this.productsSourceList;
    }

    @Nullable
    public final ArrayList<AccountItemEntity> getSpotAssetsSourceList() {
        return this.spotAssetsSourceList;
    }

    @Nullable
    public final SpotAccountOverviewEntity getSpotPnlOverview() {
        return this.spotPnlOverview;
    }

    @Nullable
    public final CovertFromCoin getUiConvertInfo() {
        return this.uiConvertInfo;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public final boolean getUiHideSmallSwitch() {
        return this.uiHideSmallSwitch;
    }

    @Nullable
    public final List<AccountItemEntity> getUiSpotAssetsShowList() {
        return this.uiSpotAssetsShowList;
    }

    public int hashCode() {
        List<AccountItemEntity> list = this.uiSpotAssetsShowList;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31) + Boolean.hashCode(this.uiHideSmallSwitch)) * 31;
        CovertFromCoin covertFromCoin = this.uiConvertInfo;
        int iHashCode2 = (iHashCode + (covertFromCoin == null ? 0 : covertFromCoin.hashCode())) * 31;
        ArrayList<AccountItemEntity> arrayList = this.spotAssetsSourceList;
        int iHashCode3 = (((iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.filterKeywords.hashCode()) * 31;
        ArrayList<EarnAccountItem> arrayList2 = this.productsSourceList;
        int iHashCode4 = (iHashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        SpotAccountOverviewEntity spotAccountOverviewEntity = this.spotPnlOverview;
        return iHashCode4 + (spotAccountOverviewEntity != null ? spotAccountOverviewEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(uiSpotAssetsShowList=" + this.uiSpotAssetsShowList + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", uiHideSmallSwitch=" + this.uiHideSmallSwitch + ", uiConvertInfo=" + this.uiConvertInfo + ", spotAssetsSourceList=" + this.spotAssetsSourceList + ", filterKeywords=" + this.filterKeywords + ", productsSourceList=" + this.productsSourceList + ", spotPnlOverview=" + this.spotPnlOverview + ')';
    }

    public /* synthetic */ UIState(List list, boolean z11, boolean z12, CovertFromCoin covertFromCoin, ArrayList arrayList, String str, ArrayList arrayList2, SpotAccountOverviewEntity spotAccountOverviewEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 4) != 0 ? C46392a.m102322d(C42153h.f93593a.m92503G(), false) : z12, (i11 & 8) != 0 ? null : covertFromCoin, (i11 & 16) != 0 ? null : arrayList, (i11 & 32) != 0 ? "" : str, (i11 & 64) != 0 ? null : arrayList2, (i11 & 128) != 0 ? null : spotAccountOverviewEntity);
    }
}
