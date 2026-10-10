package com.kubi.monitor.cls.internal;

/* JADX INFO: compiled from: AppTrackerCredentialManager.kt */
/* JADX INFO: loaded from: classes29.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.monitor.cls.internal.AppTrackerCredentialManager$start$1", m90122f = "AppTrackerCredentialManager.kt", m90123i = {0, 1, 2}, m90124l = {41, 43, 44}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$launch", "$this$launch"}, m90127s = {"L$0", "L$0", "L$0"})
public final class AppTrackerCredentialManager$start$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context $applicationContext;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    public AppTrackerCredentialManager$start$1(android.content.Context r1, kotlin.coroutines.Continuation<? super com.kubi.monitor.cls.internal.AppTrackerCredentialManager$start$1> r2) {
            r0 = this;
            r0.$applicationContext = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.monitor.cls.internal.AppTrackerCredentialManager$start$1 r0 = new com.kubi.monitor.cls.internal.AppTrackerCredentialManager$start$1
            android.content.Context r1 = r2.$applicationContext
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.monitor.cls.internal.AppTrackerCredentialManager$start$1 r1 = (com.kubi.monitor.cls.internal.AppTrackerCredentialManager$start$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            java.lang.String r2 = "applicationContext"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            goto L24
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L24:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L46
        L2c:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            com.kubi.monitor.cls.internal.AppTrackerCredentialManager r8 = com.kubi.monitor.cls.internal.AppTrackerCredentialManager.f35508a
            android.content.Context r6 = r7.$applicationContext
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r7.L$0 = r1
            r7.label = r5
            java.lang.Object r8 = com.kubi.monitor.cls.internal.AppTrackerCredentialManager.m42400a(r8, r6, r7)
            if (r8 != r0) goto L46
            goto L6b
        L46:
            boolean r8 = kotlinx.coroutines.C41713n0.m91132h(r1)
            if (r8 == 0) goto L6c
            r7.L$0 = r1
            r7.label = r4
            r5 = 1620000(0x18b820, double:8.003863E-318)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r5, r7)
            if (r8 != r0) goto L5a
            goto L6b
        L5a:
            com.kubi.monitor.cls.internal.AppTrackerCredentialManager r8 = com.kubi.monitor.cls.internal.AppTrackerCredentialManager.f35508a
            android.content.Context r5 = r7.$applicationContext
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = com.kubi.monitor.cls.internal.AppTrackerCredentialManager.m42400a(r8, r5, r7)
            if (r8 != r0) goto L46
        L6b:
            return r0
        L6c:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
