package com.kubi.core.biz.bottomtab;

import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.BottomBizGroupContract$UiState, reason: from toString */
/* JADX INFO: compiled from: TradeBottomContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006&"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiState;", "Lcom/kubi/core/base/arch/mvi/IBizUiStatus;", "orderLevelType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "defaultTabIndex", "", "supportTabs", "", "Lcom/kubi/core/biz/bottomtab/Tabs;", "delegationCount", "", "basicOrderCount", "advancedOrderCount", "<init>", "(Lcom/kubi/core/base/order/data/OrderLevelType;ILjava/util/List;Ljava/lang/String;II)V", "getOrderLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "getDefaultTabIndex", "()I", "getSupportTabs", "()Ljava/util/List;", "getDelegationCount", "()Ljava/lang/String;", "getBasicOrderCount", "getAdvancedOrderCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UiState implements InterfaceC19284f {
    private final int advancedOrderCount;
    private final int basicOrderCount;
    private final int defaultTabIndex;

    @NotNull
    private final String delegationCount;

    @NotNull
    private final OrderLevelType orderLevelType;

    @NotNull
    private final List<Tabs> supportTabs;

    public UiState() {
        this(null, 0, null, null, 0, 0, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiState)) {
            return false;
        }
        UiState uiState = (UiState) other;
        return Intrinsics.areEqual(this.orderLevelType, uiState.orderLevelType) && this.defaultTabIndex == uiState.defaultTabIndex && Intrinsics.areEqual(this.supportTabs, uiState.supportTabs) && Intrinsics.areEqual(this.delegationCount, uiState.delegationCount) && this.basicOrderCount == uiState.basicOrderCount && this.advancedOrderCount == uiState.advancedOrderCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiState(@NotNull OrderLevelType orderLevelType, int i11, @NotNull List<? extends Tabs> supportTabs, @NotNull String delegationCount, int i12, int i13) {
        Intrinsics.checkNotNullParameter(orderLevelType, "orderLevelType");
        Intrinsics.checkNotNullParameter(supportTabs, "supportTabs");
        Intrinsics.checkNotNullParameter(delegationCount, "delegationCount");
        this.orderLevelType = orderLevelType;
        this.defaultTabIndex = i11;
        this.supportTabs = supportTabs;
        this.delegationCount = delegationCount;
        this.basicOrderCount = i12;
        this.advancedOrderCount = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiState copy$default(UiState uiState, OrderLevelType orderLevelType, int i11, List list, String str, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            orderLevelType = uiState.orderLevelType;
        }
        if ((i14 & 2) != 0) {
            i11 = uiState.defaultTabIndex;
        }
        if ((i14 & 4) != 0) {
            list = uiState.supportTabs;
        }
        if ((i14 & 8) != 0) {
            str = uiState.delegationCount;
        }
        if ((i14 & 16) != 0) {
            i12 = uiState.basicOrderCount;
        }
        if ((i14 & 32) != 0) {
            i13 = uiState.advancedOrderCount;
        }
        int i15 = i12;
        int i16 = i13;
        return uiState.copy(orderLevelType, i11, list, str, i15, i16);
    }

    @NotNull
    public final UiState copy(@NotNull OrderLevelType orderLevelType, int defaultTabIndex, @NotNull List<? extends Tabs> supportTabs, @NotNull String delegationCount, int basicOrderCount, int advancedOrderCount) {
        Intrinsics.checkNotNullParameter(orderLevelType, "orderLevelType");
        Intrinsics.checkNotNullParameter(supportTabs, "supportTabs");
        Intrinsics.checkNotNullParameter(delegationCount, "delegationCount");
        return new UiState(orderLevelType, defaultTabIndex, supportTabs, delegationCount, basicOrderCount, advancedOrderCount);
    }

    public final int getAdvancedOrderCount() {
        return this.advancedOrderCount;
    }

    public final int getBasicOrderCount() {
        return this.basicOrderCount;
    }

    public final int getDefaultTabIndex() {
        return this.defaultTabIndex;
    }

    @NotNull
    public final String getDelegationCount() {
        return this.delegationCount;
    }

    @NotNull
    public final OrderLevelType getOrderLevelType() {
        return this.orderLevelType;
    }

    @NotNull
    public final List<Tabs> getSupportTabs() {
        return this.supportTabs;
    }

    public int hashCode() {
        return (((((((((this.orderLevelType.hashCode() * 31) + Integer.hashCode(this.defaultTabIndex)) * 31) + this.supportTabs.hashCode()) * 31) + this.delegationCount.hashCode()) * 31) + Integer.hashCode(this.basicOrderCount)) * 31) + Integer.hashCode(this.advancedOrderCount);
    }

    @NotNull
    public String toString() {
        return "UiState(orderLevelType=" + this.orderLevelType + ", defaultTabIndex=" + this.defaultTabIndex + ", supportTabs=" + this.supportTabs + ", delegationCount=" + this.delegationCount + ", basicOrderCount=" + this.basicOrderCount + ", advancedOrderCount=" + this.advancedOrderCount + ')';
    }

    public /* synthetic */ UiState(OrderLevelType orderLevelType, int i11, List list, String str, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? OrderLevelType.Normal.INSTANCE : orderLevelType, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? CollectionsKt.emptyList() : list, (i14 & 8) != 0 ? "" : str, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? 0 : i13);
    }
}
