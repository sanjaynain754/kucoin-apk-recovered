package com.kubi.assets.finance;

import com.kubi.assets.entity.FinanceCoinEntity;
import com.kubi.assets.entity.FinanceConfig;
import com.kubi.assets.entity.FinanceRecommendEntity;
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

/* JADX INFO: renamed from: com.kubi.assets.finance.FinanceContract$UIState, reason: from toString */
/* JADX INFO: compiled from: FinanceContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceContract$UIState;", "Lcom/kubi/mvi/state/IState;", "data", "", "Lcom/kubi/assets/entity/FinanceCoinEntity;", "recommendList", "Lcom/kubi/assets/entity/FinanceRecommendEntity;", "config", "Lcom/kubi/assets/entity/FinanceConfig;", "uiHideNumberFlag", "", "autoEarnState", "", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/kubi/assets/entity/FinanceConfig;ZLjava/lang/String;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getRecommendList", "setRecommendList", "getConfig", "()Lcom/kubi/assets/entity/FinanceConfig;", "getUiHideNumberFlag", "()Z", "getAutoEarnState", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceContract.kt\ncom/kubi/assets/finance/FinanceContract$UIState\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,64:1\n135#2,2:65\n*S KotlinDebug\n*F\n+ 1 FinanceContract.kt\ncom/kubi/assets/finance/FinanceContract$UIState\n*L\n49#1:65,2\n*E\n"})
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final String autoEarnState;

    @Nullable
    private final FinanceConfig config;

    @Nullable
    private List<FinanceCoinEntity> data;

    @Nullable
    private List<FinanceRecommendEntity> recommendList;
    private final boolean uiHideNumberFlag;

    public UIState() {
        this(null, null, null, false, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.data, uIState.data) && Intrinsics.areEqual(this.recommendList, uIState.recommendList) && Intrinsics.areEqual(this.config, uIState.config) && this.uiHideNumberFlag == uIState.uiHideNumberFlag && Intrinsics.areEqual(this.autoEarnState, uIState.autoEarnState);
    }

    public UIState(@Nullable List<FinanceCoinEntity> list, @Nullable List<FinanceRecommendEntity> list2, @Nullable FinanceConfig financeConfig, boolean z11, @Nullable String str) {
        this.data = list;
        this.recommendList = list2;
        this.config = financeConfig;
        this.uiHideNumberFlag = z11;
        this.autoEarnState = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, List list2, FinanceConfig financeConfig, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uIState.data;
        }
        if ((i11 & 2) != 0) {
            list2 = uIState.recommendList;
        }
        if ((i11 & 4) != 0) {
            financeConfig = uIState.config;
        }
        if ((i11 & 8) != 0) {
            z11 = uIState.uiHideNumberFlag;
        }
        if ((i11 & 16) != 0) {
            str = uIState.autoEarnState;
        }
        String str2 = str;
        FinanceConfig financeConfig2 = financeConfig;
        return uIState.copy(list, list2, financeConfig2, z11, str2);
    }

    @NotNull
    public final UIState copy(@Nullable List<FinanceCoinEntity> data, @Nullable List<FinanceRecommendEntity> recommendList, @Nullable FinanceConfig config, boolean uiHideNumberFlag, @Nullable String autoEarnState) {
        return new UIState(data, recommendList, config, uiHideNumberFlag, autoEarnState);
    }

    @Nullable
    public final String getAutoEarnState() {
        return this.autoEarnState;
    }

    @Nullable
    public final FinanceConfig getConfig() {
        return this.config;
    }

    public final boolean getUiHideNumberFlag() {
        return this.uiHideNumberFlag;
    }

    public int hashCode() {
        List<FinanceCoinEntity> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FinanceRecommendEntity> list2 = this.recommendList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        FinanceConfig financeConfig = this.config;
        int iHashCode3 = (((iHashCode2 + (financeConfig == null ? 0 : financeConfig.hashCode())) * 31) + Boolean.hashCode(this.uiHideNumberFlag)) * 31;
        String str = this.autoEarnState;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", recommendList=" + this.recommendList + ", config=" + this.config + ", uiHideNumberFlag=" + this.uiHideNumberFlag + ", autoEarnState=" + this.autoEarnState + ')';
    }

    public /* synthetic */ UIState(List list, List list2, FinanceConfig financeConfig, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? null : financeConfig, (i11 & 8) != 0 ? C46392a.m102322d(C42153h.f93593a.m92500D(), false) : z11, (i11 & 16) != 0 ? "" : str);
    }
}
