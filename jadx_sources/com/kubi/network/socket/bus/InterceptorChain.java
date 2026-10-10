package com.kubi.network.socket.bus;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InterceptorChain.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m90084d2 = {"Lcom/kubi/network/socket/bus/InterceptorChain;", "", "", "Lcom/kubi/network/socket/bus/a;", "interceptors", "<init>", "(Ljava/util/List;)V", "Lcom/kubi/network/api/model/NetworkMessage;", "msg", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/List;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class InterceptorChain {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC19345a> interceptors;

    /* JADX WARN: Multi-variable type inference failed */
    public InterceptorChain(@NotNull List<? extends InterfaceC19345a> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.interceptors = interceptors;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0063 -> B:20:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m42899a(@org.jetbrains.annotations.NotNull com.kubi.network.api.model.NetworkMessage<?> r8, @org.jetbrains.annotations.NotNull p852kotlin.coroutines.Continuation<? super p852kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.kubi.network.socket.bus.InterceptorChain$process$1
            if (r0 == 0) goto L13
            r0 = r9
            com.kubi.network.socket.bus.InterceptorChain$process$1 r0 = (com.kubi.network.socket.bus.InterceptorChain$process$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.network.socket.bus.InterceptorChain$process$1 r0 = new com.kubi.network.socket.bus.InterceptorChain$process$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            int r8 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.kubi.network.api.model.NetworkMessage r2 = (com.kubi.network.api.model.NetworkMessage) r2
            java.lang.Object r5 = r0.L$0
            com.kubi.network.socket.bus.InterceptorChain r5 = (com.kubi.network.socket.bus.InterceptorChain) r5
            p852kotlin.ResultKt.throwOnFailure(r9)
            goto L66
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            p852kotlin.ResultKt.throwOnFailure(r9)
            java.util.List<com.kubi.network.socket.bus.a> r9 = r7.interceptors
            int r9 = r9.size()
            int r9 = r9 - r4
            r5 = r9
            r9 = r8
            r8 = r5
            r5 = r7
        L4a:
            if (r3 >= r8) goto L71
            java.util.List<com.kubi.network.socket.bus.a> r2 = r5.interceptors
            java.lang.Object r2 = r2.get(r8)
            com.kubi.network.socket.bus.a r2 = (com.kubi.network.socket.bus.InterfaceC19345a) r2
            r0.L$0 = r5
            r0.L$1 = r9
            r0.I$0 = r8
            r0.label = r4
            java.lang.Object r2 = r2.mo42904a(r9, r0)
            if (r2 != r1) goto L63
            return r1
        L63:
            r6 = r2
            r2 = r9
            r9 = r6
        L66:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L71
            int r8 = r8 + r3
            r9 = r2
            goto L4a
        L71:
            kotlin.Unit r8 = p852kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.network.socket.bus.InterceptorChain.m42899a(com.kubi.network.api.model.NetworkMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
