package com.kubi.utaspotlib.biz.order;

import com.kubi.core.spot.business.holder.LimitOrderHolder;
import com.kubi.core.spot.business.holder.MarketOrderHolder;
import com.kubi.core.spot.business.holder.SegmentOrderHolder;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import ne.InterfaceC42808a;
import ne.LimitTradeInputData;
import ne.MarketTradeInputData;
import ne.SegmentTradeInputData;
import p852kotlin.Metadata;
import v30.C45371a0;

/* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.e */
/* JADX INFO: compiled from: UtaOrderConfirmationDialog.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0007"}, m90084d2 = {"isMarginBorrowSupported", "", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "getBorrowCurrency", "", "getBorrowAmountText", "showPreRiskRate", "UtaSpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C26918e {
    /* JADX INFO: renamed from: e */
    public static final String m66174e(InterfaceC42808a interfaceC42808a) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        CharSequence text = null;
        if (interfaceC42808a instanceof MarketTradeInputData) {
            MarketTradeInputData marketTradeInputData = (MarketTradeInputData) interfaceC42808a;
            MarketOrderHolder orderHolderType = marketTradeInputData.getOrderHolderType();
            if (marketTradeInputData.getIsBuy()) {
                C45371a0 binding = orderHolderType.getBinding();
                if (binding != null && (baseTextView6 = binding.f102015p) != null) {
                    text = baseTextView6.getText();
                }
                return String.valueOf(text);
            }
            C45371a0 binding2 = orderHolderType.getBinding();
            if (binding2 != null && (baseTextView5 = binding2.f102010k) != null) {
                text = baseTextView5.getText();
            }
            return String.valueOf(text);
        }
        if (interfaceC42808a instanceof LimitTradeInputData) {
            LimitTradeInputData limitTradeInputData = (LimitTradeInputData) interfaceC42808a;
            LimitOrderHolder orderHolderType2 = limitTradeInputData.getOrderHolderType();
            if (limitTradeInputData.getIsBuy()) {
                C45371a0 binding3 = orderHolderType2.getBinding();
                if (binding3 != null && (baseTextView4 = binding3.f102015p) != null) {
                    text = baseTextView4.getText();
                }
                return String.valueOf(text);
            }
            C45371a0 binding4 = orderHolderType2.getBinding();
            if (binding4 != null && (baseTextView3 = binding4.f102010k) != null) {
                text = baseTextView3.getText();
            }
            return String.valueOf(text);
        }
        if (!(interfaceC42808a instanceof SegmentTradeInputData)) {
            return "";
        }
        SegmentTradeInputData segmentTradeInputData = (SegmentTradeInputData) interfaceC42808a;
        SegmentOrderHolder orderHolderType3 = segmentTradeInputData.getOrderHolderType();
        if (segmentTradeInputData.getIsBuy()) {
            C45371a0 binding5 = orderHolderType3.getBinding();
            if (binding5 != null && (baseTextView2 = binding5.f102015p) != null) {
                text = baseTextView2.getText();
            }
            return String.valueOf(text);
        }
        C45371a0 binding6 = orderHolderType3.getBinding();
        if (binding6 != null && (baseTextView = binding6.f102010k) != null) {
            text = baseTextView.getText();
        }
        return String.valueOf(text);
    }

    /* JADX INFO: renamed from: f */
    public static final String m66175f(InterfaceC42808a interfaceC42808a) {
        if (interfaceC42808a instanceof MarketTradeInputData) {
            MarketTradeInputData marketTradeInputData = (MarketTradeInputData) interfaceC42808a;
            boolean isBuy = marketTradeInputData.getIsBuy();
            SymbolInfoEntity symbolInfoEntityM93865o = marketTradeInputData.m93865o();
            if (isBuy) {
                if (symbolInfoEntityM93865o != null) {
                    return symbolInfoEntityM93865o.getQuoteCurrency();
                }
                return null;
            }
            if (symbolInfoEntityM93865o != null) {
                return symbolInfoEntityM93865o.getBaseCurrency();
            }
            return null;
        }
        if (interfaceC42808a instanceof LimitTradeInputData) {
            LimitTradeInputData limitTradeInputData = (LimitTradeInputData) interfaceC42808a;
            boolean isBuy2 = limitTradeInputData.getIsBuy();
            SymbolInfoEntity symbolInfoEntityM93852p = limitTradeInputData.m93852p();
            if (isBuy2) {
                if (symbolInfoEntityM93852p != null) {
                    return symbolInfoEntityM93852p.getQuoteCurrency();
                }
                return null;
            }
            if (symbolInfoEntityM93852p != null) {
                return symbolInfoEntityM93852p.getBaseCurrency();
            }
            return null;
        }
        if (interfaceC42808a instanceof SegmentTradeInputData) {
            SegmentTradeInputData segmentTradeInputData = (SegmentTradeInputData) interfaceC42808a;
            boolean isBuy3 = segmentTradeInputData.getIsBuy();
            SymbolInfoEntity symbolInfoEntityM93878p = segmentTradeInputData.m93878p();
            if (isBuy3) {
                if (symbolInfoEntityM93878p != null) {
                    return symbolInfoEntityM93878p.getQuoteCurrency();
                }
                return null;
            }
            if (symbolInfoEntityM93878p != null) {
                return symbolInfoEntityM93878p.getBaseCurrency();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m66176g(InterfaceC42808a interfaceC42808a) {
        if (interfaceC42808a instanceof MarketTradeInputData) {
            MarketTradeInputData marketTradeInputData = (MarketTradeInputData) interfaceC42808a;
            return marketTradeInputData.getIsBuy() ? marketTradeInputData.getOrderHolderType().m22965t0() : marketTradeInputData.getOrderHolderType().m22964s0();
        }
        if (interfaceC42808a instanceof LimitTradeInputData) {
            LimitTradeInputData limitTradeInputData = (LimitTradeInputData) interfaceC42808a;
            return limitTradeInputData.getIsBuy() ? limitTradeInputData.getOrderHolderType().m22965t0() : limitTradeInputData.getOrderHolderType().m22964s0();
        }
        if (!(interfaceC42808a instanceof SegmentTradeInputData)) {
            return false;
        }
        SegmentTradeInputData segmentTradeInputData = (SegmentTradeInputData) interfaceC42808a;
        return segmentTradeInputData.getIsBuy() ? segmentTradeInputData.getOrderHolderType().m22965t0() : segmentTradeInputData.getOrderHolderType().m22964s0();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m66177h(InterfaceC42808a interfaceC42808a) {
        return !(interfaceC42808a instanceof SegmentTradeInputData);
    }
}
