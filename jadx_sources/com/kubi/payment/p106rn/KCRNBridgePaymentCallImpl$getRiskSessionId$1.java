package com.kubi.payment.p106rn;

import com.kubi.otc.exception.OtcException;
import com.kubi.otc.fiat.finger.DeviceFingerHelper;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCRNBridgePaymentCallImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.KCRNBridgePaymentCallImpl$getRiskSessionId$1", m90122f = "KCRNBridgePaymentCallImpl.kt", m90123i = {}, m90124l = {125}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCRNBridgePaymentCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$getRiskSessionId$1\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,620:1\n44#2,2:621\n*S KotlinDebug\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$getRiskSessionId$1\n*L\n128#1:621,2\n*E\n"})
public final class KCRNBridgePaymentCallImpl$getRiskSessionId$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizType;
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCRNBridgePaymentCallImpl$getRiskSessionId$1(String str, Function2<? super String, ? super ProtocolException, Unit> function2, Continuation<? super KCRNBridgePaymentCallImpl$getRiskSessionId$1> continuation) {
        super(2, continuation);
        this.$bizType = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRNBridgePaymentCallImpl$getRiskSessionId$1(this.$bizType, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRNBridgePaymentCallImpl$getRiskSessionId$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
                DeviceFingerHelper deviceFingerHelper = DeviceFingerHelper.f37296a;
                String str = this.$bizType;
                this.label = 1;
                obj = deviceFingerHelper.m44052e(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.$callback.invoke((String) obj, null);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "BankCardBuyConfirmVM", false, null, 8, null), null, 2, null);
            Function2<String, ProtocolException, Unit> function2 = this.$callback;
            String message = e11.getMessage();
            if (message == null) {
                message = "getRiskSessionId error";
            }
            function2.invoke(null, new ProtocolException(message, null, null, false, 14, null));
        }
        return Unit.INSTANCE;
    }
}
