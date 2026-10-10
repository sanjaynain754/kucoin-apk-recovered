package com.kubi.futures.trade.order.modify.hidden;

import androidx.lifecycle.Lifecycle;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.futures.trade.order.modify.hidden.HiddenModifyOrderDialog;
import com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog;
import com.kubi.futures.trade.submit.panel.tradeType.hidden.f;
import com.kubi.futures.trade.submit.validate.factory.b;
import com.kubi.futures.trade.submit.validate.factory.c;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.widget.ITradeInputLayoutOperations;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import dm.C36794l0;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HiddenModifyOrderDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0014¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/hidden/HiddenModifyOrderDialog;", "Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;", "Lcom/kubi/futures/trade/submit/panel/tradeType/hidden/IHiddenInputPanel;", "<init>", "()V", "orderType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "initView", "", "tradeInputInitialized", "", "isModifyOfOrder", "showQty", "Ljava/math/BigDecimal;", "side", "", "showInputQty", "isFullPercent", "createValidate", "Lcom/kubi/futures/trade/submit/validate/factory/OrderValidate$Factory;", "ensureInputPrecision", "blockId", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HiddenModifyOrderDialog extends LimitModifyOrderDialog implements f {
    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    /* JADX INFO: renamed from: V1 */
    public boolean mo27310V1() {
        return false;
    }

    /* JADX INFO: renamed from: D5 */
    public static final Unit m27315D5(C36794l0 c36794l0, HiddenModifyOrderDialog hiddenModifyOrderDialog) {
        if (c36794l0.f80454c.getF44406k()) {
            return Unit.INSTANCE;
        }
        if (!hiddenModifyOrderDialog.mo27319u5()) {
            C17058m0.m36548c(hiddenModifyOrderDialog, R$string.kc_trade_order_not_modify);
            return Unit.INSTANCE;
        }
        C43852m.m96591c(C17060n0.m36552b(), hiddenModifyOrderDialog.mo27312b5(), "1", null, 8, null);
        hiddenModifyOrderDialog.mo27317o1();
        c36794l0.f80454c.m55043o();
        hiddenModifyOrderDialog.mo27181z4().m27229V(hiddenModifyOrderDialog, hiddenModifyOrderDialog);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog, com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: E4 */
    public OrderTradeType mo27147E4() {
        return OrderTradeType.Hidden;
    }

    @Nullable
    /* JADX INFO: renamed from: L2 */
    public BigDecimal m27316L2(@NotNull String side) {
        Intrinsics.checkNotNullParameter(side, "side");
        InterfaceC38213a interfaceC38213aM27158Q2 = m27158Q2();
        if (interfaceC38213aM27158Q2 == null) {
            return null;
        }
        return mo27179x4().mo90015i(interfaceC38213aM27158Q2, m27360v2(side), m27318u1(), null);
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: J1 */
    public com.kubi.futures.trade.submit.validate.factory.f.a mo27309J1() {
        BigDecimal visibleSize;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            visibleSize = orderEntityM27178w4.getVisibleSize();
        } else {
            visibleSize = null;
        }
        if (C41014a.m89917B(visibleSize)) {
            return new b();
        }
        return new c();
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    /* JADX INFO: renamed from: a2 */
    public boolean mo27311a2() {
        return getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: b5 */
    public String mo27312b5() {
        BigDecimal visibleSize;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 != null) {
            visibleSize = orderEntityM27178w4.getVisibleSize();
        } else {
            visibleSize = null;
        }
        if (C41014a.m89917B(visibleSize)) {
            return "ModifyHiddenOrder";
        }
        return "ModifyIcebergOrder";
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog, com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    public void initView() {
        InterfaceC38213a interfaceC38213aM27158Q2;
        OrderEntity orderEntityM27178w4;
        BigDecimal bigDecimalAbs;
        super.initView();
        final C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 == null || (interfaceC38213aM27158Q2 = m27158Q2()) == null || (orderEntityM27178w4 = m27178w4()) == null) {
            return;
        }
        String str = C27017c.f54310a.m66516f(R$string.show_amount, new Object[0]) + '(' + C6447a.m11724a(m27171t0().mo90013g(interfaceC38213aM27158Q2)).toPlainString() + ')';
        KcTradeNumAbInputView kcTradeNumAbInputView = c36794l0M27350c5.f80475x;
        Intrinsics.checkNotNull(kcTradeNumAbInputView);
        C27046k.m66684G(kcTradeNumAbInputView, true);
        kcTradeNumAbInputView.setHint(str);
        kcTradeNumAbInputView.setSupportFloatInputFilter(true);
        ITradeInputLayoutOperations.m55172d(kcTradeNumAbInputView, mo27179x4().mo90016j(interfaceC38213aM27158Q2, orderEntityM27178w4.getPrice(), null), mo27179x4().mo90017k(interfaceC38213aM27158Q2), false, 4, null);
        kcTradeNumAbInputView.setEnsureIncrement(mo27179x4().mo90013g(interfaceC38213aM27158Q2));
        BigDecimal visibleSize = orderEntityM27178w4.getVisibleSize();
        if (visibleSize != null) {
            bigDecimalAbs = visibleSize.abs();
        } else {
            bigDecimalAbs = null;
        }
        BigDecimal bigDecimalM66656p = C27039d.m66656p(bigDecimalAbs);
        if (bigDecimalM66656p.compareTo(BigDecimal.ZERO) == 0) {
            kcTradeNumAbInputView.getEditText().setText("0");
        } else {
            BigDecimal bigDecimalM11724a = C6447a.m11724a(mo27179x4().mo90009c(interfaceC38213aM27158Q2, C27039d.m66656p(orderEntityM27178w4.getPrice()), bigDecimalM66656p, null));
            Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
            ITradeInputLayoutOperations.m55171a(kcTradeNumAbInputView, bigDecimalM11724a, false, 2, null);
        }
        kcTradeNumAbInputView.setStatusEnabled(!C41014a.m89917B(bigDecimalM66656p));
        KcPrimaryButton confirm = c36794l0M27350c5.f80454c;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: ri.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HiddenModifyOrderDialog.m27315D5(c36794l0M27350c5, this);
            }
        }, 1, null);
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    /* JADX INFO: renamed from: o1 */
    public void mo27317o1() {
        KcTradeNumAbInputView kcTradeNumAbInputView;
        super.mo27317o1();
        C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 != null && (kcTradeNumAbInputView = c36794l0M27350c5.f80475x) != null) {
            kcTradeNumAbInputView.mo54630g(false);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u1 */
    public BigDecimal m27318u1() {
        KcTradeNumAbInputView kcTradeNumAbInputView;
        C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 != null && (kcTradeNumAbInputView = c36794l0M27350c5.f80475x) != null) {
            return kcTradeNumAbInputView.getValue();
        }
        return null;
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    /* JADX INFO: renamed from: u5 */
    public boolean mo27319u5() {
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimalAbs;
        OrderEntity orderEntityM27178w4 = m27178w4();
        if (orderEntityM27178w4 == null) {
            return false;
        }
        BigDecimal bigDecimalM27360v2 = m27360v2(C27041f.m66669i(orderEntityM27178w4.getSide(), "buy"));
        BigDecimal bigDecimalM27348I2 = m27348I2(C27041f.m66669i(orderEntityM27178w4.getSide(), "buy"));
        BigDecimal bigDecimalM27316L2 = m27316L2(C27041f.m66669i(orderEntityM27178w4.getSide(), "buy"));
        BigDecimal bigDecimalM27363x0 = m27363x0();
        BigDecimal bigDecimalM27355g0 = m27355g0();
        if (C17054k0.m36528b(bigDecimalM27360v2, orderEntityM27178w4.getPrice())) {
            BigDecimal size = orderEntityM27178w4.getSize();
            BigDecimal bigDecimalAbs2 = null;
            if (size != null && (bigDecimalAbs = size.abs()) != null) {
                bigDecimalSubtract = bigDecimalAbs.subtract(C27039d.m66656p(orderEntityM27178w4.getDealSize()));
            } else {
                bigDecimalSubtract = null;
            }
            if (C17054k0.m36528b(bigDecimalM27348I2, bigDecimalSubtract)) {
                BigDecimal visibleSize = orderEntityM27178w4.getVisibleSize();
                if (visibleSize != null) {
                    bigDecimalAbs2 = visibleSize.abs();
                }
                if (C17054k0.m36528b(bigDecimalM27316L2, bigDecimalAbs2) && C17054k0.m36528b(bigDecimalM27363x0, orderEntityM27178w4.getTriggerStopUpPrice()) && C17054k0.m36528b(bigDecimalM27355g0, orderEntityM27178w4.getTriggerStopDownPrice())) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
