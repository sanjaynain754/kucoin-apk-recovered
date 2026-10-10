package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyBalanceEntity;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1 */
/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/unify/entity/UnifyBalanceEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 1, 2}, m90124l = {308, 308, 314}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$flow", "$this$flow"}, m90127s = {"L$0", "L$0", "L$0"})
@SourceDebugExtension({"SMAP\nUnifyNetworkDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,520:1\n375#2:521\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1\n*L\n306#1:521\n*E\n"})
public final class C26639xf50538b1 extends SuspendLambda implements Function2<InterfaceC41635f<? super UnifyBalanceEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ UnifyNetworkDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26639xf50538b1(UnifyNetworkDataSourceImpl unifyNetworkDataSourceImpl, String str, Continuation<? super C26639xf50538b1> continuation) {
        super(2, continuation);
        this.this$0 = unifyNetworkDataSourceImpl;
        this.$currency = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C26639xf50538b1 c26639xf50538b1 = new C26639xf50538b1(this.this$0, this.$currency, continuation);
        c26639xf50538b1.L$0 = obj;
        return c26639xf50538b1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41635f<? super UnifyBalanceEntity> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((C26639xf50538b1) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[Catch: Exception -> 0x0023, CancellationException -> 0x0025, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0025, Exception -> 0x0023, blocks: (B:10:0x001f, B:22:0x003c, B:26:0x0052, B:17:0x002b), top: B:36:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0072 -> B:20:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.flow.f r0 = (kotlinx.coroutines.flow.InterfaceC41635f) r0
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L2f
            if (r2 == r6) goto L27
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            goto L2f
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            p852kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            goto L66
        L23:
            r10 = move-exception
            goto L5f
        L25:
            r10 = move-exception
            goto L75
        L27:
            java.lang.Object r2 = r9.L$1
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.InterfaceC41635f) r2
            p852kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            goto L52
        L2f:
            p852kotlin.ResultKt.throwOnFailure(r10)
        L32:
            kotlin.coroutines.CoroutineContext r10 = r9.get$context()
            boolean r10 = kotlinx.coroutines.C41783z1.m91411q(r10)
            if (r10 == 0) goto L76
            com.kubi.unify.stream.UnifyNetworkDataSourceImpl r10 = r9.this$0     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            i60.c r10 = com.kubi.unify.stream.UnifyNetworkDataSourceImpl.m65370l(r10)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            java.lang.String r2 = r9.$currency     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.L$0 = r0     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.L$1 = r0     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.label = r6     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            java.lang.Object r10 = r10.m86737d(r2, r9)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            if (r10 != r1) goto L51
            goto L74
        L51:
            r2 = r0
        L52:
            r9.L$0 = r0     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.L$1 = r3     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.label = r5     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            java.lang.Object r10 = r2.emit(r10, r9)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            if (r10 != r1) goto L66
            goto L74
        L5f:
            java.lang.String r2 = "[unifyAccount]"
            java.lang.String r7 = "observeAvailableBalance poll"
            ro.C44128b.m97262f(r2, r7, r10)
        L66:
            r9.L$0 = r0
            r9.L$1 = r3
            r9.label = r4
            r7 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m90350b(r7, r9)
            if (r10 != r1) goto L32
        L74:
            return r1
        L75:
            throw r10
        L76:
            kotlin.Unit r10 = p852kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.unify.stream.C26639xf50538b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
