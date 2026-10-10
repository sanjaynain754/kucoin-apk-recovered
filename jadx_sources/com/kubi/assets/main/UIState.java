package com.kubi.assets.main;

import com.kubi.assets.entity.AccountItemEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.MainRecommendData;
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

/* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainContract$UIState, reason: from toString */
/* JADX INFO: compiled from: AssetV2MainContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\b\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u001d\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\bHÆ\u0003J\u001d\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\bHÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u009d\u0001\u0010(\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\b2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R%\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R%\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019¨\u0006/"}, m90084d2 = {"Lcom/kubi/assets/main/AssetV2MainContract$UIState;", "Lcom/kubi/mvi/state/IState;", "uiMainAssetsShowList", "", "Lcom/kubi/assets/entity/AccountItemEntity;", "uiRecommendCurrency", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/MainRecommendData;", "Lkotlin/collections/ArrayList;", "uiHideNumberFlag", "", "uiHideSmallSwitch", "mainAssetsSourceList", "productsSourceList", "Lcom/kubi/assets/entity/EarnAccountItem;", "filterKeywords", "", "kuCardStatus", "<init>", "(Ljava/util/List;Ljava/util/ArrayList;ZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Z)V", "getUiMainAssetsShowList", "()Ljava/util/List;", "getUiRecommendCurrency", "()Ljava/util/ArrayList;", "getUiHideNumberFlag", "()Z", "getUiHideSmallSwitch", "getMainAssetsSourceList", "getProductsSourceList", "getFilterKeywords", "()Ljava/lang/String;", "getKuCardStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2MainContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2MainContract.kt\ncom/kubi/assets/main/AssetV2MainContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,78:1\n135#2,2:79\n135#2,2:81\n*S KotlinDebug\n*F\n+ 1 AssetV2MainContract.kt\ncom/kubi/assets/main/AssetV2MainContract$UIState\n*L\n56#1:79,2\n60#1:81,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final String filterKeywords;
    private final boolean kuCardStatus;

    @Nullable
    private final ArrayList<AccountItemEntity> mainAssetsSourceList;

    @Nullable
    private final ArrayList<EarnAccountItem> productsSourceList;
    private final boolean uiHideNumberFlag;
    private final boolean uiHideSmallSwitch;

    @Nullable
    private final List<AccountItemEntity> uiMainAssetsShowList;

    @Nullable
    private final ArrayList<MainRecommendData> uiRecommendCurrency;

    public UIState() {
        this(null, null, false, false, null, null, null, false, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.uiMainAssetsShowList, uIState.uiMainAssetsShowList) && Intrinsics.areEqual(this.uiRecommendCurrency, uIState.uiRecommendCurrency) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && this.uiHideSmallSwitch == uIState.uiHideSmallSwitch && Intrinsics.areEqual(this.mainAssetsSourceList, uIState.mainAssetsSourceList) && Intrinsics.areEqual(this.productsSourceList, uIState.productsSourceList) && Intrinsics.areEqual(this.filterKeywords, uIState.filterKeywords) && this.kuCardStatus == uIState.kuCardStatus;
    }

    public UIState(@Nullable List<AccountItemEntity> list, @Nullable ArrayList<MainRecommendData> arrayList, boolean z11, boolean z12, @Nullable ArrayList<AccountItemEntity> arrayList2, @Nullable ArrayList<EarnAccountItem> arrayList3, @NotNull String filterKeywords, boolean z13) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        this.uiMainAssetsShowList = list;
        this.uiRecommendCurrency = arrayList;
        this.uiHideNumberFlag = z11;
        this.uiHideSmallSwitch = z12;
        this.mainAssetsSourceList = arrayList2;
        this.productsSourceList = arrayList3;
        this.filterKeywords = filterKeywords;
        this.kuCardStatus = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, ArrayList arrayList, boolean z11, boolean z12, ArrayList arrayList2, ArrayList arrayList3, String str, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uIState.uiMainAssetsShowList;
        }
        if ((i11 & 2) != 0) {
            arrayList = uIState.uiRecommendCurrency;
        }
        if ((i11 & 4) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 8) != 0) {
            z12 = uIState.uiHideSmallSwitch;
        }
        if ((i11 & 16) != 0) {
            arrayList2 = uIState.mainAssetsSourceList;
        }
        if ((i11 & 32) != 0) {
            arrayList3 = uIState.productsSourceList;
        }
        if ((i11 & 64) != 0) {
            str = uIState.filterKeywords;
        }
        if ((i11 & 128) != 0) {
            z13 = uIState.kuCardStatus;
        }
        String str2 = str;
        boolean z14 = z13;
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = arrayList3;
        return uIState.copy(list, arrayList, z11, z12, arrayList4, arrayList5, str2, z14);
    }

    @NotNull
    public final UIState copy(@Nullable List<AccountItemEntity> uiMainAssetsShowList, @Nullable ArrayList<MainRecommendData> uiRecommendCurrency, boolean uiHideNumberFlag, boolean uiHideSmallSwitch, @Nullable ArrayList<AccountItemEntity> mainAssetsSourceList, @Nullable ArrayList<EarnAccountItem> productsSourceList, @NotNull String filterKeywords, boolean kuCardStatus) {
        Intrinsics.checkNotNullParameter(filterKeywords, "filterKeywords");
        return new UIState(uiMainAssetsShowList, uiRecommendCurrency, uiHideNumberFlag, uiHideSmallSwitch, mainAssetsSourceList, productsSourceList, filterKeywords, kuCardStatus);
    }

    @NotNull
    public final String getFilterKeywords() {
        return this.filterKeywords;
    }

    public final boolean getKuCardStatus() {
        return this.kuCardStatus;
    }

    @Nullable
    public final ArrayList<AccountItemEntity> getMainAssetsSourceList() {
        return this.mainAssetsSourceList;
    }

    @Nullable
    public final ArrayList<EarnAccountItem> getProductsSourceList() {
        return this.productsSourceList;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public final boolean getUiHideSmallSwitch() {
        return this.uiHideSmallSwitch;
    }

    @Nullable
    public final List<AccountItemEntity> getUiMainAssetsShowList() {
        return this.uiMainAssetsShowList;
    }

    @Nullable
    public final ArrayList<MainRecommendData> getUiRecommendCurrency() {
        return this.uiRecommendCurrency;
    }

    public int hashCode() {
        List<AccountItemEntity> list = this.uiMainAssetsShowList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ArrayList<MainRecommendData> arrayList = this.uiRecommendCurrency;
        int iHashCode2 = (((((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31) + Boolean.hashCode(this.uiHideSmallSwitch)) * 31;
        ArrayList<AccountItemEntity> arrayList2 = this.mainAssetsSourceList;
        int iHashCode3 = (iHashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<EarnAccountItem> arrayList3 = this.productsSourceList;
        return ((((iHashCode3 + (arrayList3 != null ? arrayList3.hashCode() : 0)) * 31) + this.filterKeywords.hashCode()) * 31) + Boolean.hashCode(this.kuCardStatus);
    }

    @NotNull
    public String toString() {
        return "UIState(uiMainAssetsShowList=" + this.uiMainAssetsShowList + ", uiRecommendCurrency=" + this.uiRecommendCurrency + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", uiHideSmallSwitch=" + this.uiHideSmallSwitch + ", mainAssetsSourceList=" + this.mainAssetsSourceList + ", productsSourceList=" + this.productsSourceList + ", filterKeywords=" + this.filterKeywords + ", kuCardStatus=" + this.kuCardStatus + ')';
    }

    public /* synthetic */ UIState(List list, ArrayList arrayList, boolean z11, boolean z12, ArrayList arrayList2, ArrayList arrayList3, String str, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : arrayList, (i11 & 4) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 8) != 0 ? C46392a.m102322d(C42153h.f93593a.m92532v(), false) : z12, (i11 & 16) != 0 ? null : arrayList2, (i11 & 32) != 0 ? null : arrayList3, (i11 & 64) != 0 ? "" : str, (i11 & 128) != 0 ? false : z13);
    }
}
