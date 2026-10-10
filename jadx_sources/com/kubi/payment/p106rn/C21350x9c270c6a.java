package com.kubi.payment.p106rn;

import com.kubi.payment.third.data.entities.ThirdOrder;
import com.kubi.sdk.util.NullGson;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.payment.rn.IUnifyPaymentBridge$openThirdPurchaseOrderChannelInternal$1$thirdOrder$1 */
/* JADX INFO: compiled from: IUnifyPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/payment/third/data/entities/ThirdOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.IUnifyPaymentBridge$openThirdPurchaseOrderChannelInternal$1$thirdOrder$1", m90122f = "IUnifyPaymentBridge.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C21350x9c270c6a extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super ThirdOrder>, Object> {
    final /* synthetic */ String $jsonOrder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21350x9c270c6a(String str, Continuation<? super C21350x9c270c6a> continuation) {
        super(2, continuation);
        this.$jsonOrder = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C21350x9c270c6a(this.$jsonOrder, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super ThirdOrder> continuation) {
        return ((C21350x9c270c6a) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                return (ThirdOrder) NullGson.m58333g().fromJson(this.$jsonOrder, ThirdOrder.class);
            } catch (Exception unused) {
                return null;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
