package com.kubi.spot.dialog.order;

import com.kubi.event.api.C12572a;
import com.kubi.spot.R$string;
import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.dialog.order.model.AmendResult;
import com.kubi.utils.ToastCompat;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AmendOrderDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/spot/dialog/order/model/AmendResult;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.dialog.order.AmendOrderDialog$initView$4$1$1$2$1", m90122f = "AmendOrderDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AmendOrderDialog$initView$4$1$1$2$1 extends SuspendLambda implements Function2<AmendResult, Continuation<? super Unit>, Object> {
    final /* synthetic */ AmendContext $amendContext;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AmendOrderDialog this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(AmendResult amendResult, Continuation<? super Unit> continuation) {
        return ((AmendOrderDialog$initView$4$1$1$2$1) create(amendResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmendOrderDialog$initView$4$1$1$2$1(AmendOrderDialog amendOrderDialog, AmendContext amendContext, Continuation<? super AmendOrderDialog$initView$4$1$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = amendOrderDialog;
        this.$amendContext = amendContext;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AmendOrderDialog$initView$4$1$1$2$1 amendOrderDialog$initView$4$1$1$2$1 = new AmendOrderDialog$initView$4$1$1$2$1(this.this$0, this.$amendContext, continuation);
        amendOrderDialog$initView$4$1$1$2$1.L$0 = obj;
        return amendOrderDialog$initView$4$1$1$2$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        AmendResult amendResult = (AmendResult) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.isVisible()) {
            this.this$0.f50500v0 = true;
            this.this$0.dismissAllowingStateLoss();
            this.$amendContext.getNewParams().setOrderId(amendResult.getNewOrderId());
            C12572a.m23695d("EVENT_ORDER_REFRESH", this.$amendContext, 0L, 4, null);
            ToastCompat.m66441G(this.this$0.getString(R$string.kc_trade_modify_order_success), new Object[0]);
            AmendOrderDialog.m61660D4(this.this$0, true, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
