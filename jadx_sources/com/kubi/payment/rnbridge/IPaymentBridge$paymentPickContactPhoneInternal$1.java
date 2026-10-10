package com.kubi.payment.rnbridge;

import android.content.Intent;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.InterfaceC41709m0;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44127a;

/* JADX INFO: compiled from: IPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rnbridge.IPaymentBridge$paymentPickContactPhoneInternal$1", m90122f = "IPaymentBridge.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IPaymentBridge$paymentPickContactPhoneInternal$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    int label;
    final /* synthetic */ IPaymentBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IPaymentBridge$paymentPickContactPhoneInternal$1(BaseActivity baseActivity, IPaymentBridge iPaymentBridge, Function2<? super String, ? super ProtocolException, Unit> function2, Continuation<? super IPaymentBridge$paymentPickContactPhoneInternal$1> continuation) {
        super(2, continuation);
        this.$activity = baseActivity;
        this.this$0 = iPaymentBridge;
        this.$callback = function2;
    }

    /* JADX INFO: renamed from: g */
    public static final void m49514g(IPaymentBridge iPaymentBridge, BaseActivity baseActivity, final Function2 function2, Intent intent) {
        iPaymentBridge.m49504a(baseActivity, intent, new Function2() { // from class: com.kubi.payment.rnbridge.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IPaymentBridge$paymentPickContactPhoneInternal$1.m49515h(function2, (String) obj, (ProtocolException) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m49515h(Function2 function2, String str, ProtocolException protocolException) {
        if (C45590s.f102687a.m100666Q()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("number: ");
            sb2.append(str);
            sb2.append(", exception: ");
            sb2.append(protocolException != null ? protocolException.getMessage() : null);
            C44127a.m97243c("IPaymentBridge", sb2.toString());
        }
        function2.invoke(str, protocolException);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IPaymentBridge$paymentPickContactPhoneInternal$1(this.$activity, this.this$0, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IPaymentBridge$paymentPickContactPhoneInternal$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BaseActivity baseActivity = this.$activity;
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("vnd.android.cursor.dir/phone_v2");
            final IPaymentBridge iPaymentBridge = this.this$0;
            final BaseActivity baseActivity2 = this.$activity;
            final Function2<String, ProtocolException, Unit> function2 = this.$callback;
            baseActivity.startActivityWithResult(intent, new Consumer() { // from class: com.kubi.payment.rnbridge.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    IPaymentBridge$paymentPickContactPhoneInternal$1.m49514g(iPaymentBridge, baseActivity2, function2, (Intent) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
