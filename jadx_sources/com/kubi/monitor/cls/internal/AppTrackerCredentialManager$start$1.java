package com.kubi.monitor.cls.internal;

import android.content.Context;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AppTrackerCredentialManager.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
@DebugMetadata(m90121c = "com.kubi.monitor.cls.internal.AppTrackerCredentialManager$start$1", m90122f = "AppTrackerCredentialManager.kt", m90123i = {0, 1, 2}, m90124l = {41, 43, 44}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$launch", "$this$launch"}, m90127s = {"L$0", "L$0", "L$0"})
public final class AppTrackerCredentialManager$start$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $applicationContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppTrackerCredentialManager$start$1(Context context, Continuation<? super AppTrackerCredentialManager$start$1> continuation) {
        super(2, continuation);
        this.$applicationContext = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AppTrackerCredentialManager$start$1 appTrackerCredentialManager$start$1 = new AppTrackerCredentialManager$start$1(this.$applicationContext, continuation);
        appTrackerCredentialManager$start$1.L$0 = obj;
        return appTrackerCredentialManager$start$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((AppTrackerCredentialManager$start$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[PHI: r1
      0x0046: PHI (r1v3 kotlinx.coroutines.m0) = (r1v2 kotlinx.coroutines.m0), (r1v4 kotlinx.coroutines.m0), (r1v6 kotlinx.coroutines.m0) binds: [B:13:0x0043, B:21:0x0069, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a A[PHI: r1
      0x005a: PHI (r1v4 kotlinx.coroutines.m0) = (r1v3 kotlinx.coroutines.m0), (r1v8 kotlinx.coroutines.m0) binds: [B:18:0x0057, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0069 -> B:15:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L5a
        L24:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L46
        L2c:
            p852kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            com.kubi.monitor.cls.internal.AppTrackerCredentialManager r8 = com.kubi.monitor.cls.internal.AppTrackerCredentialManager.f35508a
            android.content.Context r6 = r7.$applicationContext
            p852kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
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
            p852kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = com.kubi.monitor.cls.internal.AppTrackerCredentialManager.m42400a(r8, r5, r7)
            if (r8 != r0) goto L46
        L6b:
            return r0
        L6c:
            kotlin.Unit r8 = p852kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.monitor.cls.internal.AppTrackerCredentialManager$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
