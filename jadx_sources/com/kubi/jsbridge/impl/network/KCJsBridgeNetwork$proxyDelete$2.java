package com.kubi.jsbridge.impl.network;

import com.kubi.sdk.protocol.ProtocolException;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
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
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$proxyDelete$2", m90122f = "KCJsBridgeNetwork.kt", m90123i = {0, 1, 2}, m90124l = {716, 718, 720}, m90125m = "invokeSuspend", m90126n = {"arrayData", "arrayData", "arrayData"}, m90127s = {"L$0", "L$0", "L$0"})
public final class KCJsBridgeNetwork$proxyDelete$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Object> $body;
    final /* synthetic */ Function2<Map<String, ? extends Object>, ProtocolException, Unit> $callback;
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ Map<String, Object> $queries;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ KCJsBridgeNetwork this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJsBridgeNetwork$proxyDelete$2(Map<String, ? extends Object> map, String str, Map<String, ? extends Object> map2, Map<String, String> map3, KCJsBridgeNetwork kCJsBridgeNetwork, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super KCJsBridgeNetwork$proxyDelete$2> continuation) {
        super(2, continuation);
        this.$body = map;
        this.$url = str;
        this.$queries = map2;
        this.$headers = map3;
        this.this$0 = kCJsBridgeNetwork;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJsBridgeNetwork$proxyDelete$2(this.$body, this.$url, this.$queries, this.$headers, this.this$0, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJsBridgeNetwork$proxyDelete$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r13 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        if (r13 == r0) goto L44;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th2;
        KCJsBridgeNetwork$proxyDelete$2 kCJsBridgeNetwork$proxyDelete$2;
        List<Object> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    ResultKt.throwOnFailure(obj);
                    kCJsBridgeNetwork$proxyDelete$2 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                try {
                    Object obj2 = this.$body.get("array");
                    if (obj2 instanceof List) {
                        list = (List) obj2;
                    } else {
                        list = null;
                    }
                    List<Object> list2 = list;
                    if (list2 != null) {
                        KCJsBridgeNetwork.InterfaceC15261a interfaceC15261aM31794a = KCJsBridgeNetwork.f27452a.m31794a();
                        String str = this.$url;
                        Map<String, Object> map = this.$queries;
                        Map<String, String> map2 = this.$headers;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(list2);
                        this.label = 1;
                        try {
                            obj = interfaceC15261aM31794a.m31798b(str, map, list2, map2, this);
                            kCJsBridgeNetwork$proxyDelete$2 = this;
                        } catch (Throwable th3) {
                            th = th3;
                            kCJsBridgeNetwork$proxyDelete$2 = this;
                            th2 = th;
                            kCJsBridgeNetwork$proxyDelete$2.this$0.m31791j0(th2);
                            kCJsBridgeNetwork$proxyDelete$2.this$0.m31766O(kCJsBridgeNetwork$proxyDelete$2.$url, "DELETE", th2, kCJsBridgeNetwork$proxyDelete$2.$callback);
                        }
                    } else {
                        kCJsBridgeNetwork$proxyDelete$2 = this;
                        try {
                            if (kCJsBridgeNetwork$proxyDelete$2.this$0.m31770S(kCJsBridgeNetwork$proxyDelete$2.$headers)) {
                                KCJsBridgeNetwork.InterfaceC15261a interfaceC15261aM31794a2 = KCJsBridgeNetwork.f27452a.m31794a();
                                String str2 = kCJsBridgeNetwork$proxyDelete$2.$url;
                                Map<String, Object> map3 = kCJsBridgeNetwork$proxyDelete$2.$queries;
                                Map<String, Object> map4 = kCJsBridgeNetwork$proxyDelete$2.$body;
                                Map<String, String> map5 = kCJsBridgeNetwork$proxyDelete$2.$headers;
                                kCJsBridgeNetwork$proxyDelete$2.L$0 = SpillingKt.nullOutSpilledVariable(list2);
                                kCJsBridgeNetwork$proxyDelete$2.label = 2;
                                obj = interfaceC15261aM31794a2.m31802f(str2, map3, map4, map5, kCJsBridgeNetwork$proxyDelete$2);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                KCJsBridgeNetwork.InterfaceC15261a interfaceC15261aM31794a3 = KCJsBridgeNetwork.f27452a.m31794a();
                                String str3 = kCJsBridgeNetwork$proxyDelete$2.$url;
                                Map<String, Object> map6 = kCJsBridgeNetwork$proxyDelete$2.$queries;
                                Map<String, Object> map7 = kCJsBridgeNetwork$proxyDelete$2.$body;
                                Map<String, String> map8 = kCJsBridgeNetwork$proxyDelete$2.$headers;
                                kCJsBridgeNetwork$proxyDelete$2.L$0 = SpillingKt.nullOutSpilledVariable(list2);
                                kCJsBridgeNetwork$proxyDelete$2.label = 3;
                                obj = interfaceC15261aM31794a3.m31804h(str3, map6, map7, map8, kCJsBridgeNetwork$proxyDelete$2);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                            kCJsBridgeNetwork$proxyDelete$2.this$0.m31791j0(th2);
                            kCJsBridgeNetwork$proxyDelete$2.this$0.m31766O(kCJsBridgeNetwork$proxyDelete$2.$url, "DELETE", th2, kCJsBridgeNetwork$proxyDelete$2.$callback);
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    kCJsBridgeNetwork$proxyDelete$2 = this;
                }
                return Unit.INSTANCE;
            }
            kCJsBridgeNetwork$proxyDelete$2.this$0.m31767P(kCJsBridgeNetwork$proxyDelete$2.$url, "DELETE", obj, kCJsBridgeNetwork$proxyDelete$2.$callback);
        } catch (Throwable th6) {
            th2 = th6;
            kCJsBridgeNetwork$proxyDelete$2 = this;
        }
        return Unit.INSTANCE;
    }
}
