package com.kubi.jsbridge.impl.common;

import com.kubi.config.exception.KCConfigException;
import com.kubi.fingerprint.FingerprintManager;
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

/* JADX INFO: compiled from: KCJsBridgeCommon.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.common.KCJsBridgeCommon$getFingerToken$1$1", m90122f = "KCJsBridgeCommon.kt", m90123i = {}, m90124l = {256}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCJsBridgeCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJsBridgeCommon.kt\ncom/kubi/jsbridge/impl/common/KCJsBridgeCommon$getFingerToken$1$1\n+ 2 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,722:1\n44#2,2:723\n*S KotlinDebug\n*F\n+ 1 KCJsBridgeCommon.kt\ncom/kubi/jsbridge/impl/common/KCJsBridgeCommon$getFingerToken$1$1\n*L\n263#1:723,2\n*E\n"})
public final class KCJsBridgeCommon$getFingerToken$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    final /* synthetic */ String $event;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJsBridgeCommon$getFingerToken$1$1(String str, Function2<? super String, ? super ProtocolException, Unit> function2, Continuation<? super KCJsBridgeCommon$getFingerToken$1$1> continuation) {
        super(2, continuation);
        this.$event = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJsBridgeCommon$getFingerToken$1$1(this.$event, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJsBridgeCommon$getFingerToken$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                FingerprintManager fingerprintManager = FingerprintManager.a;
                String str = this.$event;
                this.label = 1;
                obj = fingerprintManager.k(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            String str2 = (String) obj;
            if (str2 != null && str2.length() != 0) {
                this.$callback.invoke(str2, null);
            } else {
                this.$callback.invoke(null, new ProtocolException("get token failed", null, null, false, 14, null));
            }
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "getFingerToken", false, null, 8, null), null, 2, null);
            this.$callback.invoke(null, new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }
}
