package com.kubi.tradebase.orderbook;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.widget.OrderBookItemView;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$drawable;
import com.kubi.tradebase.R$layout;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderBookAdapter.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0007J \u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0005J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/tradebase/orderbook/OrderBookAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/tradebase/orderbook/OrderBookItemData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "sideType", "", "direction", "isTotalAmount", "", "selectListener", "Lcom/kubi/resources/widget/OrderBookItemView$OnTradingSelectListener;", "<init>", "(IIZLcom/kubi/resources/widget/OrderBookItemView$OnTradingSelectListener;)V", "changedDisplayTotal", "", "isTotal", "updateOrderBookData", "data", "Lcom/kubi/tradebase/orderbook/DisplayOrderBookData;", "isShowAll", "displaySize", "getItemView", "Landroid/view/View;", "layoutResId", "parent", "Landroid/view/ViewGroup;", "convert", "helper", "item", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderBookAdapter extends BaseQuickAdapter<OrderBookItemData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final int f51585i;

    /* JADX INFO: renamed from: j */
    public final int f51586j;

    /* JADX INFO: renamed from: k */
    public boolean f51587k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public OrderBookItemView.InterfaceC22934a f51588l;

    public OrderBookAdapter() {
        this(0, 0, false, null, 15, null);
    }

    public /* synthetic */ OrderBookAdapter(int i11, int i12, boolean z11, OrderBookItemView.InterfaceC22934a interfaceC22934a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? false : z11, (i13 & 8) != 0 ? null : interfaceC22934a);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: g */
    public final void m63252g(boolean z11) {
        this.f51587k = z11;
        notifyDataSetChanged();
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public View getItemView(int layoutResId, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = super.getItemView(layoutResId, parent);
        Intrinsics.checkNotNull(itemView, "null cannot be cast to non-null type com.kubi.resources.widget.OrderBookItemView");
        OrderBookItemView orderBookItemView = (OrderBookItemView) itemView;
        OrderBookItemView.InterfaceC22934a interfaceC22934a = this.f51588l;
        if (interfaceC22934a != null) {
            orderBookItemView.setOnSelectListener(interfaceC22934a);
            orderBookItemView.setBackgroundResource(R$drawable.selector_orderbook_item_press);
        }
        orderBookItemView.setOrderBookType(this.f51585i);
        orderBookItemView.setDirection(this.f51586j);
        int iM6236a = C5275i0.m6236a(6.5f);
        if (this.f51586j == 1) {
            if (this.f51585i == 0) {
                orderBookItemView.setPadding(iM6236a, 0, 0, 0);
                return orderBookItemView;
            }
            orderBookItemView.setPadding(0, 0, iM6236a, 0);
        }
        return orderBookItemView;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull OrderBookItemData item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.kubi.resources.widget.OrderBookItemView");
        OrderBookItemView orderBookItemView = (OrderBookItemView) view;
        orderBookItemView.setProgress(item.getDisplayProgress());
        orderBookItemView.setNeedShowPosition(item.isDelegationMark());
        orderBookItemView.setAmountColor(ContextCompat.getColor(this.mContext, R$color.c_text80));
        String displayAmount = null;
        if (this.f51587k) {
            DisPlayAmount totalAmount = item.getTotalAmount();
            if (totalAmount != null) {
                displayAmount = totalAmount.getDisplayAmount();
            }
        } else {
            DisPlayAmount singleAmount = item.getSingleAmount();
            if (singleAmount != null) {
                displayAmount = singleAmount.getDisplayAmount();
            }
        }
        orderBookItemView.setText(C27041f.m66669i(item.getDisplayPrice(), "--"), C27041f.m66669i(displayAmount, "--"));
        orderBookItemView.setTextSize(item.getTextSize());
    }

    /* JADX INFO: renamed from: i */
    public final void m63254i(@NotNull DisplayOrderBookData data, boolean z11, int i11) {
        List<OrderBookItemData> listM63280a;
        List<OrderBookItemData> listM63280a2;
        Intrinsics.checkNotNullParameter(data, "data");
        int iAbs = Math.abs(i11);
        if (z11) {
            if (this.f51585i == 1) {
                listM63280a2 = C25907c.m63280a(CollectionsKt.take(data.getDisplayBids(), iAbs), iAbs);
            } else {
                listM63280a2 = C25907c.m63280a(CollectionsKt.take(data.getDisplayAsks(), iAbs), iAbs);
                if (this.f51586j == 0) {
                    listM63280a2 = CollectionsKt.reversed(listM63280a2);
                }
            }
            replaceData(listM63280a2);
            return;
        }
        if (this.f51585i == 1) {
            listM63280a = C25907c.m63280a(data.getDisplayBids(), 10);
        } else {
            listM63280a = C25907c.m63280a(data.getDisplayAsks(), 10);
            if (this.f51586j == 0) {
                listM63280a = CollectionsKt.reversed(listM63280a);
            }
        }
        replaceData(listM63280a);
    }

    public OrderBookAdapter(int i11, int i12, boolean z11, @Nullable OrderBookItemView.InterfaceC22934a interfaceC22934a) {
        super(R$layout.btradebase_item_orderbook);
        this.f51585i = i11;
        this.f51586j = i12;
        this.f51587k = z11;
        this.f51588l = interfaceC22934a;
    }
}
