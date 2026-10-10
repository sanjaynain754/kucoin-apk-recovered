package com.kubi.kumex.record.currentDelegate.adapter;

import androidx.annotation.StringRes;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.record.OrderEmpty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TodoDelegateAdapter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "", "<init>", "()V", "BaseOrderInfo", "TwapOrderInfo", "ActiveOrderInfo", "StopOrderInfo", "TsoOrderInfo", "OrderViewMore", "OrderEmptyInfo", "OrderHistoryNumTipsInfo", "OrderHistoryEmpty", "OrderHistoryNoMore", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$BaseOrderInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderEmptyInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderHistoryEmpty;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderHistoryNoMore;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderHistoryNumTipsInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderViewMore;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class TodoDelegateItem {

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$a, reason: from toString */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$ActiveOrderInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$BaseOrderInfo;", "pageIndex", "", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "<init>", "(JLcom/kubi/kumex/data/trade/model/OrderEntity;)V", "getPageIndex", "()J", "getOrderEntity", "()Lcom/kubi/kumex/data/trade/model/OrderEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ActiveOrderInfo extends b {

        /* JADX INFO: renamed from: c, reason: from toString */
        public final long pageIndex;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final OrderEntity orderEntity;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveOrderInfo)) {
                return false;
            }
            ActiveOrderInfo activeOrderInfo = (ActiveOrderInfo) other;
            return this.pageIndex == activeOrderInfo.pageIndex && Intrinsics.areEqual(this.orderEntity, activeOrderInfo.orderEntity);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActiveOrderInfo(long j11, @NotNull OrderEntity orderEntity) {
            super(j11, orderEntity);
            Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
            this.pageIndex = j11;
            this.orderEntity = orderEntity;
        }

        @Override // com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem.b
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public OrderEntity getOrderEntity() {
            return this.orderEntity;
        }

        @Override // com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public long getPageIndex() {
            return this.pageIndex;
        }

        public int hashCode() {
            return (Long.hashCode(this.pageIndex) * 31) + this.orderEntity.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActiveOrderInfo(pageIndex=" + this.pageIndex + ", orderEntity=" + this.orderEntity + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$b */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$BaseOrderInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "pageIndex", "", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "<init>", "(JLcom/kubi/kumex/data/trade/model/OrderEntity;)V", "getPageIndex", "()J", "getOrderEntity", "()Lcom/kubi/kumex/data/trade/model/OrderEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static class b extends TodoDelegateItem {

        /* JADX INFO: renamed from: a */
        public final long f30001a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final OrderEntity f30002b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j11, @NotNull OrderEntity orderEntity) {
            super(null);
            Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
            this.f30001a = j11;
            this.f30002b = orderEntity;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public OrderEntity getOrderEntity() {
            return this.f30002b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public long getPageIndex() {
            return this.f30001a;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$c, reason: from toString */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderEmptyInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "orderEmpty", "Lcom/kubi/kumex/record/OrderEmpty;", "<init>", "(Lcom/kubi/kumex/record/OrderEmpty;)V", "getOrderEmpty", "()Lcom/kubi/kumex/record/OrderEmpty;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OrderEmptyInfo extends TodoDelegateItem {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final OrderEmpty orderEmpty;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderEmptyInfo) && Intrinsics.areEqual(this.orderEmpty, ((OrderEmptyInfo) other).orderEmpty);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderEmptyInfo(@NotNull OrderEmpty orderEmpty) {
            super(null);
            Intrinsics.checkNotNullParameter(orderEmpty, "orderEmpty");
            this.orderEmpty = orderEmpty;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final OrderEmpty getOrderEmpty() {
            return this.orderEmpty;
        }

        public int hashCode() {
            return this.orderEmpty.hashCode();
        }

        @NotNull
        public String toString() {
            return "OrderEmptyInfo(orderEmpty=" + this.orderEmpty + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$d */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderHistoryEmpty;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class d extends TodoDelegateItem {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final d f30004a = new d();

        public d() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof d);
        }

        @NotNull
        public String toString() {
            return "OrderHistoryEmpty";
        }

        public int hashCode() {
            return 1221404059;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$e */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderHistoryNoMore;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class e extends TodoDelegateItem {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final e f30005a = new e();

        public e() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof e);
        }

        @NotNull
        public String toString() {
            return "OrderHistoryNoMore";
        }

        public int hashCode() {
            return -532718040;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$f, reason: from toString */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderHistoryNumTipsInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "num", "", "assetType", "", "numDescResId", "", "<init>", "(JLjava/lang/String;I)V", "getNum", "()J", "getAssetType", "()Ljava/lang/String;", "getNumDescResId", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OrderHistoryNumTipsInfo extends TodoDelegateItem {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final long num;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String assetType;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final int numDescResId;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderHistoryNumTipsInfo)) {
                return false;
            }
            OrderHistoryNumTipsInfo orderHistoryNumTipsInfo = (OrderHistoryNumTipsInfo) other;
            return this.num == orderHistoryNumTipsInfo.num && Intrinsics.areEqual(this.assetType, orderHistoryNumTipsInfo.assetType) && this.numDescResId == orderHistoryNumTipsInfo.numDescResId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderHistoryNumTipsInfo(long j11, @NotNull String assetType, @StringRes int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.num = j11;
            this.assetType = assetType;
            this.numDescResId = i11;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAssetType() {
            return this.assetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getNum() {
            return this.num;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getNumDescResId() {
            return this.numDescResId;
        }

        public int hashCode() {
            return (((Long.hashCode(this.num) * 31) + this.assetType.hashCode()) * 31) + Integer.hashCode(this.numDescResId);
        }

        @NotNull
        public String toString() {
            return "OrderHistoryNumTipsInfo(num=" + this.num + ", assetType=" + this.assetType + ", numDescResId=" + this.numDescResId + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$g */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$OrderViewMore;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class g extends TodoDelegateItem {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final g f30009a = new g();

        public g() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof g);
        }

        @NotNull
        public String toString() {
            return "OrderViewMore";
        }

        public int hashCode() {
            return 362436892;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$h, reason: from toString */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$StopOrderInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$BaseOrderInfo;", "pageIndex", "", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "<init>", "(JLcom/kubi/kumex/data/trade/model/OrderEntity;)V", "getPageIndex", "()J", "getOrderEntity", "()Lcom/kubi/kumex/data/trade/model/OrderEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class StopOrderInfo extends b {

        /* JADX INFO: renamed from: c, reason: from toString */
        public final long pageIndex;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final OrderEntity orderEntity;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopOrderInfo)) {
                return false;
            }
            StopOrderInfo stopOrderInfo = (StopOrderInfo) other;
            return this.pageIndex == stopOrderInfo.pageIndex && Intrinsics.areEqual(this.orderEntity, stopOrderInfo.orderEntity);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopOrderInfo(long j11, @NotNull OrderEntity orderEntity) {
            super(j11, orderEntity);
            Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
            this.pageIndex = j11;
            this.orderEntity = orderEntity;
        }

        @Override // com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem.b
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public OrderEntity getOrderEntity() {
            return this.orderEntity;
        }

        @Override // com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public long getPageIndex() {
            return this.pageIndex;
        }

        public int hashCode() {
            return (Long.hashCode(this.pageIndex) * 31) + this.orderEntity.hashCode();
        }

        @NotNull
        public String toString() {
            return "StopOrderInfo(pageIndex=" + this.pageIndex + ", orderEntity=" + this.orderEntity + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$i, reason: from toString */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$TsoOrderInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$BaseOrderInfo;", "pageIndex", "", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "<init>", "(JLcom/kubi/kumex/data/trade/model/OrderEntity;)V", "getPageIndex", "()J", "getOrderEntity", "()Lcom/kubi/kumex/data/trade/model/OrderEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TsoOrderInfo extends b {

        /* JADX INFO: renamed from: c, reason: from toString */
        public final long pageIndex;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final OrderEntity orderEntity;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TsoOrderInfo)) {
                return false;
            }
            TsoOrderInfo tsoOrderInfo = (TsoOrderInfo) other;
            return this.pageIndex == tsoOrderInfo.pageIndex && Intrinsics.areEqual(this.orderEntity, tsoOrderInfo.orderEntity);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TsoOrderInfo(long j11, @NotNull OrderEntity orderEntity) {
            super(j11, orderEntity);
            Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
            this.pageIndex = j11;
            this.orderEntity = orderEntity;
        }

        @Override // com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem.b
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public OrderEntity getOrderEntity() {
            return this.orderEntity;
        }

        @Override // com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public long getPageIndex() {
            return this.pageIndex;
        }

        public int hashCode() {
            return (Long.hashCode(this.pageIndex) * 31) + this.orderEntity.hashCode();
        }

        @NotNull
        public String toString() {
            return "TsoOrderInfo(pageIndex=" + this.pageIndex + ", orderEntity=" + this.orderEntity + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.currentDelegate.adapter.a$j, reason: from toString */
    /* JADX INFO: compiled from: TodoDelegateAdapter.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$TwapOrderInfo;", "Lcom/kubi/kumex/record/currentDelegate/adapter/TodoDelegateItem$BaseOrderInfo;", "pageIndex", "", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "<init>", "(JLcom/kubi/kumex/data/trade/model/OrderEntity;)V", "getPageIndex", "()J", "getOrderEntity", "()Lcom/kubi/kumex/data/trade/model/OrderEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TwapOrderInfo extends b {

        /* JADX INFO: renamed from: c, reason: from toString */
        public final long pageIndex;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final OrderEntity orderEntity;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TwapOrderInfo)) {
                return false;
            }
            TwapOrderInfo twapOrderInfo = (TwapOrderInfo) other;
            return this.pageIndex == twapOrderInfo.pageIndex && Intrinsics.areEqual(this.orderEntity, twapOrderInfo.orderEntity);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TwapOrderInfo(long j11, @NotNull OrderEntity orderEntity) {
            super(j11, orderEntity);
            Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
            this.pageIndex = j11;
            this.orderEntity = orderEntity;
        }

        @Override // com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem.b
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public OrderEntity getOrderEntity() {
            return this.orderEntity;
        }

        @Override // com.kubi.kumex.record.currentDelegate.adapter.TodoDelegateItem.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public long getPageIndex() {
            return this.pageIndex;
        }

        public int hashCode() {
            return (Long.hashCode(this.pageIndex) * 31) + this.orderEntity.hashCode();
        }

        @NotNull
        public String toString() {
            return "TwapOrderInfo(pageIndex=" + this.pageIndex + ", orderEntity=" + this.orderEntity + ')';
        }
    }

    public /* synthetic */ TodoDelegateItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public TodoDelegateItem() {
    }
}
