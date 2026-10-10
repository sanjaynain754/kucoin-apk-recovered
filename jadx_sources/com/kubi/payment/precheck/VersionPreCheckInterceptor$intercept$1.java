package com.kubi.payment.precheck;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: VersionPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.precheck.VersionPreCheckInterceptor", m90122f = "VersionPreCheckInterceptor.kt", m90123i = {0, 0}, m90124l = {13}, m90125m = "intercept", m90126n = {"param", "checkResult"}, m90127s = {"L$0", "L$1"})
public final class VersionPreCheckInterceptor$intercept$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VersionPreCheckInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionPreCheckInterceptor$intercept$1(VersionPreCheckInterceptor versionPreCheckInterceptor, Continuation<? super VersionPreCheckInterceptor$intercept$1> continuation) {
        super(continuation);
        this.this$0 = versionPreCheckInterceptor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo47135a(null, this);
    }
}
