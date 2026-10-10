package com.kubi.payment.flutter;

import com.kubi.otc.entity.OtcAd;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FlutterPaymentHandler.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.flutter.FlutterPaymentHandler$getVideoThumbnail$1", m90122f = "FlutterPaymentHandler.kt", m90123i = {}, m90124l = {250}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlutterPaymentHandler$getVideoThumbnail$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MethodCall $call;
    final /* synthetic */ MethodChannel.Result $result;
    int label;
    final /* synthetic */ FlutterPaymentHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlutterPaymentHandler$getVideoThumbnail$1(FlutterPaymentHandler flutterPaymentHandler, MethodCall methodCall, MethodChannel.Result result, Continuation<? super FlutterPaymentHandler$getVideoThumbnail$1> continuation) {
        super(2, continuation);
        this.this$0 = flutterPaymentHandler;
        this.$call = methodCall;
        this.$result = result;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlutterPaymentHandler$getVideoThumbnail$1(this.this$0, this.$call, this.$result, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FlutterPaymentHandler$getVideoThumbnail$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

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
            FlutterPaymentHandler flutterPaymentHandler = this.this$0;
            MethodCall methodCall = this.$call;
            this.label = 1;
            obj = flutterPaymentHandler.m48126j(methodCall, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            this.$result.success(bArr);
        } else {
            this.$result.error(OtcAd.KYC_NOT_PASS, "Get frame of video unknown error", null);
        }
        return Unit.INSTANCE;
    }
}
