package com.kubi.payment.channel.precheck;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreCheckInterceptorChain.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/channel/precheck/PreCheckInterceptorChain;", "", "interceptors", "", "Lcom/kubi/payment/channel/precheck/IPreCheckInterceptor;", "<init>", "(Ljava/util/List;)V", "proceed", "Lcom/kubi/payment/channel/precheck/PreCheckResult;", "preCheckRequest", "Lcom/kubi/payment/channel/precheck/PreCheckRequest;", "(Lcom/kubi/payment/channel/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PreCheckInterceptorChain {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<IPreCheckInterceptor> f38375a;

    /* JADX WARN: Multi-variable type inference failed */
    public PreCheckInterceptorChain(@NotNull List<? extends IPreCheckInterceptor> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.f38375a = interceptors;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0068 -> B:21:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m45996a(@org.jetbrains.annotations.NotNull com.kubi.payment.channel.precheck.PreCheckRequest r7, @org.jetbrains.annotations.NotNull p852kotlin.coroutines.Continuation<? super com.kubi.payment.channel.precheck.PreCheckResult> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.kubi.payment.channel.precheck.PreCheckInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r8
            com.kubi.payment.channel.precheck.PreCheckInterceptorChain$proceed$1 r0 = (com.kubi.payment.channel.precheck.PreCheckInterceptorChain$proceed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.payment.channel.precheck.PreCheckInterceptorChain$proceed$1 r0 = new com.kubi.payment.channel.precheck.PreCheckInterceptorChain$proceed$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$2
            com.kubi.payment.channel.precheck.a r7 = (com.kubi.payment.channel.precheck.IPreCheckInterceptor) r7
            java.lang.Object r7 = r0.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$0
            com.kubi.payment.channel.precheck.PreCheckRequest r2 = (com.kubi.payment.channel.precheck.PreCheckRequest) r2
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L6b
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            p852kotlin.ResultKt.throwOnFailure(r8)
            java.util.List<com.kubi.payment.channel.precheck.a> r8 = r6.f38375a
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
        L49:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r7.next()
            com.kubi.payment.channel.precheck.a r2 = (com.kubi.payment.channel.precheck.IPreCheckInterceptor) r2
            r0.L$0 = r8
            r0.L$1 = r7
            java.lang.Object r4 = p852kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r2 = r2.mo45994a(r8, r0)
            if (r2 != r1) goto L68
            return r1
        L68:
            r5 = r2
            r2 = r8
            r8 = r5
        L6b:
            com.kubi.payment.channel.precheck.b r8 = (com.kubi.payment.channel.precheck.PreCheckResult) r8
            boolean r4 = r8 instanceof com.kubi.payment.channel.precheck.PreCheckResult.c
            if (r4 != 0) goto L72
            return r8
        L72:
            r8 = r2
            goto L49
        L74:
            com.kubi.payment.channel.precheck.b$c r7 = com.kubi.payment.channel.precheck.PreCheckResult.c.f38378a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.payment.channel.precheck.PreCheckInterceptorChain.m45996a(com.kubi.payment.channel.precheck.PreCheckRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
