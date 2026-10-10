package com.kubi.kumex.record.done.adapter;

import com.kubi.kumex.data.trade.model.OrderEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.record.done.adapter.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TwapDelegateRecordAdapter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem;", "", "<init>", "()V", "TwapOrderInfo", "Empty", "NoMore", "Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem$Empty;", "Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem$NoMore;", "Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem$TwapOrderInfo;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class DelegateRecordItem {

    /* JADX INFO: renamed from: com.kubi.kumex.record.done.adapter.a$a */
    /* JADX INFO: compiled from: TwapDelegateRecordAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem$Empty;", "Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a extends DelegateRecordItem {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f30186a = new a();

        public a() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @NotNull
        public String toString() {
            return "Empty";
        }

        public int hashCode() {
            return 1908567934;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.done.adapter.a$b */
    /* JADX INFO: compiled from: TwapDelegateRecordAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem$NoMore;", "Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b extends DelegateRecordItem {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f30187a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "NoMore";
        }

        public int hashCode() {
            return -705474395;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.done.adapter.a$c, reason: from toString */
    /* JADX INFO: compiled from: TwapDelegateRecordAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem$TwapOrderInfo;", "Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem;", "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "<init>", "(Lcom/kubi/kumex/data/trade/model/OrderEntity;)V", "getOrderEntity", "()Lcom/kubi/kumex/data/trade/model/OrderEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TwapOrderInfo extends DelegateRecordItem {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final OrderEntity orderEntity;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TwapOrderInfo) && Intrinsics.areEqual(this.orderEntity, ((TwapOrderInfo) other).orderEntity);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TwapOrderInfo(@NotNull OrderEntity orderEntity) {
            super(null);
            Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
            this.orderEntity = orderEntity;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final OrderEntity getOrderEntity() {
            return this.orderEntity;
        }

        public int hashCode() {
            return this.orderEntity.hashCode();
        }

        @NotNull
        public String toString() {
            return "TwapOrderInfo(orderEntity=" + this.orderEntity + ')';
        }
    }

    public /* synthetic */ DelegateRecordItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public DelegateRecordItem() {
    }
}
