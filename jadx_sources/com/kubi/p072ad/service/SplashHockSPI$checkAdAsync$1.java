package com.kubi.p072ad.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SplashHockSPI.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.SplashHockSPI", m90122f = "SplashHockSPI.kt", m90123i = {0, 0, 1, 1}, m90124l = {62, 68}, m90125m = "checkAdAsync", m90126n = {"activity", "stubSplash", "activity", "stubSplash"}, m90127s = {"L$0", "L$1", "L$0", "L$1"})
public final class SplashHockSPI$checkAdAsync$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SplashHockSPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashHockSPI$checkAdAsync$1(SplashHockSPI splashHockSPI, Continuation<? super SplashHockSPI$checkAdAsync$1> continuation) {
        super(continuation);
        this.this$0 = splashHockSPI;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo14689a(null, null, this);
    }
}
