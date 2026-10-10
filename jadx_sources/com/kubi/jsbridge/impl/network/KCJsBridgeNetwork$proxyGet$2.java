package com.kubi.jsbridge.impl.network;

import com.kubi.sdk.protocol.ProtocolException;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCJsBridgeNetwork.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$proxyGet$2", m90122f = "KCJsBridgeNetwork.kt", m90123i = {0, 0}, m90124l = {598}, m90125m = "invokeSuspend", m90126n = {"scalarParams", "queryUrl"}, m90127s = {"L$0", "L$1"})
public final class KCJsBridgeNetwork$proxyGet$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Map<String, ? extends Object>, ProtocolException, Unit> $callback;
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KCJsBridgeNetwork this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJsBridgeNetwork$proxyGet$2(KCJsBridgeNetwork kCJsBridgeNetwork, String str, Map<String, ? extends Object> map, Map<String, String> map2, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super KCJsBridgeNetwork$proxyGet$2> continuation) {
        super(2, continuation);
        this.this$0 = kCJsBridgeNetwork;
        this.$url = str;
        this.$params = map;
        this.$headers = map2;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJsBridgeNetwork$proxyGet$2(this.this$0, this.$url, this.$params, this.$headers, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJsBridgeNetwork$proxyGet$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
                Pair<Map<String, Object>, String> pairM31764M = this.this$0.m31764M(this.$url, this.$params);
                Map<String, Object> mapComponent1 = pairM31764M.component1();
                String strComponent2 = pairM31764M.component2();
                KCJsBridgeNetwork.InterfaceC15261a interfaceC15261aM31794a = KCJsBridgeNetwork.f27452a.m31794a();
                Map<String, String> map = this.$headers;
                this.L$0 = SpillingKt.nullOutSpilledVariable(mapComponent1);
                this.L$1 = SpillingKt.nullOutSpilledVariable(strComponent2);
                this.label = 1;
                obj = interfaceC15261aM31794a.m31801e(strComponent2, map, mapComponent1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.this$0.m31767P(this.$url, "GET", obj, this.$callback);
        } catch (Throwable th2) {
            this.this$0.m31791j0(th2);
            this.this$0.m31766O(this.$url, "GET", th2, this.$callback);
        }
        return Unit.INSTANCE;
    }
}
