package com.kubi.sdk.flutter;

import com.kubi.fingerprint.FingerprintManager;
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

/* JADX INFO: compiled from: FlutterConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.flutter.FlutterConfig$handleMethod$2", m90122f = "FlutterConfig.kt", m90123i = {}, m90124l = {213}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlutterConfig$handleMethod$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MethodCall $call;
    final /* synthetic */ MethodChannel.Result $result;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlutterConfig$handleMethod$2(MethodChannel.Result result, MethodCall methodCall, Continuation<? super FlutterConfig$handleMethod$2> continuation) {
        super(2, continuation);
        this.$result = result;
        this.$call = methodCall;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlutterConfig$handleMethod$2(this.$result, this.$call, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FlutterConfig$handleMethod$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MethodChannel.Result result;
        MethodChannel.Result result2;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                result2 = (MethodChannel.Result) this.L$1;
                result = (MethodChannel.Result) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception unused) {
                    str = null;
                    result2 = result;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MethodChannel.Result result3 = this.$result;
            try {
                FingerprintManager fingerprintManager = FingerprintManager.a;
                String str2 = (String) this.$call.argument("event");
                this.L$0 = result3;
                this.L$1 = result3;
                this.label = 1;
                Object objK = fingerprintManager.k(str2, this);
                if (objK == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = result3;
                obj = objK;
                result = result2;
            } catch (Exception unused2) {
                result = result3;
                str = null;
                result2 = result;
            }
        }
        str = (String) obj;
        result2.success(str);
        return Unit.INSTANCE;
    }
}
