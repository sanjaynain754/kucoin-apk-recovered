package com.kubi.payment.p106rn;

import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.otc.service.OtcDepend;
import com.kubi.sdk.protocol.ProtocolException;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCRNBridgePaymentCallImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.KCRNBridgePaymentCallImpl$getTotalBalance$1", m90122f = "KCRNBridgePaymentCallImpl.kt", m90123i = {}, m90124l = {553}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCRNBridgePaymentCallImpl$getTotalBalance$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $balanceCurrency;
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCRNBridgePaymentCallImpl$getTotalBalance$1(String str, Function2<? super String, ? super ProtocolException, Unit> function2, Continuation<? super KCRNBridgePaymentCallImpl$getTotalBalance$1> continuation) {
        super(2, continuation);
        this.$balanceCurrency = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRNBridgePaymentCallImpl$getTotalBalance$1(this.$balanceCurrency, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRNBridgePaymentCallImpl$getTotalBalance$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String plainString;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                IAssetsCenterService iAssetsCenterServiceM45457f = OtcDepend.f38138a.m45457f();
                String str = this.$balanceCurrency;
                this.label = 1;
                obj = iAssetsCenterServiceM45457f.mo15350p(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BigDecimal bigDecimal = (BigDecimal) obj;
            Function2<String, ProtocolException, Unit> function2 = this.$callback;
            if (bigDecimal != null) {
                plainString = bigDecimal.toPlainString();
            } else {
                plainString = null;
            }
            function2.invoke(plainString, null);
        } catch (Exception e11) {
            Function2<String, ProtocolException, Unit> function3 = this.$callback;
            String message = e11.getMessage();
            if (message == null) {
                message = "getTotalBalance error";
            }
            function3.invoke(null, new ProtocolException(message, null, null, false, 14, null));
        }
        return Unit.INSTANCE;
    }
}
