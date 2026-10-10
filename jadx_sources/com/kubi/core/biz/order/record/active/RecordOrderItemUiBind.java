package com.kubi.core.biz.order.record.active;

import android.content.Context;
import com.kubi.core.base.order.data.C11623a;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.biz.bottomtab.order.child.DelegationCustomItemBind;
import com.kubi.data.entity.SymbolInfoEntity;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p401kd.C41005i;
import p401kd.C41008l;
import p401kd.InterfaceC41007k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.order.record.active.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RecordOrderItemUiBind.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/RecordOrderItemUiBind;", "Lcom/kubi/core/biz/bottomtab/order/child/DelegationCustomItemBind;", "<init>", "()V", "bindDataToItemView", "", "context", "Landroid/content/Context;", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "curSymbol", "", "needJumpGuideIcon", "", "isMargin", "cancelOrder", "Lkotlin/Function1;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;", "parseOrderItemToData", "parseLimitData", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Limit;", "parseMarketData", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Market;", "parseConditionalLimitData", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalLimit;", "parseConditionalMarketData", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalMarket;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RecordOrderItemUiBind implements DelegationCustomItemBind {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RecordOrderItemUiBind f20596a = new RecordOrderItemUiBind();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: g */
    private final InterfaceC41007k m22145g(OrderItem orderItem) {
        String orderDisplayType;
        if (orderItem == null || (orderDisplayType = orderItem.getOrderDisplayType()) == null) {
            return null;
        }
        switch (orderDisplayType.hashCode()) {
            case 48:
                if (orderDisplayType.equals("0")) {
                    return m22143e(orderItem);
                }
                return null;
            case 49:
                if (orderDisplayType.equals("1")) {
                    return m22144f(orderItem);
                }
                return null;
            case 50:
                if (orderDisplayType.equals("2")) {
                    return m22141c(orderItem);
                }
                return null;
            case 51:
                if (orderDisplayType.equals("3")) {
                    return m22142d(orderItem);
                }
                return null;
            case 52:
                if (orderDisplayType.equals("4")) {
                    return m22143e(orderItem);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC41007k.ConditionalLimit m22141c(OrderItem orderItem) {
        String side;
        String symbol;
        SymbolInfoEntity symbolInfoEntityM85601B = (orderItem == null || (symbol = orderItem.getSymbol()) == null) ? null : C37890n.f85269a.m85601B(symbol);
        return new InterfaceC41007k.ConditionalLimit(orderItem != null ? orderItem.getOrderId() : null, orderItem != null ? orderItem.getOrderTime() : null, orderItem != null ? orderItem.getOrderDisplayType() : null, orderItem != null ? orderItem.getSymbol() : null, (orderItem == null || (side = orderItem.getSide()) == null) ? null : C11623a.m21087f(side), orderItem != null ? orderItem.getSize() : null, orderItem != null ? orderItem.getFunds() : null, orderItem != null ? Intrinsics.areEqual(orderItem.getHidden(), Boolean.TRUE) : false, orderItem != null ? Intrinsics.areEqual(orderItem.getIceberg(), Boolean.TRUE) : false, C41008l.m89878b(false, orderItem, symbolInfoEntityM85601B), orderItem != null ? orderItem.getFilledFunds() : null, orderItem != null ? orderItem.getFilledSize() : null, orderItem != null ? orderItem.getAvgPrice() : null, orderItem != null ? orderItem.getPrice() : null, orderItem != null ? orderItem.getTriggerPrice() : null, orderItem != null ? orderItem.getTriggerDirection() : null, symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, symbolInfoEntityM85601B != null ? Integer.valueOf(symbolInfoEntityM85601B.getQuoteIncrementPrecision()) : null, symbolInfoEntityM85601B != null ? Integer.valueOf(symbolInfoEntityM85601B.getBaseIncrementPrecision()) : null);
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC41007k.ConditionalMarket m22142d(OrderItem orderItem) {
        String side;
        String symbol;
        SymbolInfoEntity symbolInfoEntityM85601B = (orderItem == null || (symbol = orderItem.getSymbol()) == null) ? null : C37890n.f85269a.m85601B(symbol);
        return new InterfaceC41007k.ConditionalMarket(orderItem != null ? orderItem.getOrderId() : null, orderItem != null ? orderItem.getOrderTime() : null, orderItem != null ? orderItem.getOrderDisplayType() : null, orderItem != null ? orderItem.getSymbol() : null, (orderItem == null || (side = orderItem.getSide()) == null) ? null : C11623a.m21087f(side), orderItem != null ? orderItem.getSize() : null, orderItem != null ? orderItem.getFunds() : null, orderItem != null ? Intrinsics.areEqual(orderItem.getHidden(), Boolean.TRUE) : false, orderItem != null ? Intrinsics.areEqual(orderItem.getIceberg(), Boolean.TRUE) : false, C41008l.m89878b(true, orderItem, symbolInfoEntityM85601B), orderItem != null ? orderItem.getFilledFunds() : null, orderItem != null ? orderItem.getFilledSize() : null, orderItem != null ? orderItem.getAvgPrice() : null, orderItem != null ? orderItem.getTriggerPrice() : null, orderItem != null ? orderItem.getTriggerDirection() : null, symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, symbolInfoEntityM85601B != null ? Integer.valueOf(symbolInfoEntityM85601B.getQuoteIncrementPrecision()) : null, symbolInfoEntityM85601B != null ? Integer.valueOf(symbolInfoEntityM85601B.getBaseIncrementPrecision()) : null);
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC41007k.Limit m22143e(OrderItem orderItem) {
        String side;
        String symbol;
        SymbolInfoEntity symbolInfoEntityM85601B = (orderItem == null || (symbol = orderItem.getSymbol()) == null) ? null : C37890n.f85269a.m85601B(symbol);
        return new InterfaceC41007k.Limit(orderItem != null ? orderItem.getOrderId() : null, orderItem != null ? orderItem.getOrderTime() : null, orderItem != null ? orderItem.getOrderDisplayType() : null, orderItem != null ? orderItem.getSymbol() : null, (orderItem == null || (side = orderItem.getSide()) == null) ? null : C11623a.m21087f(side), orderItem != null ? orderItem.getSize() : null, orderItem != null ? orderItem.getFunds() : null, orderItem != null ? Intrinsics.areEqual(orderItem.getHidden(), Boolean.TRUE) : false, orderItem != null ? Intrinsics.areEqual(orderItem.getIceberg(), Boolean.TRUE) : false, C41008l.m89878b(false, orderItem, symbolInfoEntityM85601B), orderItem != null ? orderItem.getFilledFunds() : null, orderItem != null ? orderItem.getFilledSize() : null, orderItem != null ? orderItem.getAvgPrice() : null, symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, symbolInfoEntityM85601B != null ? Integer.valueOf(symbolInfoEntityM85601B.getQuoteIncrementPrecision()) : null, symbolInfoEntityM85601B != null ? Integer.valueOf(symbolInfoEntityM85601B.getBaseIncrementPrecision()) : null, orderItem != null ? orderItem.getPrice() : null);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC41007k.Market m22144f(OrderItem orderItem) {
        String side;
        String symbol;
        SymbolInfoEntity symbolInfoEntityM85601B = (orderItem == null || (symbol = orderItem.getSymbol()) == null) ? null : C37890n.f85269a.m85601B(symbol);
        return new InterfaceC41007k.Market(orderItem != null ? orderItem.getOrderId() : null, orderItem != null ? orderItem.getOrderTime() : null, orderItem != null ? orderItem.getOrderDisplayType() : null, orderItem != null ? orderItem.getSymbol() : null, (orderItem == null || (side = orderItem.getSide()) == null) ? null : C11623a.m21087f(side), orderItem != null ? orderItem.getSize() : null, orderItem != null ? orderItem.getFunds() : null, orderItem != null ? Intrinsics.areEqual(orderItem.getHidden(), Boolean.TRUE) : false, orderItem != null ? Intrinsics.areEqual(orderItem.getIceberg(), Boolean.TRUE) : false, C41008l.m89878b(true, orderItem, symbolInfoEntityM85601B), orderItem != null ? orderItem.getFilledFunds() : null, orderItem != null ? orderItem.getFilledSize() : null, orderItem != null ? orderItem.getAvgPrice() : null, symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, symbolInfoEntityM85601B != null ? Integer.valueOf(symbolInfoEntityM85601B.getQuoteIncrementPrecision()) : null, symbolInfoEntityM85601B != null ? Integer.valueOf(symbolInfoEntityM85601B.getBaseIncrementPrecision()) : null);
    }

    @Override // com.kubi.core.biz.bottomtab.order.child.DelegationCustomItemBind
    /* JADX INFO: renamed from: b */
    public void mo21491b(@NotNull Context context, @Nullable BaseViewHolder baseViewHolder, @Nullable OrderItem orderItem, @Nullable String str, boolean z11, boolean z12, @NotNull Function1<? super InterfaceC41007k, Unit> cancelOrder) {
        InterfaceC41007k interfaceC41007kM22145g;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cancelOrder, "cancelOrder");
        if (baseViewHolder == null || orderItem == null || (interfaceC41007kM22145g = m22145g(orderItem)) == null) {
            return;
        }
        if (interfaceC41007kM22145g instanceof InterfaceC41007k.Limit) {
            C41005i.m89841o(baseViewHolder, context, str, z11, (InterfaceC41007k.Limit) interfaceC41007kM22145g, z12, cancelOrder);
            return;
        }
        if (interfaceC41007kM22145g instanceof InterfaceC41007k.Market) {
            C41005i.m89844r(baseViewHolder, context, str, z11, (InterfaceC41007k.Market) interfaceC41007kM22145g, z12, cancelOrder);
        } else if (interfaceC41007kM22145g instanceof InterfaceC41007k.ConditionalMarket) {
            C41005i.m89838l(baseViewHolder, context, str, z11, (InterfaceC41007k.ConditionalMarket) interfaceC41007kM22145g, z12, cancelOrder);
        } else {
            if (!(interfaceC41007kM22145g instanceof InterfaceC41007k.ConditionalLimit)) {
                throw new NoWhenBranchMatchedException();
            }
            C41005i.m89835i(baseViewHolder, context, str, z11, (InterfaceC41007k.ConditionalLimit) interfaceC41007kM22145g, z12, cancelOrder);
        }
    }
}
