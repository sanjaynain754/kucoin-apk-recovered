package com.kubi.sdk.pkg.helper;

import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RnWritePageChecker.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.helper.RnWritePageChecker", m90122f = "RnWritePageChecker.kt", m90123i = {0, 0, 0}, m90124l = {35}, m90125m = "checkWhitePage", m90126n = {"this", Constants.BIZ, "whitePageCode"}, m90127s = {"L$0", "L$1", "L$2"})
public final class RnWritePageChecker$checkWhitePage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RnWritePageChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnWritePageChecker$checkWhitePage$1(RnWritePageChecker rnWritePageChecker, Continuation<? super RnWritePageChecker$checkWhitePage$1> continuation) {
        super(continuation);
        this.this$0 = rnWritePageChecker;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57704b(null, null, this);
    }
}
