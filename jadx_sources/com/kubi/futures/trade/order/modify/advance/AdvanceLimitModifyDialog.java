package com.kubi.futures.trade.order.modify.advance;

import androidx.lifecycle.Lifecycle;
import com.kubi.futures.dialog.TIF;
import com.kubi.futures.trade.order.modify.advance.AdvanceLimitModifyDialog;
import com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog;
import com.kubi.futures.trade.submit.panel.tradeType.advanceLimit.d;
import com.kubi.futures.trade.submit.validate.factory.a;
import com.kubi.futures.trade.submit.validate.factory.f;
import com.kubi.kumex.R$string;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.extensions.C27046k;
import dm.C36794l0;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdvanceLimitModifyDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0014¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/advance/AdvanceLimitModifyDialog;", "Lcom/kubi/futures/trade/order/modify/limit/LimitModifyOrderDialog;", "Lcom/kubi/futures/trade/submit/panel/tradeType/advanceLimit/IAdvanceInputPanel;", "<init>", "()V", "initView", "", "tradeInputInitialized", "", "orderType", "Lcom/kubi/kumex/logic/constant/OrderTradeType;", "tif", "", "isFullPercent", "createValidate", "Lcom/kubi/futures/trade/submit/validate/factory/OrderValidate$Factory;", "blockId", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AdvanceLimitModifyDialog extends LimitModifyOrderDialog implements d {
    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    /* JADX INFO: renamed from: V1 */
    public boolean mo27310V1() {
        return false;
    }

    /* JADX INFO: renamed from: D5 */
    public static final Unit m27308D5(C36794l0 c36794l0, AdvanceLimitModifyDialog advanceLimitModifyDialog) {
        if (c36794l0.f80454c.getF44406k()) {
            return Unit.INSTANCE;
        }
        if (!advanceLimitModifyDialog.mo27319u5()) {
            C17058m0.m36549d(advanceLimitModifyDialog, advanceLimitModifyDialog.getString(R$string.kc_trade_order_not_modify));
            return Unit.INSTANCE;
        }
        C43852m.m96591c(C17060n0.m36552b(), advanceLimitModifyDialog.mo27312b5(), "1", null, 8, null);
        advanceLimitModifyDialog.mo27317o1();
        c36794l0.f80454c.m55043o();
        advanceLimitModifyDialog.mo27181z4().m27229V(advanceLimitModifyDialog, advanceLimitModifyDialog);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog, com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: E4 */
    public OrderTradeType mo27147E4() {
        return OrderTradeType.AdvancedLimit;
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: J1 */
    public f.a mo27309J1() {
        return new a();
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    @NotNull
    /* JADX INFO: renamed from: b5 */
    public String mo27312b5() {
        return "ModifyAdvancedLimitOrder";
    }

    @NotNull
    /* JADX INFO: renamed from: w1 */
    public String m27313w1() {
        return TIF.PostOnly.getTifForBackendRequest();
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog
    /* JADX INFO: renamed from: a2 */
    public boolean mo27311a2() {
        return getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.kubi.futures.trade.order.modify.limit.LimitModifyOrderDialog, com.kubi.futures.trade.order.modify.BaseModifyOrderDialog
    public void initView() {
        super.initView();
        final C36794l0 c36794l0M27350c5 = m27350c5();
        if (c36794l0M27350c5 == null) {
            return;
        }
        BaseTextView type = c36794l0M27350c5.f80473v;
        Intrinsics.checkNotNullExpressionValue(type, "type");
        C27046k.m66685H(type);
        BaseTextView typeLabel = c36794l0M27350c5.f80474w;
        Intrinsics.checkNotNullExpressionValue(typeLabel, "typeLabel");
        C27046k.m66685H(typeLabel);
        KcPrimaryButton confirm = c36794l0M27350c5.f80454c;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: qi.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvanceLimitModifyDialog.m27308D5(c36794l0M27350c5, this);
            }
        }, 1, null);
    }
}
