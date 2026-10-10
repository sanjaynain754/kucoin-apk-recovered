package com.kubi.payment.rnbridge;

import android.content.Intent;
import android.net.Uri;
import com.kubi.otc.exception.OtcException;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rnbridge.IPaymentBridge$handleContactResult$1", m90122f = "IPaymentBridge.kt", m90123i = {0}, m90124l = {141}, m90125m = "invokeSuspend", m90126n = {"uri"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nIPaymentBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPaymentBridge.kt\ncom/kubi/payment/rnbridge/IPaymentBridge$handleContactResult$1\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,160:1\n44#2,2:161\n*S KotlinDebug\n*F\n+ 1 IPaymentBridge.kt\ncom/kubi/payment/rnbridge/IPaymentBridge$handleContactResult$1\n*L\n145#1:161,2\n*E\n"})
public final class IPaymentBridge$handleContactResult$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    final /* synthetic */ Intent $result;
    Object L$0;
    int label;
    final /* synthetic */ IPaymentBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IPaymentBridge$handleContactResult$1(Intent intent, Function2<? super String, ? super ProtocolException, Unit> function2, IPaymentBridge iPaymentBridge, BaseActivity baseActivity, Continuation<? super IPaymentBridge$handleContactResult$1> continuation) {
        super(2, continuation);
        this.$result = intent;
        this.$callback = function2;
        this.this$0 = iPaymentBridge;
        this.$activity = baseActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IPaymentBridge$handleContactResult$1(this.$result, this.$callback, this.this$0, this.$activity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IPaymentBridge$handleContactResult$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri data;
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
                Intent intent = this.$result;
                if (intent != null) {
                    data = intent.getData();
                } else {
                    data = null;
                }
                if (data == null) {
                    this.$callback.invoke(null, new ProtocolException("get uri failed", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                IPaymentBridge iPaymentBridge = this.this$0;
                BaseActivity baseActivity = this.$activity;
                this.L$0 = SpillingKt.nullOutSpilledVariable(data);
                this.label = 1;
                obj = iPaymentBridge.m49505d(baseActivity, data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.$callback.invoke((String) obj, null);
        } catch (Exception e11) {
            this.$callback.invoke(null, new ProtocolException(e11.getMessage(), e11, null, false, 12, null));
            C43846g.m96568c(new OtcException(e11, "IPaymentBridge", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
