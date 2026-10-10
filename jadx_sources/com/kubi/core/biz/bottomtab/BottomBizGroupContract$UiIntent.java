package com.kubi.core.biz.bottomtab;

import android.content.Context;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeBottomContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "JumpOrderRecordPage", "SelectedTabBiz", "RefreshData", "PageHide", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$JumpOrderRecordPage;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$PageHide;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$RefreshData;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$SelectedTabBiz;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BottomBizGroupContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: TradeBottomContract.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$JumpOrderRecordPage;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent;", "context", "Landroid/content/Context;", "symbol", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class JumpOrderRecordPage extends BottomBizGroupContract$UiIntent {

        @NotNull
        private final Context context;

        @Nullable
        private final String symbol;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JumpOrderRecordPage)) {
                return false;
            }
            JumpOrderRecordPage jumpOrderRecordPage = (JumpOrderRecordPage) other;
            return Intrinsics.areEqual(this.context, jumpOrderRecordPage.context) && Intrinsics.areEqual(this.symbol, jumpOrderRecordPage.symbol);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JumpOrderRecordPage(@NotNull Context context, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.symbol = str;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            String str = this.symbol;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "JumpOrderRecordPage(context=" + this.context + ", symbol=" + this.symbol + ')';
        }
    }

    /* JADX INFO: compiled from: TradeBottomContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$PageHide;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PageHide extends BottomBizGroupContract$UiIntent {

        @NotNull
        public static final PageHide INSTANCE = new PageHide();

        private PageHide() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof PageHide);
        }

        @NotNull
        public String toString() {
            return "PageHide";
        }

        public int hashCode() {
            return 503085000;
        }
    }

    /* JADX INFO: compiled from: TradeBottomContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$RefreshData;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RefreshData extends BottomBizGroupContract$UiIntent {

        @NotNull
        public static final RefreshData INSTANCE = new RefreshData();

        private RefreshData() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof RefreshData);
        }

        @NotNull
        public String toString() {
            return "RefreshData";
        }

        public int hashCode() {
            return 1130437230;
        }
    }

    /* JADX INFO: compiled from: TradeBottomContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent$SelectedTabBiz;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent;", "orderLevelType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "<init>", "(Lcom/kubi/core/base/order/data/OrderLevelType;)V", "getOrderLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SelectedTabBiz extends BottomBizGroupContract$UiIntent {

        @NotNull
        private final OrderLevelType orderLevelType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectedTabBiz) && Intrinsics.areEqual(this.orderLevelType, ((SelectedTabBiz) other).orderLevelType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedTabBiz(@NotNull OrderLevelType orderLevelType) {
            super(null);
            Intrinsics.checkNotNullParameter(orderLevelType, "orderLevelType");
            this.orderLevelType = orderLevelType;
        }

        @NotNull
        public final OrderLevelType getOrderLevelType() {
            return this.orderLevelType;
        }

        public int hashCode() {
            return this.orderLevelType.hashCode();
        }

        @NotNull
        public String toString() {
            return "SelectedTabBiz(orderLevelType=" + this.orderLevelType + ')';
        }
    }

    public /* synthetic */ BottomBizGroupContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BottomBizGroupContract$UiIntent() {
    }
}
