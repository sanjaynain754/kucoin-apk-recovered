package com.kubi.payment.p2p.order;

import androidx.appcompat.widget.AppCompatImageView;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import kotlinx.coroutines.InterfaceC41709m0;
import p270ft.C37678r1;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OrderDetailFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailFragment$showTaxInfo$1", m90122f = "OrderDetailFragment.kt", m90123i = {}, m90124l = {899}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderDetailFragment$showTaxInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailFragment$showTaxInfo$1(OrderDetailFragment orderDetailFragment, Continuation<? super OrderDetailFragment$showTaxInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = orderDetailFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderDetailFragment$showTaxInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderDetailFragment$showTaxInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean hit;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            P2PHelper p2PHelper = P2PHelper.f39683a;
            this.label = 1;
            obj = p2PHelper.m48409a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        TaxInfo taxInfo = (TaxInfo) obj;
        if (taxInfo != null) {
            hit = taxInfo.getHit();
        } else {
            hit = null;
        }
        if (C27025c.m66566d(hit)) {
            C37678r1 c37678r1M48680D4 = this.this$0.m48680D4();
            if (c37678r1M48680D4 != null && (appCompatImageView2 = c37678r1M48680D4.f84573s) != null) {
                C27046k.m66685H(appCompatImageView2);
            }
        } else {
            C37678r1 c37678r1M48680D5 = this.this$0.m48680D4();
            if (c37678r1M48680D5 != null && (appCompatImageView = c37678r1M48680D5.f84573s) != null) {
                C27046k.m66700o(appCompatImageView);
            }
        }
        return Unit.INSTANCE;
    }
}
