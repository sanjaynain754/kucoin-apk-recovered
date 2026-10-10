package com.kubi.home.router;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RouterNavigationInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.router.RouterNavigationInterceptor$Companion", m90122f = "RouterNavigationInterceptor.kt", m90123i = {0, 1}, m90124l = {34, 37}, m90125m = "updateKuCoinPayLink", m90126n = {"jumpUrl", "jumpUrl"}, m90127s = {"L$0", "L$0"})
public final class RouterNavigationInterceptor$Companion$updateKuCoinPayLink$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RouterNavigationInterceptor.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterNavigationInterceptor$Companion$updateKuCoinPayLink$1(RouterNavigationInterceptor.Companion companion, Continuation<? super RouterNavigationInterceptor$Companion$updateKuCoinPayLink$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateKuCoinPayLink(null, this);
    }
}
