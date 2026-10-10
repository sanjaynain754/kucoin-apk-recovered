package com.kubi.payment.p106rn;

import android.app.Activity;
import com.kubi.payment.third.data.entities.PayChannelSelect;
import com.kubi.payment.third.data.entities.ThirdOrder;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p413ku.C41984b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: IUnifyPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.IUnifyPaymentBridge$openThirdPurchaseOrderChannelInternal$1", m90122f = "IUnifyPaymentBridge.kt", m90123i = {}, m90124l = {54}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IUnifyPaymentBridge$openThirdPurchaseOrderChannelInternal$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, String, Unit> $callback;
    final /* synthetic */ String $jsonOrder;
    final /* synthetic */ Activity $topActivity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IUnifyPaymentBridge$openThirdPurchaseOrderChannelInternal$1(Function2<? super Boolean, ? super String, Unit> function2, Activity activity, String str, Continuation<? super IUnifyPaymentBridge$openThirdPurchaseOrderChannelInternal$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
        this.$topActivity = activity;
        this.$jsonOrder = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IUnifyPaymentBridge$openThirdPurchaseOrderChannelInternal$1(this.$callback, this.$topActivity, this.$jsonOrder, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IUnifyPaymentBridge$openThirdPurchaseOrderChannelInternal$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
            C21350x9c270c6a c21350x9c270c6a = new C21350x9c270c6a(this.$jsonOrder, null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M91392b, c21350x9c270c6a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ThirdOrder thirdOrder = (ThirdOrder) obj;
        if (thirdOrder == null) {
            this.$callback.invoke(Boxing.boxBoolean(false), "订单信息异常");
            return Unit.INSTANCE;
        }
        String channel = thirdOrder.getChannel();
        if (channel != null) {
            int iHashCode = channel.hashCode();
            if (iHashCode != -82245516) {
                if (iHashCode != 1225229819) {
                    if (iHashCode == 2093876486 && channel.equals(PayChannelSelect.SIMPLEX)) {
                        C41984b.f92193a.m92058j(this.$topActivity, thirdOrder, Boxing.boxBoolean(false));
                    } else {
                        C41984b.f92193a.m92057h(thirdOrder, Boxing.boxBoolean(false));
                    }
                } else if (channel.equals(PayChannelSelect.MOBILUM)) {
                    C41984b.f92193a.m92056g(this.$topActivity, thirdOrder);
                } else {
                    C41984b.f92193a.m92057h(thirdOrder, Boxing.boxBoolean(false));
                }
            } else if (channel.equals(PayChannelSelect.LEGEND_TRADE)) {
                C41984b.f92193a.m92055e(thirdOrder, Boxing.boxBoolean(false));
            } else {
                C41984b.f92193a.m92057h(thirdOrder, Boxing.boxBoolean(false));
            }
        } else {
            C41984b.f92193a.m92057h(thirdOrder, Boxing.boxBoolean(false));
        }
        this.$callback.invoke(Boxing.boxBoolean(true), null);
        return Unit.INSTANCE;
    }
}
