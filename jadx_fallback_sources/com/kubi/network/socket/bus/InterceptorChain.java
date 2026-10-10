package com.kubi.network.socket.bus;

/* JADX INFO: compiled from: InterceptorChain.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m90084d2 = {"Lcom/kubi/network/socket/bus/InterceptorChain;", "", "", "Lcom/kubi/network/socket/bus/a;", "interceptors", "<init>", "(Ljava/util/List;)V", "Lcom/kubi/network/api/model/NetworkMessage;", "msg", "", "a", "(Lcom/kubi/network/api/model/NetworkMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/List;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class InterceptorChain {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.kubi.network.socket.bus.InterfaceC19345a> f36015a;

    public InterceptorChain(@org.jetbrains.annotations.NotNull java.util.List<? extends com.kubi.network.socket.bus.InterfaceC19345a> r2) {
            r1 = this;
            java.lang.String r0 = "interceptors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.f36015a = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m42899a(@org.jetbrains.annotations.NotNull com.kubi.network.api.model.NetworkMessage<?> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            kotlin.ResultKt.throwOnFailure(r9)
            goto L66
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.List<com.kubi.network.socket.bus.a> r9 = r7.f36015a
            int r9 = r9.size()
            int r9 = r9 - r4
            r5 = r9
            r9 = r8
            r8 = r5
            r5 = r7
        L4a:
            if (r3 >= r8) goto L71
            java.util.List<com.kubi.network.socket.bus.a> r2 = r5.f36015a
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
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
