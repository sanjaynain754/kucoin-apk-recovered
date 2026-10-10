package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.core.data.model.SNSCompletionResult;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.C1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31171C1 extends AdaptedFunctionReference implements Function1 {
    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((C31243a2) this.receiver).mo70620a((SNSCompletionResult) obj, false);
        return Unit.INSTANCE;
    }

    public C31171C1(C31243a2 c31243a2) {
        super(1, c31243a2, C31243a2.class, "onCancel", "onCancel(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V", 0);
    }
}
