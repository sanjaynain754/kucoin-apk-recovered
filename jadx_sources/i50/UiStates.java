package i50;

import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i50.a, reason: from toString */
/* JADX INFO: compiled from: UiStates.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003Ja\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006!"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/state/UiStates;", "", "loading", "", "loadingFailed", "allStrategies", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "strategyTypeGroupedData", "", "", "strategiesForUi", "<init>", "(ZZLjava/util/List;Ljava/util/Map;Ljava/util/List;)V", "getLoading", "()Z", "getLoadingFailed", "getAllStrategies", "()Ljava/util/List;", "getStrategyTypeGroupedData", "()Ljava/util/Map;", "getStrategiesForUi", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiStates {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean loading;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final boolean loadingFailed;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final List<StrategyItemEntity> allStrategies;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Map<Integer, List<StrategyItemEntity>> strategyTypeGroupedData;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final List<StrategyItemEntity> strategiesForUi;

    public UiStates() {
        this(false, false, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiStates)) {
            return false;
        }
        UiStates uiStates = (UiStates) other;
        return this.loading == uiStates.loading && this.loadingFailed == uiStates.loadingFailed && Intrinsics.areEqual(this.allStrategies, uiStates.allStrategies) && Intrinsics.areEqual(this.strategyTypeGroupedData, uiStates.strategyTypeGroupedData) && Intrinsics.areEqual(this.strategiesForUi, uiStates.strategiesForUi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiStates(boolean z11, boolean z12, @Nullable List<StrategyItemEntity> list, @Nullable Map<Integer, ? extends List<StrategyItemEntity>> map, @Nullable List<StrategyItemEntity> list2) {
        this.loading = z11;
        this.loadingFailed = z12;
        this.allStrategies = list;
        this.strategyTypeGroupedData = map;
        this.strategiesForUi = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ UiStates m86700b(UiStates uiStates, boolean z11, boolean z12, List list, Map map, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = uiStates.loading;
        }
        if ((i11 & 2) != 0) {
            z12 = uiStates.loadingFailed;
        }
        if ((i11 & 4) != 0) {
            list = uiStates.allStrategies;
        }
        if ((i11 & 8) != 0) {
            map = uiStates.strategyTypeGroupedData;
        }
        if ((i11 & 16) != 0) {
            list2 = uiStates.strategiesForUi;
        }
        List list3 = list2;
        List list4 = list;
        return uiStates.m86701a(z11, z12, list4, map, list3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final UiStates m86701a(boolean z11, boolean z12, @Nullable List<StrategyItemEntity> list, @Nullable Map<Integer, ? extends List<StrategyItemEntity>> map, @Nullable List<StrategyItemEntity> list2) {
        return new UiStates(z11, z12, list, map, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final List<StrategyItemEntity> m86702c() {
        return this.allStrategies;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getLoadingFailed() {
        return this.loadingFailed;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final List<StrategyItemEntity> m86705f() {
        return this.strategiesForUi;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Map<Integer, List<StrategyItemEntity>> m86706g() {
        return this.strategyTypeGroupedData;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.loading) * 31) + Boolean.hashCode(this.loadingFailed)) * 31;
        List<StrategyItemEntity> list = this.allStrategies;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<Integer, List<StrategyItemEntity>> map = this.strategyTypeGroupedData;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<StrategyItemEntity> list2 = this.strategiesForUi;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UiStates(loading=" + this.loading + ", loadingFailed=" + this.loadingFailed + ", allStrategies=" + this.allStrategies + ", strategyTypeGroupedData=" + this.strategyTypeGroupedData + ", strategiesForUi=" + this.strategiesForUi + ')';
    }

    public /* synthetic */ UiStates(boolean z11, boolean z12, List list, Map map, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : map, (i11 & 16) != 0 ? null : list2);
    }
}
