package com.kubi.margin.p099eu;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: EuMarginRiskAgreementManager.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.eu.EuMarginRiskAgreementManager", m90122f = "EuMarginRiskAgreementManager.kt", m90123i = {0, 0}, m90124l = {98}, m90125m = "signAgreement", m90126n = {"fragment", "onPassed"}, m90127s = {"L$0", "L$1"})
public final class EuMarginRiskAgreementManager$signAgreement$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EuMarginRiskAgreementManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EuMarginRiskAgreementManager$signAgreement$1(EuMarginRiskAgreementManager euMarginRiskAgreementManager, Continuation<? super EuMarginRiskAgreementManager$signAgreement$1> continuation) {
        super(continuation);
        this.this$0 = euMarginRiskAgreementManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m38351r(null, null, this);
    }
}
