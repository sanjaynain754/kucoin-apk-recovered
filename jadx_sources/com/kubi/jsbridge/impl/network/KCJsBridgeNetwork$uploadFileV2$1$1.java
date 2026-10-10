package com.kubi.jsbridge.impl.network;

import com.kubi.sdk.protocol.ProtocolException;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Request;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCJsBridgeNetwork.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$uploadFileV2$1$1", m90122f = "KCJsBridgeNetwork.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCJsBridgeNetwork$uploadFileV2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Map<String, ? extends Object>, ProtocolException, Unit> $callback;
    final /* synthetic */ Map<String, String> $customHeaders;
    final /* synthetic */ boolean $isFullUrl;
    final /* synthetic */ Request $request;
    int label;
    final /* synthetic */ KCJsBridgeNetwork this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJsBridgeNetwork$uploadFileV2$1$1(KCJsBridgeNetwork kCJsBridgeNetwork, Request request, boolean z11, Map<String, String> map, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super KCJsBridgeNetwork$uploadFileV2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = kCJsBridgeNetwork;
        this.$request = request;
        this.$isFullUrl = z11;
        this.$customHeaders = map;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJsBridgeNetwork$uploadFileV2$1$1(this.this$0, this.$request, this.$isFullUrl, this.$customHeaders, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJsBridgeNetwork$uploadFileV2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m31762K(this.$request, this.$isFullUrl, this.$customHeaders, this.$callback);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
