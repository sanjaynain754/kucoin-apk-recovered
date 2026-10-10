package com.kubi.assets.unify;

import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.UnifiedAccountOverview;
import com.kubi.assets.entity.UnifiedAssetsEntity;
import com.kubi.assets.entity.UnifiedOverviewEntity;
import com.kubi.data.entity.UnifiedMarginCurrencySettingEntity;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetUnifiedContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u001d\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\rHÆ\u0003J\u001d\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\rHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003J³\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r2\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0013\u00108\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR%\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R%\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006>"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedContract$UIState;", "Lcom/kubi/mvi/state/IState;", "overviewData", "Lcom/kubi/assets/entity/UnifiedAccountOverview;", "uiAssetsShowList", "", "Lcom/kubi/assets/entity/UnifiedAssetsEntity;", "uiHideNumberFlag", "", "isShowInDebt", "uiHideSmallSwitch", "originAssetsSourceList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "productsSourceList", "Lcom/kubi/assets/entity/EarnAccountItem;", "marginCurrencySet", "", "", "marginCurrencySetting", "Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;", "filterKeywords", "unifiedPnlOverview", "Lcom/kubi/assets/entity/UnifiedOverviewEntity;", "<init>", "(Lcom/kubi/assets/entity/UnifiedAccountOverview;Ljava/util/List;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Set;Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;Ljava/lang/String;Lcom/kubi/assets/entity/UnifiedOverviewEntity;)V", "getOverviewData", "()Lcom/kubi/assets/entity/UnifiedAccountOverview;", "getUiAssetsShowList", "()Ljava/util/List;", "getUiHideNumberFlag", "()Z", "getUiHideSmallSwitch", "getOriginAssetsSourceList", "()Ljava/util/ArrayList;", "getProductsSourceList", "getMarginCurrencySet", "()Ljava/util/Set;", "getMarginCurrencySetting", "()Lcom/kubi/data/entity/UnifiedMarginCurrencySettingEntity;", "getFilterKeywords", "()Ljava/lang/String;", "getUnifiedPnlOverview", "()Lcom/kubi/assets/entity/UnifiedOverviewEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final String filterKeywords;
    private final boolean isShowInDebt;

    @NotNull
    private final Set<String> marginCurrencySet;

    @Nullable
    private final UnifiedMarginCurrencySettingEntity marginCurrencySetting;

    @Nullable
    private final ArrayList<UnifiedAssetsEntity> originAssetsSourceList;

    @Nullable
    private final UnifiedAccountOverview overviewData;

    @Nullable
    private final ArrayList<EarnAccountItem> productsSourceList;

    @Nullable
    private final List<UnifiedAssetsEntity> uiAssetsShowList;
    private final boolean uiHideNumberFlag;
    private final boolean uiHideSmallSwitch;

    @Nullable
    private final UnifiedOverviewEntity unifiedPnlOverview;

    public UIState() {
        this(null, null, false, false, false, null, null, null, null, null, null, 2047, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.overviewData, uIState.overviewData) && Intrinsics.areEqual(this.uiAssetsShowList, uIState.uiAssetsShowList) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && this.isShowInDebt == uIState.isShowInDebt && this.uiHideSmallSwitch == uIState.uiHideSmallSwitch && Intrinsics.areEqual(this.originAssetsSourceList, uIState.originAssetsSourceList) && Intrinsics.areEqual(this.productsSourceList, uIState.productsSourceList) && Intrinsics.areEqual(this.marginCurrencySet, uIState.marginCurrencySet) && Intrinsics.areEqual(this.marginCurrencySetting, uIState.marginCurrencySetting) && Intrinsics.areEqual(this.filterKeywords, uIState.filterKeywords) && Intrinsics.areEqual(this.unifiedPnlOverview, uIState.unifiedPnlOverview);
    }

    public UIState(@Nullable UnifiedAccountOverview unifiedAccountOverview, @Nullable List<UnifiedAssetsEntity> list, boolean z11, boolean z12, boolean z13, @Nullable ArrayList<UnifiedAssetsEntity> arrayList, @Nullable ArrayList<EarnAccountItem> arrayList2, @NotNull Set<String> marginCurrencySet, @Nullable UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity, @NotNull String filterKeywords, @Nullable UnifiedOverviewEntity unifiedOverviewEntity) {
        Intrinsics.checkNotNullParameter(marginCurrencySet, "marginCurrencySet");
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        this.overviewData = unifiedAccountOverview;
        this.uiAssetsShowList = list;
        this.uiHideNumberFlag = z11;
        this.isShowInDebt = z12;
        this.uiHideSmallSwitch = z13;
        this.originAssetsSourceList = arrayList;
        this.productsSourceList = arrayList2;
        this.marginCurrencySet = marginCurrencySet;
        this.marginCurrencySetting = unifiedMarginCurrencySettingEntity;
        this.filterKeywords = filterKeywords;
        this.unifiedPnlOverview = unifiedOverviewEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, UnifiedAccountOverview unifiedAccountOverview, List list, boolean z11, boolean z12, boolean z13, ArrayList arrayList, ArrayList arrayList2, Set set, UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity, String str, UnifiedOverviewEntity unifiedOverviewEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            unifiedAccountOverview = uIState.overviewData;
        }
        if ((i11 & 2) != 0) {
            list = uIState.uiAssetsShowList;
        }
        if ((i11 & 4) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 8) != 0) {
            z12 = uIState.isShowInDebt;
        }
        if ((i11 & 16) != 0) {
            z13 = uIState.uiHideSmallSwitch;
        }
        if ((i11 & 32) != 0) {
            arrayList = uIState.originAssetsSourceList;
        }
        if ((i11 & 64) != 0) {
            arrayList2 = uIState.productsSourceList;
        }
        if ((i11 & 128) != 0) {
            set = uIState.marginCurrencySet;
        }
        if ((i11 & 256) != 0) {
            unifiedMarginCurrencySettingEntity = uIState.marginCurrencySetting;
        }
        if ((i11 & 512) != 0) {
            str = uIState.filterKeywords;
        }
        if ((i11 & 1024) != 0) {
            unifiedOverviewEntity = uIState.unifiedPnlOverview;
        }
        String str2 = str;
        UnifiedOverviewEntity unifiedOverviewEntity2 = unifiedOverviewEntity;
        Set set2 = set;
        UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity2 = unifiedMarginCurrencySettingEntity;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z14 = z13;
        boolean z15 = z11;
        return uIState.copy(unifiedAccountOverview, list, z15, z12, z14, arrayList3, arrayList4, set2, unifiedMarginCurrencySettingEntity2, str2, unifiedOverviewEntity2);
    }

    @NotNull
    public final UIState copy(@Nullable UnifiedAccountOverview overviewData, @Nullable List<UnifiedAssetsEntity> uiAssetsShowList, boolean uiHideNumberFlag, boolean isShowInDebt, boolean uiHideSmallSwitch, @Nullable ArrayList<UnifiedAssetsEntity> originAssetsSourceList, @Nullable ArrayList<EarnAccountItem> productsSourceList, @NotNull Set<String> marginCurrencySet, @Nullable UnifiedMarginCurrencySettingEntity marginCurrencySetting, @NotNull String filterKeywords, @Nullable UnifiedOverviewEntity unifiedPnlOverview) {
        Intrinsics.checkNotNullParameter(marginCurrencySet, "marginCurrencySet");
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        return new UIState(overviewData, uiAssetsShowList, uiHideNumberFlag, isShowInDebt, uiHideSmallSwitch, originAssetsSourceList, productsSourceList, marginCurrencySet, marginCurrencySetting, filterKeywords, unifiedPnlOverview);
    }

    @NotNull
    public final String getFilterKeywords() {
        return this.filterKeywords;
    }

    @NotNull
    public final Set<String> getMarginCurrencySet() {
        return this.marginCurrencySet;
    }

    @Nullable
    public final ArrayList<UnifiedAssetsEntity> getOriginAssetsSourceList() {
        return this.originAssetsSourceList;
    }

    @Nullable
    public final UnifiedAccountOverview getOverviewData() {
        return this.overviewData;
    }

    @Nullable
    public final ArrayList<EarnAccountItem> getProductsSourceList() {
        return this.productsSourceList;
    }

    @Nullable
    public final List<UnifiedAssetsEntity> getUiAssetsShowList() {
        return this.uiAssetsShowList;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public final boolean getUiHideSmallSwitch() {
        return this.uiHideSmallSwitch;
    }

    @Nullable
    public final UnifiedOverviewEntity getUnifiedPnlOverview() {
        return this.unifiedPnlOverview;
    }

    public int hashCode() {
        UnifiedAccountOverview unifiedAccountOverview = this.overviewData;
        int iHashCode = (unifiedAccountOverview == null ? 0 : unifiedAccountOverview.hashCode()) * 31;
        List<UnifiedAssetsEntity> list = this.uiAssetsShowList;
        int iHashCode2 = (((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31) + Boolean.hashCode(this.isShowInDebt)) * 31) + Boolean.hashCode(this.uiHideSmallSwitch)) * 31;
        ArrayList<UnifiedAssetsEntity> arrayList = this.originAssetsSourceList;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<EarnAccountItem> arrayList2 = this.productsSourceList;
        int iHashCode4 = (((iHashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31) + this.marginCurrencySet.hashCode()) * 31;
        UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity = this.marginCurrencySetting;
        int iHashCode5 = (((iHashCode4 + (unifiedMarginCurrencySettingEntity == null ? 0 : unifiedMarginCurrencySettingEntity.hashCode())) * 31) + this.filterKeywords.hashCode()) * 31;
        UnifiedOverviewEntity unifiedOverviewEntity = this.unifiedPnlOverview;
        return iHashCode5 + (unifiedOverviewEntity != null ? unifiedOverviewEntity.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isShowInDebt, reason: from getter */
    public final boolean getIsShowInDebt() {
        return this.isShowInDebt;
    }

    @NotNull
    public String toString() {
        return "UIState(overviewData=" + this.overviewData + ", uiAssetsShowList=" + this.uiAssetsShowList + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", isShowInDebt=" + this.isShowInDebt + ", uiHideSmallSwitch=" + this.uiHideSmallSwitch + ", originAssetsSourceList=" + this.originAssetsSourceList + ", productsSourceList=" + this.productsSourceList + ", marginCurrencySet=" + this.marginCurrencySet + ", marginCurrencySetting=" + this.marginCurrencySetting + ", filterKeywords=" + this.filterKeywords + ", unifiedPnlOverview=" + this.unifiedPnlOverview + ')';
    }

    public /* synthetic */ UIState(UnifiedAccountOverview unifiedAccountOverview, List list, boolean z11, boolean z12, boolean z13, ArrayList arrayList, ArrayList arrayList2, Set set, UnifiedMarginCurrencySettingEntity unifiedMarginCurrencySettingEntity, String str, UnifiedOverviewEntity unifiedOverviewEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : unifiedAccountOverview, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? C11200j.f19030a.m19887a() : z11, (i11 & 8) != 0 ? C11200j.f19030a.m19889c() : z12, (i11 & 16) != 0 ? C11200j.f19030a.m19888b() : z13, (i11 & 32) != 0 ? null : arrayList, (i11 & 64) != 0 ? null : arrayList2, (i11 & 128) != 0 ? SetsKt.emptySet() : set, (i11 & 256) != 0 ? null : unifiedMarginCurrencySettingEntity, (i11 & 512) != 0 ? "" : str, (i11 & 1024) != 0 ? null : unifiedOverviewEntity);
    }
}
