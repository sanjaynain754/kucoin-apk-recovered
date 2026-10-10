package com.kubi.flutter.security.channel;

import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodChannel;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SecurityChannel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/lang/Object;"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.kubi.flutter.security.channel.SecurityChannel$send$2", m90122f = "SecurityChannel.kt", m90123i = {}, m90124l = {74}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SecurityChannel$send$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Object>, Object> {
    final /* synthetic */ Object $arguments;
    final /* synthetic */ String $method;
    final /* synthetic */ MethodChannel $this_send;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: com.kubi.flutter.security.channel.SecurityChannel$send$2$a */
    /* JADX INFO: compiled from: SecurityChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"com/kubi/flutter/security/channel/SecurityChannel$send$2$a", "Lio/flutter/plugin/common/MethodChannel$Result;", "", DbParams.KEY_CHANNEL_RESULT, "", "success", "(Ljava/lang/Object;)V", "", "errorCode", "errorMessage", "errorDetails", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "notImplemented", "()V", "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C12737a implements MethodChannel.Result {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Continuation<Object> f22229a;

        public C12737a(Continuation<Object> continuation) {
            this.f22229a = continuation;
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String errorCode, String errorMessage, Object errorDetails) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Continuation<Object> continuation = this.f22229a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new RuntimeException("errorCode = " + errorCode + ", errorMessage = " + errorMessage))));
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            Continuation<Object> continuation = this.f22229a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new RuntimeException("channel not implemented"))));
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object result) {
            this.f22229a.resumeWith(Result.m103844constructorimpl(result));
        }
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Object> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<Object>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityChannel$send$2(MethodChannel methodChannel, String str, Object obj, Continuation<? super SecurityChannel$send$2> continuation) {
        super(2, continuation);
        this.$this_send = methodChannel;
        this.$method = str;
        this.$arguments = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityChannel$send$2(this.$this_send, this.$method, this.$arguments, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<Object> continuation) {
        return ((SecurityChannel$send$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MethodChannel methodChannel = this.$this_send;
        String str = this.$method;
        Object obj2 = this.$arguments;
        this.L$0 = methodChannel;
        this.L$1 = str;
        this.L$2 = obj2;
        this.label = 1;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
        methodChannel.invokeMethod(str, obj2, new C12737a(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (orThrow == coroutine_suspended) {
            return coroutine_suspended;
        }
        return orThrow;
    }
}
