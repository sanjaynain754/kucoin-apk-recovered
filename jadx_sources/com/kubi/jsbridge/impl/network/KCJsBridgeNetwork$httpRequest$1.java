package com.kubi.jsbridge.impl.network;

import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJsBridgeNetwork.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$httpRequest$1", m90122f = "KCJsBridgeNetwork.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {219, 220, 221}, m90125m = "invokeSuspend", m90126n = {ReportDataTable.COLUMN_PARAMS, "data", "rawHeaders", "reqHeaders", "reqUrl", ReportDataTable.COLUMN_PARAMS, "data", "rawHeaders", "reqHeaders", "reqUrl", ReportDataTable.COLUMN_PARAMS, "data", "rawHeaders", "reqHeaders", "reqUrl"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class KCJsBridgeNetwork$httpRequest$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Map<String, ? extends Object>, ProtocolException, Unit> $callback;
    final /* synthetic */ Map<String, Object> $config;
    final /* synthetic */ String $method;
    final /* synthetic */ String $source;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ KCJsBridgeNetwork this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJsBridgeNetwork$httpRequest$1(Map<String, ? extends Object> map, String str, KCJsBridgeNetwork kCJsBridgeNetwork, String str2, String str3, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super KCJsBridgeNetwork$httpRequest$1> continuation) {
        super(2, continuation);
        this.$config = map;
        this.$source = str;
        this.this$0 = kCJsBridgeNetwork;
        this.$url = str2;
        this.$method = str3;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJsBridgeNetwork$httpRequest$1(this.$config, this.$source, this.this$0, this.$url, this.$method, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJsBridgeNetwork$httpRequest$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0175  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r0.m31779a0(r10, r2, r4, r14, r5, r15) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0135, code lost:
    
        if (r0.m31783c0(r10, r4, r3, r14, r5, r15) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0172, code lost:
    
        if (r0.m31781b0(r10, r2, r14, r4, r15) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
    
        return r7;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x0175, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map<String, ? extends Object> mapM31773V;
        Map<String, ? extends Object> mapM31773V2;
        Map map;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.$config.get(ReportDataTable.COLUMN_PARAMS);
            if (obj2 instanceof Map) {
                mapM31773V = (Map) obj2;
            } else {
                mapM31773V = null;
            }
            if (mapM31773V == null) {
                mapM31773V = MapsKt.emptyMap();
            }
            Object obj3 = this.$config.get("data");
            if (obj3 instanceof Map) {
                mapM31773V2 = (Map) obj3;
            } else {
                mapM31773V2 = null;
            }
            if (mapM31773V2 == null) {
                mapM31773V2 = MapsKt.emptyMap();
            }
            if (Intrinsics.areEqual(this.$source, KCTurboFileModuleImpl.SOURCE_RN)) {
                mapM31773V = this.this$0.m31773V(mapM31773V);
                mapM31773V2 = this.this$0.m31773V(mapM31773V2);
            }
            Object obj4 = this.$config.get("headers");
            if (obj4 instanceof Map) {
                map = (Map) obj4;
            } else {
                map = null;
            }
            Map mapM31763L = this.this$0.m31763L(map);
            String strM31774W = this.this$0.m31774W(this.$url);
            this.this$0.m31792k0(strM31774W, this.$method, this.$source, map, mapM31763L);
            String upperCase = this.$method.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 70454) {
                if (iHashCode != 2461856) {
                    if (iHashCode == 2012838315 && upperCase.equals("DELETE")) {
                        Map<String, ? extends Object> map2 = mapM31773V;
                        KCJsBridgeNetwork kCJsBridgeNetwork = this.this$0;
                        Function2<Map<String, ? extends Object>, ProtocolException, Unit> function2 = this.$callback;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(map2);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(mapM31773V2);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(map);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(mapM31763L);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(strM31774W);
                        this.label = 3;
                    } else {
                        this.$callback.invoke(null, new ProtocolException("-9001", null, this.$method + " is not supported", false, 10, null));
                    }
                } else {
                    Map<String, ? extends Object> map3 = mapM31773V2;
                    if (upperCase.equals("POST")) {
                        Map<String, ? extends Object> map4 = mapM31773V;
                        KCJsBridgeNetwork kCJsBridgeNetwork2 = this.this$0;
                        Function2<Map<String, ? extends Object>, ProtocolException, Unit> function3 = this.$callback;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(map4);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(map3);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(map);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(mapM31763L);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(strM31774W);
                        this.label = 2;
                    } else {
                        this.$callback.invoke(null, new ProtocolException("-9001", null, this.$method + " is not supported", false, 10, null));
                    }
                }
            } else {
                Map<String, ? extends Object> map5 = mapM31773V;
                if (upperCase.equals("GET")) {
                    KCJsBridgeNetwork kCJsBridgeNetwork3 = this.this$0;
                    Map<String, Object> mapM31772U = kCJsBridgeNetwork3.m31772U(map5, mapM31773V2);
                    Map<String, ? extends Object> map6 = mapM31773V2;
                    Function2<Map<String, ? extends Object>, ProtocolException, Unit> function4 = this.$callback;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(map5);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(map6);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(map);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(mapM31763L);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(strM31774W);
                    this.label = 1;
                } else {
                    this.$callback.invoke(null, new ProtocolException("-9001", null, this.$method + " is not supported", false, 10, null));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
