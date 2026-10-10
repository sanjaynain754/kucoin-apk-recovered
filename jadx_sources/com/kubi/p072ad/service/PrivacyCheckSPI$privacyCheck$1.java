package com.kubi.p072ad.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PrivacyCheckSPI.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.PrivacyCheckSPI", m90122f = "PrivacyCheckSPI.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, m90124l = {21, 22}, m90125m = "privacyCheck", m90126n = {"activity", "service$iv", "$this$privacyCheck_u24lambda_u240", "$i$f$flavor", "$i$a$-flavor-PrivacyCheckSPI$privacyCheck$2", "activity", "service$iv", "$i$f$flavor", "$i$a$-flavor-PrivacyCheckSPI$privacyCheck$3"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
public final class PrivacyCheckSPI$privacyCheck$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PrivacyCheckSPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyCheckSPI$privacyCheck$1(PrivacyCheckSPI privacyCheckSPI, Continuation<? super PrivacyCheckSPI$privacyCheck$1> continuation) {
        super(continuation);
        this.this$0 = privacyCheckSPI;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo14654a(null, this);
    }
}
