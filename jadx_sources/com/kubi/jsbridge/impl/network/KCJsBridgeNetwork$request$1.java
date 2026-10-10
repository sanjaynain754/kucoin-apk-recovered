package com.kubi.jsbridge.impl.network;

import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import org.tensorflow.lite.schema.BuiltinOperator;
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
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$request$1", m90122f = "KCJsBridgeNetwork.kt", m90123i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, m90124l = {153, 154, BuiltinOperator.UNSORTED_SEGMENT_SUM}, m90125m = "invokeSuspend", m90126n = {ReportDataTable.COLUMN_PARAMS, "reqHeaders", "reqUrl", ReportDataTable.COLUMN_PARAMS, "reqHeaders", "reqUrl", ReportDataTable.COLUMN_PARAMS, "reqHeaders", "reqUrl"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
public final class KCJsBridgeNetwork$request$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Map<String, ? extends Object>, ProtocolException, Unit> $callback;
    final /* synthetic */ Map<String, Object> $data;
    final /* synthetic */ Map<String, Object> $headers;
    final /* synthetic */ String $method;
    final /* synthetic */ String $source;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ KCJsBridgeNetwork this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJsBridgeNetwork$request$1(Map<String, ? extends Object> map, String str, KCJsBridgeNetwork kCJsBridgeNetwork, Map<String, ? extends Object> map2, String str2, String str3, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super KCJsBridgeNetwork$request$1> continuation) {
        super(2, continuation);
        this.$data = map;
        this.$source = str;
        this.this$0 = kCJsBridgeNetwork;
        this.$headers = map2;
        this.$url = str2;
        this.$method = str3;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJsBridgeNetwork$request$1(this.$data, this.$source, this.this$0, this.$headers, this.$url, this.$method, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJsBridgeNetwork$request$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ff A[PHI: r11
      0x00ff: PHI (r11v1 com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$request$1) = 
      (r11v0 com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$request$1)
      (r11v2 com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$request$1)
      (r11v4 com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$request$1)
     binds: [B:36:0x00db, B:30:0x00ae, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (r5.m31779a0(r6, r7, r8, r9, r10, r12) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        if (r5.m31783c0(r6, r7, r8, r9, r10, r11) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fc, code lost:
    
        if (r5.m31781b0(r6, r8, r9, r9, r11) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        return r0;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00ff, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        KCJsBridgeNetwork$request$1 kCJsBridgeNetwork$request$1;
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
            Map<String, Object> mapM31773V = this.$data;
            if (mapM31773V == null) {
                mapM31773V = MapsKt.emptyMap();
            }
            if (Intrinsics.areEqual(this.$source, KCTurboFileModuleImpl.SOURCE_RN)) {
                mapM31773V = this.this$0.m31773V(mapM31773V);
            }
            Map<String, Object> map = mapM31773V;
            Map mapM31763L = this.this$0.m31763L(this.$headers);
            String strM31774W = this.this$0.m31774W(this.$url);
            String upperCase = this.$method.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 70454) {
                if (iHashCode != 2461856) {
                    if (iHashCode != 2012838315 || !upperCase.equals("DELETE")) {
                        kCJsBridgeNetwork$request$1 = this;
                        kCJsBridgeNetwork$request$1.$callback.invoke(null, new ProtocolException("-9001", null, kCJsBridgeNetwork$request$1.$method + " is not supported", false, 10, null));
                    } else {
                        KCJsBridgeNetwork kCJsBridgeNetwork = this.this$0;
                        Map mapEmptyMap = MapsKt.emptyMap();
                        Function2<Map<String, ? extends Object>, ProtocolException, Unit> function2 = this.$callback;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(map);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(mapM31763L);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(strM31774W);
                        this.label = 3;
                    }
                } else {
                    kCJsBridgeNetwork$request$1 = this;
                    if (upperCase.equals("POST")) {
                        KCJsBridgeNetwork kCJsBridgeNetwork2 = kCJsBridgeNetwork$request$1.this$0;
                        Map mapEmptyMap2 = MapsKt.emptyMap();
                        Function2<Map<String, ? extends Object>, ProtocolException, Unit> function3 = kCJsBridgeNetwork$request$1.$callback;
                        kCJsBridgeNetwork$request$1.L$0 = SpillingKt.nullOutSpilledVariable(map);
                        kCJsBridgeNetwork$request$1.L$1 = SpillingKt.nullOutSpilledVariable(mapM31763L);
                        kCJsBridgeNetwork$request$1.L$2 = SpillingKt.nullOutSpilledVariable(strM31774W);
                        kCJsBridgeNetwork$request$1.label = 2;
                    } else {
                        kCJsBridgeNetwork$request$1.$callback.invoke(null, new ProtocolException("-9001", null, kCJsBridgeNetwork$request$1.$method + " is not supported", false, 10, null));
                    }
                }
            } else {
                kCJsBridgeNetwork$request$1 = this;
                if (upperCase.equals("GET")) {
                    KCJsBridgeNetwork kCJsBridgeNetwork3 = kCJsBridgeNetwork$request$1.this$0;
                    Function2<Map<String, ? extends Object>, ProtocolException, Unit> function4 = kCJsBridgeNetwork$request$1.$callback;
                    kCJsBridgeNetwork$request$1.L$0 = SpillingKt.nullOutSpilledVariable(map);
                    kCJsBridgeNetwork$request$1.L$1 = SpillingKt.nullOutSpilledVariable(mapM31763L);
                    kCJsBridgeNetwork$request$1.L$2 = SpillingKt.nullOutSpilledVariable(strM31774W);
                    kCJsBridgeNetwork$request$1.label = 1;
                } else {
                    kCJsBridgeNetwork$request$1.$callback.invoke(null, new ProtocolException("-9001", null, kCJsBridgeNetwork$request$1.$method + " is not supported", false, 10, null));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
